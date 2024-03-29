package com.alicenjf.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhoto {
	private Long id;
	private int sol;
	private MarsCamera cameras;
	@JsonProperty("img_src")
	private String imgSrc;
	@JsonProperty("earth_date")
	private String earthDate;
	private MarsRover rover;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getSol() {
		return sol;
	}
	public void setSol(int sol) {
		this.sol = sol;
	}
	public MarsCamera getCameras() {
		return cameras;
	}
	public void setCameras(MarsCamera cameras) {
		this.cameras = cameras;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	@Override
	public String toString() {
		return "MarsPhoto [id=" + id + ", sol=" + sol + ", cameras=" + cameras + ", imgSrc=" + imgSrc + "]";
	}
	public MarsRover getRover() {
		return rover;
	}
	public void setRover(MarsRover rover) {
		this.rover = rover;
	}
	
}
