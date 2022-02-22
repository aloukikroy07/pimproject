package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RltdDts {
	@JacksonXmlProperty(localName = "TxDtTm")
	private String txDtTm;

	public RltdDts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RltdDts(String txDtTm) {
		super();
		this.txDtTm = txDtTm;
	}

	public String getTxDtTm() {
		return txDtTm;
	}

	public void setTxDtTm(String txDtTm) {
		this.txDtTm = txDtTm;
	}
	
}
