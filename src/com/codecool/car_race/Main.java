package com.codecool.car_race;


public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i = 0; i < 10; i++) {
            race.vehicles[i] = new Car();
            race.vehicles[i+10] = new Motorcycle();
            race.vehicles[i+20] = new Truck();
        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);
        race.simulateRace();
        race.printRaceResults();
    }
}
