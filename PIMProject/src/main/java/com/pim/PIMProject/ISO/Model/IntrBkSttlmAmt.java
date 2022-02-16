package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class IntrBkSttlmAmt {
	@JacksonXmlProperty(isAttribute = true, localName = "Ccy")
	private String ccy;
	@JacksonXmlText
	private String txIntrBkSttlmAmt;

	public IntrBkSttlmAmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntrBkSttlmAmt(String ccy, String txIntrBkSttlmAmt) {
		super();
		this.ccy = ccy;
		this.txIntrBkSttlmAmt = txIntrBkSttlmAmt;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getTxIntrBkSttlmAmt() {
		return txIntrBkSttlmAmt;
	}

	public void setTxIntrBkSttlmAmt(String txIntrBkSttlmAmt) {
		this.txIntrBkSttlmAmt = txIntrBkSttlmAmt;
	}

	
	
}
