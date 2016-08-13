package com.lebedevas;

/**
 * Created by Stanislav on 08.08.2016.
 */

public class ReptileEating implements Eating {
    public void Eat(String[] foodList) {
        System.out.println("Reptile Eat food: " + foodList.toString());
    }
}