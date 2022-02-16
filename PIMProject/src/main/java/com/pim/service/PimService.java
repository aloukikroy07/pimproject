package com.pim.service;

import javax.xml.bind.JAXBContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pim.PIMProject.Model.InterfaceLogs;
import com.pim.PIMProject.Model.RegisterUser;
import com.pim.PIMProject.Model.TransferFunds;
import com.pim.repository.PimRepository;

@Service
public class PimService {

	@Autowired
	private PimRepository urRepository;
	
	public int insertUserRegistrationData(JAXBContext reqClass, RegisterUser registerUser) {
		return urRepository.insertUserRegistration(reqClass, registerUser);
	}

	@SuppressWarnings("unchecked")
	public <T> int interfaceLogsInsert(JAXBContext reqClass, T tf) throws Exception {
		
		InterfaceLogs ifl = new InterfaceLogs();
	    ifl.setRequestParams(tf);
	    
		return urRepository.insertInterfaceLogs(reqClass, ifl);
	}

	
}
