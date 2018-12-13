package com.codecool.car_race;

public class Vehicle {

    String name;
    int normalSpeed = 100;
    int speed;
    private int distanceTraveled = 0;

    String getName() {
        return name;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void prepareForLap(Race race){
    }

    void moveForAnHour(){
        distanceTraveled += speed;
    }
}
