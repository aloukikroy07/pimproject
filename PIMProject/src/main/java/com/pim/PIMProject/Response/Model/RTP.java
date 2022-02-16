package com.pim.PIMProject.Response.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RTP {
	@JacksonXmlProperty(isAttribute = true)
	private String seqNum;
	@JacksonXmlProperty(localName = "Date")
	private String date;
	@JacksonXmlProperty(localName = "SenderName")
	private String senderName;
	@JacksonXmlProperty(localName = "SenderVID")
	private String senderVID;
	@JacksonXmlProperty(localName = "ReceiverName")
	private String receiverName;
	@JacksonXmlProperty(localName = "ReceiverVID")
	private String receiverVID;
	@JacksonXmlProperty(localName = "ReqID")
	private String reqID;
	@JacksonXmlProperty(localName = "Reference")
	private String reference;
	@JacksonXmlProperty(localName = "Amount")
	private String amount;
	@JacksonXmlProperty(localName = "Status")
	private String status;
	
	public RTP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RTP(String seqNum, String date, String senderName, String senderVID, String receiverName, String receiverVID,
			String reqID, String reference, String amount, String status) {
		super();
		this.seqNum = seqNum;
		this.date = date;
		this.senderName = senderName;
		this.senderVID = senderVID;
		this.receiverName = receiverName;
		this.receiverVID = receiverVID;
		this.reqID = reqID;
		this.reference = reference;
		this.amount = amount;
		this.status = status;
	}

	public String getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderVID() {
		return senderVID;
	}

	public void setSenderVID(String senderVID) {
		this.senderVID = senderVID;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverVID() {
		return receiverVID;
	}

	public void setReceiverVID(String receiverVID) {
		this.receiverVID = receiverVID;
	}

	public String getReqID() {
		return reqID;
	}

	public void setReqID(String reqID) {
		this.reqID = reqID;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
