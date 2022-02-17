package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ResponseDocument {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn:iso:std:iso:20022:tech:xsd:pacs.002.001.05";
	@JacksonXmlProperty(localName = "FIToFIPmtStsRpt")
	private ResponseFIToFIPmtStsRpt responseFIToFIPmtStsRpt;
	public ResponseDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseDocument(String xmlns, ResponseFIToFIPmtStsRpt responseFIToFIPmtStsRpt) {
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
	public ResponseFIToFIPmtStsRpt getResponseFIToFIPmtStsRpt() {
		return responseFIToFIPmtStsRpt;
	}
	public void setResponseFIToFIPmtStsRpt(ResponseFIToFIPmtStsRpt responseFIToFIPmtStsRpt) {
		this.responseFIToFIPmtStsRpt = responseFIToFIPmtStsRpt;
	}
	
	
}
