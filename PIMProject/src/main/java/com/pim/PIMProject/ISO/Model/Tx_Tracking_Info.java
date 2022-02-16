package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Tx_Tracking_Info {
	@JacksonXmlProperty(localName = "RefNo_SendingPSP")
	private String refNo_SendingPSP;
	@JacksonXmlProperty(localName = "RefNo_SendingBank")
	private String refNo_SendingBank;
	@JacksonXmlProperty(localName = "RefNo_ReceivingBank")
	private String refNo_ReceivingBank;
	@JacksonXmlProperty(localName = "RefNo_ReceivingPSP")
	private String refNo_ReceivingPSP;
	@JacksonXmlProperty(localName = "RefNo_IDTP")
	private String refNo_IDTP;
	public Tx_Tracking_Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tx_Tracking_Info(String refNo_SendingPSP, String refNo_SendingBank, String refNo_ReceivingBank,
			String refNo_ReceivingPSP, String refNo_IDTP) {
		super();
		this.refNo_SendingPSP = refNo_SendingPSP;
		this.refNo_SendingBank = refNo_SendingBank;
		this.refNo_ReceivingBank = refNo_ReceivingBank;
		this.refNo_ReceivingPSP = refNo_ReceivingPSP;
		this.refNo_IDTP = refNo_IDTP;
	}
	public String getRefNo_SendingPSP() {
		return refNo_SendingPSP;
	}
	public void setRefNo_SendingPSP(String refNo_SendingPSP) {
		this.refNo_SendingPSP = refNo_SendingPSP;
	}
	public String getRefNo_SendingBank() {
		return refNo_SendingBank;
	}
	public void setRefNo_SendingBank(String refNo_SendingBank) {
		this.refNo_SendingBank = refNo_SendingBank;
	}
	public String getRefNo_ReceivingBank() {
		return refNo_ReceivingBank;
	}
	public void setRefNo_ReceivingBank(String refNo_ReceivingBank) {
		this.refNo_ReceivingBank = refNo_ReceivingBank;
	}
	public String getRefNo_ReceivingPSP() {
		return refNo_ReceivingPSP;
	}
	public void setRefNo_ReceivingPSP(String refNo_ReceivingPSP) {
		this.refNo_ReceivingPSP = refNo_ReceivingPSP;
	}
	public String getRefNo_IDTP() {
		return refNo_IDTP;
	}
	public void setRefNo_IDTP(String refNo_IDTP) {
		this.refNo_IDTP = refNo_IDTP;
	}
	
	
}
