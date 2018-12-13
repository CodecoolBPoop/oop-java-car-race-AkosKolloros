package com.codecool.car_race;

import java.util.Random;

class Weather {

    private static boolean rain;

    static boolean  isRaining(){
        return rain;
    }

    static void setRaining(){
        Random random = new Random();
        int chanceToRain = 30;

        int randomChance = random.nextInt(100);
        rain = (randomChance < chanceToRain);
    }
}
