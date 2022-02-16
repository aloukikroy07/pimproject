package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Document {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns= "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06";
	@JacksonXmlProperty(localName = "FIToFICstmrCdtTrf")
	private FIToFICstmrCdtTrf fiToFICstmrCdtTrf;
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(String xmlns, FIToFICstmrCdtTrf fiToFICstmrCdtTrf) {
		super();
		this.xmlns = xmlns;
		this.fiToFICstmrCdtTrf = fiToFICstmrCdtTrf;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public FIToFICstmrCdtTrf getFiToFICstmrCdtTrf() {
		return fiToFICstmrCdtTrf;
	}
	public void setFiToFICstmrCdtTrf(FIToFICstmrCdtTrf fiToFICstmrCdtTrf) {
		this.fiToFICstmrCdtTrf = fiToFICstmrCdtTrf;
	}
	
}
