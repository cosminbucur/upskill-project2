package com.sda.finalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/weather")
@RestController
public class WeatherInfoController {

    public static final String OPEN_WEATHER_API = "http://api.openweathermap.org/data/2.5";
    public static final String OPEN_WEATHER_API_KEY = "9913431fcacaa955aa3815b513513750";
    @GetMapping("{locationName}")
    public String getWeatherInfo(@PathVariable String locationName) {
        // http://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
        return "ok";
    }
}
