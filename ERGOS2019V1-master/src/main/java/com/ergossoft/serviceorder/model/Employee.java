package com.ergossoft.serviceorder.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_ID")
	private Integer employeeId;

	@Column(name = "EmployeeCode")
	private String employeeCode;

	@Column(name = "Client_ID")
	private Integer clientId;

	@Column(name = "Department_ID")
	private Integer departmentId;

	@Column(name = "Name")
	private String name;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "Address")
	private String address;

	@Column(name = "City")
	private String city;

	@Column(name = "State_ID")
	private Integer stateId;

	@Column(name = "ZipCode_ID")
	private Integer zipCodeId;


	@Column(name = "Sector")
	private String sector;

	@Column(name = "Manager")
	private String manager;

	@Column(name = "HomePhone")
	private String homePhone;

	@Column(name = "CellPhone")
	private String cellPhone;

	@Column(name = "Email")
	private String email;

	@Column(name = "CommissionPercent")
	private Float commissionPercent;

	@Column(name = "ManagerCommissionPercent")
	private Float managerCommissionPercent;

	@Column(name = "TerminateDate")
	private LocalDate TerminateDate;

	@Column(name = "Company_ID")
	private Integer companyId;

	@Column(name = "SequenceCounterForempNote")
	private String sequenceCounterForempNote;

	@Column(name = "LastServiceOrderNumber")
	private String lastServiceOrderNumber;

	@Column(name = "DriverLicense")
	private String driverLicense;

	@Column(name = "DriverLicenseExpiration")
	private LocalDate DriverLicenseExpiration;

	@Column(name = "EligibleForInsurance")
	private LocalDate EligibleForInsurance;

	@Column(name = "EligibleForRetirement")
	private LocalDate EligibleForRetirement;

	@Column(name = "TechnicianBioData")
	private String TechnicianBioData;

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

	
	@Column(name = "Image")
	private byte[] image;
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(Float commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public float getManagerCommissionPercent() {
		return managerCommissionPercent;
	}

	public void setManagerCommissionPercent(float managerCommissionPercent) {
		this.managerCommissionPercent = managerCommissionPercent;
	}

	public LocalDate getTerminateDate() {
		return TerminateDate;
	}

	public void setTerminateDate(LocalDate terminateDate) {
		TerminateDate = terminateDate;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getSequenceCounterForempNote() {
		return sequenceCounterForempNote;
	}

	public void setSequenceCounterForempNote(String sequenceCounterForempNote) {
		this.sequenceCounterForempNote = sequenceCounterForempNote;
	}

	public String getLastServiceOrderNumber() {
		return lastServiceOrderNumber;
	}

	public void setLastServiceOrderNumber(String lastServiceOrderNumber) {
		this.lastServiceOrderNumber = lastServiceOrderNumber;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public LocalDate getDriverLicenseExpiration() {
		return DriverLicenseExpiration;
	}

	public void setDriverLicenseExpiration(LocalDate driverLicenseExpiration) {
		DriverLicenseExpiration = driverLicenseExpiration;
	}

	public LocalDate getEligibleForInsurance() {
		return EligibleForInsurance;
	}

	public void setEligibleForInsurance(LocalDate eligibleForInsurance) {
		EligibleForInsurance = eligibleForInsurance;
	}

	public LocalDate getEligibleForRetirement() {
		return EligibleForRetirement;
	}

	public void setEligibleForRetirement(LocalDate eligibleForRetirement) {
		EligibleForRetirement = eligibleForRetirement;
	}

	public String getTechnicianBioData() {
		return TechnicianBioData;
	}

	public void setTechnicianBioData(String technicianBioData) {
		TechnicianBioData = technicianBioData;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
