package com.pim.PIMProject.Model.ISO.CAMT05400104;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

@XmlRootElement
@JacksonXmlRootElement(localName = "Body")
public class BodyCAMT05400104 {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private DocumentCAMT05400104 document;
	public BodyCAMT05400104() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BodyCAMT05400104(AppHdr appHdr, DocumentCAMT05400104 document) {
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
	public DocumentCAMT05400104 getDocument() {
		return document;
	}
	public void setDocument(DocumentCAMT05400104 document) {
		this.document = document;
	}
	
	
}
