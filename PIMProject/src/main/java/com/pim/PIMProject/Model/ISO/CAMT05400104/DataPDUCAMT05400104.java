package com.pim.PIMProject.Model.ISO.CAMT05400104;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement(localName="DataPDU")
public class DataPDUCAMT05400104 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn: swift:saa: xsd:saa.2.0";
	@JacksonXmlProperty(localName = "Revision")
	private String revision;
	@JacksonXmlProperty(localName = "Body")
	private BodyCAMT05400104 body;
	public DataPDUCAMT05400104() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataPDUCAMT05400104(String xmlns, String revision, BodyCAMT05400104 body) {
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
	public BodyCAMT05400104 getBody() {
		return body;
	}
	public void setBody(BodyCAMT05400104 body) {
		this.body = body;
	}
	
}
