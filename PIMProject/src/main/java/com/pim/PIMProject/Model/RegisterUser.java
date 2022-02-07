package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class RegisterUser {
	@JacksonXmlProperty(localName = "Head")
	private Head head;
	@JacksonXmlProperty(localName = "Req")
	private Req req;
	@JacksonXmlProperty(localName = "Entity")
	private Entity entity;
	
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Req getReq() {
		return req;
	}
	public void setReq(Req req) {
		this.req = req;
	}
	public Entity getEntity() {
		return entity;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}
		
}
