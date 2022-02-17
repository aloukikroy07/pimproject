package com.pim.PIMProject.Model.ISO.PACS00200105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DocumentPACS05 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn:iso:std:iso:20022:tech:xsd:pacs.002.001.05";
	@JacksonXmlProperty(localName = "FIToFIPmtStsRpt")
	private FIToFIPmtStsRptPACS05 responseFIToFIPmtStsRpt;
	public DocumentPACS05() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentPACS05(String xmlns, FIToFIPmtStsRptPACS05 responseFIToFIPmtStsRpt) {
		super();
		this.xmlns = xmlns;
		this.responseFIToFIPmtStsRpt = responseFIToFIPmtStsRpt;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public FIToFIPmtStsRptPACS05 getResponseFIToFIPmtStsRpt() {
		return responseFIToFIPmtStsRpt;
	}
	public void setResponseFIToFIPmtStsRpt(FIToFIPmtStsRptPACS05 responseFIToFIPmtStsRpt) {
		this.responseFIToFIPmtStsRpt = responseFIToFIPmtStsRpt;
	}
	
	
}
