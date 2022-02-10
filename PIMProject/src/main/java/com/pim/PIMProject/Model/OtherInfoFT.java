package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//@JacksonXmlRootElement(localName = "SenderVID")
public class OtherInfoFT {
	@JacksonXmlProperty(localName = "Purpose")
	private String purpose;
	@JacksonXmlProperty(localName = "BillNo")
	private String billNo;
	@JacksonXmlProperty(localName = "RTPID")
	private String rTPID;
	public OtherInfoFT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OtherInfoFT(String purpose, String billNo, String rTPID) {
		super();
		this.purpose = purpose;
		this.billNo = billNo;
		this.rTPID = rTPID;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getrTPID() {
		return rTPID;
	}
	public void setrTPID(String rTPID) {
		this.rTPID = rTPID;
	}
	
}
