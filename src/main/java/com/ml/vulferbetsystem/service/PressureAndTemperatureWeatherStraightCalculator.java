package com.ml.vulferbetsystem.service;

import com.ml.vulferbetsystem.domain.Point;
import com.ml.vulferbetsystem.utils.GeometryUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PressureAndTemperatureWeatherStraightCalculator implements PressureAndTemperatureWeatherCalculator {
    @Override
    public boolean isPressureAndTempWeather(List<Point> planetLocations, int days) {
        boolean belongToStraight = GeometryUtils.isBelongToStraight(planetLocations);
        boolean straightPassForOrigin = GeometryUtils.isStraightPassForOrigin(planetLocations.get(0), planetLocations.get(1));

        return belongToStraight && !straightPassForOrigin;
    }
}
