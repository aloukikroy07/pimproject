package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.ISO.Model.AppHdr;

public class ResponseBody {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private ResponseDocument responseDocument;
	public ResponseBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseBody(AppHdr appHdr, ResponseDocument responseDocument) {
		super();
		this.appHdr = appHdr;
		this.responseDocument = responseDocument;
	}
	public AppHdr getAppHdr() {
		return appHdr;
	}
	public void setAppHdr(AppHdr appHdr) {
		this.appHdr = appHdr;
	}
	public ResponseDocument getResponseDocument() {
		return responseDocument;
	}
	public void setResponseDocument(ResponseDocument responseDocument) {
		this.responseDocument = responseDocument;
	}
	
}
