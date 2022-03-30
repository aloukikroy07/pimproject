package com.pim.PIMProject.Controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pim.PIMProject.JWT.Models.User;
import com.pim.PIMProject.JWT.Repository.UserRepo;
import com.pim.PIMProject.Model.Request.RegisterUser;
import com.pim.util.CommonMethods;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthController<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	private CommonMethods<T> cms;
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping(value="/Signin", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
	public T Signin(@RequestBody User u) {
		try {
			JAXBContext jc = JAXBContext.newInstance(User.class);
			logger.info("Request for Signin info: "+cms.convertToXmlFromModel(jc, (T) u));
			
			int result = userRepo.VerifyUser(u);
			if(result==1) {
				String token = getJWTToken(u.getUsername());
				User user = new User();
				user.setUsername(u.getUsername());
				user.setEmailaddress(u.getEmailaddress());
				user.setToken(token);		
				
				logger.info("Response Data for Signin: "+cms.convertToXmlFromModel(jc, (T) user));
				
				return (T) user;
			}
			
			else {
				return (T) "Username or password don't match.";
			}
			
		}
				
		catch(Exception e) {
			logger.error("Error Data: "+ e);
			return (T) "Username or password don't match.";
		}
	}
	
	@PostMapping(value="/Signup", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String Signup(@RequestBody User u) {
		try {
			JAXBContext jc = JAXBContext.newInstance(User.class);
			logger.info("Request for Signup info: "+cms.convertToXmlFromModel(jc, (T) u));
			
			int result = userRepo.AddUser(u);
			if(result == 1) {
				logger.info("Response Data for Signup: "+cms.convertToXmlFromModel(jc, (T) u));
				return "User registration successful.";
			}
			else {
				return "User registration failed.";
			}
		}
			
		catch(Exception e) {
			logger.error("Error Data: "+ e);
			return "User registration failed.";
		}
			
	}
	
	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
}
