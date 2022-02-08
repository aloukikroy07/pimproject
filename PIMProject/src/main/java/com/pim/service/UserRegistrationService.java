package com.pim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pim.PIMProject.Model.RegisterUser;
import com.pim.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRegistrationRepository urRepository;
	
	public int insertUserRegistrationData(RegisterUser registerUser) {
		return urRepository.insertUserRegistration(registerUser);
	}
	
	
}
