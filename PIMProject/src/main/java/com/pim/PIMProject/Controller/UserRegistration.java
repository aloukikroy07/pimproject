package com.pim.PIMProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value="/", produces= MediaType.APPLICATION_XML_VALUE, consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public RegisterUser registerUser(@RequestBody RegisterUser userReg){
		RegisterUser registerUser = new RegisterUser();
		ContactReference contactReference = new ContactReference();
		Cred cred1 = new Cred();
		Cred cred2 = new Cred();
		Creds credentials = new Creds();
		DeviceInfo deviceInfo = new DeviceInfo();
		Entity entity = new Entity();
		FinancialInstitutionInfo financialInstitutionInfo = new FinancialInstitutionInfo();
		Head head = new Head();
		Info info = new Info();
		OtherInfo otherInfo = new OtherInfo();
		Req req = new Req();
		RequestedVirtualID requestedVirtualID = new RequestedVirtualID();
		
		head.setVer(userReg.getHead().getVer());
		head.setTs(userReg.getHead().getTs());
		head.setOrgId(userReg.getHead().getOrgId());
		head.setMsgId(userReg.getHead().getMsgId());
		
		req.setId(userReg.getReq().getId());
		req.setNote(userReg.getReq().getNote());
		req.setTs(userReg.getReq().getTs());
		req.setType(userReg.getReq().getType());
		
		
		info.setEntityType(userReg.getEntity().getInfo().getEntityType());
		info.setName(userReg.getEntity().getInfo().getName());
		info.setAddressLine1(userReg.getEntity().getInfo().getAddressLine1());
		info.setAddressLine2(userReg.getEntity().getInfo().getAddressLine2());
		info.setDistrict(userReg.getEntity().getInfo().getDistrict());
		info.setPostalCode(userReg.getEntity().getInfo().getPostalCode());
		info.setMobileNumber(userReg.getEntity().getInfo().getMobileNumber());
		info.setEmail(userReg.getEntity().getInfo().getEmail());
		info.setTypeOfOwnership(userReg.getEntity().getInfo().getTypeOfOwnership());
		info.setTypeOfBusiness(userReg.getEntity().getInfo().getTypeOfBusiness());
		info.setNameOfMinistry(userReg.getEntity().getInfo().getNameOfMinistry());
		info.setNameOfDivision(userReg.getEntity().getInfo().getNameOfDivision());
		info.setTypeOfFinancialInstitution(userReg.getEntity().getInfo().getTypeOfFinancialInstitution());
		info.setSwiftCode(userReg.getEntity().getInfo().getSwiftCode());
		info.setcBAccountNumber(userReg.getEntity().getInfo().getcBAccountNumber());
		info.setnID(userReg.getEntity().getInfo().getnID());
		info.settIN(userReg.getEntity().getInfo().gettIN());
		info.setbIN(userReg.getEntity().getInfo().getbIN());
		info.setiDTPKey(userReg.getEntity().getInfo().getiDTPKey());
		info.setDateOfBirth(userReg.getEntity().getInfo().getDateOfBirth());
		info.setCallBackURL(userReg.getEntity().getInfo().getCallBackURL());
		info.setPassword(userReg.getEntity().getInfo().getPassword());
		
		deviceInfo.setDevice_ID(userReg.getEntity().getDeviceInfo().getDevice_ID());
		deviceInfo.setMobile_No(userReg.getEntity().getDeviceInfo().getMobile_No());
		deviceInfo.setLocation(userReg.getEntity().getDeviceInfo().getLocation());
		deviceInfo.setiP(userReg.getEntity().getDeviceInfo().getiP());
		
		financialInstitutionInfo.setFinancialInstitution(userReg.getEntity().getFinancialInstitutionInfo().getFinancialInstitution());
		financialInstitutionInfo.setBranchName(userReg.getEntity().getFinancialInstitutionInfo().getBranchName());
		financialInstitutionInfo.setRoutingNumber(userReg.getEntity().getFinancialInstitutionInfo().getRoutingNumber());
		financialInstitutionInfo.setAccountNumber(userReg.getEntity().getFinancialInstitutionInfo().getAccountNumber());
		
		contactReference.setContactPersonName(userReg.getEntity().getContactReference().getContactPersonName());
		contactReference.setDesignation(userReg.getEntity().getContactReference().getDesignation());
		contactReference.setContactNumber(userReg.getEntity().getContactReference().getContactNumber());
		contactReference.setEmail(userReg.getEntity().getContactReference().getEmail());
		
		cred1.setType(userReg.getEntity().getCreds().getCreds().get(0).getType());
		cred1.setSubtype(userReg.getEntity().getCreds().getCreds().get(0).getSubtype());
		cred1.setData(userReg.getEntity().getCreds().getCreds().get(0).getData());
		
		cred2.setType(userReg.getEntity().getCreds().getCreds().get(1).getType());
		cred2.setSubtype(userReg.getEntity().getCreds().getCreds().get(1).getSubtype());
		cred2.setData(userReg.getEntity().getCreds().getCreds().get(1).getData());
		
		List<Cred> creds = new ArrayList<>();
		creds.add(cred1);
		creds.add(cred2);
		credentials.setCreds(creds);
		
		requestedVirtualID.setValue(userReg.getEntity().getRequestedVirtualID().getValue());
		
		otherInfo.setChannel(userReg.getEntity().getOtherInfo().getChannel());
		
		entity.setSeqNum(userReg.getEntity().getSeqNum());
		entity.setInfo(info);
		entity.setDeviceInfo(deviceInfo);
		entity.setFinancialInstitutionInfo(financialInstitutionInfo);
		entity.setContactReference(contactReference);
		entity.setCreds(credentials);
		entity.setRequestedVirtualID(requestedVirtualID);
		entity.setOtherInfo(otherInfo);
		
		registerUser.setHead(head);
		registerUser.setReq(req);
		registerUser.setEntity(entity);

		return registerUser;
	}
}
