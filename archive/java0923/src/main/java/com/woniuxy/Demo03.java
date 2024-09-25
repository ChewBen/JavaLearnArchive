package com.woniuxy;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/23 10:57
 * @description：hashmap learn
 * @modified By：
 * @version:
 */
public class Demo03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"q");
        hashMap.put(2,"q");
        hashMap.put(3,"3");
        hashMap.put(4,"q");
        hashMap.put(5,"q");
        hashMap.put(6,"q");
        hashMap.put(7,"q");
        System.out.println(hashMap);
        System.out.println(hashMap.get(3));

        TreeMap treeMap = new TreeMap();
        treeMap.put(1,"q");
        treeMap.put(2,"q");
        treeMap.put(3,"3");
        treeMap.put(4,"q");
        treeMap.put(5,"q");
        treeMap.put(6,"q");
        treeMap.put(7,"q");
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.get(3));
    }
}
