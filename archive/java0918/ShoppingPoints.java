package com.woniuxy.java0918;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/18 10:16
 * @description：
 * @modified By：
 * @version:
 */
public class ShoppingPoints {
    @Override
    public String toString() {
        return "ShoppingPoints{" +
                "id=" + id +
                ", customerSName='" + customerSName + '\'' +
                ", point=" + point +
                ", multiple=" + multiple +
                '}';
    }
    static int count;
    public ShoppingPoints() {
        this.point = 1000;
        count++;
    }

    public ShoppingPoints(int point) {
        this.point = point;
        count++;
    }

    public ShoppingPoints(int point, int id, String customerSName) {
        this.point = point;
        this.id = id;
        this.customerSName = customerSName;
        count++;
    }


    private int id;
    private String customerSName;

    private double point;
    private double multiple;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerSName() {
        return customerSName;
    }

    public void setCustomerSName(String customerSName) {
        this.customerSName = customerSName;
    }


    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double getMultiple() {
        return multiple;
    }

    public void setMultiple(double multiple) {
        this.multiple = multiple;
    }

    public void totalPoints(double money) {
        point += money;
        System.out.println("总积分是" + point);
    }

    public void totalPoints(double money, double multiple) {
        money = money * multiple;
        point += money;
        System.out.println("总积分是" + point);
    }
}
