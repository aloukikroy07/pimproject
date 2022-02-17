package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.GrpHdr;

public class CdtrPmtActvtnReq {
	@JacksonXmlProperty(localName = "GrpHdr")
	private GrpHdr grpHdr;
	@JacksonXmlProperty(localName = "PmtInf")
	private PmtInf pmtInf;
	public CdtrPmtActvtnReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CdtrPmtActvtnReq(GrpHdr grpHdr, PmtInf pmtInf) {
		super();
		this.grpHdr = grpHdr;
		this.pmtInf = pmtInf;
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
}
