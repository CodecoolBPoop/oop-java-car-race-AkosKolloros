package com.codecool.car_race;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Car extends Vehicle {

    private List<String> carNames = Arrays.asList("Essence", "Vanish", "Mastery", "Intro", "Vigor",
                                                  "Legend", "Fragment", "Whirlpool", "Charm", "Blast",
                                                  "Expedition", "Formula", "Crest", "Resolve", "Shadow",
                                                  "Escape", "Centaur", "Twister", "Silver", "Paradox",
                                                  "Pyre", "Empyrean", "Blitz", "Crown", "Gallop");

    @Override
    public void prepareForLap(Race race){
        if(race.isThereABrokenTruck()){
            speed = 75;
        }
        else {
            speed = normalSpeed;
        }
    }

    public Car(){
        Random random = new Random();
        normalSpeed = random.nextInt(31) + 80;
        name = carNames.get(random.nextInt(carNames.size())) + " " + carNames.get(random.nextInt(carNames.size()));
    }
}
