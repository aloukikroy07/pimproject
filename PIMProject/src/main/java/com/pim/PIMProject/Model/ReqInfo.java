package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ReqInfo {
	@JacksonXmlProperty(isAttribute = true)
	private String addrType;
	@JacksonXmlProperty(localName = "ReferenceNo")
	private ReferenceNo referenceNo;
	@JacksonXmlProperty(localName = "ReqAmount")
	private ReqAmount reqAmount;
	public ReqInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReqInfo(String addrType, ReferenceNo referenceNo, ReqAmount reqAmount) {
		super();
		this.addrType = addrType;
		this.referenceNo = referenceNo;
		this.reqAmount = reqAmount;
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
	
	
}
