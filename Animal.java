package com.lebedevas;

/**
 * Created by arty on 07-Aug-16.
 */
public abstract class Animal {
    private Moving movingType;

    public Animal(Environment environment) {
        switch (environment) {
            case Earth: {
                movingType = new Walking();
                break;
            }
            //TO DO Crawling
            case Water: {
                movingType = new Swimming();
                break;
            }
            case Air: {
                movingType = new Flying();
                break;
            }
        }
    }

    public abstract class Eating {
        private com.lebedevas.Eating eatingFood;
        String[] eatingList;
        public Eating(Environment environment) {
            switch (environment) {
                case Earth: {
                    eatingList = new String {FoodType.Flowers, FoodType.Trees, FoodType.Grass, FoodType.Fruits };
                    eatingFood = new MammalEating();
                    break;
                }
                case Water: {
                    eatingList = new String { FoodType.Plankton, FoodType.Seaweed };
                    eatingFood = new FishEating();
                    break;
                }
                case Air: {
                    eatingList = new String { FoodType.Insects, FoodType.Fruits };
                    eatingFood = new BirdEating();
                    break;
                }
            }
        }
    }
}
