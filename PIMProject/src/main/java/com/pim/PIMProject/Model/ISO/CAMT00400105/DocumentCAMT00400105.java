package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DocumentCAMT00400105 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn:swift:xsd:camt.004.001.05";
	@JacksonXmlProperty(localName = "RtrAcct")
	private RtrAcct rtrAcct;
	public DocumentCAMT00400105() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentCAMT00400105(String xmlns, RtrAcct rtrAcct) {
		super();
		this.xmlns = xmlns;
		this.rtrAcct = rtrAcct;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public RtrAcct getRtrAcct() {
		return rtrAcct;
	}
	public void setRtrAcct(RtrAcct rtrAcct) {
		this.rtrAcct = rtrAcct;
	}
	
}
