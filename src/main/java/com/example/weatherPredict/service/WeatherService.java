package com.example.weatherPredict.service;

import org.springframework.stereotype.Component;

import com.example.weatherPredict.Model.Reponse.WeatherResponse;

@Component
public interface WeatherService {
	
	public WeatherResponse getWeatherForecast(int zipcode);

}
