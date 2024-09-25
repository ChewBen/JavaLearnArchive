package com.woniuxy.java0921;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/21 16:02
 * @description：
 * @modified By：
 * @version:
 */
public class Demo04
{
    public static void main(String[] args) {
        IShape pic = new IShape() {
            @Override
            public void draw() {
                System.out.println("pic");
            }
        };
        pic.draw();
    }
}
