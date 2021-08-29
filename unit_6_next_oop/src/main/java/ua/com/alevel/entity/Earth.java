package ua.com.alevel.entity;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.entity.type.PlanetType;
import ua.com.alevel.serrvice.impl.PlanetServiceImpl;

import java.math.BigDecimal;

@Getter
@Setter
public class Earth extends CelestialBody {

    private final BigDecimal diameter = BigDecimal.valueOf(12756280);
    private final BigDecimal weight = BigDecimal.valueOf(6.0E24);
    private final PlanetType planetType = PlanetType.InnerPlanet;

    public BigDecimal getAccelerationOfGravity() {
        PlanetServiceImpl g = new PlanetServiceImpl();
        return g.accelerationOfGravity(this.getDiameter(), this.getWeight());
    }
}
