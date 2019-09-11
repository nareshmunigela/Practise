package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MaterialSize")
public class MaterialSize {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MateialSize_ID")
	private Integer materialSize_ID;

	@Column(name="MaterialSizeCode")
	private String materialSizeCode;

	@Column(name="Size")
	private Float size;

	@Column(name="Client_ID")
	private Integer client_ID;

	@Column(name="Status")
	private Integer status;

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

	public Integer getMaterialSize_ID() {
		return materialSize_ID;
	}

	public void setMaterialSize_ID(Integer materialSize_ID) {
		this.materialSize_ID = materialSize_ID;
	}

	public String getMaterialSizeCode() {
		return materialSizeCode;
	}

	public void setMaterialSizeCode(String materialSizeCode) {
		this.materialSizeCode = materialSizeCode;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public Integer getClient_ID() {
		return client_ID;
	}

	public void setClient_ID(Integer client_ID) {
		this.client_ID = client_ID;
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
