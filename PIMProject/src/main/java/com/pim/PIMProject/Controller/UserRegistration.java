package com.pim.PIMProject.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pim.PIMProject.Model.ContactReference;
import com.pim.PIMProject.Model.Cred;
import com.pim.PIMProject.Model.Creds;
import com.pim.PIMProject.Model.DeviceInfo;
import com.pim.PIMProject.Model.Entity;
import com.pim.PIMProject.Model.FinancialInstitutionInfo;
import com.pim.PIMProject.Model.Head;
import com.pim.PIMProject.Model.Info;
import com.pim.PIMProject.Model.OtherInfo;
import com.pim.PIMProject.Model.RegisterUser;
import com.pim.PIMProject.Model.Req;
import com.pim.PIMProject.Model.RequestedVirtualID;

@RestController
public class UserRegistration {
	
	@RequestMapping(value="/", produces=MediaType.APPLICATION_XML_VALUE)
	public RegisterUser registerUser(){
		RegisterUser registerUser = new RegisterUser();
		ContactReference contactReference = new ContactReference();
		Cred cred1 = new Cred();
		Cred cred2 = new Cred();
		Creds creds = new Creds();
		DeviceInfo deviceInfo = new DeviceInfo();
		Entity entity = new Entity();
		FinancialInstitutionInfo financialInstitutionInfo = new FinancialInstitutionInfo();
		Head head = new Head();
		Info info = new Info();
		OtherInfo otherInfo = new OtherInfo();
		Req req = new Req();
		RequestedVirtualID requestedVirtualID = new RequestedVirtualID();
		
		head.setVer("1.0");
		head.setTs("12/1/2020 2:15:18 AM");
		head.setOrgId("SBL1BDDH");
		head.setMsgId("1");
		
		req.setId("2b4251e7-4275-40c4-b366-5da09f10fd47");
		req.setNote("RegisterUser");
		req.setTs("2020-01-01 02:15:18");
		req.setType("RegisterUser");
		
		info.setEntityType("Individual");
		info.setName("Sample User 1");
		info.setAddressLine1("Dhaka 1");
		info.setAddressLine2("Dhaka 2");
		info.setDistrict("Dhaka");
		info.setPostalCode("1206");
		info.setMobileNumber("01710000000");
		info.setEmail("samleuser1@gmail.com");
		info.setTypeOfOwnership("");
		info.setTypeOfBusiness("");
		info.setNameOfMinistry("");
		info.setNameOfDivision("");
		info.setTypeOfFinancialInstitution("");
		info.setSwiftCode("");
		info.setCBAccountNumber("");
		info.setNID("18033001882336991");
		info.setTIN("055710312020");
		info.setBIN("");
		info.setIDTPKey("");
		info.setDateOfBirth("12/01/1988");
		info.setCallBackURL("");
		info.setPassword("XXXXXXXXXX");
		
		deviceInfo.setDevice_ID("");
		deviceInfo.setMobile_No("");
		deviceInfo.setLocation("");
		deviceInfo.setIP("");
		
		financialInstitutionInfo.setFinancialInstitution("Sample Bank 1");
		financialInstitutionInfo.setBranchName("");
		financialInstitutionInfo.setRoutingNumber("065210312020");
		financialInstitutionInfo.setAccountingNumber("8511905700115926");
		
		contactReference.setContactPersonName("");
		contactReference.setDesignation("");
		contactReference.setContactNumber("");
		contactReference.setEmail("");
		
		cred1.setType("IDTP_PIN");
		cred1.setSubtype("");
		cred1.setData("XXXXXX");
		
		cred2.setType("APP_PASS");
		cred2.setSubtype("");
		cred2.setData("XXXXXX");
		
		creds.creds.add(cred1);
		creds.creds.add(cred2);
		
		requestedVirtualID.setValue("sampleuser2@gmail.com");
		
		otherInfo.setChannel("Online");
		
		entity.setSeqNum("1");
		entity.setInfo(info);
		entity.setDeviceInfo(deviceInfo);
		entity.setFinancialInstitutionInfo(financialInstitutionInfo);
		entity.setContactReference(contactReference);
		entity.setCreds(creds);
		entity.setRequestedVirtualID(requestedVirtualID);
		entity.setOtherInfo(otherInfo);
		
		registerUser.setHead(head);
		registerUser.setReq(req);
		registerUser.setEntity(entity);

		return registerUser;
	}
}
