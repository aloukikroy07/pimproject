package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00200105.OrgnlGrpInfAndSts;
import com.pim.PIMProject.Model.ISO.PACS00800106.GrpHdr;
import com.pim.PIMProject.Model.ISO.PACS00800106.SplmtryData;
import com.pim.PIMProject.Model.ISO.PAIN01400106.OrgnlPmtInfAndSts;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CdtrPmtActvtnReq {
	@JacksonXmlProperty(localName = "GrpHdr")
	private GrpHdr grpHdr;
	@JacksonXmlProperty(localName = "PmtInf")
	private PmtInf pmtInf;
	@JacksonXmlProperty(localName = "OrgnlGrpInfAndSts")
	private OrgnlGrpInfAndSts orgnlGrpInfAndSts;
	@JacksonXmlProperty(localName = "OrgnlPmtInfAndSts")
	private OrgnlPmtInfAndSts orgnlPmtInfAndSts;
	@JacksonXmlProperty(localName = "SplmtryData")
	private SplmtryData splmtryData;
	
	public CdtrPmtActvtnReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CdtrPmtActvtnReq(GrpHdr grpHdr, PmtInf pmtInf, OrgnlGrpInfAndSts orgnlGrpInfAndSts,
			OrgnlPmtInfAndSts orgnlPmtInfAndSts, SplmtryData splmtryData) {
		super();
		this.grpHdr = grpHdr;
		this.pmtInf = pmtInf;
		this.orgnlGrpInfAndSts = orgnlGrpInfAndSts;
		this.orgnlPmtInfAndSts = orgnlPmtInfAndSts;
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

	public OrgnlGrpInfAndSts getOrgnlGrpInfAndSts() {
		return orgnlGrpInfAndSts;
	}

	public void setOrgnlGrpInfAndSts(OrgnlGrpInfAndSts orgnlGrpInfAndSts) {
		this.orgnlGrpInfAndSts = orgnlGrpInfAndSts;
	}

	public OrgnlPmtInfAndSts getOrgnlPmtInfAndSts() {
		return orgnlPmtInfAndSts;
	}

	public void setOrgnlPmtInfAndSts(OrgnlPmtInfAndSts orgnlPmtInfAndSts) {
		this.orgnlPmtInfAndSts = orgnlPmtInfAndSts;
	}

	public SplmtryData getSplmtryData() {
		return splmtryData;
	}

	public void setSplmtryData(SplmtryData splmtryData) {
		this.splmtryData = splmtryData;
	}
	
}
