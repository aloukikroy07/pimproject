package com.pim.PIMProject.Model.ISO.PAIN01300106;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

@XmlRootElement
@JacksonXmlRootElement(localName = "Body")
public class BodyPAIN01300106 {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private DocumentPAIN01300106 pain06Document;
	public BodyPAIN01300106() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BodyPAIN01300106(AppHdr appHdr, DocumentPAIN01300106 pain06Document) {
		super();
		this.appHdr = appHdr;
		this.pain06Document = pain06Document;
	}
	public AppHdr getAppHdr() {
		return appHdr;
	}
	public void setAppHdr(AppHdr appHdr) {
		this.appHdr = appHdr;
	}
	public DocumentPAIN01300106 getPain06Document() {
		return pain06Document;
	}
	public void setPain06Document(DocumentPAIN01300106 pain06Document) {
		this.pain06Document = pain06Document;
	}
}
