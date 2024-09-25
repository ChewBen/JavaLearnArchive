package com.woniuxy.java0921;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/21 10:15
 * @description：
 * @modified By：
 * @version:
 */
public class Emploee {
    private int id;
    private String name;
    private int age;



    public Emploee() {
    }

    public Emploee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
