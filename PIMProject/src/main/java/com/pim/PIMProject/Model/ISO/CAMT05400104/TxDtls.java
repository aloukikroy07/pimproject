package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.IntrBkSttlmAmt;

public class TxDtls {
	@JacksonXmlProperty(localName = "Refs")
	private Refs refs;
	@JacksonXmlProperty(localName = "Amt")
	private IntrBkSttlmAmt intrBkSttlmAmt;
	@JacksonXmlProperty(localName = "CdtDbtInd")
	private String cdtDbtInd;
	@JacksonXmlProperty(localName = "RltdPties")
	private RltdPties rltdPties;
	@JacksonXmlProperty(localName = "RltdDts")
	private RltdDts rltdDts;
	@JacksonXmlProperty(localName = "AddtlTxInf")
	private String addtlTxInf;
	public TxDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TxDtls(Refs refs, IntrBkSttlmAmt intrBkSttlmAmt, String cdtDbtInd, RltdPties rltdPties, RltdDts rltdDts,
			String addtlTxInf) {
		super();
		this.refs = refs;
		this.intrBkSttlmAmt = intrBkSttlmAmt;
		this.cdtDbtInd = cdtDbtInd;
		this.rltdPties = rltdPties;
		this.rltdDts = rltdDts;
		this.addtlTxInf = addtlTxInf;
	}
	public Refs getRefs() {
		return refs;
	}
	public void setRefs(Refs refs) {
		this.refs = refs;
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
	public RltdPties getRltdPties() {
		return rltdPties;
	}
	public void setRltdPties(RltdPties rltdPties) {
		this.rltdPties = rltdPties;
	}
	public RltdDts getRltdDts() {
		return rltdDts;
	}
	public void setRltdDts(RltdDts rltdDts) {
		this.rltdDts = rltdDts;
	}
	public String getAddtlTxInf() {
		return addtlTxInf;
	}
	public void setAddtlTxInf(String addtlTxInf) {
		this.addtlTxInf = addtlTxInf;
	}
}
