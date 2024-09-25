package com.woniuxy.java0919.homework;

import java.util.Random;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 17:38
 * @description：开发一个食物类Food，具体要求如下
 *
 * 1.具有私有属性：营养值、食物名称，提供公有的get方法和保护的set方法。
 * 2.有一个保护的带参的构造方法，参数为食物名称，并在该方法内营养值由1-10之间的随机数产生
 * 3.包含一个公有的加工食物的方法
 * 4.添加主方法测试
 * @modified By：
 * @version:
 */
public class Food {
//    public static void main(String[] args) {
//        Food bread = new Food();
//        bread.setFoodName("面包");
//       bread.setNutritionalValue(bread.setFood(bread.foodName));
//       bread.processedFoods(bread.foodName);
//        System.out.println(bread);
//        Food beer = new Food();
//        beer.setFoodName("啤酒");
//        beer.setNutritionalValue(beer.setFood(beer.foodName));
//        beer.processedFoods(beer.foodName);
//        System.out.println(beer);
//
//    }
    public Food(){

    }
    /**
     * @Description
    有一个保护的带参的构造方法，参数为食物名称，并在该方法内营养值由1-10之间的随机数产生
     * @Return
     * @Author  Ben
     * @Date  Create by
     */
    protected Food(String foodName) {
        Random random = new Random();
        this.nutritionalValue=random.nextInt(11);
        this.foodName = foodName;
    }

    private double nutritionalValue;
    private String foodName;
    protected void setFoodName(String foodName){
        this.foodName=foodName;
    }
    protected void setNutritionalValue(double nutritionalValue){
        this.nutritionalValue=nutritionalValue;
    }

   public String getFoodName(){
        return foodName;
    }
    public double getNutritionalValue(){

        return nutritionalValue;

    }



        /**
             * @Description
        公有的加工食物的方法
             * @Return
             * @Author  Ben
             * @Date  Create by
             */
        public void processedFoods(String foodName){
            System.out.println("step1" + foodName);
            System.out.println("step2" + foodName);
            System.out.println("step3" + foodName);
            System.out.println("step4" + foodName);
        }

    @Override
    public String toString() {
        return "Food{" +
                "nutritionalValue=" + nutritionalValue +
                ", foodName='" + foodName + '\'' +
                '}';
    }
}
