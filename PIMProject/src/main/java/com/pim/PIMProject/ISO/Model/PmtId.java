package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PmtId {
	@JacksonXmlProperty(localName = "InstrId")
	private String instrId;
	@JacksonXmlProperty(localName = "EndToEndId")
	private String endToEndId;
	@JacksonXmlProperty(localName = "TxId")
	private String txId;
	public PmtId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PmtId(String instrId, String endToEndId, String txId) {
		super();
		this.instrId = instrId;
		this.endToEndId = endToEndId;
		this.txId = txId;
	}
	public String getInstrId() {
		return instrId;
	}
	public void setInstrId(String instrId) {
		this.instrId = instrId;
	}
	public String getEndToEndId() {
		return endToEndId;
	}
	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	
}
