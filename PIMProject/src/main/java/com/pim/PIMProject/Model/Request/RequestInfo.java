package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RequestInfo {
	@JacksonXmlProperty(isAttribute = true)
	private String addr;
	@JacksonXmlProperty(isAttribute = true)
	private String type;
	@JacksonXmlProperty(localName = "SenderInfo")
	private SenderInfo senderInfo;
	@JacksonXmlProperty(localName = "DeviceInfo")
	private DeviceInfo deviceInfo;
	@JacksonXmlProperty(localName = "ReceiverInfo")
	private ReceiverInfo receiverInfo;
	@JacksonXmlProperty(localName = "ReqInfo")
	private ReqInfo reqInfo;
	@JacksonXmlProperty(localName = "OtherInfo")
	private OtherInfo otherInfo;
	@JacksonXmlProperty(localName = "Creds")
	private Creds creds;
	public RequestInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestInfo(String addr, String type, SenderInfo senderInfo, DeviceInfo deviceInfo,
			ReceiverInfo receiverInfo, ReqInfo reqInfo, OtherInfo otherInfo, Creds creds) {
		super();
		this.addr = addr;
		this.type = type;
		this.senderInfo = senderInfo;
		this.deviceInfo = deviceInfo;
		this.receiverInfo = receiverInfo;
		this.reqInfo = reqInfo;
		this.otherInfo = otherInfo;
		this.creds = creds;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public SenderInfo getSenderInfo() {
		return senderInfo;
	}
	public void setSenderInfo(SenderInfo senderInfo) {
		this.senderInfo = senderInfo;
	}
	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public ReceiverInfo getReceiverInfo() {
		return receiverInfo;
	}
	public void setReceiverInfo(ReceiverInfo receiverInfo) {
		this.receiverInfo = receiverInfo;
	}
	public ReqInfo getReqInfo() {
		return reqInfo;
	}
	public void setReqInfo(ReqInfo reqInfo) {
		this.reqInfo = reqInfo;
	}
	public OtherInfo getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(OtherInfo otherInfo) {
		this.otherInfo = otherInfo;
	}
	public Creds getCreds() {
		return creds;
	}
	public void setCreds(Creds creds) {
		this.creds = creds;
	}
	
}
