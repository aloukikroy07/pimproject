package com.pim.PIMProject.Model;

import java.sql.Timestamp;

public class Req {
	private String id;
	private String note;
	private Timestamp ts;
	private String type;
	
	public Req() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Req(String id, String note, Timestamp ts, String type) {
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
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
