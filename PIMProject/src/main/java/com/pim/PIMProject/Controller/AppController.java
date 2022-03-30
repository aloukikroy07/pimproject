package com.pim.PIMProject.Controller;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pim.PIMProject.Model.ISO.CAMT00300105.BodyCAMT00300105;
import com.pim.PIMProject.Model.ISO.CAMT00300105.DataPDUCAMT00300105;
import com.pim.PIMProject.Model.ISO.CAMT00400105.DataPDUCAMT00400105;
import com.pim.PIMProject.Model.ISO.CAMT05400104.DataPDUCAMT05400104;
import com.pim.PIMProject.Model.ISO.PACS00200105.DataPDUPACS05;
import com.pim.PIMProject.Model.ISO.PACS00800106.DataPDUPACS06;
import com.pim.PIMProject.Model.ISO.PAIN00100104.BodyPAIN00100104;
import com.pim.PIMProject.Model.ISO.PAIN00100104.DataPDUPAIN00100104;
import com.pim.PIMProject.Model.ISO.PAIN01300106.BodyPAIN01300106;
import com.pim.PIMProject.Model.ISO.PAIN01400106.BodyPAIN01400106;
import com.pim.PIMProject.Model.Request.CreateRTP;
import com.pim.PIMProject.Model.Request.CustomerProfiles;
import com.pim.PIMProject.Model.Request.GetFIUserInfo;
import com.pim.PIMProject.Model.Request.GetRTPListReceived;
import com.pim.PIMProject.Model.Request.GetRTPListSent;
import com.pim.PIMProject.Model.Request.GetTransactionsbyFI;
import com.pim.PIMProject.Model.Request.InitiateFundTransfer;
import com.pim.PIMProject.Model.Request.NotifyIDTPAccountChange;
import com.pim.PIMProject.Model.Request.RegisterUser;
import com.pim.PIMProject.Model.Request.SenderVID;
import com.pim.PIMProject.Model.Request.TransferFunds;
import com.pim.PIMProject.Model.Request.ValidateFIUser;
import com.pim.PIMProject.Model.Response.CreateRTPResponse;
import com.pim.PIMProject.Model.Response.GetRTPListReceivedResponse;
import com.pim.PIMProject.Model.Response.GetRTPListSentResponse;
import com.pim.PIMProject.Model.Response.GetTransactionsbyFIResponse;
import com.pim.PIMProject.Model.Response.RegisterUserResponse;
import com.pim.PIMProject.Model.Response.TransactionResponse;
import com.pim.db.mapping.model.Transactions;
import com.pim.repository.PimRepository;
import com.pim.service.PimService;
import com.pim.util.CommonMethods;

