package com.example.BusReservationOnline.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "Bus_Details_Table")
@IdClass(BusDetailTableID.class)
public class BusDetailTableEntity {
	
	
	@Id
	@Column(name = "SRC_CITY")
	private String sourceCity;
	
	@Id
	@Column(name = "DEST_CITY")
	private String destinationCity;
	
	@Id
	@Column(name = "TRVL_DATE")
	private String travelDate;
	
	@Id
	@Column(name = "RETN_DATE")
	private String returnDate;
	
	@Id
	@Column(name = "BUS_NO")
	private String busNumber;
	
	@Id
	@Column(name = "OPTR_NAME")
	private String operatorName;
	
	@Id
	@Column(name = "DEPT_TIME")
	private String depatureTime;
	
	@Id
	@Column(name = "ARVL_TIME")
	private String arrivalTime;
	
	@Id
	@Column(name = "DURATION")
	private String duration;
	
	@Id
	@Column(name = "PRICE")
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


}
