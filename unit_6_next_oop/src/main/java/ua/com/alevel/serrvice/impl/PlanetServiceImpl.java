package ua.com.alevel.serrvice.impl;

import ua.com.alevel.serrvice.PlanetService;

import java.math.BigDecimal;
import java.math.MathContext;

public class PlanetServiceImpl implements PlanetService {

    private static final BigDecimal G = BigDecimal.valueOf(6.672E-11);

    @Override
    public BigDecimal accelerationOfGravity(BigDecimal diameter, BigDecimal weight) {
        BigDecimal radius = diameter.divide(BigDecimal.valueOf(2));
        MathContext mc = new MathContext(5);
        return G.multiply(weight.divide(radius.pow(2), mc));
    }
}
