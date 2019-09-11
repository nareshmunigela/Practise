package com.ergossoft.serviceorder.model;

import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Material")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Material_ID")
	private Integer materialId;

	@Column(name = "MaterialCode")
	private String materialCode;

	@Column(name = "Name")
	private String name;

	@Column(name = "Description")
	private String description;

	@Column(name = "Manufacturer")
	private String manufacturer;

	@Column(name = "ModelNumber")
	private String modelNumber;

	@Column(name = "Photo")
	private Blob photo;

	@Column(name = "UnitCharge")
	private Float unitCharge;

	@Column(name = "UnitCost")
	private Float unitCost;

	@Column(name = "MfgMaterialWarranty")
	private Boolean mfgMaterialWarranty;

	@Column(name = "MfgLaborWarranty")
	private Boolean mfgLaborWarranty;

	@Column(name = "CompanyWarranty")
	private Boolean companyWarranty;

	@Column(name = "CompanyMaterialWarranty")
	private Boolean companyMaterialWarranty;

	@Column(name = "CompanyLaborWarranty")
	private Boolean companyLaborWarranty;

	@Column(name = "MfgMaterialWarrantyYYMM")
	private String mfgMaterialWarrantyYYMM;

	@Column(name = "MfgLaborWarrantyYYMM")
	private String mfgLaborWarrantyYYMM;

	@Column(name = "CompanyMaterialWarrantyYYMM")
	private String companyMaterialWarrantyYYMM;

	@Column(name = "CompanyLaborWarrantyYYMM")
	private String companyLaborWarrantyYYMM;

	@Column(name = "IsInventory")
	private Boolean isInventory;

	@Column(name = "IsSubcontractor")
	private Boolean isSubcontractor;

	@Column(name = "IsEquipment")
	private Boolean isEquipment;

	@Column(name = "IsSearialize")
	private Boolean isSearialize;

	@Column(name = "IsConsumable")
	private Boolean isConsumable;

	@Column(name = "Size_ID")
	private int sizeId;

	@Column(name = "ChartOfAccount_ID")
	private Integer chartOfAccountId;

	@Column(name = "UOM_ID")
	private int uOMId;

	@Column(name = "MaterialType_ID")
	private int materialTypeId;

	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "Status")
	private int status;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "DeletedDate")
	private LocalDateTime deletedDate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "DeletedBy")
	private String deletedBy;

	public Integer getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public Float getUnitCharge() {
		return unitCharge;
	}

	public void setUnitCharge(Float unitCharge) {
		this.unitCharge = unitCharge;
	}

	public Float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}

	public Boolean getMfgMaterialWarranty() {
		return mfgMaterialWarranty;
	}

	public void setMfgMaterialWarranty(Boolean mfgMaterialWarranty) {
		this.mfgMaterialWarranty = mfgMaterialWarranty;
	}

	public Boolean getMfgLaborWarranty() {
		return mfgLaborWarranty;
	}

	public void setMfgLaborWarranty(Boolean mfgLaborWarranty) {
		this.mfgLaborWarranty = mfgLaborWarranty;
	}

	public Boolean getCompanyWarranty() {
		return companyWarranty;
	}

	public void setCompanyWarranty(Boolean companyWarranty) {
		this.companyWarranty = companyWarranty;
	}

	public Boolean getCompanyMaterialWarranty() {
		return companyMaterialWarranty;
	}

	public void setCompanyMaterialWarranty(Boolean companyMaterialWarranty) {
		this.companyMaterialWarranty = companyMaterialWarranty;
	}

	public Boolean getCompanyLaborWarranty() {
		return companyLaborWarranty;
	}

	public void setCompanyLaborWarranty(Boolean companyLaborWarranty) {
		this.companyLaborWarranty = companyLaborWarranty;
	}

	public String getMfgMaterialWarrantyYYMM() {
		return mfgMaterialWarrantyYYMM;
	}

	public void setMfgMaterialWarrantyYYMM(String mfgMaterialWarrantyYYMM) {
		this.mfgMaterialWarrantyYYMM = mfgMaterialWarrantyYYMM;
	}

	public String getMfgLaborWarrantyYYMM() {
		return mfgLaborWarrantyYYMM;
	}

	public void setMfgLaborWarrantyYYMM(String mfgLaborWarrantyYYMM) {
		this.mfgLaborWarrantyYYMM = mfgLaborWarrantyYYMM;
	}

	public String getCompanyMaterialWarrantyYYMM() {
		return companyMaterialWarrantyYYMM;
	}

	public void setCompanyMaterialWarrantyYYMM(String companyMaterialWarrantyYYMM) {
		this.companyMaterialWarrantyYYMM = companyMaterialWarrantyYYMM;
	}

	public String getCompanyLaborWarrantyYYMM() {
		return companyLaborWarrantyYYMM;
	}

	public void setCompanyLaborWarrantyYYMM(String companyLaborWarrantyYYMM) {
		this.companyLaborWarrantyYYMM = companyLaborWarrantyYYMM;
	}

	public Boolean getIsInventory() {
		return isInventory;
	}

	public void setIsInventory(Boolean isInventory) {
		this.isInventory = isInventory;
	}

	public Boolean getIsSubcontractor() {
		return isSubcontractor;
	}

	public void setIsSubcontractor(Boolean isSubcontractor) {
		this.isSubcontractor = isSubcontractor;
	}

	public Boolean getIsEquipment() {
		return isEquipment;
	}

	public void setIsEquipment(Boolean isEquipment) {
		this.isEquipment = isEquipment;
	}

	public Boolean getIsSearialize() {
		return isSearialize;
	}

	public void setIsSearialize(Boolean isSearialize) {
		this.isSearialize = isSearialize;
	}

	public Boolean getIsConsumable() {
		return isConsumable;
	}

	public void setIsConsumable(Boolean isConsumable) {
		this.isConsumable = isConsumable;
	}

	public int getSizeId() {
		return sizeId;
	}

	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}

	public Integer getChartOfAccountId() {
		return chartOfAccountId;
	}

	public void setChartOfAccountId(Integer chartOfAccountId) {
		this.chartOfAccountId = chartOfAccountId;
	}

	public int getuOMId() {
		return uOMId;
	}

	public void setuOMId(int uOMId) {
		this.uOMId = uOMId;
	}

	public int getMaterialTypeId() {
		return materialTypeId;
	}

	public void setMaterialTypeId(int materialTypeId) {
		this.materialTypeId = materialTypeId;
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
