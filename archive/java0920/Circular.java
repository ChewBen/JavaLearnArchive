package com.woniuxy.java0920;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/20 11:18
 * @description：
 * @modified By：
 * @version:
 */
public class Circular implements IShape {
    @Override
    public void getCircumference() {
        System.out.println("2PIR");
    }

    @Override
    public void getArea() {
        System.out.println("PIR*R");
        System.out.println(PI);
    }

    @Override
    public void draw() {

    }
}
