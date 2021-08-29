package ua.com.alevel.entity;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.entity.type.PlanetType;
import ua.com.alevel.serrvice.impl.PlanetServiceImpl;

import java.math.BigDecimal;

@Setter
@Getter
public class Uranus extends CelestialBody {

    private final BigDecimal diameter = BigDecimal.valueOf(51118000);
    private final BigDecimal weight = BigDecimal.valueOf(8.7E25);
    private final PlanetType planetType = PlanetType.OuterPlanet;

    public BigDecimal getAccelerationOfGravity() {
        PlanetServiceImpl g = new PlanetServiceImpl();
        return g.accelerationOfGravity(this.getDiameter(), this.getWeight());
    }
}

