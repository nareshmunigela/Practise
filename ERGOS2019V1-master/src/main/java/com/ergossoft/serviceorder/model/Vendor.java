package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Vendor_ID")
	private Integer vendorId;

	@Column(name="VendorCode")
	private String vendorCode;

	@Column(name="VendorType_ID")
	private Integer vendorTypeId;

	@Column(name="VendorName")
	private String vendorName;

	@Column(name="AddressLine1")
	private String addressLine1;

	@Column(name="AddressLine2")
	private String addressLine2;

	@Column(name="City")
	private String city;

	@Column(name="State_ID")
	private Integer stateId;

	@Column(name="ZipCode_ID")
	private Integer zipCodeId;

	@Column(name="Contact_ID")
	private Integer contactId;

	@Column(name="ContactPhone_ID")
	private Integer contactPhoneId;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="DeptNo")
	private Integer deptNo;

	@Column(name="Client_ID")
	private Integer clientId;

	@Column(name="Status")
	private Integer status;

	@Column(name="CreatedDate")
	private LocalDateTime createdDate;

	@Column(name="DeletedDate")
	private LocalDateTime deletedDate;

	@Column(name="UpdatedDate")
	private LocalDateTime updatedDate;

	@Column(name="CreatedBy")
	private String createdBy;

	@Column(name="UpdatedBy")
	private String updatedBy;

	@Column(name="DeletedBy")
	private String deletedBy;

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public Integer getVendorTypeId() {
		return vendorTypeId;
	}

	public void setVendorTypeId(Integer vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getZipCodeId() {
		return zipCodeId;
	}

	public void setZipCodeId(Integer zipCodeId) {
		this.zipCodeId = zipCodeId;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getContactPhoneId() {
		return contactPhoneId;
	}

	public void setContactPhoneId(Integer contactPhoneId) {
		this.contactPhoneId = contactPhoneId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
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
