package com.pim.PIMProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pim.PIMProject.PimProjectApplication;
import com.pim.PIMProject.Model.ContactReference;
import com.pim.PIMProject.Model.CreateRTP;
import com.pim.PIMProject.Model.Cred;
import com.pim.PIMProject.Model.Creds;
import com.pim.PIMProject.Model.DeviceInfo;
import com.pim.PIMProject.Model.Entity;
import com.pim.PIMProject.Model.FinancialInstitutionInfo;
import com.pim.PIMProject.Model.Head;
import com.pim.PIMProject.Model.Info;
import com.pim.PIMProject.Model.InitiateFundTransfer;
import com.pim.PIMProject.Model.OtherInfo;
import com.pim.PIMProject.Model.RegisterUser;
import com.pim.PIMProject.Model.Req;
import com.pim.PIMProject.Model.RequestedVirtualID;
import com.pim.PIMProject.Model.TransferFunds;
import com.pim.service.UserRegistrationService;

@RestController
public class AppController {
	
	private static final Logger logger = LoggerFactory.getLogger(PimProjectApplication.class);
	
	@Autowired
	private UserRegistrationService userRegService;
	
	@PostMapping(value="/registeruser", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public RegisterUser registerUser(@RequestBody RegisterUser userReg){
		logger.info("Request Info: "+userReg);
		RegisterUser registerUser = new RegisterUser();
		registerUser.setHead(userReg.getHead());
		registerUser.setEntity(userReg.getEntity());
		registerUser.setReq(userReg.getReq());
		registerUser.setChannelInfo(userReg.getChannelInfo());
		//userRegService.insertUserRegistrationData(registerUser);
		
		logger.info("Response Data: "+registerUser);
		
		return registerUser;
	}
	
	@PostMapping(value="/transferfunds", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public TransferFunds transferFunds(@RequestBody TransferFunds fundTransfer){
		logger.info("Request Info: "+fundTransfer);
		
		TransferFunds transferFunds = new TransferFunds();
		transferFunds.setHead(fundTransfer.getHead());
		transferFunds.setReq(fundTransfer.getReq());
		transferFunds.setChannelInfo(fundTransfer.getChannelInfo());
		transferFunds.setTransactionInfo(fundTransfer.getTransactionInfo());
		
		logger.info("Response Data: "+transferFunds);
		return transferFunds;
	}
	
	@PostMapping(value="/creatertp", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public CreateRTP createRTP(@RequestBody CreateRTP rtpCreation){
		logger.info("Request Info: "+rtpCreation);
		
		CreateRTP createRTP = new CreateRTP();
		createRTP.setHead(rtpCreation.getHead());
		createRTP.setReq(rtpCreation.getReq());
		createRTP.setChannelInfo(rtpCreation.getChannelInfo());
		createRTP.setRequestInfo(rtpCreation.getRequestInfo());
		
		logger.info("Response Data: "+createRTP);
		return createRTP;
	}
	
	@PostMapping(value="/initiatefundtransfer", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public InitiateFundTransfer initiateFundTransfer(@RequestBody InitiateFundTransfer fundTransferInitiate){
		logger.info("Request Info: "+fundTransferInitiate);
		
		InitiateFundTransfer initiateFundTransfer = new InitiateFundTransfer();
		initiateFundTransfer.setHead(fundTransferInitiate.getHead());
		initiateFundTransfer.setReq(fundTransferInitiate.getReq());
		initiateFundTransfer.setChannelInfo(fundTransferInitiate.getChannelInfo());
		initiateFundTransfer.setTransactionInfo(fundTransferInitiate.getTransactionInfo());
		
		logger.info("Response Data: "+initiateFundTransfer);
		return initiateFundTransfer;
	}
}
