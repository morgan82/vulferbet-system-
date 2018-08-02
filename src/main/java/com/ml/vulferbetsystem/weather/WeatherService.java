package com.ml.vulferbetsystem.weather;

import com.ml.vulferbetsystem.config.ErrorType;
import com.ml.vulferbetsystem.config.StatusCodeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class WeatherService {

    @Autowired
    private WeatherRepository repository;

    public WeatherDTO getWeatherByDay(int days) {

        Weather byWeatherDate = repository.findByWeatherDate(days);
        if (byWeatherDate == null) {
            throw new StatusCodeException(HttpStatus.NOT_FOUND, ErrorType.WEATHER_NOT_FOUND);
        } else {
            return new WeatherDTO(days, byWeatherDate.getWeatherType());
        }
    }
}