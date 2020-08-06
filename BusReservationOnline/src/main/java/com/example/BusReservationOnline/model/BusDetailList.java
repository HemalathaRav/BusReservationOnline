package com.example.BusReservationOnline.model;

public class BusDetailList {
	
	
	private String sourceCity;
	
	private String destinationCity;
	
	private String travelDate;
	
	private String returnDate;

	private String busNumber;
	
	private String operatorName;

	private String depatureTime;

	private String arrivalTime;

	private String duration;

	private String price;
	
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

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "BusDetailList : [ sourceCity : " +sourceCity+ " destinationCity: " + destinationCity+" travelDate: "+ travelDate+ " returnDate: " + returnDate + "busNumber: "+ busNumber +"  operatorName: "+ operatorName + "depatureTime: "+depatureTime + "arrivalTime: " + arrivalTime +"duration: " + duration +"price: " + price +"]"  ;
	}

}
