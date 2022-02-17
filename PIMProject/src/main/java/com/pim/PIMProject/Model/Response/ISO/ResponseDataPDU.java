package com.pim.PIMProject.Model.Response.ISO;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement(localName="DataPDU")
public class ResponseDataPDU {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns = "urn:swift:saa:xsd:saa.2.0";
	@JacksonXmlProperty(localName = "Revision")
	private String revision;
	@JacksonXmlProperty(localName = "Body")
	private ResponseBody responseBody;
	public ResponseDataPDU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseDataPDU(String xmlns, String revision, ResponseBody responseBody) {
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
	public ResponseBody getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(ResponseBody responseBody) {
		this.responseBody = responseBody;
	}
	
}
