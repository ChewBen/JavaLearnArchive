package com.woniuxy;

import java.util.TreeSet;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/23 10:30
 * @description：
 * @modified By：
 * @version:
 */
public class Demo02 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(5);
        integers.add(4);
        System.out.println(integers);

    }
}
