package com.woniuxy.java0919.homework;

import java.security.PublicKey;
import java.time.temporal.ValueRange;
import java.util.Random;
import java.util.WeakHashMap;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 19:40
 * @description：创建猴子完成基础测试操作 ---------------------以下内容选做------------------
 * 创建5个猴子，每个猴子进行100次吃食物和游戏，具体每次吃食物还是游戏是随机的（提示随机数是1、3、5、7、9吃，2，4，6，8，10玩），
 * 而且获取食物也是随机的可能是肉制品，水果蔬菜制品和淀粉制品（提示：随机数是1~3肉制品）。
 * 最后输出5个猴子的名称和体重。注：可以根据需要自由设计该类
 * 完成思维导图
 * @modified By：
 * @version:
 */
public class Management {
    public static void main(String[] args) {
        Monkey[] monkeys=new Monkey[5];
        for (int i = 0; i < monkeys.length; i++) {
            monkeys[i]=new Monkey(i+"monkey");
        }
        int times = 100;
        Meat meat = new Meat("meat");
        Fruit fruit = new Fruit("fruit");
        Starch starch = new Starch("starch");
        Random random = new Random();
        for (Monkey monkey : monkeys) {
            for (int i = 1; i <= 100; i++) {
                //偶数吃
                if (random.nextInt(10) / 2 == 0) {
                    if ((random.nextInt(3) + 1) == 1) {
                        monkey.eat(meat);
                    }
                    if ((random.nextInt(3) + 1) == 2) {
                        monkey.eat(fruit);
                    }
                    if ((random.nextInt(3) + 1) == 3) {
                        monkey.eat(starch);
                    }

                } else {
                    monkey.game();
                }
            }
            System.out.println(monkey.getName()+"最终" + monkey.getWeight());
            //奇数玩游戏
        }


    }

}







