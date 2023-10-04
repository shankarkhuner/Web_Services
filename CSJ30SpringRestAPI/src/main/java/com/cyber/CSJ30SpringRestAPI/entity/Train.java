package com.cyber.CSJ30SpringRestAPI.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Train_Table")
public class Train {
	@Id
	
	private int trainNumber;
	private String trainName;
	private String sourceStation;
	private String destinationStation;
	private double trainPrice;
	private LocalDate journeyDate;
	private String trainStatus;
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public double getTrainPrice() {
		return trainPrice;
	}
	public void setTrainPrice(double trainPrice) {
		this.trainPrice = trainPrice;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getTrainStatus() {
		return trainStatus;
	}
	public void setTrainStatus(String trainStatus) {
		this.trainStatus = trainStatus;
	}
	public Train(int trainNumber, String trainName, String sourceStation, String destinationStation, double trainPrice,
			LocalDate journeyDate, String trainStatus) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.trainPrice = trainPrice;
		this.journeyDate = journeyDate;
		this.trainStatus = trainStatus;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
