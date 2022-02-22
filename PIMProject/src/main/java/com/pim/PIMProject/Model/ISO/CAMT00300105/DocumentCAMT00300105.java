package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DocumentCAMT00300105 {
	@JacksonXmlProperty(isAttribute = true,localName = "xmlns:xsi")
	private String xsi = "http://www.w3.org/2001/XMLSchema-instance";
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn: iso:std: iso:20022:tech: xsd:camt.003.001.05";
	@JacksonXmlProperty(localName = "GetAcct")
	private GetAcct GetAcct;
	public DocumentCAMT00300105() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentCAMT00300105(String xsi, String xmlns, com.pim.PIMProject.Model.ISO.CAMT00300105.GetAcct getAcct) {
		super();
		this.xsi = xsi;
		this.xmlns = xmlns;
		GetAcct = getAcct;
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
	public GetAcct getGetAcct() {
		return GetAcct;
	}
	public void setGetAcct(GetAcct getAcct) {
		GetAcct = getAcct;
	}
	
}
