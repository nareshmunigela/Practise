package com.ergossoft.serviceorder.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOReceipt")
public class SoReceipt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "SOReceipt_ID")
	private int soReceiptId;
	
	@Column(name = "PaymentType_ID")
	private int paymentTypeId;
	
	@Column(name = "CustomerCard_ID")
	private int customerCreditCardId;
	
	@Column(name = "CustomerBank_ID")
	private int customerBankId;
	
	@Column(name = "SO_ID")
	private int serviceOrderId;
	
	
	@Column(name = "Amount")
	private Double Amount;
	
	@Column(name = "CheckNumber")
	private int chequeNumber; 	

	
	@Column(name = "ReceiptDate")
	private LocalDate receiptDate;
	
	
	@Column(name="PaidTo")
	private String paidTo;
	
	@Column(name = "Client_ID")
	private int clientId;
	
	@Column(name = "Status")
	private int status;
	
	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;
	
	@Column(name = "DeletedDate")
	private LocalDateTime deletedDate;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "DeletedBy")
	private String deletedBy;

	
	
	
	
	
	public LocalDate getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(LocalDate receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getPaidTo() {
		return paidTo;
	}

	public void setPaidTo(String paidTo) {
		this.paidTo = paidTo;
	}

	public int getSoReceiptId() {
		return soReceiptId;
	}

	public void setSoReceiptId(int soReceiptId) {
		this.soReceiptId = soReceiptId;
	}

	public int getPaymentTypeId() {
		return paymentTypeId;
	}

	public void setPaymentTypeId(int paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public int getCustomerCreditCardId() {
		return customerCreditCardId;
	}

	public void setCustomerCreditCardId(int customerCreditCardId) {
		this.customerCreditCardId = customerCreditCardId;
	}

	public int getServiceOrderId() {
		return serviceOrderId;
	}

	public void setServiceOrderId(int serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}


	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	public int getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(LocalDateTime deletedDate) {
		this.deletedDate = deletedDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public int getCustomerBankId() {
		return customerBankId;
	}

	public void setCustomerBankId(int customerBankId) {
		this.customerBankId = customerBankId;
	}	
	
}
	
	

	
