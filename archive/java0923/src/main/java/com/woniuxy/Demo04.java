package com.woniuxy;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/23 11:23
 * @description：
 * @modified By：
 * @version:
 */
public class Demo04
{
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(1,"q");
        treeMap.put(2,"q");
        treeMap.put(3,"3");
        treeMap.put(4,"q");
        treeMap.put(5,"q");
        treeMap.put(6,"q");
        treeMap.put(7,"q");
//        Set<Integer> set = treeMap.keySet();
//        for (Integer key : set) {
//            System.out.println(treeMap.get(key));
//        }
        Set<Map.Entry<Integer, Objects>> set = treeMap.entrySet();//entrySet 声明的set类要加entry范型
        for (Map.Entry<Integer, Objects> integerObjectsEntry : set) {
            System.out.println(integerObjectsEntry.getKey() + " " + integerObjectsEntry.getValue());

        }

    }
}
