package com.woniuxy.java0919.homework;

import com.woniuxy.java0918.mgr.Management;
import sun.applet.Main;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 19:00
 * @description：
 * @modified By：
 * @version:
 */
public class FoodTest {


    public static void main(String[] args) {
        Meat meat = new Meat("牛肉");
        meat.processedFoods(meat.getFoodName());
        System.out.println(meat);
        Starch starch = new Starch("土豆");
        starch.processedFoods(starch.getFoodName());
        System.out.println(starch);
        Fruit apple = new Fruit("apple");
        apple.processedFoods(apple.getFoodName());
        System.out.println(apple);
    }
}
