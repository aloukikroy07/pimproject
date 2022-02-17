package com.pim.PIMProject.Model.ISO.PAIN01400106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PAIN01300106.CdtrPmtActvtnReq;

public class DocumentPAIN01400106 {
	@JacksonXmlProperty(isAttribute = true,localName = "xmlns:xsi")
	private String xsi = "http://www.w3.org/2001/XMLSchema-instance";
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn:iso:std:iso:20022:tech:xsd:pain.014.001.06";
	@JacksonXmlProperty(localName = "CdtrPmtActvtnReq")
	private CdtrPmtActvtnReq cdtrPmtActvtnReq;
	public DocumentPAIN01400106() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentPAIN01400106(String xsi, String xmlns, CdtrPmtActvtnReq cdtrPmtActvtnReq) {
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
