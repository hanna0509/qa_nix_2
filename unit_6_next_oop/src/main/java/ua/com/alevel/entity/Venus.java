package ua.com.alevel.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.com.alevel.entity.type.PlanetType;
import ua.com.alevel.serrvice.impl.PlanetServiceImpl;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Venus extends CelestialBody {

    private final BigDecimal diameter = BigDecimal.valueOf(12103000);
    private final BigDecimal weight = BigDecimal.valueOf(4.9E24);
    private final PlanetType planetType = PlanetType.InnerPlanet;

    public BigDecimal getAccelerationOfGravity() {
        PlanetServiceImpl g = new PlanetServiceImpl();
        return g.accelerationOfGravity(this.getDiameter(), this.getWeight());
    }
}
