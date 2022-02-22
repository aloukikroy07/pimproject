package com.pim.PIMProject.Model.ISO.CAMT00400105;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement(localName="DataPDU")
public class DataPDUCAMT00400105 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn: swift:saa: xsd:saa.2.0";
	@JacksonXmlProperty(localName = "Revision")
	private String revision;
	@JacksonXmlProperty(localName = "Body")
	private BodyCAMT00400105 body;
	public DataPDUCAMT00400105() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataPDUCAMT00400105(String xmlns, String revision, BodyCAMT00400105 body) {
		super();
		this.xmlns = xmlns;
		this.revision = revision;
		this.body = body;
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
	public BodyCAMT00400105 getBody() {
		return body;
	}
	public void setBody(BodyCAMT00400105 body) {
		this.body = body;
	}
}
