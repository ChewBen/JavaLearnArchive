package com.woniuxy.java0918.entity;

import java.text.ParseException;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/18 17:27
 * @description：
 * @modified By：
 * @version:
 */
public class InstanceTesting {
//      1 成绩类测试
    /*public static void main(String[] args) {
        Score tom = new Score(100, 90, 75);
        System.out.println("tom的平均分是" + tom.getAverageScore() + "总分是" + tom.getSum());
        Score jer = new Score();
        System.out.println("jer的各科成绩是" + jer +"\n"+ "平均分是" +
                jer.getAverageScore() +
                "总分是" + jer.getSum());

    }*/
    public static void main(String[] args) throws ParseException {
        Student tom =new Student(1001,"tom","男");
        tom.setStuBirth("1999-03-21");

        System.out.println(tom.getStuBirth());
        System.out.println(tom.scores.getAverageScore());
        System.out.println(tom);
    }
}
