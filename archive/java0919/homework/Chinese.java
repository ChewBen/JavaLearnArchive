package com.woniuxy.java0919.homework;

/**
     * @author ：Mashiro
     * @date ：Created in 2024/9/19 17:34
     * @description：开发一个Chinese类（中国人），要求如下
 *
 * 1、该类继承Person类
 * 2、该类有两个构造方法，一个是无参的，另一个是有参的（参数为：姓名、性别、年龄、地址，并将4个参数值为相应的4个属性赋值）。
 * 这两个构造方法功能通过调用父类构造方法实现
 * 3、为该类添加表演武术的方法：public void playMartialArt(){//...},该方法的功能是打印一句话：武术是中国的国粹
 * 4、开发一个包含主方法的测试类Test测试
     * @modified By：
     * @version:  
     */
public class Chinese extends Person {
    public static void main(String[] args) {
        Chinese chinese = new Chinese("a", "b", "c", 18);
        chinese.playMartialArt();
    }
    public Chinese() {
        super();
    }
    public Chinese(String name, String gender, String address, int age){
        super(name,gender,address,age);
    }
    public void  playMartialArt(){
        System.out.println("武术是中国的国粹");
    }
}
