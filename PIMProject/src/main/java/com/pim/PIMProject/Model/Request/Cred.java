package com.pim.PIMProject.Model.Request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Cred {
	
	@JacksonXmlProperty(isAttribute = true)
	private String type;
	
	@JacksonXmlProperty(isAttribute = true)
	private String subtype;
	
	@JacksonXmlProperty(localName = "Data")
	private String data;

	public Cred() {
		super();
	}

	public Cred(String type, String subtype, String data) {
		super();
		this.type = type;
		this.subtype = subtype;
		this.data = data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
