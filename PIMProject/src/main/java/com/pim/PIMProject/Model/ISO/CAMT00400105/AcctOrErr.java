package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AcctOrErr {
	@JacksonXmlProperty(localName = "Acct")
	private Acct acct;

	public AcctOrErr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcctOrErr(Acct acct) {
		super();
		this.acct = acct;
	}

	public Acct getAcct() {
		return acct;
	}

	public void setAcct(Acct acct) {
		this.acct = acct;
	}
	
}
