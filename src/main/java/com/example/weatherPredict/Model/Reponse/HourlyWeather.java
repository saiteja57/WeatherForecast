package com.example.weatherPredict.Model.Reponse;

public class HourlyWeather {
	
	private MainHourlyWeather main;
	private String dt_txt;
	
	public MainHourlyWeather getMain() {
		return main;
	}
	public void setMain(MainHourlyWeather main) {
		this.main = main;
	}
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
}
