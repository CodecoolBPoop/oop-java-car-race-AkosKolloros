package com.codecool.car_race;

class Race {

    Vehicle[] vehicles = new Vehicle[30];

    boolean isThereABrokenTruck() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBroken()){
                    return true;
                }
            }
        }
    return false;
    }

    void simulateRace(){
        for (int i = 0; i < 50; i++) {
            Weather.setRaining();
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
        }
    }

    void printRaceResults(){
        for (Vehicle vehicle : vehicles) {
            System.out.println("Name: " + vehicle.getName());
            System.out.println("Distance travelled: " + vehicle.getDistanceTraveled() + "km");
            System.out.println("Type: " + vehicle.getClass().getSimpleName());
            System.out.println();
        }
    }


}
