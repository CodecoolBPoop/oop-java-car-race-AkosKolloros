package com.codecool.car_race;

import java.util.Random;

public class Motorcycle extends Vehicle {

    private static int motorcycleNumber = 0;

    @Override
    public void prepareForLap(Race race){
        Random random = new Random();
        if (Weather.isRaining()){
            speed = normalSpeed - (random.nextInt(46) + 5);
        } else {
            speed = normalSpeed;
        }
    }

    public Motorcycle(){
        motorcycleNumber++;
        name = "Motorcycle " + motorcycleNumber;
    }
}
