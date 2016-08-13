package com.lebedevas;

/**
 * Created by Stanislav on 08.08.2016.
 */
public class BirdEating implements Eating {
    public void Eat(String foodList[]) {
        System.out.println("Bird Eat food: " + foodList.toString());
    }
}
