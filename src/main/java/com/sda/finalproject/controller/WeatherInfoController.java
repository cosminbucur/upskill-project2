package com.sda.finalproject.controller;

import com.sda.finalproject.dto.OpenWeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/weather")
@RestController
public class WeatherInfoController {

    private static final Logger log = LoggerFactory.getLogger(WeatherInfoController.class);
    public static final String OPEN_WEATHER_API = "http://api.openweathermap.org/data/2.5";
    public static final String OPEN_WEATHER_API_KEY = "9913431fcacaa955aa3815b513513750";

    private RestTemplate restTemplate;

    @Autowired
    public WeatherInfoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // http://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
    // http://api.openweathermap.org/data/2.5/weather?q=New York&appid=9913431fcacaa955aa3815b513513750
    @GetMapping("/{locationName}")
    public String getWeatherInfo(@PathVariable String locationName) {
        String url = OPEN_WEATHER_API + "/weather?q=" + locationName + "&appid=" + OPEN_WEATHER_API_KEY;
        OpenWeatherResponse response = restTemplate.getForObject(url, OpenWeatherResponse.class);
        log.info("open weather response: {}", response);
        return "ok";
    }
}
