package com.pim.PIMProject.ISO.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement(localName="DataPDU")
public class RequestDataPDU {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn:swift:saa:xsd:saa.2.0";
	@JacksonXmlProperty(localName = "Revision")
	private String revision;
	@JacksonXmlProperty(localName = "Body")
	private Body body;
	public RequestDataPDU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestDataPDU(String revision, Body body) {
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
