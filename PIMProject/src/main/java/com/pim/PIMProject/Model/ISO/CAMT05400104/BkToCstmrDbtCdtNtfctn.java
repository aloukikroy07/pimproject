package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.GrpHdr;

public class BkToCstmrDbtCdtNtfctn {
	@JacksonXmlProperty(localName = "GrpHdr")
	private GrpHdr grpHdr;
	@JacksonXmlProperty(localName = "Ntfctn")
	private Ntfctn ntfctn;
	public BkToCstmrDbtCdtNtfctn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BkToCstmrDbtCdtNtfctn(GrpHdr grpHdr, Ntfctn ntfctn) {
		super();
		this.grpHdr = grpHdr;
		this.ntfctn = ntfctn;
	}
	public GrpHdr getGrpHdr() {
		return grpHdr;
	}
	public void setGrpHdr(GrpHdr grpHdr) {
		this.grpHdr = grpHdr;
	}
	public Ntfctn getNtfctn() {
		return ntfctn;
	}
	public void setNtfctn(Ntfctn ntfctn) {
		this.ntfctn = ntfctn;
	}
}
