package com.pim.PIMProject.Model.ISO.PACS00200105;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement(localName="DataPDU")
public class DataPDUPACS05 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn:swift:saa:xsd:saa.2.0";
	@JacksonXmlProperty(localName = "Revision")
	private String revision;
	@JacksonXmlProperty(localName = "Body")
	private BodyPACS05 responseBody;
	public DataPDUPACS05() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataPDUPACS05(String xmlns, String revision, BodyPACS05 responseBody) {
		super();
		this.xmlns = xmlns;
		this.revision = revision;
		this.responseBody = responseBody;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public BodyPACS05 getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(BodyPACS05 responseBody) {
		this.responseBody = responseBody;
	}
	
}
