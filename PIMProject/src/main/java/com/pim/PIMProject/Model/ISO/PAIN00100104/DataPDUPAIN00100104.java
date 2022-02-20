package com.pim.PIMProject.Model.ISO.PAIN00100104;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement(localName="DataPDU")
public class DataPDUPAIN00100104 {
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="urn: swift:saa: xsd:saa.2.0";
	@JacksonXmlProperty(localName = "Revision")
	private String revision;
	@JacksonXmlProperty(localName = "Body")
	private BodyPAIN00100104 bodyPAIN00100104;
	public DataPDUPAIN00100104() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DataPDUPAIN00100104(String xmlns, String revision, BodyPAIN00100104 bodyPAIN00100104) {
		super();
		this.xmlns = xmlns;
		this.revision = revision;
		this.bodyPAIN00100104 = bodyPAIN00100104;
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
	public BodyPAIN00100104 getBodyPAIN00100104() {
		return bodyPAIN00100104;
	}
	public void setBodyPAIN00100104(BodyPAIN00100104 bodyPAIN00100104) {
		this.bodyPAIN00100104 = bodyPAIN00100104;
	}
	
}
