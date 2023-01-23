package com.foodfinder.console;

import com.foodfinder.FoodFinderApplicationStarter;
import com.foodfinder.FoodFinderDto;

public class Main {
    public static void main(String[] args) {
        FoodFinderDto start = new FoodFinderApplicationStarter().start();
        System.out.println(start.message());
        System.out.println(start.receipe());
    }
}
