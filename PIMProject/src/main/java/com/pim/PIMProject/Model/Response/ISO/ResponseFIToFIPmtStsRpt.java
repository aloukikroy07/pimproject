package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.ISO.Model.GrpHdr;
import com.pim.PIMProject.ISO.Model.SplmtryData;

public class ResponseFIToFIPmtStsRpt {
	@JacksonXmlProperty(localName = "GrpHdr")
	private GrpHdr grpHdr;
	@JacksonXmlProperty(localName = "OrgnlGrpInfAndSts")
	private OrgnlGrpInfAndSts orgnlGrpInfAndSts;
	@JacksonXmlProperty(localName = "TxInfAndSts")
	private TxInfAndSts txInfAndSts;
	@JacksonXmlProperty(localName = "SplmtryData")
	private SplmtryData splmtryData;
	public ResponseFIToFIPmtStsRpt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseFIToFIPmtStsRpt(GrpHdr grpHdr, OrgnlGrpInfAndSts orgnlGrpInfAndSts, TxInfAndSts txInfAndSts,
			SplmtryData splmtryData) {
		super();
		this.grpHdr = grpHdr;
		this.orgnlGrpInfAndSts = orgnlGrpInfAndSts;
		this.txInfAndSts = txInfAndSts;
		this.splmtryData = splmtryData;
	}
	public GrpHdr getGrpHdr() {
		return grpHdr;
	}
	public void setGrpHdr(GrpHdr grpHdr) {
		this.grpHdr = grpHdr;
	}
	public OrgnlGrpInfAndSts getOrgnlGrpInfAndSts() {
		return orgnlGrpInfAndSts;
	}
	public void setOrgnlGrpInfAndSts(OrgnlGrpInfAndSts orgnlGrpInfAndSts) {
		this.orgnlGrpInfAndSts = orgnlGrpInfAndSts;
	}
	public TxInfAndSts getTxInfAndSts() {
		return txInfAndSts;
	}
	public void setTxInfAndSts(TxInfAndSts txInfAndSts) {
		this.txInfAndSts = txInfAndSts;
	}
	public SplmtryData getSplmtryData() {
		return splmtryData;
	}
	public void setSplmtryData(SplmtryData splmtryData) {
		this.splmtryData = splmtryData;
	}
}
