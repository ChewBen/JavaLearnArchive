package com.woniuxy.java0919.homework;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 18:58
 * @description：
 * @modified By：
 * @version:
 */
public class Fruit extends Food {
    public Fruit(String foodName) {
        super(foodName);
        setNutritionalValue(super.getNutritionalValue()*0.9);
    }

    @Override
    public void processedFoods(String foodName) {
        System.out.println("step01" + foodName);
    }
}

