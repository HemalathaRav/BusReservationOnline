package com.example.BusReservationOnline.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BusDetailResponse {
	
	private String busNumber;
	
	private String operatorName;

	private String depatureTime;

	private String arrivalTime;

	private String duration;

	private String price;

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
		return "BusDetailResponse : [ busNumber: "+ busNumber +"  operatorName: "+ operatorName + "depatureTime: "+depatureTime + "arrivalTime: " + arrivalTime +"duration: " + duration +"price: " + price +"]"  ;
	}

}
