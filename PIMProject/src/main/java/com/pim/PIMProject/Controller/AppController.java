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

import com.pim.PIMProject.ISO.Model.RequestDataPDU;
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
import com.pim.service.PimService;
import com.pim.util.CommonMethods;

@RestController
public class AppController<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	private CommonMethods<T> cms;
	
	@Autowired
	private PimService userRegService;
	
	@PostMapping(value="/registeruser", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public RegisterUser registerUser(@RequestBody RegisterUser userReg){
		RegisterUser registerUser = new RegisterUser();	
		
		try {
			JAXBContext jc = JAXBContext.newInstance(RegisterUser.class);
			logger.info("Request to RegisterUser info: "+cms.convertToXmlFromModel(jc, (T) userReg));
			
			registerUser.setHead(userReg.getHead());
			registerUser.setEntity(userReg.getEntity());
			registerUser.setReq(userReg.getReq());
			registerUser.setChannelInfo(userReg.getChannelInfo());
			
			userRegService.insertUserRegistrationData(jc, registerUser);
			logger.info("Response Data for RegisterUser: "+cms.convertToXmlFromModel(jc, (T) registerUser));
			
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
		TransferFunds transferFunds = new TransferFunds();
		
		try {	
			JAXBContext jc = JAXBContext.newInstance(TransferFunds.class);
			logger.info("Request to TransferFunds info : "+cms.convertToXmlFromModel(jc, (T) fundTransfer));
			
			transferFunds.setHead(fundTransfer.getHead());
			transferFunds.setReq(fundTransfer.getReq());
			transferFunds.setChannelInfo(fundTransfer.getChannelInfo());
			transferFunds.setTransactionInfo(fundTransfer.getTransactionInfo());
			
			userRegService.interfaceLogsInsert(jc, transferFunds);
			logger.info("Response Data for TransferFunds: "+cms.convertToXmlFromModel(jc, (T) transferFunds));
			
			return transferFunds;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return transferFunds;
		}
		
	}
	
	@PostMapping(value="/creatertp", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public CreateRTP createRTP(@RequestBody CreateRTP rtpCreation){
		CreateRTP createRTP = new CreateRTP();
			
		try {	
			JAXBContext jc = JAXBContext.newInstance(CreateRTP.class);
			logger.info("Request to CreateRTP info : "+cms.convertToXmlFromModel(jc, (T) rtpCreation));
			
			createRTP.setHead(rtpCreation.getHead());
			createRTP.setReq(rtpCreation.getReq());
			createRTP.setChannelInfo(rtpCreation.getChannelInfo());
			createRTP.setRequestInfo(rtpCreation.getRequestInfo());
			
			userRegService.interfaceLogsInsert(jc, createRTP);
			logger.info("Response Data for CreateRTP: "+cms.convertToXmlFromModel(jc, (T) createRTP));
			
			return createRTP;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return createRTP;
		}
		
	}
	
	@PostMapping(value="/initiatefundtransfer", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public InitiateFundTransfer initiateFundTransfer(@RequestBody InitiateFundTransfer fundTransferInitiate){
		InitiateFundTransfer initiateFundTransfer = new InitiateFundTransfer();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(InitiateFundTransfer.class);
			logger.info("Request to InitiateFundTransfer info : "+cms.convertToXmlFromModel(jc, (T) fundTransferInitiate));
			
			initiateFundTransfer.setHead(fundTransferInitiate.getHead());
			initiateFundTransfer.setReq(fundTransferInitiate.getReq());
			initiateFundTransfer.setChannelInfo(fundTransferInitiate.getChannelInfo());
			initiateFundTransfer.setTransactionInfo(fundTransferInitiate.getTransactionInfo());
			
			userRegService.interfaceLogsInsert(jc, initiateFundTransfer);
			logger.info("Response Data for InitiateFundTransfer: "+cms.convertToXmlFromModel(jc, (T) initiateFundTransfer));
			
			return initiateFundTransfer;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return initiateFundTransfer;
		}
		
	}
	
	@PostMapping(value="/gettransactionsbyfi", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetTransactionsbyFI getTransactionsbyFI(@RequestBody GetTransactionsbyFI getFITransactions){
		GetTransactionsbyFI getTransactionsbyFI = new GetTransactionsbyFI();	
		
		try {	
			JAXBContext jc = JAXBContext.newInstance(GetTransactionsbyFI.class);
			logger.info("Request to GetTransactionsbyFI info : "+cms.convertToXmlFromModel(jc, (T) getFITransactions));
			
			getTransactionsbyFI.setHead(getFITransactions.getHead());
			getTransactionsbyFI.setReq(getFITransactions.getReq());
			getTransactionsbyFI.setChannelInfo(getFITransactions.getChannelInfo());
			getTransactionsbyFI.setReqInfo(getFITransactions.getReqInfo());
			
			userRegService.interfaceLogsInsert(jc, getTransactionsbyFI);
			logger.info("Response Data for GetTransactionsbyFI: "+cms.convertToXmlFromModel(jc, (T) getTransactionsbyFI));
			
			return getTransactionsbyFI;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getTransactionsbyFI;
		}
		
	}
	
	@PostMapping(value="/getrtplistsent", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetRTPListSent getRTPListSent(@RequestBody GetRTPListSent getListSentRTP){
		GetRTPListSent getRTPListSent = new GetRTPListSent();	
		
		try {
			JAXBContext jc = JAXBContext.newInstance(GetRTPListSent.class);
			logger.info("Request to GetRTPListSent info : "+cms.convertToXmlFromModel(jc, (T) getListSentRTP));
			
			getRTPListSent.setHead(getListSentRTP.getHead());
			getRTPListSent.setReq(getListSentRTP.getReq());
			getRTPListSent.setChannelInfo(getListSentRTP.getChannelInfo());
			getRTPListSent.setReqInfo(getListSentRTP.getReqInfo());
			
			userRegService.interfaceLogsInsert(jc, getRTPListSent);
			logger.info("Response Data for GetRTPListSent: "+cms.convertToXmlFromModel(jc, (T) getRTPListSent));
			
			return getRTPListSent;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getRTPListSent;
		}
	}
	
	@PostMapping(value="/getrtplistreceived", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetRTPListReceived getRTPListReceived(@RequestBody GetRTPListReceived getListReceivedRTP){
		GetRTPListReceived getRTPListReceived = new GetRTPListReceived();
			
		try {	
			JAXBContext jc = JAXBContext.newInstance(GetRTPListReceived.class);
			logger.info("Request to GetRTPListReceived info : "+cms.convertToXmlFromModel(jc, (T) getListReceivedRTP));
			
			getRTPListReceived.setHead(getListReceivedRTP.getHead());
			getRTPListReceived.setReq(getListReceivedRTP.getReq());
			getRTPListReceived.setChannelInfo(getListReceivedRTP.getChannelInfo());
			getRTPListReceived.setReqInfo(getListReceivedRTP.getReqInfo());
			
			userRegService.interfaceLogsInsert(jc, getRTPListReceived);
			logger.info("Response Data for GetRTPListReceived: "+cms.convertToXmlFromModel(jc, (T) getRTPListReceived));
			
			return getRTPListReceived;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getRTPListReceived;
		}
		
	}
	
	@PostMapping(value="/ValidateFIUser", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public ValidateFIUser validateFIUser(@RequestBody ValidateFIUser userFIValidate){
		ValidateFIUser validateFIUser = new ValidateFIUser();
			
		try {
			JAXBContext jc = JAXBContext.newInstance(ValidateFIUser.class);
			logger.info("Request to ValidateFIUser info : "+cms.convertToXmlFromModel(jc, (T) userFIValidate));
			
			validateFIUser.setHead(userFIValidate.getHead());
			validateFIUser.setReq(userFIValidate.getReq());
			validateFIUser.setUserInfo(userFIValidate.getUserInfo());
			validateFIUser.setOtherInfo(userFIValidate.getOtherInfo());
			
			userRegService.interfaceLogsInsert(jc, validateFIUser);
			logger.info("Response Data for ValidateFIUser: "+cms.convertToXmlFromModel(jc, (T) validateFIUser));
			
			return validateFIUser;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return validateFIUser;
		}
		
	}
	
	@PostMapping(value="/NotifyIDTPAccountChange", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public NotifyIDTPAccountChange notifyIDTPAccountChange(@RequestBody NotifyIDTPAccountChange accountChangeNotifyIDTPAccountChange){
		NotifyIDTPAccountChange notifyIDTPAccountChange = new NotifyIDTPAccountChange();
			
		try {
			JAXBContext jc = JAXBContext.newInstance(NotifyIDTPAccountChange.class);
			logger.info("Request to NotifyIDTPAccountChange info : "+cms.convertToXmlFromModel(jc, (T) accountChangeNotifyIDTPAccountChange));
			
			notifyIDTPAccountChange.setHead(accountChangeNotifyIDTPAccountChange.getHead());
			notifyIDTPAccountChange.setReq(accountChangeNotifyIDTPAccountChange.getReq());
			notifyIDTPAccountChange.setChannelInfo(accountChangeNotifyIDTPAccountChange.getChannelInfo());
			notifyIDTPAccountChange.setDeviceInfo(accountChangeNotifyIDTPAccountChange.getDeviceInfo());
			notifyIDTPAccountChange.setUserInfo(accountChangeNotifyIDTPAccountChange.getUserInfo());
			
			userRegService.interfaceLogsInsert(jc, notifyIDTPAccountChange);
			logger.info("Response Data for NotifyIDTPAccountChange: "+cms.convertToXmlFromModel(jc, (T) notifyIDTPAccountChange));
			
			return notifyIDTPAccountChange;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return notifyIDTPAccountChange;
		}
	}
	
	@PostMapping(value="/GetFIUserInfo", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public GetFIUserInfo getFIUserInfo(@RequestBody GetFIUserInfo getInfoFIUser){
		GetFIUserInfo getFIUserInfo = new GetFIUserInfo();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(GetFIUserInfo.class);
			logger.info("Request to GetFIUserInfo info : "+cms.convertToXmlFromModel(jc, (T) getInfoFIUser));
			
			getFIUserInfo.setHead(getInfoFIUser.getHead());
			getFIUserInfo.setReq(getInfoFIUser.getReq());
			getFIUserInfo.setChannelInfo(getInfoFIUser.getChannelInfo());
			getFIUserInfo.setUserInfo(getInfoFIUser.getUserInfo());
			getFIUserInfo.setOtherInfo(getInfoFIUser.getOtherInfo());
			
			userRegService.interfaceLogsInsert(jc, getInfoFIUser);
			logger.info("Response Data for GetFIUserInfo: "+cms.convertToXmlFromModel(jc, (T) getFIUserInfo));
			
			return getFIUserInfo;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getFIUserInfo;
		}
	}
	
	@PostMapping(value="/transferfundsiso", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public RequestDataPDU dataPDU(@RequestBody RequestDataPDU pduData) {
		RequestDataPDU dataPDU = new RequestDataPDU();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(RequestDataPDU.class);
			logger.info("Request to GetFIUserInfo info : "+cms.convertToXmlFromModel(jc, (T) pduData));
			
			dataPDU.setRevision(pduData.getRevision());
			dataPDU.setBody(pduData.getBody());
			
			userRegService.interfaceLogsInsert(jc, pduData);
			logger.info("Response Data for GetFIUserInfo: "+cms.convertToXmlFromModel(jc, (T) dataPDU));
			
			return dataPDU;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return dataPDU;
		}
	}
}
