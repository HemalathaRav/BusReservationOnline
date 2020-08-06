package com.example.BusReservationOnline.model;


import com.sun.istack.NotNull;

public class BusDetailRequest {
	@NotNull
	private String sourceCity;
	@NotNull
	private String destinationCity;
	@NotNull
	private String travelDate;
	
	private String returnDate;
	
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	@Override
	public String toString() {
		return "BusDetailRequest : [ sourceCity : " +sourceCity+ " destinationCity: " + destinationCity+" travelDate: "+ travelDate+ " returnDate: " + returnDate + "]"  ;
	}

}
