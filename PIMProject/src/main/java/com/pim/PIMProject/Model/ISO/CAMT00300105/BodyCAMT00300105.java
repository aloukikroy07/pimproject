package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

public class BodyCAMT00300105 {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private DocumentCAMT00300105 document;
	public BodyCAMT00300105() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BodyCAMT00300105(AppHdr appHdr, DocumentCAMT00300105 document) {
		super();
		this.appHdr = appHdr;
		this.document = document;
	}
	public AppHdr getAppHdr() {
		return appHdr;
	}
	public void setAppHdr(AppHdr appHdr) {
		this.appHdr = appHdr;
	}
	public DocumentCAMT00300105 getDocument() {
		return document;
	}
	public void setDocument(DocumentCAMT00300105 document) {
		this.document = document;
	}
	
}
