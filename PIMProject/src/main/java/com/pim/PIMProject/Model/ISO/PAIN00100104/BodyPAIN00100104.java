package com.pim.PIMProject.Model.ISO.PAIN00100104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

public class BodyPAIN00100104 {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private DocumentPAIN00100104 documentPAIN00100104;
	public BodyPAIN00100104() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BodyPAIN00100104(AppHdr appHdr, DocumentPAIN00100104 documentPAIN00100104) {
		super();
		this.appHdr = appHdr;
		this.documentPAIN00100104 = documentPAIN00100104;
	}
	public AppHdr getAppHdr() {
		return appHdr;
	}
	public void setAppHdr(AppHdr appHdr) {
		this.appHdr = appHdr;
	}
	public DocumentPAIN00100104 getDocumentPAIN00100104() {
		return documentPAIN00100104;
	}
	public void setDocumentPAIN00100104(DocumentPAIN00100104 documentPAIN00100104) {
		this.documentPAIN00100104 = documentPAIN00100104;
	}
	
	
}
