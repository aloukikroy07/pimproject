package com.pim.PIMProject.Model.Request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement
@JacksonXmlRootElement 
public class RegisterUser {
	@JacksonXmlProperty(localName = "xmlns:idtp", isAttribute = true)
	private String xmlns="http://example.com";
	@JacksonXmlProperty(localName = "Head")
	private Head head;
	@JacksonXmlProperty(localName = "Req")
	private Req req;
	@JacksonXmlProperty(localName = "ChannelInfo")
	private ChannelInfo channelInfo;
	@JacksonXmlProperty(localName = "Entity")
	private Entity entity;
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterUser(String xmlns, Head head, Req req, ChannelInfo channelInfo, Entity entity) {
		super();
		this.xmlns = xmlns;
		this.head = head;
		this.req = req;
		this.channelInfo = channelInfo;
		this.entity = entity;
	}
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
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
	public ChannelInfo getChannelInfo() {
		return channelInfo;
	}
	public void setChannelInfo(ChannelInfo channelInfo) {
		this.channelInfo = channelInfo;
	}
	public Entity getEntity() {
		return entity;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}
}
