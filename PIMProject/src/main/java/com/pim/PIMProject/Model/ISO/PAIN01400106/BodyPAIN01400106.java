package com.pim.PIMProject.Model.ISO.PAIN01400106;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

@XmlRootElement
@JacksonXmlRootElement(localName = "Body")
public class BodyPAIN01400106 {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private DocumentPAIN01400106 document;
	public BodyPAIN01400106() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BodyPAIN01400106(AppHdr appHdr, DocumentPAIN01400106 document) {
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
	public DocumentPAIN01400106 getDocument() {
		return document;
	}
	public void setDocument(DocumentPAIN01400106 document) {
		this.document = document;
	}
	
}
