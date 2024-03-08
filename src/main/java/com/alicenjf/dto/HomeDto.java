package com.alicenjf.dto;


public class HomeDto {
	private String marsApiRoverData;
	private Integer marsSol;
	private Boolean flexCheckDefault;
	public String getMarsApiRoverData() {
		return marsApiRoverData;
	}
	public void setMarsApiRoverData(String marsApiRoverData) {
		this.marsApiRoverData = marsApiRoverData;
	}
	public Integer getMarsSol() {
		return marsSol;
	}
	public void setMarsSol(Integer marsSol) {
		this.marsSol = marsSol;
	}
	public Boolean getFlexCheckDefault() {
		return flexCheckDefault;
	}
	public void setFlexCheckDefault(Boolean chekBox) {
		this.flexCheckDefault = chekBox;
	}
	
}
