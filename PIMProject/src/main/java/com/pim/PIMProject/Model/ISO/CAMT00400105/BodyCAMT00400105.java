package com.pim.PIMProject.Model.ISO.CAMT00400105;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

@XmlRootElement
@JacksonXmlRootElement(localName = "Body")
public class BodyCAMT00400105 {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private DocumentCAMT00400105 document;
	public BodyCAMT00400105() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BodyCAMT00400105(AppHdr appHdr, DocumentCAMT00400105 document) {
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
	public DocumentCAMT00400105 getDocument() {
		return document;
	}
	public void setDocument(DocumentCAMT00400105 document) {
		this.document = document;
	}
	
}
