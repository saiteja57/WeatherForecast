package com.example.weatherPredict.Model.Reponse;

import java.util.List;

public class OpenWeatherAPIResponse {
	
	private String cod;
	private int cnt;
	private List<HourlyWeather> list;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<HourlyWeather> getList() {
		return list;
	}
	public void setList(List<HourlyWeather> list) {
		this.list = list;
	}
	
}
