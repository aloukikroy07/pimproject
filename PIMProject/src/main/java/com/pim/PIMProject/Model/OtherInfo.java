package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OtherInfo {
	@JacksonXmlProperty(localName = "Purpose")
	private String purpose;
	@JacksonXmlProperty(localName = "BillNo")
	private String billNo;
	@JacksonXmlProperty(localName = "RTPID")
	private String rtpid;
	@JacksonXmlProperty(localName = "Transaction_Type")
	private String transactionType;
	@JacksonXmlProperty(localName = "Call_From")
	private String callFrom;

	public OtherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OtherInfo(String purpose, String billNo, String rtpid, String transactionType, String callFrom) {
		super();
		this.purpose = purpose;
		this.billNo = billNo;
		this.rtpid = rtpid;
		this.transactionType = transactionType;
		this.callFrom = callFrom;
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

	public String getRtpid() {
		return rtpid;
	}

	public void setRtpid(String rtpid) {
		this.rtpid = rtpid;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getCallFrom() {
		return callFrom;
	}

	public void setCallFrom(String callFrom) {
		this.callFrom = callFrom;
	}
}
