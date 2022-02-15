package com.pim.PIMProject.Controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pim.PIMProject.Model.CreateRTP;
import com.pim.PIMProject.Model.GetFIUserInfo;
import com.pim.PIMProject.Model.GetRTPListReceived;
import com.pim.PIMProject.Model.GetRTPListSent;
import com.pim.PIMProject.Model.GetTransactionsbyFI;
import com.pim.PIMProject.Model.InitiateFundTransfer;
import com.pim.PIMProject.Model.RegisterUser;
import com.pim.PIMProject.Model.TransferFunds;
import com.pim.PIMProject.Model.ValidateFIUser;
import com.pim.PIMProject.Model.NotifyIDTPAccountChange;
import com.pim.service.UserRegistrationService;
import com.pim.util.CommonFunctions;

@RestController
public class AppController<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	private CommonFunctions<T> commonFunctions;
	
	@Autowired
	private UserRegistrationService userRegService;
	
	@PostMapping(value="/registeruser", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public RegisterUser registerUser(@RequestBody RegisterUser userReg){
		RegisterUser registerUser = new RegisterUser();	
		
		try {			
			logger.info("Request to RegisterUser info: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(RegisterUser.class), (T) userReg));
			
			registerUser.setHead(userReg.getHead());
			registerUser.setEntity(userReg.getEntity());
			registerUser.setReq(userReg.getReq());
			registerUser.setChannelInfo(userReg.getChannelInfo());
			
			userRegService.insertUserRegistrationData(registerUser);
			
			logger.info("Response Data for RegisterUser: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(RegisterUser.class), (T) registerUser));
			
			return registerUser;
			
//			RestTemplate restTemplate = new RestTemplate();
//			HttpHeaders headers = new HttpHeaders();
//			HttpEntity<RegisterUser> request = new HttpEntity<RegisterUser>(userReg, headers);
//			getFIUserInfo = restTemplate.postForEntity("http://localhost:8080/getfiuserinfo/", request, GetFIUserInfo.class);
//			
//			logger.info("Response Data: "+registerUser);			
//			
//			return getFIUserInfo.getBody();
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return registerUser;
		}
		
	}
	
	@PostMapping(value="/transferfunds", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public TransferFunds transferFunds(@RequestBody TransferFunds fundTransfer) throws JAXBException{
		//logger.info("Request Info: "+fundTransfer);
		
		TransferFunds transferFunds = new TransferFunds();
		
		try {				
			logger.info("Request to TransferFunds info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(TransferFunds.class), (T) fundTransfer));
			
			transferFunds.setHead(fundTransfer.getHead());
			transferFunds.setReq(fundTransfer.getReq());
			transferFunds.setChannelInfo(fundTransfer.getChannelInfo());
			transferFunds.setTransactionInfo(fundTransfer.getTransactionInfo());
			
			userRegService.interfaceLogsInsert(transferFunds);
			
			logger.info("Response Data for TransferFunds: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(TransferFunds.class), (T) transferFunds));
			
			return transferFunds;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return transferFunds;
		}
		
	}
	
	@PostMapping(value="/creatertp", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public CreateRTP createRTP(@RequestBody CreateRTP rtpCreation){
		logger.info("Request Info: "+rtpCreation);
		CreateRTP createRTP = new CreateRTP();
			
		try {			
			logger.info("Request to CreateRTP info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(CreateRTP.class), (T) rtpCreation));
			
			createRTP.setHead(rtpCreation.getHead());
			createRTP.setReq(rtpCreation.getReq());
			createRTP.setChannelInfo(rtpCreation.getChannelInfo());
			createRTP.setRequestInfo(rtpCreation.getRequestInfo());
			
			logger.info("Response Data for CreateRTP: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(CreateRTP.class), (T) createRTP));
			
			return createRTP;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return createRTP;
		}
		
	}
	
	@PostMapping(value="/initiatefundtransfer", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public InitiateFundTransfer initiateFundTransfer(@RequestBody InitiateFundTransfer fundTransferInitiate){
		logger.info("Request Info: "+fundTransferInitiate);
		InitiateFundTransfer initiateFundTransfer = new InitiateFundTransfer();
		
		try {
			logger.info("Request to InitiateFundTransfer info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(InitiateFundTransfer.class), (T) fundTransferInitiate));
			
			initiateFundTransfer.setHead(fundTransferInitiate.getHead());
			initiateFundTransfer.setReq(fundTransferInitiate.getReq());
			initiateFundTransfer.setChannelInfo(fundTransferInitiate.getChannelInfo());
			initiateFundTransfer.setTransactionInfo(fundTransferInitiate.getTransactionInfo());
			
			logger.info("Response Data for InitiateFundTransfer: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(InitiateFundTransfer.class), (T) initiateFundTransfer));
			
			return initiateFundTransfer;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return initiateFundTransfer;
		}
		
	}
	
	@PostMapping(value="/gettransactionsbyfi", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetTransactionsbyFI getTransactionsbyFI(@RequestBody GetTransactionsbyFI getFITransactions){
		logger.info("Request Info: "+getFITransactions);
		GetTransactionsbyFI getTransactionsbyFI = new GetTransactionsbyFI();	
		
		try {	
			logger.info("Request to GetTransactionsbyFI info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetTransactionsbyFI.class), (T) getFITransactions));
			
			getTransactionsbyFI.setHead(getFITransactions.getHead());
			getTransactionsbyFI.setReq(getFITransactions.getReq());
			getTransactionsbyFI.setChannelInfo(getFITransactions.getChannelInfo());
			getTransactionsbyFI.setReqInfo(getFITransactions.getReqInfo());
			
			logger.info("Response Data for GetTransactionsbyFI: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetTransactionsbyFI.class), (T) getTransactionsbyFI));
			
			return getTransactionsbyFI;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getTransactionsbyFI;
		}
		
	}
	
	@PostMapping(value="/getrtplistsent", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetRTPListSent getRTPListSent(@RequestBody GetRTPListSent getListSentRTP){
		logger.info("Request Info: "+getListSentRTP);
		GetRTPListSent getRTPListSent = new GetRTPListSent();	
		
		try {
			logger.info("Request to GetRTPListSent info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetRTPListSent.class), (T) getListSentRTP));
			
			getRTPListSent.setHead(getListSentRTP.getHead());
			getRTPListSent.setReq(getListSentRTP.getReq());
			getRTPListSent.setChannelInfo(getListSentRTP.getChannelInfo());
			getRTPListSent.setReqInfo(getListSentRTP.getReqInfo());
			
			logger.info("Response Data for GetRTPListSent: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetRTPListSent.class), (T) getRTPListSent));
			
			return getRTPListSent;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getRTPListSent;
		}
	}
	
	@PostMapping(value="/getrtplistreceived", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetRTPListReceived getRTPListReceived(@RequestBody GetRTPListReceived getListReceivedRTP){
		logger.info("Request Info: "+getListReceivedRTP);
		GetRTPListReceived getRTPListReceived = new GetRTPListReceived();
			
		try {	
			logger.info("Request to GetRTPListReceived info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetRTPListReceived.class), (T) getListReceivedRTP));
			
			getRTPListReceived.setHead(getListReceivedRTP.getHead());
			getRTPListReceived.setReq(getListReceivedRTP.getReq());
			getRTPListReceived.setChannelInfo(getListReceivedRTP.getChannelInfo());
			getRTPListReceived.setReqInfo(getListReceivedRTP.getReqInfo());
			
			logger.info("Response Data for GetRTPListReceived: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetRTPListReceived.class), (T) getRTPListReceived));
			
			return getRTPListReceived;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getRTPListReceived;
		}
		
	}
	
	@PostMapping(value="/ValidateFIUser", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public ValidateFIUser validateFIUser(@RequestBody ValidateFIUser userFIValidate){
		logger.info("Request Info: "+userFIValidate);
		ValidateFIUser validateFIUser = new ValidateFIUser();
			
		try {
			logger.info("Request to ValidateFIUser info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(ValidateFIUser.class), (T) userFIValidate));
			
			validateFIUser.setHead(userFIValidate.getHead());
			validateFIUser.setReq(userFIValidate.getReq());
			validateFIUser.setUserInfo(userFIValidate.getUserInfo());
			validateFIUser.setOtherInfo(userFIValidate.getOtherInfo());
			
			logger.info("Response Data for ValidateFIUser: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(ValidateFIUser.class), (T) validateFIUser));
			
			return validateFIUser;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return validateFIUser;
		}
		
	}
	
	@PostMapping(value="/notifyidtpaccountchange", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public NotifyIDTPAccountChange notifyIDTPAccountChange(@RequestBody NotifyIDTPAccountChange accountChangeNotifyIDTPAccountChange){
		logger.info("Request Info: "+accountChangeNotifyIDTPAccountChange);
		NotifyIDTPAccountChange notifyIDTPAccountChange = new NotifyIDTPAccountChange();
			
		try {
			logger.info("Request to NotifyIDTPAccountChange info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(NotifyIDTPAccountChange.class), (T) accountChangeNotifyIDTPAccountChange));
			
			notifyIDTPAccountChange.setHead(accountChangeNotifyIDTPAccountChange.getHead());
			notifyIDTPAccountChange.setReq(accountChangeNotifyIDTPAccountChange.getReq());
			notifyIDTPAccountChange.setChannelInfo(accountChangeNotifyIDTPAccountChange.getChannelInfo());
			notifyIDTPAccountChange.setDeviceInfo(accountChangeNotifyIDTPAccountChange.getDeviceInfo());
			notifyIDTPAccountChange.setUserInfo(accountChangeNotifyIDTPAccountChange.getUserInfo());
			
			logger.info("Response Data for NotifyIDTPAccountChange: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(NotifyIDTPAccountChange.class), (T) notifyIDTPAccountChange));
			
			return notifyIDTPAccountChange;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return notifyIDTPAccountChange;
		}
	}
	
	@PostMapping(value="/getfiuserinfo", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetFIUserInfo getFIUserInfo(@RequestBody GetFIUserInfo getInfoFIUser){
		logger.info("Request Info: "+getInfoFIUser);
		GetFIUserInfo getFIUserInfo = new GetFIUserInfo();
		
		try {
			logger.info("Request to GetFIUserInfo info : "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetFIUserInfo.class), (T) getInfoFIUser));
			
			getFIUserInfo.setHead(getInfoFIUser.getHead());
			getFIUserInfo.setReq(getInfoFIUser.getReq());
			getFIUserInfo.setChannelInfo(getInfoFIUser.getChannelInfo());
			getFIUserInfo.setUserInfo(getInfoFIUser.getUserInfo());
			getFIUserInfo.setOtherInfo(getInfoFIUser.getOtherInfo());
			
			logger.info("Response Data for GetFIUserInfo: "+commonFunctions.convertToXmlFromModel(JAXBContext.newInstance(GetFIUserInfo.class), (T) getFIUserInfo));
			
			return getFIUserInfo;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getFIUserInfo;
		}
		
	}
}
