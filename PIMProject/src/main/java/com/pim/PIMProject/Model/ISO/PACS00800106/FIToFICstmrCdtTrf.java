package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class FIToFICstmrCdtTrf {
	@JacksonXmlProperty(localName = "GrpHdr")
	private GrpHdr grpHdr;
	@JacksonXmlProperty(localName = "CdtTrfTxInf")
	private CdtTrfTxInf cdtTrfTxInf;
	@JacksonXmlProperty(localName = "SplmtryData")
	private SplmtryData splmtryData;
	public FIToFICstmrCdtTrf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FIToFICstmrCdtTrf(GrpHdr grpHdr, CdtTrfTxInf cdtTrfTxInf, SplmtryData splmtryData) {
		super();
		this.grpHdr = grpHdr;
		this.cdtTrfTxInf = cdtTrfTxInf;
		this.splmtryData = splmtryData;
	}
	public GrpHdr getGrpHdr() {
		return grpHdr;
	}
	public void setGrpHdr(GrpHdr grpHdr) {
		this.grpHdr = grpHdr;
	}
	public CdtTrfTxInf getCdtTrfTxInf() {
		return cdtTrfTxInf;
	}
	public void setCdtTrfTxInf(CdtTrfTxInf cdtTrfTxInf) {
		this.cdtTrfTxInf = cdtTrfTxInf;
	}
	public SplmtryData getSplmtryData() {
		return splmtryData;
	}
	public void setSplmtryData(SplmtryData splmtryData) {
		this.splmtryData = splmtryData;
	}
	
}
