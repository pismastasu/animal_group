package com.lebedevas;

/**
 * Created by Stanislav on 08.08.2016.
 */
public class FishEating implements Eating {
    public void Eat(String foodList[]) {
        System.out.println("Fish Eat food: " + foodList.toString());
    }
}
