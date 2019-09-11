package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VendorType")

public class VendorType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VendorType_Id")
	private int vendorTypeId;
	
	@Column(name="VendorTypeCode")
	private String vendorTypeCode;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Client_ID")
	private int clientId;
	
	@Column(name="Status")
	private boolean status;
	
	@Column(name="CreatedDate")
	private LocalDateTime createdDate;
	
	@Column(name="UpdatedDate")
	private LocalDateTime updatedDate;
	
	@Column(name="DeletedDate")
	private LocalDateTime deletedDate;
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="UpdatedBy")
	private String updatedBy;
	
	@Column(name="DeletedBy")
	private String deletedBy;

	public int getVendorTypeId() {
		return vendorTypeId;
	}

	public void setVendorTypeId(int vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}

	public String getVendorTypeCode() {
		return vendorTypeCode;
	}

	public void setVendorTypeCode(String vendorTypeCode) {
		this.vendorTypeCode = vendorTypeCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
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

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalDateTime getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(LocalDateTime deletedDate) {
		this.deletedDate = deletedDate;
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

	

}
