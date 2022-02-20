package com.pim.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

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
	private CommonMethods<T> cm;
	
	public int insertUserRegistrationData(RegisterUser request, String requestName, JAXBContext reqClass, RegisterUser response) {
		Integer returnStatus = urRepository.insertUserRegistration(request, response);
		
		if (returnStatus == 1) {
			try {
				returnStatus = interfaceLogsInsert(request, requestName, reqClass, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			returnStatus = 0;
		}
		
		return returnStatus;
	}

	@SuppressWarnings("unchecked")
	public <T> int interfaceLogsInsert(T request, String requestName, JAXBContext reqClass, T response) throws Exception {
		
		InterfaceLogs ifl = new InterfaceLogs();
	    
	    String xmlRequest = cm.makeXmlForInterfaceLogs(reqClass, request);
	    String xmlRespose = cm.makeXmlForInterfaceLogs(reqClass, response);
	    
	    ifl.setRequestName(requestName);
	    ifl.setRequestParams(xmlRequest);
	    ifl.setResponse(xmlRespose);
	    
		return urRepository.insertInterfaceLogs(ifl);
	}

	
}
