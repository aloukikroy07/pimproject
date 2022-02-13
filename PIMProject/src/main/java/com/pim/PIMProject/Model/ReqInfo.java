package com.pim.PIMProject.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ReqInfo {
	@JacksonXmlProperty(localName = "DeviceInfo")
	private DeviceInfo deviceInfo;
	@JacksonXmlProperty(localName = "FIInfo")
	private FIInfo fiInfo;
	@JacksonXmlProperty(localName = "UserInfo")
	private UserInfo userInfo;
	@JacksonXmlProperty(isAttribute = true)
	private String addrType;
	@JacksonXmlProperty(localName = "ReferenceNo")
	private ReferenceNo referenceNo;
	@JacksonXmlProperty(localName = "ReqAmount")
	private ReqAmount reqAmount;
	@JacksonXmlProperty(localName = "OtherInfo")
	private OtherInfo otherInfo;
	public ReqInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReqInfo(DeviceInfo deviceInfo, FIInfo fiInfo, UserInfo userInfo, String addrType, ReferenceNo referenceNo,
			ReqAmount reqAmount, OtherInfo otherInfo) {
		super();
		this.deviceInfo = deviceInfo;
		this.fiInfo = fiInfo;
		this.userInfo = userInfo;
		this.addrType = addrType;
		this.referenceNo = referenceNo;
		this.reqAmount = reqAmount;
		this.otherInfo = otherInfo;
	}
	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public FIInfo getFiInfo() {
		return fiInfo;
	}
	public void setFiInfo(FIInfo fiInfo) {
		this.fiInfo = fiInfo;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	public ReferenceNo getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(ReferenceNo referenceNo) {
		this.referenceNo = referenceNo;
	}
	public ReqAmount getReqAmount() {
		return reqAmount;
	}
	public void setReqAmount(ReqAmount reqAmount) {
		this.reqAmount = reqAmount;
	}
	public OtherInfo getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(OtherInfo otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	
}
