package com.example.weatherPredict.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.weatherPredict.Model.Reponse.HourlyWeather;
import com.example.weatherPredict.Model.Reponse.MainHourlyWeather;
import com.example.weatherPredict.Model.Reponse.OpenWeatherAPIResponse;
import com.example.weatherPredict.Model.Reponse.WeatherResponse;
import com.example.weatherPredict.Model.Reponse.WeatherApiResponse;
import com.example.weatherPredict.util.WeatherServiceApiUtil;

@Component
public class WeatherServiceImpl implements WeatherService{

	@Override
	public WeatherResponse getWeatherForecast(int zipcode) {
		WeatherResponse weatherResponse = new WeatherResponse();
		try {
			OpenWeatherAPIResponse response = WeatherServiceApiUtil.getWeatherForecast(zipcode);
			LocalDate currentDate = LocalDate.now();
			LocalDate nextDay = currentDate.plusDays(1);
			List<HourlyWeather> list = response.getList();
			List<WeatherApiResponse> hourlyWeather = new ArrayList<>();
			for(HourlyWeather weatherFilter : list) {
				if(weatherFilter.getDt_txt().substring(0, 10).equals(nextDay.toString())) {
					MainHourlyWeather finalWeather = WeatherServiceApiUtil.convertKelvinToFahrenheit(weatherFilter.getMain().getTemp_min(), weatherFilter.getMain().getTemp_max());
					hourlyWeather.add(new WeatherApiResponse(weatherFilter.getDt_txt(), finalWeather.getTemp_min(), finalWeather.getTemp_max()));
				}
			}
			weatherResponse.setHourlyWeather(hourlyWeather);
			return weatherResponse;
		} catch (Exception e) {
			return weatherResponse;
		}
	}
}
