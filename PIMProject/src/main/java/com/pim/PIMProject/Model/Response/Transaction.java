package com.pim.PIMProject.Model.Response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Transaction {
	@JacksonXmlProperty(isAttribute = true)
	private String seqNum;
	@JacksonXmlProperty(localName = "TransactionId")
	private String transactionId;
	@JacksonXmlProperty(localName = "TxnType")
	private String txnType;
	@JacksonXmlProperty(localName = "TxnDate")
	private String txnDate;
	@JacksonXmlProperty(localName = "SenderVID")
	private String senderVID;
	@JacksonXmlProperty(localName = "SendingAcc")
	private String sendingAcc;
	@JacksonXmlProperty(localName = "SenderFI")
	private String senderFI;
	@JacksonXmlProperty(localName = "ReceiverVID")
	private String receiverVID;
	@JacksonXmlProperty(localName = "ReceivingAcc")
	private String receivingAcc;
	@JacksonXmlProperty(localName = "ReceiverFI")
	private String receiverFI;
	@JacksonXmlProperty(localName = "Purpose")
	private String purpose;
	@JacksonXmlProperty(localName = "Settled")
	private String settled;
	@JacksonXmlProperty(localName = "TxnStatus")
	private String txnStatus;
	@JacksonXmlProperty(localName = "Amount")
	private String amount;
	@JacksonXmlProperty(localName = "SendingBankRefNo")
	private String sendingBankRefNo;
	@JacksonXmlProperty(localName = "SendingPSPRefNo")
	private String sendingPSPRefNo;
	@JacksonXmlProperty(localName = "ReceivingBankReference")
	private String receivingBankReference;
	@JacksonXmlProperty(localName = "ReceivingPSPReference")
	private String receivingPSPReference;
	@JacksonXmlProperty(localName = "IDTPReference")
	private String idtpReference;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(String seqNum, String transactionId, String txnType, String txnDate, String senderVID,
			String sendingAcc, String senderFI, String receiverVID, String receivingAcc, String receiverFI,
			String purpose, String settled, String txnStatus, String amount, String sendingBankRefNo,
			String sendingPSPRefNo, String receivingBankReference, String receivingPSPReference, String idtpReference) {
		super();
		this.seqNum = seqNum;
		this.transactionId = transactionId;
		this.txnType = txnType;
		this.txnDate = txnDate;
		this.senderVID = senderVID;
		this.sendingAcc = sendingAcc;
		this.senderFI = senderFI;
		this.receiverVID = receiverVID;
		this.receivingAcc = receivingAcc;
		this.receiverFI = receiverFI;
		this.purpose = purpose;
		this.settled = settled;
		this.txnStatus = txnStatus;
		this.amount = amount;
		this.sendingBankRefNo = sendingBankRefNo;
		this.sendingPSPRefNo = sendingPSPRefNo;
		this.receivingBankReference = receivingBankReference;
		this.receivingPSPReference = receivingPSPReference;
		this.idtpReference = idtpReference;
	}
	public String getSeqNum() {
		return seqNum;
	}
	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}
	public String getSenderVID() {
		return senderVID;
	}
	public void setSenderVID(String senderVID) {
		this.senderVID = senderVID;
	}
	public String getSendingAcc() {
		return sendingAcc;
	}
	public void setSendingAcc(String sendingAcc) {
		this.sendingAcc = sendingAcc;
	}
	public String getSenderFI() {
		return senderFI;
	}
	public void setSenderFI(String senderFI) {
		this.senderFI = senderFI;
	}
	public String getReceiverVID() {
		return receiverVID;
	}
	public void setReceiverVID(String receiverVID) {
		this.receiverVID = receiverVID;
	}
	public String getReceivingAcc() {
		return receivingAcc;
	}
	public void setReceivingAcc(String receivingAcc) {
		this.receivingAcc = receivingAcc;
	}
	public String getReceiverFI() {
		return receiverFI;
	}
	public void setReceiverFI(String receiverFI) {
		this.receiverFI = receiverFI;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getSettled() {
		return settled;
	}
	public void setSettled(String settled) {
		this.settled = settled;
	}
	public String getTxnStatus() {
		return txnStatus;
	}
	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSendingBankRefNo() {
		return sendingBankRefNo;
	}
	public void setSendingBankRefNo(String sendingBankRefNo) {
		this.sendingBankRefNo = sendingBankRefNo;
	}
	public String getSendingPSPRefNo() {
		return sendingPSPRefNo;
	}
	public void setSendingPSPRefNo(String sendingPSPRefNo) {
		this.sendingPSPRefNo = sendingPSPRefNo;
	}
	public String getReceivingBankReference() {
		return receivingBankReference;
	}
	public void setReceivingBankReference(String receivingBankReference) {
		this.receivingBankReference = receivingBankReference;
	}
	public String getReceivingPSPReference() {
		return receivingPSPReference;
	}
	public void setReceivingPSPReference(String receivingPSPReference) {
		this.receivingPSPReference = receivingPSPReference;
	}
	public String getIdtpReference() {
		return idtpReference;
	}
	public void setIdtpReference(String idtpReference) {
		this.idtpReference = idtpReference;
	}
}
