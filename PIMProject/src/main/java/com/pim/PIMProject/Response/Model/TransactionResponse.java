package com.pim.PIMProject.Response.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TransactionResponse {
	@JacksonXmlProperty(localName = "Code")
	private String code;
	@JacksonXmlProperty(localName = "Message")
	private String message;
	@JacksonXmlProperty(localName = "RefNo_SendingBank")
	private String refNoSendingBank;
	@JacksonXmlProperty(localName = "RefNo_SendingPSP")
	private String refNoSendingPSP;
	@JacksonXmlProperty(localName = "RefNo_ReceivingBank")
	private String refNoReceivingBank;
	@JacksonXmlProperty(localName = "RefNo_ReceivingPSP")
	private String refNoReceivingPSP;
	@JacksonXmlProperty(localName = "RefNo_IDTP")
	private String refNoIDTP;
	public TransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionResponse(String code, String message, String refNoSendingBank, String refNoSendingPSP,
			String refNoReceivingBank, String refNoReceivingPSP, String refNoIDTP) {
		super();
		this.code = code;
		this.message = message;
		this.refNoSendingBank = refNoSendingBank;
		this.refNoSendingPSP = refNoSendingPSP;
		this.refNoReceivingBank = refNoReceivingBank;
		this.refNoReceivingPSP = refNoReceivingPSP;
		this.refNoIDTP = refNoIDTP;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRefNoSendingBank() {
		return refNoSendingBank;
	}
	public void setRefNoSendingBank(String refNoSendingBank) {
		this.refNoSendingBank = refNoSendingBank;
	}
	public String getRefNoSendingPSP() {
		return refNoSendingPSP;
	}
	public void setRefNoSendingPSP(String refNoSendingPSP) {
		this.refNoSendingPSP = refNoSendingPSP;
	}
	public String getRefNoReceivingBank() {
		return refNoReceivingBank;
	}
	public void setRefNoReceivingBank(String refNoReceivingBank) {
		this.refNoReceivingBank = refNoReceivingBank;
	}
	public String getRefNoReceivingPSP() {
		return refNoReceivingPSP;
	}
	public void setRefNoReceivingPSP(String refNoReceivingPSP) {
		this.refNoReceivingPSP = refNoReceivingPSP;
	}
	public String getRefNoIDTP() {
		return refNoIDTP;
	}
	public void setRefNoIDTP(String refNoIDTP) {
		this.refNoIDTP = refNoIDTP;
	}
	
	
}
