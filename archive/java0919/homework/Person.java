package com.woniuxy.java0919.homework;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 17:25
 * @description：
 * 1开发一个Person类（人），要求如下
 *
 * 1、该类包含属性：姓名、性别、年龄、地址，要求所有的属性定义为私有的；
 * 2、该类有两个构造方法，一个是无参的，另一个是有参的（参数为：姓名、性别、年龄、地址，并将4个参数值为相应的4个属性赋值）
 * 3、要求为每一个属性分别编写设置值和读取值的方法,而且这些方法的访问修饰符是public
 * @modified By：
 * @version:
 */
public class Person
{
    public static void main(String[] args) {
        Person person = new Person("w", "男", "sdfas", 11);
        System.out.println(person.address);
        person.setAddress("dsfaf");
        System.out.println(person.address);
    }
    private String name;
    private String gender;
    private String address;
    private int age;
    public Person(){}

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
