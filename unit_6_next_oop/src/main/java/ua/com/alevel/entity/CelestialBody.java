package ua.com.alevel.entity;

import ua.com.alevel.entity.type.PlanetType;

import java.math.BigDecimal;

public abstract class CelestialBody {

    private PlanetType planetType;

    public PlanetType getPlanetType() {
        return planetType;
    }


    public abstract BigDecimal getAccelerationOfGravity();


}
