package com.pim.PIMProject.Model.Request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class DeviceInfo {
	private Integer idDeviceKey;
	
	@JacksonXmlProperty(localName = "Device_ID")
	private String device_ID;
	
	@JacksonXmlProperty(localName = "Mobile_No")
	private String mobile_No;
	
	@JacksonXmlProperty(localName = "Location")
	private String location;
	
	@JacksonXmlProperty(localName = "IP")
	private String iP;
	
	public DeviceInfo() {
		super();
	}

	public DeviceInfo(Integer idDeviceKey, String device_ID, String mobile_No, String location, String iP) {
		super();
		this.idDeviceKey = idDeviceKey;
		this.device_ID = device_ID;
		this.mobile_No = mobile_No;
		this.location = location;
		this.iP = iP;
	}

	public Integer getIdDeviceKey() {
		return idDeviceKey;
	}

	public void setIdDeviceKey(Integer idDeviceKey) {
		this.idDeviceKey = idDeviceKey;
	}

	public String getDevice_ID() {
		return device_ID;
	}

	public void setDevice_ID(String device_ID) {
		this.device_ID = device_ID;
	}

	public String getMobile_No() {
		return mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getiP() {
		return iP;
	}

	public void setiP(String iP) {
		this.iP = iP;
	}

	
	
	
}
