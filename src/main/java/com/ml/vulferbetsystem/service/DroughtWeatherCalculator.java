package com.ml.vulferbetsystem.service;

import com.ml.vulferbetsystem.domain.Point;

import java.util.List;

public interface DroughtWeatherCalculator {
    boolean isDroughtWeather(List<Point> planetLocations, int days);
}
