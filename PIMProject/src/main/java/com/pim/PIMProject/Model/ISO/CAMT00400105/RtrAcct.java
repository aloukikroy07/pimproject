package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.GrpHdr;

public class RtrAcct {
	@JacksonXmlProperty(localName = "MsgHdr")
	private GrpHdr msgHdr;
	@JacksonXmlProperty(localName = "RptOrErr")
	private RptOrErr rptOrErr;
	public RtrAcct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RtrAcct(GrpHdr msgHdr, RptOrErr rptOrErr) {
		super();
		this.msgHdr = msgHdr;
		this.rptOrErr = rptOrErr;
	}
	public GrpHdr getMsgHdr() {
		return msgHdr;
	}
	public void setMsgHdr(GrpHdr msgHdr) {
		this.msgHdr = msgHdr;
	}
	public RptOrErr getRptOrErr() {
		return rptOrErr;
	}
	public void setRptOrErr(RptOrErr rptOrErr) {
		this.rptOrErr = rptOrErr;
	}
	
}
