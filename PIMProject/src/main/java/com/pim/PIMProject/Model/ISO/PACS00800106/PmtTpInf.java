package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PmtTpInf {
	@JacksonXmlProperty(localName = "ClrChanl")
	private String clrChanl;
	@JacksonXmlProperty(localName = "SvcLvl")
	private SvcLvl svcLvl;
	@JacksonXmlProperty(localName = "LclInstrm")
	private SvcLvl lclInstrm;
	@JacksonXmlProperty(localName = "CtgyPurp")
	private SvcLvl ctgyPurp;
	public PmtTpInf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PmtTpInf(String clrChanl, SvcLvl svcLvl, SvcLvl lclInstrm, SvcLvl ctgyPurp) {
		super();
		this.clrChanl = clrChanl;
		this.svcLvl = svcLvl;
		this.lclInstrm = lclInstrm;
		this.ctgyPurp = ctgyPurp;
	}
	public String getClrChanl() {
		return clrChanl;
	}
	public void setClrChanl(String clrChanl) {
		this.clrChanl = clrChanl;
	}
	public SvcLvl getSvcLvl() {
		return svcLvl;
	}
	public void setSvcLvl(SvcLvl svcLvl) {
		this.svcLvl = svcLvl;
	}
	public SvcLvl getLclInstrm() {
		return lclInstrm;
	}
	public void setLclInstrm(SvcLvl lclInstrm) {
		this.lclInstrm = lclInstrm;
	}
	public SvcLvl getCtgyPurp() {
		return ctgyPurp;
	}
	public void setCtgyPurp(SvcLvl ctgyPurp) {
		this.ctgyPurp = ctgyPurp;
	}
	
}
