package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EquipmentType")
public class EquipmentType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EquipmentType_ID")
	private Integer equipmentTypeId;

	@Column(name = "Description")
	private String description;

	@Column(name = "EquipmentTypeCode")
	private String equipmentTypeCode;

	@Column(name = "SystemValue")
	private int systemValue;
	
	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "Status")
	private Integer status;

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

	public Integer getEquipmentTypeId() {
		return equipmentTypeId;
	}

	public void setEquipmentTypeId(Integer equipmentTypeId) {
		this.equipmentTypeId = equipmentTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEquipmentTypeCode() {
		return equipmentTypeCode;
	}

	public void setEquipmentTypeCode(String equipmentTypeCode) {
		this.equipmentTypeCode = equipmentTypeCode;
	}

	public int getSystemValue() {
		return systemValue;
	}

	public void setSystemValue(int systemValue) {
		this.systemValue = systemValue;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}



	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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
	
	
}
