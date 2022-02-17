package com.pim.PIMProject.Model.ISO.PACS00800106;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement(localName="DataPDU")
public class DataPDUPACS06 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn:swift:saa:xsd:saa.2.0";
	@JacksonXmlProperty(localName = "Revision")
	private String revision;
	@JacksonXmlProperty(localName = "Body")
	private Body body;
	public DataPDUPACS06() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataPDUPACS06(String revision, Body body) {
		super();
		this.revision = revision;
		this.body = body;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
}
