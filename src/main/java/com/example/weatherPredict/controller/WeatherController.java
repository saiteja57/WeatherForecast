package com.example.weatherPredict.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.weatherPredict.Model.Reponse.WeatherResponse;
import com.example.weatherPredict.service.WeatherService;


@RestController
public class WeatherController {
	@Autowired
	WeatherService weatherService;
	
	@RequestMapping(value = "/getWeatherForecast/{zipcode}", produces = {APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
	public WeatherResponse getWeatherForecast(@PathVariable int zipcode) {
		WeatherResponse response = new WeatherResponse();
		try {
			response = weatherService.getWeatherForecast(zipcode);
			response.setStatusCode(HttpStatus.OK.value());
			response.setStatusMessage("Success...!!!!");
			return response;
		}catch (Exception e) {
			response.setStatusCode(HttpStatus.EXPECTATION_FAILED.value());
			response.setStatusMessage("Exception Occurred...!!!!");
			return response;
		}
	}

}
