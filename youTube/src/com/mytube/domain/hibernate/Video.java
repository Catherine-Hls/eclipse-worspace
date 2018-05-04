package com.mytube.domain.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="video")

public class Video {
	
	@Id	 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="user_id")
	private Long user_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="publicationdate")
	private String publicationdate;
	
	@Column(name="urlvideo")
	private String urlvideo;
	
	@Column(name="urlminiature")
	private String urlminiature;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long userId) {
		this.user_id = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getPublicationdate() {
		return publicationdate;
	}
	public void setPublicationdate(String publicationdate) {
		this.publicationdate = publicationdate;
	}
	public String getUrlvideo() {
		return urlvideo;
	}
	public void setUrlvideo(String urlvideo) {
		this.urlvideo = urlvideo;
	}
	public String getUrlminiature() {
		return urlminiature;
	}
	public void setUrlminiature(String urlminiature) {
		this.urlminiature = urlminiature;
	}
		
		
}
