package com.woniuxy.java0921;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/21 14:14
 * @description：
 * @modified By：
 * @version:
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Emploee> list = new ArrayList<>();
        list.add(new Emploee(1001,"a",22));
        list.add(new Emploee(1002,"a",22));
        list.add(new Emploee(1003,"a",22));
        Iterator<Emploee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Emploee next = iterator.next();
            System.out.println(next.getId());
        }


    }
}
