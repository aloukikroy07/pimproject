package com.pim.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pim.PIMProject.Model.Request.InterfaceLogs;
import com.pim.PIMProject.Model.Request.RegisterUser;
import com.pim.PIMProject.Model.Request.TransferFunds;
import com.pim.db.mapping.model.Transactions;
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
				returnStatus = interfaceLogsInsertion(request, requestName, reqClass, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			returnStatus = 0;
		}
		
		return returnStatus;
	}

	@SuppressWarnings("unchecked")
	public <T> int interfaceLogsInsertion(T request, String requestName, JAXBContext reqClass, T response) throws Exception {
		
		InterfaceLogs ifl = new InterfaceLogs();
	    
	    String xmlRequest = cm.makeXmlForInterfaceLogs(reqClass, request);
	    String xmlRespose = cm.makeXmlForInterfaceLogs(reqClass, response);
	    
	    ifl.setRequestName(requestName);
	    ifl.setRequestParams(xmlRequest);
	    ifl.setResponse(xmlRespose);
	    
		return urRepository.insertInterfaceLogs(ifl);
	}

	@SuppressWarnings("unchecked")
	public <T> int transactionInsertion(T request, Transactions ts, T response) throws Exception {
	    
		return urRepository.insertTransactions(ts);
	}
	
}
