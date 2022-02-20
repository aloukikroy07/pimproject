package com.pim.PIMProject.Model.ISO.PAIN00100104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.GrpHdr;
import com.pim.PIMProject.Model.ISO.PACS00800106.SplmtryData;
import com.pim.PIMProject.Model.ISO.PAIN01300106.PmtInf;

public class CstmrCdtTrfInitn {
	@JacksonXmlProperty(localName = "GrpHdr")
	private GrpHdr grpHdr;
	@JacksonXmlProperty(localName = "PmtInf")
	private PmtInf pmtInf;
	@JacksonXmlProperty(localName = "SplmtryData")
	private SplmtryData splmtryData;
	public CstmrCdtTrfInitn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CstmrCdtTrfInitn(GrpHdr grpHdr, PmtInf pmtInf, SplmtryData splmtryData) {
		super();
		this.grpHdr = grpHdr;
		this.pmtInf = pmtInf;
		this.splmtryData = splmtryData;
	}
	public GrpHdr getGrpHdr() {
		return grpHdr;
	}
	public void setGrpHdr(GrpHdr grpHdr) {
		this.grpHdr = grpHdr;
	}
	public PmtInf getPmtInf() {
		return pmtInf;
	}
	public void setPmtInf(PmtInf pmtInf) {
		this.pmtInf = pmtInf;
	}
	public SplmtryData getSplmtryData() {
		return splmtryData;
	}
	public void setSplmtryData(SplmtryData splmtryData) {
		this.splmtryData = splmtryData;
	}
}
