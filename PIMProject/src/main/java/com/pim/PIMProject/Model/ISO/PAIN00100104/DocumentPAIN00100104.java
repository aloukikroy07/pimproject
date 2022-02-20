package com.pim.PIMProject.Model.ISO.PAIN00100104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DocumentPAIN00100104 {
	@JacksonXmlProperty(isAttribute = true, localName = "xmlns:xsi")
	private String xsi = "http://www.w3.org/2001/XMLSchema-instance";
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.04";
	@JacksonXmlProperty(localName = "CstmrCdtTrfInitn")
	private CstmrCdtTrfInitn cstmrCdtTrfInitn;
	public DocumentPAIN00100104() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentPAIN00100104(String xsi, String xmlns, CstmrCdtTrfInitn cstmrCdtTrfInitn) {
		super();
		this.xsi = xsi;
		this.xmlns = xmlns;
		this.cstmrCdtTrfInitn = cstmrCdtTrfInitn;
	}
	public String getXsi() {
		return xsi;
	}
	public void setXsi(String xsi) {
		this.xsi = xsi;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public CstmrCdtTrfInitn getCstmrCdtTrfInitn() {
		return cstmrCdtTrfInitn;
	}
	public void setCstmrCdtTrfInitn(CstmrCdtTrfInitn cstmrCdtTrfInitn) {
		this.cstmrCdtTrfInitn = cstmrCdtTrfInitn;
	}
}
