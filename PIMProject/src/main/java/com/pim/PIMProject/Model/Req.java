package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Req {
	@JacksonXmlProperty(isAttribute = true)
	private String id;
	
	@JacksonXmlProperty(isAttribute = true)
	private String note;
	
	@JacksonXmlProperty(isAttribute = true)
	private String ts;
	
	@JacksonXmlProperty(isAttribute = true)
	private String type;
	
	public Req() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Req(String id, String note, String ts, String type) {
		super();
		this.id = id;
		this.note = note;
		this.ts = ts;
		this.type = type;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
