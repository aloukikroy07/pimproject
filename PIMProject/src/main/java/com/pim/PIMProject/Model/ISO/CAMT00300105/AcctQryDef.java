package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AcctQryDef {
	@JacksonXmlProperty(localName = "AcctCrit")
	private AcctCrit acctCrit;

	public AcctQryDef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcctQryDef(AcctCrit acctCrit) {
		super();
		this.acctCrit = acctCrit;
	}

	public AcctCrit getAcctCrit() {
		return acctCrit;
	}

	public void setAcctCrit(AcctCrit acctCrit) {
		this.acctCrit = acctCrit;
	}
	
}
