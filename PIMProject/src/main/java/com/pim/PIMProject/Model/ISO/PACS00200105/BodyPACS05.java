package com.pim.PIMProject.Model.ISO.PACS00200105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

public class BodyPACS05 {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private DocumentPACS05 responseDocument;
	public BodyPACS05() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BodyPACS05(AppHdr appHdr, DocumentPACS05 responseDocument) {
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
	public DocumentPACS05 getResponseDocument() {
		return responseDocument;
	}
	public void setResponseDocument(DocumentPACS05 responseDocument) {
		this.responseDocument = responseDocument;
	}
	
}
