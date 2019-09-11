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
@Table(name = "CustomerDemographic")
public class CustomerDemographic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerDemographic_ID")
	private int CustomerDemographic_ID;

	@Column(name = "Customer_ID")
	private Integer customerID;

	@Column(name = "DateofBirth")
	private LocalDate dateofBirth;

	@Column(name = "WeddingAnniversary")
	private LocalDate weddingAnniversary;

	@Column(name = "SeniorCitizen")
	private Boolean seniorCitizen;

	@Column(name = "Military")
	private Boolean military;

	@Column(name = "Adults")
	private Integer adults;

	@Column(name = "Childrens")
	private Integer childrens;

	@Column(name = "Dogs")
	private Boolean dogs;

	@Column(name = "Cats")
	private Boolean cats;
	
	@Column(name="Client_ID")
	private Integer clientId;
	
	@Column(name="Status")
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

	public int getCustomerDemographic_ID() {
		return CustomerDemographic_ID;
	}

	public void setCustomerDemographic_ID(int customerDemographic_ID) {
		CustomerDemographic_ID = customerDemographic_ID;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public LocalDate getWeddingAnniversary() {
		return weddingAnniversary;
	}

	public void setWeddingAnniversary(LocalDate weddingAnniversary) {
		this.weddingAnniversary = weddingAnniversary;
	}

	public Boolean getSeniorCitizen() {
		return seniorCitizen;
	}

	public void setSeniorCitizen(Boolean seniorCitizen) {
		this.seniorCitizen = seniorCitizen;
	}

	public Boolean getMilitary() {
		return military;
	}

	public void setMilitary(Boolean military) {
		this.military = military;
	}

	public Integer getAdults() {
		return adults;
	}

	public void setAdults(Integer adults) {
		this.adults = adults;
	}

	public Integer getChildrens() {
		return childrens;
	}

	public void setChildrens(Integer childrens) {
		this.childrens = childrens;
	}

	public Boolean getDogs() {
		return dogs;
	}

	public void setDogs(Boolean dogs) {
		this.dogs = dogs;
	}

	public Boolean getCats() {
		return cats;
	}

	public void setCats(Boolean cats) {
		this.cats = cats;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
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
