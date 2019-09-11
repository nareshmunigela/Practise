package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BankMaster")

public class BankMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Bank_ID")
	private int bankId;

	@Column(name = "BankCode")
	private String bankCode;

	@Column(name = "BankName")
	private String bankName;

	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "BankAddress")
	private String bankAddress;

	@Column(name = "SortCode")
	private String sortCode;

	@Column(name = "BIC")
	private String bIC;

	@Column(name = "IBAN")
	private String iBAN;
	
	@Column(name = "RoutingNumber")
	private Integer routingNumber;

	@Column(name = "Status")
	private boolean status;

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

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getbIC() {
		return bIC;
	}

	public void setbIC(String bIC) {
		this.bIC = bIC;
	}

	public String getiBAN() {
		return iBAN;
	}

	public void setiBAN(String iBAN) {
		this.iBAN = iBAN;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
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

	public Integer getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(Integer routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	

}
