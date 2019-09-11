/**
 * 
 */
package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MediaCategory")

public class MediaCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MediaCategoryId")
	private Integer MediaCategoryId;

	@Column(name = "MediaCategoryName")
	private String MediaCategoryName;

	@Column(name = "CreatedDate")
	private Date CreatedDate;

	public Integer getMediaCategoryId() {
		return MediaCategoryId;
	}

	public void setMediaCategoryId(Integer mediaCategoryId) {
		MediaCategoryId = mediaCategoryId;
	}

	public String getMediaCategoryName() {
		return MediaCategoryName;
	}

	public void setMediaCategoryName(String mediaCategoryName) {
		MediaCategoryName = mediaCategoryName;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	 
	
	
}
