package com.ergossoft.serviceorder.model;

import java.sql.Blob;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Equipment")
public class Equipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Equipment_ID")
	private Integer equipmentId;
	
	@Column(name = "Name")
	private String name;

	@Column(name = "Description")
	private String description;

	@Column(name = "Location")
	private String location;

	@Column(name = "Manufacturer")
	private String manufacturer;

	@Column(name = "Model")
	private String model;

	@Column(name = "SerialNumber")
	private String serialNumber;

	@Column(name = "Warranty")
	private String warranty;

	@Column(name = "InstallationDate")
	private Date installationDate;

	@Column(name = "InstalledByUs")
	private Boolean installedByUs;
	
	@Column(name = "MfgMaterialWarrantyExpDate")
	private Date mfgMaterialWarrantyExpDate;
	
	@Column(name = "MfgLaborWarrantyExpDate")
	private Date mfgLaborWarrantyExpDate;
	
	@Column(name = "CompanyMaterialWarrantyExpDate")
	private Date companyMaterialWarrantyExpDate;
	
	@Column(name = "CompanyLaborWarrantyExpDate")
	private Date companyLaborWarrantyExpDate;
	
	@Column(name="EstimatedAgeInYears")
	private Integer estimatedAgeInYears;

	@Column(name = "Image")
	private Blob image;	

	@Column(name = "EquipmentType_ID")
	private Integer equipmentTypeID;
	
	@Column(name = "SO_ID")
	private Integer soId;

	@Column(name = "Customer_ID")
	private Integer customerID;

	@Column(name = "Site_ID")
	private Integer siteID;

	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "Status")
	private Integer status;

	@Column(name = "CreatedDate")
	private Date createdDate;

	@Column(name = "DeletedDate")
	private Date deletedDate;

	@Column(name = "UpdatedDate")
	private Date updatedDate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "DeletedBy")
	private String deletedBy;
	
	
	

	public Integer getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
 

	public Boolean getInstalledByUs() {
		return installedByUs;
	}

	public void setInstalledByUs(Boolean installedByUs) {
		this.installedByUs = installedByUs;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}	

	public Integer getEquipmentTypeID() {
		return equipmentTypeID;
	}

	public void setEquipmentTypeID(Integer equipmentTypeID) {
		this.equipmentTypeID = equipmentTypeID;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

 
	public Integer getSoId() {
		return soId;
	}

	public void setSoId(Integer soId) {
		this.soId = soId;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public Integer getSiteID() {
		return siteID;
	}

	public void setSiteID(Integer siteID) {
		this.siteID = siteID;
	}

	
	public Integer getEstimatedAgeInYears() {
		return estimatedAgeInYears;
	}

	public void setEstimatedAgeInYears(Integer estimatedAgeInYears) {
		this.estimatedAgeInYears = estimatedAgeInYears;
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

	public Date getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
	}

	public Date getMfgMaterialWarrantyExpDate() {
		return mfgMaterialWarrantyExpDate;
	}

	public void setMfgMaterialWarrantyExpDate(Date mfgMaterialWarrantyExpDate) {
		this.mfgMaterialWarrantyExpDate = mfgMaterialWarrantyExpDate;
	}

	public Date getMfgLaborWarrantyExpDate() {
		return mfgLaborWarrantyExpDate;
	}

	public void setMfgLaborWarrantyExpDate(Date mfgLaborWarrantyExpDate) {
		this.mfgLaborWarrantyExpDate = mfgLaborWarrantyExpDate;
	}

	public Date getCompanyMaterialWarrantyExpDate() {
		return companyMaterialWarrantyExpDate;
	}

	public void setCompanyMaterialWarrantyExpDate(Date companyMaterialWarrantyExpDate) {
		this.companyMaterialWarrantyExpDate = companyMaterialWarrantyExpDate;
	}

	public Date getCompanyLaborWarrantyExpDate() {
		return companyLaborWarrantyExpDate;
	}

	public void setCompanyLaborWarrantyExpDate(Date companyLaborWarrantyExpDate) {
		this.companyLaborWarrantyExpDate = companyLaborWarrantyExpDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	 
	
	
}
