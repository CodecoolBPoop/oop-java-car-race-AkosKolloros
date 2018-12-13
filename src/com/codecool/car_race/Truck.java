package com.codecool.car_race;

import java.util.Random;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft = 0;

    boolean isBroken(){
        return breakdownTurnsLeft > 0;
    }

    private void checkBreakDown(){
        Random random = new Random();
        int randomChance = random.nextInt(100);
        if (randomChance < 5){
            breakdownTurnsLeft = 2;
        }
    }

    @Override
    public void prepareForLap(Race race){
        checkBreakDown();
        if (breakdownTurnsLeft > 0){
            breakdownTurnsLeft--;
            speed = 0;
        } else {
            speed = normalSpeed;
        }
    }

    public Truck(){
        Random random = new Random();
        name = String.valueOf(random.nextInt(1001));
    }
}
