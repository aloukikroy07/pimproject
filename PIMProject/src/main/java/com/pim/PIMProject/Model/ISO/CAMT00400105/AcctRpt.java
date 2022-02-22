package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Id;

public class AcctRpt {
	@JacksonXmlProperty(localName = "AcctId")
	private Id acctId;
	@JacksonXmlProperty(localName = "AcctOrErr")
	private AcctOrErr acctOrErr;
	public AcctRpt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcctRpt(Id acctId, AcctOrErr acctOrErr) {
		super();
		this.acctId = acctId;
		this.acctOrErr = acctOrErr;
	}
	public Id getAcctId() {
		return acctId;
	}
	public void setAcctId(Id acctId) {
		this.acctId = acctId;
	}
	public AcctOrErr getAcctOrErr() {
		return acctOrErr;
	}
	public void setAcctOrErr(AcctOrErr acctOrErr) {
		this.acctOrErr = acctOrErr;
	}
	
}
