package com.woniuxy.java0919;

import com.woniuxy.java0917.Employee;

import java.util.Objects;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 15:34
 * @description：
 * @modified By：
 * @version:
 */
public class Demo02 {
   String str1="asd";




    public static void main(String[] args) {
        String str1="asd";
        String str2="asd";
        String str3 = new String("asd");
        String str4 = new String("asd");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str2));
        System.out.println(str3.equals(str4));
        Employee employee1 = new Employee("as",1);
        Employee employee2 = new Employee("as", 1);
        System.out.println(employee1.equals(employee2));

    }
}
