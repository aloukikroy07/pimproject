package com.pim.PIMProject.Model.ISO.PAIN01300106;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.pim.PIMProject.Model.ISO.PACS00800106.AppHdr;

@XmlRootElement
@JacksonXmlRootElement(localName = "Body")
public class Pain06RequestBody {
	@JacksonXmlProperty(localName = "AppHdr")
	private AppHdr appHdr;
	@JacksonXmlProperty(localName = "Document")
	private Pain06Document pain06Document;
	public Pain06RequestBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pain06RequestBody(AppHdr appHdr, Pain06Document pain06Document) {
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
	public Pain06Document getPain06Document() {
		return pain06Document;
	}
	public void setPain06Document(Pain06Document pain06Document) {
		this.pain06Document = pain06Document;
	}
}
