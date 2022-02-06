package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DeviceInfo {
	private Integer idDeviceKey;
	private String Device_ID;
	private String Mobile_No;
	private String Location;
	private String IP;
	
	public DeviceInfo() {
		super();
	}

	public DeviceInfo(Integer idDeviceKey, String device_ID, String mobile_No, String location, String iP) {
		super();
		this.idDeviceKey = idDeviceKey;
		Device_ID = device_ID;
		Mobile_No = mobile_No;
		Location = location;
		IP = iP;
	}

	public Integer getIdDeviceKey() {
		return idDeviceKey;
	}

	public void setIdDeviceKey(Integer idDeviceKey) {
		this.idDeviceKey = idDeviceKey;
	}

	public String getDevice_ID() {
		return Device_ID;
	}

	public void setDevice_ID(String device_ID) {
		Device_ID = device_ID;
	}

	public String getMobile_No() {
		return Mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}
	
	
	
}
