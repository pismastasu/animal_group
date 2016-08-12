package com.company;

import java.util.Random;

/**
 * Created by Admin on 07.08.2016.
 */
abstract class Animal {
    private String typeAnimal;
    private String gengerAnimal;
    private Moving movingType;
    private Animal animals[] = new Animal[2];
    private Random randomGender = new Random();

    public Animal(Enviroment enviroment) {
        switch (enviroment) {
            case Earth: {
                movingType = new Walking();
                break;
            }
            case Water: {
                movingType = new Swiming();
                break;
            }
            case Air: {
                movingType = new Flying();
                break;
            }
        }
    }

    public static boolean Pairing(Animal animal1, Animal animal2) {
        for (int i = 0; i < 2; i++) {
            int j = (int) Math.random();
            switch (i) {
                case 0: {
                    if (j == 0) {
                        animal1.gengerAnimal = "male";
                    } else {
                        animal1.gengerAnimal = "female";
                    }
                    break;
                }
                case 1: {
                    if (j == 0) {
                        animal2.gengerAnimal = "male";
                    } else {
                        animal2.gengerAnimal = "female";
                    }
                    break;
                }
            }
        }

        if (animal1.gengerAnimal.equals(animal2.gengerAnimal) || animal1.typeAnimal.equals(animal2.typeAnimal) == false) {
            return false;
        }
        return true;
    }
}
