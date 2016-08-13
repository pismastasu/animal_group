package com.lebedevas;

/**
 * Created by Stanislav on 08.08.2016.
 */
public class MammalEating implements Eating {
    public void Eat(String[] foodList) {
        System.out.println("Mammal Eat food: " + foodList.toString());
    }
}
