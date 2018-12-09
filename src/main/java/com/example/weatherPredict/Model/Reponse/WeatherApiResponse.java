package com.example.weatherPredict.Model.Reponse;

public class WeatherApiResponse {
	
	private String dateAndTime;
	private double minTemp;
	private double maxTemp;
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public WeatherApiResponse(String dateAndTime, double minTemp, double maxTemp) {
		super();
		this.dateAndTime = dateAndTime;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
	}
	
	
	

}
