package com.woniuxy.java0919.homework;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 19:19
 * @description：开发一个猴子类Monkey，具体要求如下： 1.具有私有属性：名称，体重（直接赋初值10.0），两者均提供公有的get方法。
 * 2.仅有一个公有的有参构造方法：构造参数参数为名称
 * 3.具有一个公有的，参数是Food类型，无返回值的eat(Food food)方法，其功能是吃食物（在控制台打印猴子名称和食物名称等信息），同时体重会增加，体重增加量是：营养值*0.1
 * 4.具有一个公有的，无参的，无返回值的game()方法，其功能是游戏（可在控制台打印信息），体重降低0.05，若体重在5以下不再下降。
 * 5.重写toString方法
 * 添加主方法测试
 * @modified By：
 * @version:
 */
public class Monkey {
    public static void main(String[] args) {
        Monkey wukong = new Monkey("wukong");
        Food peach = new Food("peach");
        wukong.eat(peach);
        wukong.game();
    }

    private String name;
    private double weight = 10.0;

    public Monkey(String name) {
        this.name = name;
    }


    public void eat(Food food) {
         System.out.println(getName() + "在吃" + food.getFoodName());
       this.weight=getWeight()- food.getNutritionalValue();
        System.out.println("当前体重:"+weight);
    }

    public void game() {
        this.weight -= 0.05;
        this.weight = getWeight() > 5 ? getWeight() : 5;
        System.out.println(getName() + "在玩游戏,当前体重是:" + getWeight());
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", weight=" + weight
                +'}';
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
