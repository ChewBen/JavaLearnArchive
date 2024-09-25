package com.woniuxy.java0919;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 10:40
 * @description：
 * @modified By：
 * @version:
 */
public class Demo01 {
    public static void main(String[] args) {
        /*String str="22";
        int age =Integer.parseInt(str);
        System.out.println(age + 1);
        Integer i =Integer.valueOf(1);
        int ag=i.intValue();
        Integer integer=1;
        int b=integer;
        System.out.println(b + 1);*/
        Animal animal = new Animal();
        animal.eat();
        LaoWang laoWang = new LaoWang(1,"laowan");
        laoWang.makeToFU();
        laoWang.makeToFU(1);
        XiaoWang xiaoWang = new XiaoWang();
        xiaoWang.setID(1);
        xiaoWang.makeToFU();
        xiaoWang.makeToFU(2);
        XiaoWang xiaowan2=new XiaoWang();
        xiaowan2.makeToFU();
        xiaowan2.makeFood();
    }
}
