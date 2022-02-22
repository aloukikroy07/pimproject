package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.IntrBkSttlmAmt;

public class Ntry {
	@JacksonXmlProperty(localName = "NtryRef")
	private String ntryRef;
	@JacksonXmlProperty(localName = "Amt")
	private IntrBkSttlmAmt intrBkSttlmAmt;
	@JacksonXmlProperty(localName = "CdtDbtInd")
	private String cdtDbtInd;
	@JacksonXmlProperty(localName = "Sts")
	private String sts;
	@JacksonXmlProperty(localName = "ValDt")
	private ValDt valDt;
	@JacksonXmlProperty(localName = "BkTxCd")
	private BkTxCd bkTxCd;
	@JacksonXmlProperty(localName = "NtryDtls")
	private NtryDtls ntryDtls;
	public Ntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ntry(String ntryRef, IntrBkSttlmAmt intrBkSttlmAmt, String cdtDbtInd, String sts, ValDt valDt, BkTxCd bkTxCd,
			NtryDtls ntryDtls) {
		super();
		this.ntryRef = ntryRef;
		this.intrBkSttlmAmt = intrBkSttlmAmt;
		this.cdtDbtInd = cdtDbtInd;
		this.sts = sts;
		this.valDt = valDt;
		this.bkTxCd = bkTxCd;
		this.ntryDtls = ntryDtls;
	}
	public String getNtryRef() {
		return ntryRef;
	}
	public void setNtryRef(String ntryRef) {
		this.ntryRef = ntryRef;
	}
	public IntrBkSttlmAmt getIntrBkSttlmAmt() {
		return intrBkSttlmAmt;
	}
	public void setIntrBkSttlmAmt(IntrBkSttlmAmt intrBkSttlmAmt) {
		this.intrBkSttlmAmt = intrBkSttlmAmt;
	}
	public String getCdtDbtInd() {
		return cdtDbtInd;
	}
	public void setCdtDbtInd(String cdtDbtInd) {
		this.cdtDbtInd = cdtDbtInd;
	}
	public String getSts() {
		return sts;
	}
	public void setSts(String sts) {
		this.sts = sts;
	}
	public ValDt getValDt() {
		return valDt;
	}
	public void setValDt(ValDt valDt) {
		this.valDt = valDt;
	}
	public BkTxCd getBkTxCd() {
		return bkTxCd;
	}
	public void setBkTxCd(BkTxCd bkTxCd) {
		this.bkTxCd = bkTxCd;
	}
	public NtryDtls getNtryDtls() {
		return ntryDtls;
	}
	public void setNtryDtls(NtryDtls ntryDtls) {
		this.ntryDtls = ntryDtls;
	}
	
	
}
