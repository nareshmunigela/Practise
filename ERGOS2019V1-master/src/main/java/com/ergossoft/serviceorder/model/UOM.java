package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UOM")

public class UOM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "UOM_ID")
	private int UOMId;
	
	@Column(name="UOMCode")
	private String UOMCode;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Quantity")
	private float quantity;
	
	@Column(name="Client_Id")
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

	
	public int getUOMId() {
		return UOMId;
	}

	public void setUOMId(int uOMId) {
		UOMId = uOMId;
	}

	public String getUOMCode() {
		return UOMCode;
	}

	public void setUOMCode(String uOMCode) {
		UOMCode = uOMCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
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
