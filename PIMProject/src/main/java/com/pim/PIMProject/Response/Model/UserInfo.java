package com.pim.PIMProject.Response.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserInfo {
	@JacksonXmlProperty(isAttribute = true)
	private String seqNum;
	@JacksonXmlProperty(localName = "Status")
	private String status;
	@JacksonXmlProperty(localName = "VirtualID")
	private String virtualID;
	@JacksonXmlProperty(localName = "Reason")
	private String reason;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String seqNum, String status, String virtualID, String reason) {
		super();
		this.seqNum = seqNum;
		this.status = status;
		this.virtualID = virtualID;
		this.reason = reason;
	}
	public String getSeqNum() {
		return seqNum;
	}
	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVirtualID() {
		return virtualID;
	}
	public void setVirtualID(String virtualID) {
		this.virtualID = virtualID;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
