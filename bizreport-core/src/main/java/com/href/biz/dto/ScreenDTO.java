package com.href.biz.dto;

import java.util.List;

public class ScreenDTO {
	
	private String id;
	private String date;
	private String  name;
	private List<ShowDTO> shows;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ShowDTO> getShows() {
		return shows;
	}
	public void setShows(List<ShowDTO> shows) {
		this.shows = shows;
	}
	
	
	
	

}
