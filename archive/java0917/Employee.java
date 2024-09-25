package com.woniuxy.java0917;

import java.util.Objects;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/17 16:21
 * @description： //定义类Employee, 要求如下：
 * //1、私有属性有：员工编号、姓名、性别、年龄、邮箱、电话、地址、薪水
 * //2、提供getter和setter方法
 * //3、创建实例对象，调用相关属性
 * @modified By：
 * @version:
 */
public class Employee {
    private int id;

    public void setId(int id) {
        this.id = id;
    }//创建setter设值器

    public int getId() {
        return id;
    }//创建getter取值器

    private String name;
    public Employee(){

    } public Employee(String name,int id){
this.name=name;
this.id=id;
    }


    public void setName(String name) {
        this.name = name;
    }

    private String gender;
    private int age;
    private String email;
    private String tel;
    private String address;
    private double salary;

    /*
    快捷键 alt+ins 快速创建setter和getter
     */
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
