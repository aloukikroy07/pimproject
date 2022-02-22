package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PAIN01300106.Amt;

public class CurMulLmt {
	@JacksonXmlProperty(localName = "Amt")
	private Amt amt;
	@JacksonXmlProperty(localName = "CdtDbtInd")
	private String cdtDbtInd;
	public CurMulLmt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurMulLmt(Amt amt, String cdtDbtInd) {
		super();
		this.amt = amt;
		this.cdtDbtInd = cdtDbtInd;
	}
	public Amt getAmt() {
		return amt;
	}
	public void setAmt(Amt amt) {
		this.amt = amt;
	}
	public String getCdtDbtInd() {
		return cdtDbtInd;
	}
	public void setCdtDbtInd(String cdtDbtInd) {
		this.cdtDbtInd = cdtDbtInd;
	}
	
}
