package com.href.biz.dto;

import java.util.List;

public class CinemasDTO {
	
	private String id;
	private String place;
	private String orgName;
	private List<ScreenDTO> screens;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public List<ScreenDTO> getScreens() {
		return screens;
	}
	public void setScreens(List<ScreenDTO> screens) {
		this.screens = screens;
	}
	
	
	
	

}
