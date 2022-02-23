package com.pim.PIMProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.pim.PIMProject.JWT.Security.JWTAuthorizationFilter;


@SpringBootApplication(scanBasePackages={"com.pim.PIMProject", "com.pim.controller", 
		"com.pim.service", "com.pim.repository", "com.pim.model", "com.pim.util",
		"com.pim.PIMProject.JWT.Models","com.pim.PIMProject.JWT.Repository",
		"com.pim.PIMProject.JWT.Security",})

public class PimProjectApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(PimProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PimProjectApplication.class, args);
		
//		LOGGER.info("Info level log message");
//        LOGGER.debug("Debug level log message");
//        LOGGER.error("Error level log message");
	}
	
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {	      
			  http.csrf().disable()
			  .addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
			  .authorizeRequests()
			  .antMatchers(HttpMethod.POST, "/Signin").permitAll()
		      .anyRequest().authenticated();
		}
	}

}
