package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ChannelInfo;
import com.pim.PIMProject.Model.Creds;
import com.pim.PIMProject.Model.DeviceInfo;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Envlp {
	@JacksonXmlProperty(localName = "Creds")
	private Creds creds;
	@JacksonXmlProperty(localName = "ChannelInfo")
	private ChannelInfo channelInfo;
	@JacksonXmlProperty(localName = "DeviceInfo")
	private DeviceInfo device_Info;
	@JacksonXmlProperty(localName = "Tx_Tracking_Info")
	private Tx_Tracking_Info tx_Tracking_Info;
	@JacksonXmlProperty(localName = "RTPInfo")
	private RTPInfo rtpInfo;
	@JacksonXmlProperty(localName = "IDTP_Status_Code")
	private String idtpStatusCode;
	@JacksonXmlProperty(localName = "IDTP_Status_Msg")
	private String idtpStatusMsg;
	@JacksonXmlProperty(localName = "Call_From")
	private String callFrom;
	public Envlp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Envlp(Creds creds, ChannelInfo channelInfo, DeviceInfo device_Info, Tx_Tracking_Info tx_Tracking_Info,
			RTPInfo rtpInfo, String idtpStatusCode, String idtpStatusMsg, String callFrom) {
		super();
		this.creds = creds;
		this.channelInfo = channelInfo;
		this.device_Info = device_Info;
		this.tx_Tracking_Info = tx_Tracking_Info;
		this.rtpInfo = rtpInfo;
		this.idtpStatusCode = idtpStatusCode;
		this.idtpStatusMsg = idtpStatusMsg;
		this.callFrom = callFrom;
	}
	public Creds getCreds() {
		return creds;
	}
	public void setCreds(Creds creds) {
		this.creds = creds;
	}
	public ChannelInfo getChannelInfo() {
		return channelInfo;
	}
	public void setChannelInfo(ChannelInfo channelInfo) {
		this.channelInfo = channelInfo;
	}
	public DeviceInfo getDevice_Info() {
		return device_Info;
	}
	public void setDevice_Info(DeviceInfo device_Info) {
		this.device_Info = device_Info;
	}
	public Tx_Tracking_Info getTx_Tracking_Info() {
		return tx_Tracking_Info;
	}
	public void setTx_Tracking_Info(Tx_Tracking_Info tx_Tracking_Info) {
		this.tx_Tracking_Info = tx_Tracking_Info;
	}
	public RTPInfo getRtpInfo() {
		return rtpInfo;
	}
	public void setRtpInfo(RTPInfo rtpInfo) {
		this.rtpInfo = rtpInfo;
	}
	public String getIdtpStatusCode() {
		return idtpStatusCode;
	}
	public void setIdtpStatusCode(String idtpStatusCode) {
		this.idtpStatusCode = idtpStatusCode;
	}
	public String getIdtpStatusMsg() {
		return idtpStatusMsg;
	}
	public void setIdtpStatusMsg(String idtpStatusMsg) {
		this.idtpStatusMsg = idtpStatusMsg;
	}
	public String getCallFrom() {
		return callFrom;
	}
	public void setCallFrom(String callFrom) {
		this.callFrom = callFrom;
	}
	
}
