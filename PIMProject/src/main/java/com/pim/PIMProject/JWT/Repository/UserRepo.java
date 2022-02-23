package com.pim.PIMProject.JWT.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pim.PIMProject.JWT.Models.User;
import com.pim.PIMProject.JWT.Security.EncryptDecryptService;

@Repository
public class UserRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	EncryptDecryptService encryptDecryptService;
	
	public int AddUser(User user) {
		int result = FindUser(user.getUsername());
		
		if(result==0) {
			String encodedPassword = encryptDecryptService.encodePlainTextString(user.getPassword());
			
			String sqll = "insert into T_USERS (name, email, password) values ('"+user.getUsername()+"','"+user.getEmailaddress()+"','"+encodedPassword+"')";
			jdbcTemplate.update(sqll);
			
			int result1 = FindUser(user.getUsername());
			
			if (result1 == 1){
				return 1;
			}
			else {
				return 0;
			}
		}
		
		else {
			return 0;
		}
	}
	
	public int VerifyUser(User user) {
		int result = FindUser(user.getUsername());
		boolean decryptedPwd;
		if(result == 1) {
			String sql = "SELECT * FROM T_USERS where name = '"+user.getUsername()+"'";
			List <User> userData = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
			decryptedPwd = encryptDecryptService.matchPlainTextAndEncodedString(user.getPassword(), userData.get(0).getPassword());
			if(decryptedPwd == true) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	
	public int FindUser(String username) {
		String sql = "SELECT * FROM T_USERS where name = '"+username+"'";
		List <User> userData = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
		if(userData.isEmpty()) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
