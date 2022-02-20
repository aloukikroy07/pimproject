package com.pim.service;

import javax.xml.bind.JAXBContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pim.PIMProject.Model.InterfaceLogs;
import com.pim.PIMProject.Model.RegisterUser;
import com.pim.PIMProject.Model.TransferFunds;
import com.pim.repository.PimRepository;
import com.pim.util.CommonMethods;

@Service
public class PimService<T> {

	@Autowired
	private PimRepository urRepository;
	
	@Autowired
	private CommonMethods<T> cf;
	
	public int insertUserRegistrationData(RegisterUser request, String requestName, JAXBContext reqClass, RegisterUser response) {
		return urRepository.insertUserRegistration(request, requestName, reqClass, response);
	}

	@SuppressWarnings("unchecked")
	public <T> int interfaceLogsInsert(T request, String requestName, JAXBContext reqClass, T response) throws Exception {
		
		InterfaceLogs ifl = new InterfaceLogs();
	    
	    String xmlRequest =cf.makeXmlForInterfaceLogs(reqClass, request);
	    String xmlRespose =cf.makeXmlForInterfaceLogs(reqClass, response);
	    
	    ifl.setRequestName(requestName);
	    ifl.setRequestParams(xmlRequest);
	    ifl.setResponse(xmlRespose);
	    
		return urRepository.insertInterfaceLogs(ifl);
	}

	
}
