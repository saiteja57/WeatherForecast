package com.example.weatherPredict.Model.Reponse;

import java.util.List;

public class WeatherResponse {
	
	private int StatusCode;
	private String statusMessage;
	private List<WeatherApiResponse> HourlyWeather;
	public int getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public List<WeatherApiResponse> getHourlyWeather() {
		return HourlyWeather;
	}
	public void setHourlyWeather(List<WeatherApiResponse> hourlyWeather) {
		HourlyWeather = hourlyWeather;
	}
	
	
}
