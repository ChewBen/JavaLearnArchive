package com.woniuxy.java0919.homework;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 18:56
 * @description：
 * @modified By：
 * @version:
 */
public class Starch extends Food {
    public Starch(String foodName) {
        super(foodName);
        setNutritionalValue(super.getNutritionalValue()*0.7);
    }

    @Override
    public void processedFoods(String foodName) {
        System.out.println("step1" + foodName);
        System.out.println("step2" + foodName);
    }
}
