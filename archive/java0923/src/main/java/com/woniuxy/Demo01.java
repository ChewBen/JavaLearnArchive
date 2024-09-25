package com.woniuxy;

import javafx.beans.binding.ListBinding;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/23 9:53
 * @description：
 * @modified By：
 * @version:
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(11);
        list.add(33);
        System.out.println(list);
        //去重方法一,新建一个list

        /*ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer listbe : list) {
            if (!list2.contains(listbe)) {
                list2.add(listbe);
            }

        }
        System.out.println(list2);*/
        //去重方法二,新使用set
        HashSet<Integer> list2 = new HashSet<>(list);//使用构造函数调用list对象 向上转型
        ArrayList<Integer> list3 = new ArrayList<>(list2);
        System.out.println(list3);

    }
}
