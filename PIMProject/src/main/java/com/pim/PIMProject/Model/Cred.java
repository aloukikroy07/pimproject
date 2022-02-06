package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Cred {
	
	@JacksonXmlProperty(isAttribute = true)
	private String type;
	
	@JacksonXmlProperty(isAttribute = true)
	private String subtype;
	
	private String Data;
	
	public Cred() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cred(String type, String subtype, String data) {
		super();
		this.type = type;
		this.subtype = subtype;
		Data = data;
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
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
}
