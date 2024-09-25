package com.woniuxy.java0921;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/21 16:34
 * @description：
 * @modified By：
 * @version:
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Emploee> list = new ArrayList<>();
        list.add(new Emploee(1,"111",24));
        list.add(new Emploee(2,"111",22));
        list.add(new Emploee(3,"111",23));

        System.out.println(list);

       list.sort(new Comparator<Emploee>() {
           @Override
           public int compare(Emploee o1, Emploee o2) {
               return o1.getAge()- o2.getAge();
           }
       });
        System.out.println(list);
    }
}