@RestController
public class AppController<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	private CommonMethods<T> cms;
	
	@Autowired
	private PimService userRegService;
	
	@Autowired
	private PimRepository urRepository;
	
	@Value("${icp.server.url}")
	private String icpServerUrl;
	
	RestTemplate restTemplate = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();
	
	@PostMapping(value="/registeruser", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T registerUser(@RequestBody RegisterUser userReg){
		RegisterUser registerUser = new RegisterUser();	
		ResponseEntity<RegisterUserResponse> registerUserResponse = null;
		
		try {
			JAXBContext jc = JAXBContext.newInstance(RegisterUser.class);
			logger.info("Request to RegisterUser info: "+cms.convertToXmlFromModel(jc, (T) userReg));
			
			registerUser.setHead(userReg.getHead());
			registerUser.setEntity(userReg.getEntity());
			registerUser.setReq(userReg.getReq());
			registerUser.setChannelInfo(userReg.getChannelInfo());
			
//			HttpEntity<RegisterUser> request = new HttpEntity<RegisterUser>(userReg, headers);
//			registerUserResponse = restTemplate.postForEntity(icpServerUrl, request, RegisterUserResponse.class);
			
			userRegService.insertUserRegistrationData(userReg, "registerUser", jc, registerUser);
			logger.info("Response Data for RegisterUser: "+cms.convertToXmlFromModel(jc, (T) registerUser));
			
//			RestTemplate restTemplate = new RestTemplate();
//			HttpHeaders headers = new HttpHeaders();
//			HttpEntity<RegisterUser> request = new HttpEntity<RegisterUser>(userReg, headers);
//			getFIUserInfo = restTemplate.postForEntity("http://localhost:8080/getfiuserinfo/", request, GetFIUserInfo.class);		
//			
//			return getFIUserInfo.getBody();
			
			//return  (T) registerUserResponse;
			return (T) registerUser;
		}
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return (T) ("Error Data: "+ e);
		}
	}
	
	@PostMapping(value="/transferfunds", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T transferFunds(@RequestBody TransferFunds fundTransfer) throws JAXBException{		
		TransferFunds transferFunds = new TransferFunds();
		Transactions ts = new Transactions();
		ResponseEntity<TransactionResponse> transactionResponse = null;
		
		try {	
			JAXBContext jc = JAXBContext.newInstance(TransferFunds.class);
			logger.info("Request to TransferFunds info : "+cms.convertToXmlFromModel(jc, (T) fundTransfer));
			
			transferFunds.setHead(fundTransfer.getHead());
			transferFunds.setReq(fundTransfer.getReq());
			transferFunds.setChannelInfo(fundTransfer.getChannelInfo());
			transferFunds.setTransactionInfo(fundTransfer.getTransactionInfo());
			
			String vid = fundTransfer.getTransactionInfo().getSenderInfo().getSenderVID().toString();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
//			HttpEntity<TransferFunds> request = new HttpEntity<TransferFunds>(fundTransfer, headers);
//			transactionResponse = restTemplate.postForEntity(icpServerUrl, request, TransactionResponse.class);
			
			userRegService.transactionInsertion(fundTransfer, ts, transferFunds, cpData);
			userRegService.interfaceLogsInsertion(fundTransfer, "transferfunds", jc, transferFunds);
			logger.info("Response Data for TransferFunds: "+cms.convertToXmlFromModel(jc, (T) transferFunds));
			
			//return (T) transactionResponse;
			return (T) transferFunds;
		}
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return (T) ("Error Data: "+ e);
		}
		
	}
	
	@PostMapping(value="/creatertp", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T createRTP(@RequestBody CreateRTP rtpCreation){
		CreateRTP createRTP = new CreateRTP();
		Transactions ts = new Transactions();
		ResponseEntity<CreateRTPResponse> createRTPResponse = null;
			
		try {	
			JAXBContext jc = JAXBContext.newInstance(CreateRTP.class);
			logger.info("Request to CreateRTP info : "+cms.convertToXmlFromModel(jc, (T) rtpCreation));
			
			createRTP.setHead(rtpCreation.getHead());
			createRTP.setReq(rtpCreation.getReq());
			createRTP.setChannelInfo(rtpCreation.getChannelInfo());
			createRTP.setRequestInfo(rtpCreation.getRequestInfo());
			
			HttpEntity<CreateRTP> request = new HttpEntity<CreateRTP>(rtpCreation, headers);
			createRTPResponse = restTemplate.postForEntity(icpServerUrl, request, CreateRTPResponse.class);
			
			String vid = rtpCreation.getRequestInfo().getSenderInfo().getSenderVID().getValue().toString();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
			userRegService.transactionInsertion(rtpCreation, ts, createRTP, cpData);
			userRegService.interfaceLogsInsertion(rtpCreation, "creatertp", jc, createRTP);
			logger.info("Response Data for CreateRTP: "+cms.convertToXmlFromModel(jc, (T) createRTP));
			
			return (T) createRTPResponse;
		}
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return (T) ("Error Data: "+ e);
		}
		
	}
	
	@PostMapping(value="/initiatefundtransfer", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T initiateFundTransfer(@RequestBody InitiateFundTransfer fundTransferInitiate){
		InitiateFundTransfer initiateFundTransfer = new InitiateFundTransfer();
		Transactions ts = new Transactions();
		ResponseEntity<TransactionResponse> transactionResponse = null;
		
		try {
			JAXBContext jc = JAXBContext.newInstance(InitiateFundTransfer.class);
			logger.info("Request to InitiateFundTransfer info : "+cms.convertToXmlFromModel(jc, (T) fundTransferInitiate));
			
			initiateFundTransfer.setHead(fundTransferInitiate.getHead());
			initiateFundTransfer.setReq(fundTransferInitiate.getReq());
			initiateFundTransfer.setChannelInfo(fundTransferInitiate.getChannelInfo());
			initiateFundTransfer.setTransactionInfo(fundTransferInitiate.getTransactionInfo());
			
			HttpEntity<InitiateFundTransfer> request = new HttpEntity<InitiateFundTransfer>(fundTransferInitiate, headers);
			transactionResponse = restTemplate.postForEntity(icpServerUrl, request, TransactionResponse.class);
			
			String vid = fundTransferInitiate.getTransactionInfo().getSenderInfo().getSenderVID().getValue().toString();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
			userRegService.transactionInsertion(fundTransferInitiate, ts, initiateFundTransfer, cpData);
			userRegService.interfaceLogsInsertion(fundTransferInitiate, "initiatefundtransfer", jc, initiateFundTransfer);
			logger.info("Response Data for InitiateFundTransfer: "+cms.convertToXmlFromModel(jc, (T) initiateFundTransfer));
			
			return (T) transactionResponse;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return (T) ("Error Data: "+ e);
		}
		
	}
	
	@PostMapping(value="/gettransactionsbyfi", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T getTransactionsbyFI(@RequestBody GetTransactionsbyFI getFITransactions){
		GetTransactionsbyFI getTransactionsbyFI = new GetTransactionsbyFI();	
		Transactions ts = new Transactions();
		ResponseEntity<GetTransactionsbyFIResponse> transactionsbyFIResponse = null;
		
		try {	
			JAXBContext jc = JAXBContext.newInstance(GetTransactionsbyFI.class);
			logger.info("Request to GetTransactionsbyFI info : "+cms.convertToXmlFromModel(jc, (T) getFITransactions));
			
			getTransactionsbyFI.setHead(getFITransactions.getHead());
			getTransactionsbyFI.setReq(getFITransactions.getReq());
			getTransactionsbyFI.setChannelInfo(getFITransactions.getChannelInfo());
			getTransactionsbyFI.setReqInfo(getFITransactions.getReqInfo());
			
			HttpEntity<GetTransactionsbyFI> request = new HttpEntity<GetTransactionsbyFI>(getFITransactions, headers);
			transactionsbyFIResponse = restTemplate.postForEntity(icpServerUrl, request, GetTransactionsbyFIResponse.class);
			
			userRegService.interfaceLogsInsertion(getFITransactions, "gettransactionsbyfi", jc, getTransactionsbyFI);
			logger.info("Response Data for GetTransactionsbyFI: "+cms.convertToXmlFromModel(jc, (T) getTransactionsbyFI));
			
			return (T) transactionsbyFIResponse;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return (T) ("Error Data: "+ e);
		}
		
	}
	
	@PostMapping(value="/getrtplistsent", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T getRTPListSent(@RequestBody GetRTPListSent getListSentRTP){
		GetRTPListSent getRTPListSent = new GetRTPListSent();
		Transactions ts = new Transactions();
		ResponseEntity<GetRTPListSentResponse> rtpListSentResponse = null;
		
		try {
			JAXBContext jc = JAXBContext.newInstance(GetRTPListSent.class);
			logger.info("Request to GetRTPListSent info : "+cms.convertToXmlFromModel(jc, (T) getListSentRTP));
			
			getRTPListSent.setHead(getListSentRTP.getHead());
			getRTPListSent.setReq(getListSentRTP.getReq());
			getRTPListSent.setChannelInfo(getListSentRTP.getChannelInfo());
			getRTPListSent.setReqInfo(getListSentRTP.getReqInfo());
			
			HttpEntity<GetRTPListSent> request = new HttpEntity<GetRTPListSent>(getListSentRTP, headers);
			rtpListSentResponse = restTemplate.postForEntity(icpServerUrl, request, GetRTPListSentResponse.class);
			
			userRegService.interfaceLogsInsertion(getListSentRTP, "getrtplistsent", jc, getRTPListSent);
			logger.info("Response Data for GetRTPListSent: "+cms.convertToXmlFromModel(jc, (T) getRTPListSent));
			
			return (T) rtpListSentResponse;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return (T) ("Error Data: "+ e);
		}
	}
	
	@PostMapping(value="/getrtplistreceived", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T getRTPListReceived(@RequestBody GetRTPListReceived getListReceivedRTP){
		GetRTPListReceived getRTPListReceived = new GetRTPListReceived();
		ResponseEntity<GetRTPListReceivedResponse> rtpListReceivedResponse = null;
			
		try {	
			JAXBContext jc = JAXBContext.newInstance(GetRTPListReceived.class);
			logger.info("Request to GetRTPListReceived info : "+cms.convertToXmlFromModel(jc, (T) getListReceivedRTP));
			
			getRTPListReceived.setHead(getListReceivedRTP.getHead());
			getRTPListReceived.setReq(getListReceivedRTP.getReq());
			getRTPListReceived.setChannelInfo(getListReceivedRTP.getChannelInfo());
			getRTPListReceived.setReqInfo(getListReceivedRTP.getReqInfo());
			
			HttpEntity<GetRTPListReceived> request = new HttpEntity<GetRTPListReceived>(getListReceivedRTP, headers);
			rtpListReceivedResponse = restTemplate.postForEntity(icpServerUrl, request, GetRTPListReceivedResponse.class);
			
			userRegService.interfaceLogsInsertion(getListReceivedRTP, "getrtplistreceived", jc, getRTPListReceived);
			logger.info("Response Data for GetRTPListReceived: "+cms.convertToXmlFromModel(jc, (T) getRTPListReceived));
			
			return (T) rtpListReceivedResponse;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return (T) ("Error Data: "+ e);
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
			
			userRegService.interfaceLogsInsertion(userFIValidate, "ValidateFIUser", jc, validateFIUser);
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
			
			userRegService.interfaceLogsInsertion(accountChangeNotifyIDTPAccountChange, "NotifyIDTPAccountChange", jc, notifyIDTPAccountChange);
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
			
			userRegService.interfaceLogsInsertion(getInfoFIUser, "GetFIUserInfo", jc, getInfoFIUser);
			logger.info("Response Data for GetFIUserInfo: "+cms.convertToXmlFromModel(jc, (T) getFIUserInfo));
			
			return getFIUserInfo;
		}
		
		catch (Exception e) {
			logger.error("Error Data: "+ e);
			return getFIUserInfo;
		}
	}
	
	@PostMapping(value="/transferfundsiso", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T transferFundsISO(@RequestBody DataPDUPACS06 pduData) {
		DataPDUPACS06 dataPDU = new DataPDUPACS06();
		Transactions ts = new Transactions();
		ResponseEntity<DataPDUPACS06> dataPDUPACS06 = null;
		
		try {
			JAXBContext jc = JAXBContext.newInstance(DataPDUPACS06.class);
			logger.info("Request to transferFundsISO info : "+cms.convertToXmlFromModel(jc, (T) pduData));
			
			dataPDU.setRevision(pduData.getRevision());
			dataPDU.setBody(pduData.getBody());
			
			HttpEntity<DataPDUPACS06> request = new HttpEntity<DataPDUPACS06>(pduData, headers);
			dataPDUPACS06 = restTemplate.postForEntity(icpServerUrl, request, DataPDUPACS06.class);
			
			String vid = pduData.getBody().getDocument().getFiToFICstmrCdtTrf().getCdtTrfTxInf().getDbtrAcct().getId().getOthr().getId();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
			userRegService.transactionInsertion(pduData, ts, pduData, cpData);
			userRegService.interfaceLogsInsertion(pduData, "transferfundsiso", jc, pduData);
			logger.info("Response Data for transferFundsISO: "+cms.convertToXmlFromModel(jc, (T) dataPDU));
			
			return (T) dataPDUPACS06;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return (T) ("Error Data for DataPDU: "+ e);
		}
	}
	

	@PostMapping(value="/ProcessFundTransferRequest", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public DataPDUPACS06 processFundTransferRequest(@RequestBody DataPDUPACS06 pduData) {
		DataPDUPACS06 dataPDU = new DataPDUPACS06();
		Transactions ts = new Transactions();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(DataPDUPACS06.class);
			logger.info("Request to processFundTransferRequest info : "+cms.convertToXmlFromModel(jc, (T) pduData));
			
			dataPDU.setRevision(pduData.getRevision());
			dataPDU.setBody(pduData.getBody());
			
//			String vid = pduData.getBody().getDocument().getFiToFICstmrCdtTrf().getCdtTrfTxInf().getCdtrAcct().getId().getOthr().getId().toString();
//			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
//			
//			userRegService.transactionInsertion(pduData, ts, pduData, cpData);
			userRegService.interfaceLogsInsertion(pduData, "ProcessFundTransferRequest", jc, pduData);
			logger.info("Response Data for processFundTransferRequest: "+cms.convertToXmlFromModel(jc, (T) dataPDU));
			
			return dataPDU;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return dataPDU;
		}
	}
	
	@PostMapping(value="/creatertpiso", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public T createRTPISO(@RequestBody BodyPAIN01300106 rtpISOCreate) {
		BodyPAIN01300106 createRTPISO = new BodyPAIN01300106();
		Transactions ts = new Transactions();
		ResponseEntity<DataPDUPACS06> dataPDUPACS06 = null;
		
		try {
			JAXBContext jc = JAXBContext.newInstance(BodyPAIN01300106.class);
			logger.info("Request to createRTPISO info : "+cms.convertToXmlFromModel(jc, (T) rtpISOCreate));
			
			createRTPISO.setAppHdr(rtpISOCreate.getAppHdr());
			createRTPISO.setPain06Document(rtpISOCreate.getPain06Document());
			
			HttpEntity<BodyPAIN01300106> request = new HttpEntity<BodyPAIN01300106>(rtpISOCreate, headers);
			dataPDUPACS06 = restTemplate.postForEntity(icpServerUrl, request, DataPDUPACS06.class);
			
			String vid = rtpISOCreate.getPain06Document().getCdtrPmtActvtnReq().getPmtInf().getCdtTrfTx().getCdtr().getNm().toString();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
			userRegService.transactionInsertion(rtpISOCreate, ts, rtpISOCreate, cpData);
			userRegService.interfaceLogsInsertion(rtpISOCreate, "creatertpiso", jc, rtpISOCreate);
			logger.info("Response Data for createRTPISO: "+cms.convertToXmlFromModel(jc, (T) createRTPISO));
			
			return (T) dataPDUPACS06;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return (T) ("Error Data for DataPDU: "+ e);
		}
	}
	
	@PostMapping(value="/ProcessRTPRequest", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public BodyPAIN01300106 processRTPRequest(@RequestBody BodyPAIN01300106 isoCreateRTP) {
		BodyPAIN01300106 processRTPRequest = new BodyPAIN01300106();
		Transactions ts = new Transactions();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(BodyPAIN01300106.class);
			logger.info("Request to processRTPRequest info : "+cms.convertToXmlFromModel(jc, (T) isoCreateRTP));
			
			processRTPRequest.setAppHdr(isoCreateRTP.getAppHdr());
			processRTPRequest.setPain06Document(isoCreateRTP.getPain06Document());
			
			String vid = isoCreateRTP.getPain06Document().getCdtrPmtActvtnReq().getPmtInf().getCdtTrfTx().getCdtr().getNm().toString();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
			userRegService.transactionInsertion(isoCreateRTP, ts, processRTPRequest, cpData);
			userRegService.interfaceLogsInsertion(isoCreateRTP, "ProcessRTPRequest", jc, processRTPRequest);
			logger.info("Response Data for processRTPRequest: "+cms.convertToXmlFromModel(jc, (T) processRTPRequest));
			
			return processRTPRequest;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return processRTPRequest;
		}
	}
	
	@PostMapping(value="/ProcessRTPDeclinedResponse", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public BodyPAIN01300106 processRTPDeclinedResponse(@RequestBody BodyPAIN01300106 rtpDeclinedResponseProcess) {
		BodyPAIN01300106 processRTPDeclinedResponse = new BodyPAIN01300106();
		Transactions ts = new Transactions();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(BodyPAIN01300106.class);
			logger.info("Request to processRTPDeclinedResponse info : "+cms.convertToXmlFromModel(jc, (T) rtpDeclinedResponseProcess));
			
			processRTPDeclinedResponse.setAppHdr(rtpDeclinedResponseProcess.getAppHdr());
			processRTPDeclinedResponse.setPain06Document(rtpDeclinedResponseProcess.getPain06Document());
			
			String vid = rtpDeclinedResponseProcess.getPain06Document().getCdtrPmtActvtnReq().getPmtInf().getCdtTrfTx().getCdtr().getNm().toString();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
			userRegService.transactionInsertion(rtpDeclinedResponseProcess, ts, processRTPDeclinedResponse, cpData);
			userRegService.interfaceLogsInsertion(rtpDeclinedResponseProcess, "ProcessRTPDeclinedResponse", jc, processRTPDeclinedResponse);
			logger.info("Response Data for processRTPDeclinedResponse: "+cms.convertToXmlFromModel(jc, (T) processRTPDeclinedResponse));
			
			return processRTPDeclinedResponse;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return processRTPDeclinedResponse;
		}
	}
	
	@PostMapping(value="/InitiateFundTransferISO", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public DataPDUPAIN00100104 initiateFundTransferISO(@RequestBody DataPDUPAIN00100104 fundTransferISOInitiate) {
		DataPDUPAIN00100104 initiateFundTransferISO = new DataPDUPAIN00100104();
		Transactions ts = new Transactions();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(DataPDUPAIN00100104.class);
			logger.info("Request to initiateFundTransferISO info : "+cms.convertToXmlFromModel(jc, (T) fundTransferISOInitiate));
			
			initiateFundTransferISO.setRevision(fundTransferISOInitiate.getRevision());
			initiateFundTransferISO.setBodyPAIN00100104(fundTransferISOInitiate.getBodyPAIN00100104());
			
			String vid = fundTransferISOInitiate.getBodyPAIN00100104().getDocument().getCstmrCdtTrfInitn().getPmtInf().getCdtTrfTxInf().getCdtr().getNm().toString();
			List<CustomerProfiles> cpData = urRepository.selectProfileData(vid);
			
			userRegService.transactionInsertion(fundTransferISOInitiate, ts, initiateFundTransferISO, cpData);
			userRegService.interfaceLogsInsertion(fundTransferISOInitiate, "ProcessRTPDeclinedResponse", jc, initiateFundTransferISO);
			logger.info("Response Data for initiateFundTransferISO: "+cms.convertToXmlFromModel(jc, (T) initiateFundTransferISO));
			
			return initiateFundTransferISO;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return initiateFundTransferISO;
		}
	}
	
	@PostMapping(value="/GetAccountBalance", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public DataPDUCAMT00300105 getAccountBalance(@RequestBody DataPDUCAMT00300105 accountBalanceGet) {
		DataPDUCAMT00300105 getAccountBalance = new DataPDUCAMT00300105();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(DataPDUCAMT00300105.class);
			logger.info("Request to getAccountBalance info : "+cms.convertToXmlFromModel(jc, (T) accountBalanceGet));
			
			getAccountBalance.setRevision(accountBalanceGet.getRevision());
			getAccountBalance.setBody(accountBalanceGet.getBody());
			
			userRegService.interfaceLogsInsertion(accountBalanceGet, "ProcessRTPDeclinedResponse", jc, getAccountBalance);
			logger.info("Response Data for getAccountBalance: "+cms.convertToXmlFromModel(jc, (T) getAccountBalance));
			
			return getAccountBalance;
		}
		
		catch (Exception e) {
			logger.error("Error Data for DataPDU: "+ e);
			return getAccountBalance;
		}
	}
}
