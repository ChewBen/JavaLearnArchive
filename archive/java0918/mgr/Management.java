package com.woniuxy.java0918.mgr;

import com.woniuxy.java0918.entity.Score;
import com.woniuxy.java0918.entity.Student;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/18 19:15
 * @description：
 * 在包com.woniuxy.mgr下建立一个管理类，该类的具体要求如下：
 *
 * 1.包含一个私有的、静态的、Student[] 类型的属性stus
 * 2.在静态块中初始化stus为10个元素的数组，并放入10个Student对象。
 * 3.包含公有的方法：计算所有的学生平均总分
 * 4.包含公有的方法：打印学生清单（包含学号、姓名、性别、平均成绩）

 * @modified By：
 * @version:
 */
public class Management {

    private static Student[] stus;
    static {

        stus =new Student[10];
        for (int i = 0; i < stus.length; i++) {
            stus[i]=new Student(0+i,"姓名"+i,"男");
        }
    }



    public  double getAllAvg(){
       double sum=0;
        for (Student student : stus) {
            if (student != null) {
                sum +=student.getSum();
            }
        }
        return sum/stus.length;
    }
    public void printStu(){
        for (Student student : stus) {
                System.out.println(student);
        }
    }

}

