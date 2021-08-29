package ua.com.alevel;

import ua.com.alevel.entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PlanetReporter {

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        try {
            runNavigation();

            while ((choice = reader.readLine().toLowerCase()) != null) {
                report(choice);
                choice = reader.readLine().toLowerCase();
                if (choice.equals("0")) {
                    System.exit(0);
                }
                report(choice);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("There are the planets of Solar System: Earth, Venus, Saturn, Neptune, Mars, Mercury, Uranus, Jupiter");
        System.out.println("Enter a planet name to know acceleration of gravity of it");
        System.out.println("Enter All if you want to know acceleration of gravity of all planets");
        System.out.println("Enter 0 to exit");
        System.out.println();
    }

    private void report(String choice) {
        CelestialBody earth = new Earth();
        CelestialBody venus = new Venus();
        CelestialBody saturn = new Saturn();
        CelestialBody neptune = new Neptune();
        CelestialBody mars = new Mars();
        CelestialBody mercury = new Mercury();
        CelestialBody uranus = new Uranus();
        CelestialBody jupiter = new Jupiter();
        switch (choice) {
            case "earth":
                reportPlanetInfo(earth);
                break;
            case "venus":
                reportPlanetInfo(venus);
                break;
            case "saturn":
                reportPlanetInfo(saturn);
                break;
            case "neptune":
                reportPlanetInfo(neptune);
                break;
            case "mars":
                reportPlanetInfo(mars);
                break;
            case "mercury":
                reportPlanetInfo(mercury);
                break;
            case "uranus":
                reportPlanetInfo(uranus);
                break;
            case "jupiter":
                reportPlanetInfo(jupiter);
                break;
            case "all":
                reportPlanetInfo(earth);
                reportPlanetInfo(venus);
                reportPlanetInfo(saturn);
                reportPlanetInfo(neptune);
                reportPlanetInfo(mars);
                reportPlanetInfo(mercury);
                reportPlanetInfo(uranus);
                reportPlanetInfo(jupiter);
                break;
        }
        runNavigation();
    }

    private void reportPlanetInfo(CelestialBody planet) {
        System.out.println("Planet " + planet.getClass().getSimpleName() + " is an " + planet.getPlanetType() +
                " of the Solar System. The value of acceleration gravity is " + planet.getAccelerationOfGravity() + " m/c^2 ");
    }
}
