package com.href.biz.dto;

import java.util.List;

public class ShowDTO {
	
	private String id;
	private String timeSlot;
	private String totalTicketSoldOut;
	private String grossAmount;
	private String reservationAmount;
	private String onlineTicketAmount;
	private FilmDTO filim;
	private List<FacilityDTO> facilities;
	
	
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public String getTotalTicketSoldOut() {
		return totalTicketSoldOut;
	}
	public void setTotalTicketSoldOut(String totalTicketSoldOut) {
		this.totalTicketSoldOut = totalTicketSoldOut;
	}
	public String getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(String grossAmount) {
		this.grossAmount = grossAmount;
	}
	public String getReservationAmount() {
		return reservationAmount;
	}
	public void setReservationAmount(String reservationAmount) {
		this.reservationAmount = reservationAmount;
	}
	public String getOnlineTicketAmount() {
		return onlineTicketAmount;
	}
	public void setOnlineTicketAmount(String onlineTicketAmount) {
		this.onlineTicketAmount = onlineTicketAmount;
	}
	public FilmDTO getFilim() {
		return filim;
	}
	public void setFilim(FilmDTO filim) {
		this.filim = filim;
	}
	public List<FacilityDTO> getFacilities() {
		return facilities;
	}
	public void setFacilities(List<FacilityDTO> facilities) {
		this.facilities = facilities;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
