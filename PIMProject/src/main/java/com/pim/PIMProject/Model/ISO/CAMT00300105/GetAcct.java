package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.GrpHdr;

public class GetAcct {
	@JacksonXmlProperty(localName = "MsgHdr")
	private GrpHdr msgHdr;
	@JacksonXmlProperty(localName = "AcctQryDef")
	private AcctQryDef acctQryDef;
	public GetAcct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetAcct(GrpHdr msgHdr, AcctQryDef acctQryDef) {
		super();
		this.msgHdr = msgHdr;
		this.acctQryDef = acctQryDef;
	}
	public GrpHdr getMsgHdr() {
		return msgHdr;
	}
	public void setMsgHdr(GrpHdr msgHdr) {
		this.msgHdr = msgHdr;
	}
	public AcctQryDef getAcctQryDef() {
		return acctQryDef;
	}
	public void setAcctQryDef(AcctQryDef acctQryDef) {
		this.acctQryDef = acctQryDef;
	}
	
}
