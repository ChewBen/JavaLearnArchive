package com.woniuxy.java0918.entity;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/18 17:41
 * @description： 在包com.woniuxy.entity下建立一个学生类Student，该类的具体要求如下：
 * <p>
 * 1.包含私有的实例成员变量：学号、姓名、性别
 * 2.包含私有实例成员变量：成绩（类型Score，并直接赋初值new Score())
 * 3.仅包含一个公有的构造方法，其构造参数为学号、姓名、性别
 * 4.为学号提供公有的get方法，为姓名、性别提供公有的get和set方法
 * 5.包含两个公有的实例方法：获得总分，获得平均分（可省略）
 * 6.包含私有的实例成员变量：出生日期（类型java.util.Date）
 * 7.为出生日期提供公有的get和set方法，其中get方法的返回类型是String，格式为yyyy-MM-dd，其中set方法接收参数类型是String，格式为yyyyMMdd
 * 8.添加主方法测试。
 * @modified By：
 * @version:
 */
public class Student {
    private int stuID;
    private String stuName;
    private String stuGender;
    Score scores = new Score();
    private double Score;

    public Student() {

    }

    public Student(int stuID, String stuName, String stuGender) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuGender = stuGender;
    }

    public int getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    private Date stuBirth;

    public com.woniuxy.java0918.entity.Score getScores() {
        return scores;
    }

    public void setScores(com.woniuxy.java0918.entity.Score scores) {
        this.scores = scores;
    }

    public String getStuBirth() {
        SimpleDateFormat dateForma = new SimpleDateFormat("yyyy-MM-dd");
        return dateForma.format(stuBirth);
    }

    /**
     * @Description 出生日期提供公有的get和set方法，
     * 其中get方法的返回类型是String，
     * 格式为yyyy-MM-dd，
     * 其中set方法接收参数类型是String，格式为yyyyMMdd
     * @Return
     * @Author Ben
     * @Date Create by
     */
    public void setStuBirth(String stuBirth) throws ParseException {
        SimpleDateFormat dateForma = new SimpleDateFormat("yyyyMMdd");
        Date parse = dateForma.parse(stuBirth);
        this.stuBirth = parse;
    }

    public double getAvg() {
        return scores.getAverageScore();
    }

    public double getSum() {
        return scores.getSum();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", scores=" + scores.getSum()+

                ", stuBirth=" + stuBirth +
                '}';
    }
}
