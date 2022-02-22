package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Document")
public class DocumentCAMT05400104 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn: iso:std: iso:20022:tech: xsd:camt.054.001.04";
	@JacksonXmlProperty(localName = "BkToCstmrDbtCdtNtfctn")
	private BkToCstmrDbtCdtNtfctn bkToCstmrDbtCdtNtfctn;
	public DocumentCAMT05400104() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentCAMT05400104(String xmlns, BkToCstmrDbtCdtNtfctn bkToCstmrDbtCdtNtfctn) {
		super();
		this.xmlns = xmlns;
		this.bkToCstmrDbtCdtNtfctn = bkToCstmrDbtCdtNtfctn;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public BkToCstmrDbtCdtNtfctn getBkToCstmrDbtCdtNtfctn() {
		return bkToCstmrDbtCdtNtfctn;
	}
	public void setBkToCstmrDbtCdtNtfctn(BkToCstmrDbtCdtNtfctn bkToCstmrDbtCdtNtfctn) {
		this.bkToCstmrDbtCdtNtfctn = bkToCstmrDbtCdtNtfctn;
	}
	
}
