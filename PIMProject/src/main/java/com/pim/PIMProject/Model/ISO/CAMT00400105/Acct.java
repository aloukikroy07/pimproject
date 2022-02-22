package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Dbtr;

public class Acct {
	@JacksonXmlProperty(localName = "Tp")
	private Tp tp;
	@JacksonXmlProperty(localName = "Ccy")
	private String ccy;
	@JacksonXmlProperty(localName = "CurMulLmt")
	private CurMulLmt curMulLmt;
	@JacksonXmlProperty(localName = "Ownr")
	private Dbtr ownr;
	public Acct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acct(Tp tp, String ccy, CurMulLmt curMulLmt, Dbtr ownr) {
		super();
		this.tp = tp;
		this.ccy = ccy;
		this.curMulLmt = curMulLmt;
		this.ownr = ownr;
	}
	public Tp getTp() {
		return tp;
	}
	public void setTp(Tp tp) {
		this.tp = tp;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public CurMulLmt getCurMulLmt() {
		return curMulLmt;
	}
	public void setCurMulLmt(CurMulLmt curMulLmt) {
		this.curMulLmt = curMulLmt;
	}
	public Dbtr getOwnr() {
		return ownr;
	}
	public void setOwnr(Dbtr ownr) {
		this.ownr = ownr;
	}
	
}
