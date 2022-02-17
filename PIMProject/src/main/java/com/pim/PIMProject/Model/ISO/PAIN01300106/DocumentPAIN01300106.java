package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DocumentPAIN01300106 {
	@JacksonXmlProperty(isAttribute = true,localName = "xmlns:xsi")
	private String xsi = "http://www.w3.org/2001/XMLSchema-instance";
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn:iso:std:iso:20022:tech:xsd:pain.013.001.06";
	@JacksonXmlProperty(localName = "CdtrPmtActvtnReq")
	private CdtrPmtActvtnReq cdtrPmtActvtnReq;
	public DocumentPAIN01300106() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentPAIN01300106(String xsi, String xmlns, CdtrPmtActvtnReq cdtrPmtActvtnReq) {
		super();
		this.xsi = xsi;
		this.xmlns = xmlns;
		this.cdtrPmtActvtnReq = cdtrPmtActvtnReq;
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
	public CdtrPmtActvtnReq getCdtrPmtActvtnReq() {
		return cdtrPmtActvtnReq;
	}
	public void setCdtrPmtActvtnReq(CdtrPmtActvtnReq cdtrPmtActvtnReq) {
		this.cdtrPmtActvtnReq = cdtrPmtActvtnReq;
	}
	
}
