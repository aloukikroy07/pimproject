package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RptOrErr {
	@JacksonXmlProperty(localName = "AcctRpt")
	private AcctRpt acctRpt;

	public RptOrErr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RptOrErr(AcctRpt acctRpt) {
		super();
		this.acctRpt = acctRpt;
	}

	public AcctRpt getAcctRpt() {
		return acctRpt;
	}

	public void setAcctRpt(AcctRpt acctRpt) {
		this.acctRpt = acctRpt;
	}
	
}
