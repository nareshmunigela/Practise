/**
 * 
 */
package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Attachment")
public class Attachment {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "Attachment_ID")
	private String attachmentId;

	@Column(name = "AttachmentCategory_ID")
	private int attachmentcategoryId;

	@Column(name = "FileType")
	private String attachmentType;

	@Column(name = "FileName")
	private String attachmentName;

	@Column(name = "FileSize")
	private long attachmentSize;

	@Lob
	@Column(name = "Document")
	private byte[] attachmentData;

	@Column(name = "Client_ID")
	private Integer clientId;

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

	public String getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public int getAttachmentcategoryId() {
		return attachmentcategoryId;
	}

	public void setAttachmentcategoryId(int attachmentcategoryId) {
		this.attachmentcategoryId = attachmentcategoryId;
	}

	public String getAttachmentType() {
		return attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public byte[] getAttachmentData() {
		return attachmentData;
	}

	public long getAttachmentSize() {
		return attachmentSize;
	}

	public void setAttachmentSize(long attachmentSize) {
		this.attachmentSize = attachmentSize;
	}

	public void setAttachmentData(byte[] attachmentData) {
		this.attachmentData = attachmentData;
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
