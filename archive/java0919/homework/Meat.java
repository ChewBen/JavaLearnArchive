package com.woniuxy.java0919.homework;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 18:39
 * @description：分别开发Food类的三个派生类：肉制品类、淀粉类和水果蔬菜类，要求：
 * d)这三个类均显式编写带参的构造方法，参数为食物名称，并分别对营养值乘以1.2 ,  0.7  , 0.9 处理；
 * （通过父类get方法得到父类营养值，乘以指定值后，再把新值通过父类set方法赋值给营养值）
 * e)这三个类均重写父类的加工食物的方法，
 * 并测试
 * @modified By：
 * @version:
 */
public class Meat extends Food {
    public static void main(String[] args) {
        Meat s = new Meat("s");
        System.out.println(s.getFoodName());
        System.out.println(s.getNutritionalValue());
    }
    public Meat(String foodName){
        super(foodName);
        setNutritionalValue(super.getNutritionalValue()*1.2);
    }

    @Override
    public void processedFoods(String foodName) {
        System.out.println("step1" + foodName);
        System.out.println("step2" + foodName);
        System.out.println("step3" + foodName);


    }
}
