package com.alicenjf.response;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {
	private Long id;
	private String name;
	@JsonProperty("landing_date")
	private String landingDate;
	@JsonProperty("lunch_date")
	private String lunch_date;
	private String status;
	@JsonProperty("max_sol")
	private int maxSol;
	@JsonProperty("max_date")
	private String maxDate;
	@JsonProperty("total_photos")
	private Long totalPhotos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLandingDate() {
		return landingDate;
	}
	public void setLandingDate(String landingDate) {
		this.landingDate = landingDate;
	}
	public String getLunch_date() {
		return lunch_date;
	}
	public void setLunch_date(String lunch_date) {
		this.lunch_date = lunch_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMaxSol() {
		return maxSol;
	}
	public void setMaxSol(int maxSol) {
		this.maxSol = maxSol;
	}
	public String getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}
	public Long getTotalPhotos() {
		return totalPhotos;
	}
	public void setTotalPhotos(Long totalPhotos) {
		this.totalPhotos = totalPhotos;
	}
	@Override
	public String toString() {
		return "MarsRover [id=" + id + ", name=" + name + ", landingDate=" + landingDate + ", lunch_date=" + lunch_date
				+ ", status=" + status + ", maxSol=" + maxSol + ", maxDate=" + maxDate + ", totalPhotos=" + totalPhotos
				+ "]";
	}
	
}
