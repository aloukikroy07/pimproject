package com.pim.PIMProject.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pim.PIMProject.PimProjectApplication;
import com.pim.PIMProject.Model.CreateRTP;
import com.pim.PIMProject.Model.GetRTPListSent;
import com.pim.PIMProject.Model.GetTransactionsbyFI;
import com.pim.PIMProject.Model.InitiateFundTransfer;
import com.pim.PIMProject.Model.RegisterUser;
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
	
	@PostMapping(value="/gettransactionsbyfi", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetTransactionsbyFI getTransactionsbyFI(@RequestBody GetTransactionsbyFI getFITransactions){
		GetTransactionsbyFI getTransactionsbyFI = new GetTransactionsbyFI();
		getTransactionsbyFI.setHead(getFITransactions.getHead());
		getTransactionsbyFI.setReq(getFITransactions.getReq());
		getTransactionsbyFI.setChannelInfo(getFITransactions.getChannelInfo());
		getTransactionsbyFI.setReqInfo(getFITransactions.getReqInfo());
		return getTransactionsbyFI;
	}
	
	@PostMapping(value="/getrtplistsent", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetRTPListSent getRTPListSent(@RequestBody GetRTPListSent getListSentRTP){
		GetRTPListSent getRTPListSent = new GetRTPListSent();
		getRTPListSent.setHead(getListSentRTP.getHead());
		getRTPListSent.setReq(getListSentRTP.getReq());
		getRTPListSent.setChannelInfo(getListSentRTP.getChannelInfo());
		getRTPListSent.setReqInfo(getListSentRTP.getReqInfo());
		return getRTPListSent;
	}
}
