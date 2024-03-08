package com.alicenjf.dto;

import org.springframework.web.bind.annotation.RequestParam;

public class HomeDto {
	String marsApiRoverData;
	Integer marsSol;
	Boolean chekBox;
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
	public Boolean getChekBox() {
		return chekBox;
	}
	public void setChekBox(Boolean chekBox) {
		this.chekBox = chekBox;
	}
	
}
