package com.pim.PIMProject.Model;

public class Entity {
	public Info info;
	public DeviceInfo deviceInfo;
	public FinancialInstitutionInfo financialInstitutionInfo;
	public ContactReference contactReference;
	public Creds creds;
	public RequestedVirtualID requestedVirtualID;
	public OtherInfo otherInfo;
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
