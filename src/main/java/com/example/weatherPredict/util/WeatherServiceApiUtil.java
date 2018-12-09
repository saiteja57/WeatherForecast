package com.example.weatherPredict.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.weatherPredict.Model.Reponse.MainHourlyWeather;
import com.example.weatherPredict.Model.Reponse.OpenWeatherAPIResponse;

public class WeatherServiceApiUtil {
	
	public static OpenWeatherAPIResponse getWeatherForecast(int zipcode) {
		RestTemplate rt = new RestTemplate();
		String uri
		  = "http://api.openweathermap.org/data/2.5/forecast?zip="+zipcode+",us&APPID=3373832c005d8639b57584ab5848dd84";
		ResponseEntity<OpenWeatherAPIResponse> responseEntity
		  = rt.getForEntity(uri, OpenWeatherAPIResponse.class);
		OpenWeatherAPIResponse response = responseEntity.getBody();
		return response;
	}
	
	public static MainHourlyWeather convertKelvinToFahrenheit(double tempMin, double tempMax) {
		MainHourlyWeather mainHourlyWeather = new MainHourlyWeather();
		mainHourlyWeather.setTemp_min(convertTemps(tempMin));
		mainHourlyWeather.setTemp_max(convertTemps(tempMax));
		return mainHourlyWeather;
	}
	
	private static Double convertTemps(Double temperature) {
		return Math.round(((temperature-273.15) * (9/5) + 32)*100D )/ 100D;
	}

}
