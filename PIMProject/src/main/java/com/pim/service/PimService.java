package com.pim.service;

import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.pim.PIMProject.Model.Request.CustomerProfiles;
import com.pim.PIMProject.Model.Request.InterfaceLogs;
import com.pim.PIMProject.Model.Request.RegisterUser;
import com.pim.PIMProject.Model.Request.SenderVID;
import com.pim.PIMProject.Model.Request.TransferFunds;
import com.pim.PIMProject.Model.Response.RegisterUserResponse;
import com.pim.db.mapping.model.Transactions;
import com.pim.repository.PimRepository;
import com.pim.util.CommonMethods;

@Service
public class PimService<T> {

	@Autowired
	private PimRepository urRepository;
	
	@Autowired
	private CommonMethods<T> cm;
	
	public int insertUserRegistrationData(RegisterUser request, String requestName, JAXBContext reqClass, RegisterUserResponse response, JAXBContext resClass) {
		Integer returnStatus = urRepository.insertUserRegistration(request, response);
		
		return returnStatus;
	}

	@SuppressWarnings("unchecked")
	public <T> int interfaceLogsInsertion(T request, String requestName, JAXBContext reqClass, T response, JAXBContext resClass) throws Exception {
		
		InterfaceLogs ifl = new InterfaceLogs();
	    
	    String xmlRequest = cm.makeXmlForInterfaceLogs(reqClass, request);
	    String xmlRespose = cm.makeXmlForInterfaceLogs(resClass, response);
	    
	    ifl.setRequestName(requestName);
	    ifl.setRequestParams(xmlRequest);
	    ifl.setResponse(xmlRespose);
	    
		return urRepository.insertInterfaceLogs(ifl);
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	public <T> int transactionInsertion(T request, Transactions ts, T response, List<CustomerProfiles> cpData, Map map) {
		int insertion = 0;
		try {
			insertion = urRepository.insertTransactions(ts, cpData, map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertion;
	}
	
	
	
}
