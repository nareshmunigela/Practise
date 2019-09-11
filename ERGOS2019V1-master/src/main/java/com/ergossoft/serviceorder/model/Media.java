/**
 * 
 */
package com.ergossoft.serviceorder.model;

import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Media")
public class Media {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "Media_Id")
	private String mediaId;

	@Column(name = "MediaCategory")
	private String mediaCategory;

	@Column(name = "ReferenceId")
	private int referenceId;

	@Column(name = "MediaDescription")
	private String mediaDescription;

	@Column(name = "MediaExt")
	private String mediaExt;

	@Column(name = "MediaTags")
	private String mediaTags;

	@Column(name = "MediaFileName")
	private String mediaFileName;

	@Column(name = "MediaFile")
	private Blob mediaFile;

	@Column(name = "MediaFileSize")
	private String mediaFileSize;
	
	@Column(name = "MediaFileBytes")
	private byte[] mediaFileBytes;
	
	
	@Column(name = "MediaFileThumbnail")
	private Blob mediaFileThumbnail;

	@Column(name = "CopiedFrom")
	private int copiedFrom;

	@Column(name = "MediaType")
	private String MediaType;

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
	
	@Column(name = "MediaCategoryId")
	private int MediaCategoryId;
	
	
	

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaCategory() {
		return mediaCategory;
	}

	public void setMediaCategory(String mediaCategory) {
		this.mediaCategory = mediaCategory;
	}

	public int getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}

	public String getMediaDescription() {
		return mediaDescription;
	}

	public void setMediaDescription(String mediaDescription) {
		this.mediaDescription = mediaDescription;
	}

	public String getMediaExt() {
		return mediaExt;
	}

	public void setMediaExt(String mediaExt) {
		this.mediaExt = mediaExt;
	}

	public String getMediaTags() {
		return mediaTags;
	}

	public void setMediaTags(String mediaTags) {
		this.mediaTags = mediaTags;
	}

	public String getMediaFileName() {
		return mediaFileName;
	}

	public void setMediaFileName(String mediaFileName) {
		this.mediaFileName = mediaFileName;
	}

	public Blob getMediaFile() {
		return mediaFile;
	}

	public void setMediaFile(Blob mediaFile) {
		this.mediaFile = mediaFile;
	}

	public Blob getMediaFileThumbnail() {
		return mediaFileThumbnail;
	}

	public void setMediaFileThumbnail(Blob mediaFileThumbnail) {
		this.mediaFileThumbnail = mediaFileThumbnail;
	}

	public int getCopiedFrom() {
		return copiedFrom;
	}

	public void setCopiedFrom(int copiedFrom) {
		this.copiedFrom = copiedFrom;
	}

	public String getMediaType() {
		return MediaType;
	}

	public void setMediaType(String mediaType) {
		MediaType = mediaType;
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

	public byte[] getMediaFileBytes() {
		return mediaFileBytes;
	}

	public void setMediaFileBytes(byte[] mediaFileBytes) {
		this.mediaFileBytes = mediaFileBytes;
	}

	public int getMediaCategoryId() {
		return MediaCategoryId;
	}

	public void setMediaCategoryId(int mediaCategoryId) {
		MediaCategoryId = mediaCategoryId;
	}

	public String getMediaFileSize() {
		return mediaFileSize;
	}

	public void setMediaFileSize(String mediaFileSize) {
		this.mediaFileSize = mediaFileSize;
	}

	
	
	
	
}
