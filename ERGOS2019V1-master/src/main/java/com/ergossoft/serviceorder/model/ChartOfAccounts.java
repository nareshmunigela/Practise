package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ChartOfAccounts")

public class ChartOfAccounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COA_ID")
	private Integer coaId;

	@Column(name = "COACode")
	private String coaCode;

	@Column(name = "Name")
	private String name;

	@Column(name = "Description")
	private String description;

	@Column(name = "HeadingType")
	private Integer headingType;

	@Column(name = "SubType")
	private Integer subType;

	@Column(name = "BudgetCode")
	private Integer budgetCode;

	@Column(name = "GLCategory_ID")
	private Integer gLCategoryId;

	@Column(name = "Post")
	private Boolean post;

	@Column(name = "Client_ID")
	private Integer clientId;

	@Column(name = "Status")
	private Boolean status;

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

	public Integer getCoaId() {
		return coaId;
	}

	public void setCoaId(Integer coaId) {
		this.coaId = coaId;
	}

	public String getCoaCode() {
		return coaCode;
	}

	public void setCoaCode(String coaCode) {
		this.coaCode = coaCode;
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

	public Integer getHeadingType() {
		return headingType;
	}

	public void setHeadingType(Integer headingType) {
		this.headingType = headingType;
	}

	public Integer getSubType() {
		return subType;
	}

	public void setSubType(Integer subType) {
		this.subType = subType;
	}

	public Integer getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(Integer budgetCode) {
		this.budgetCode = budgetCode;
	}

	public Integer getgLCategoryId() {
		return gLCategoryId;
	}

	public void setgLCategoryId(Integer gLCategoryId) {
		this.gLCategoryId = gLCategoryId;
	}

	public Boolean getPost() {
		return post;
	}

	public void setPost(Boolean post) {
		this.post = post;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
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
