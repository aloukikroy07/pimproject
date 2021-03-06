package com.pim.PIMProject.Model.Request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Entity {
	
	@JacksonXmlProperty(isAttribute = true)
	private String seqNum;
	
	@JacksonXmlProperty(localName = "Info")
	private Info info;
	
	@JacksonXmlProperty(localName = "DeviceInfo")
	private DeviceInfo deviceInfo;
	
	@JacksonXmlProperty(localName = "FinancialInstitutionInfo")
	private FinancialInstitutionInfo financialInstitutionInfo;
	
	@JacksonXmlProperty(localName = "ContactReference")
	private ContactReference contactReference;
	
	@JacksonXmlProperty(localName = "Creds")
	private Creds creds;
	
	@JacksonXmlProperty(localName = "RequestedVirtualID")
	private RequestedVirtualID requestedVirtualID;
	
	@JacksonXmlProperty(localName = "OtherInfo")
	private OtherInfo otherInfo;
	
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entity(String seqNum, Info info, DeviceInfo deviceInfo, FinancialInstitutionInfo financialInstitutionInfo,
			ContactReference contactReference, Creds creds, RequestedVirtualID requestedVirtualID,
			OtherInfo otherInfo) {
		super();
		this.seqNum = seqNum;
		this.info = info;
		this.deviceInfo = deviceInfo;
		this.financialInstitutionInfo = financialInstitutionInfo;
		this.contactReference = contactReference;
		this.creds = creds;
		this.requestedVirtualID = requestedVirtualID;
		this.otherInfo = otherInfo;
	}

	public String getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public FinancialInstitutionInfo getFinancialInstitutionInfo() {
		return financialInstitutionInfo;
	}

	public void setFinancialInstitutionInfo(FinancialInstitutionInfo financialInstitutionInfo) {
		this.financialInstitutionInfo = financialInstitutionInfo;
	}

	public ContactReference getContactReference() {
		return contactReference;
	}

	public void setContactReference(ContactReference contactReference) {
		this.contactReference = contactReference;
	}

	public Creds getCreds() {
		return creds;
	}

	public void setCreds(Creds creds) {
		this.creds = creds;
	}

	public RequestedVirtualID getRequestedVirtualID() {
		return requestedVirtualID;
	}

	public void setRequestedVirtualID(RequestedVirtualID requestedVirtualID) {
		this.requestedVirtualID = requestedVirtualID;
	}

	public OtherInfo getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(OtherInfo otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	

}
