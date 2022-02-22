package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Dbtr;

public class SchCrit {
	@JacksonXmlProperty(localName = "AcctId")
	private AcctId acctId;
	@JacksonXmlProperty(localName = "AcctOwnr")
	private Dbtr dbtr;
	public SchCrit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchCrit(AcctId acctId, Dbtr dbtr) {
		super();
		this.acctId = acctId;
		this.dbtr = dbtr;
	}
	public AcctId getAcctId() {
		return acctId;
	}
	public void setAcctId(AcctId acctId) {
		this.acctId = acctId;
	}
	public Dbtr getDbtr() {
		return dbtr;
	}
	public void setDbtr(Dbtr dbtr) {
		this.dbtr = dbtr;
	}
	
}
