package com.woniuxy.java0918.entity;

import java.util.Random;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/18 17:12
 * @description： 在包com.woniuxy.entity下建立一个成绩类Score，该类的具体要求如下：
 * 1.包含私有的实例成员变量：数学成绩、语文成绩和英语成绩
 * 2.包含构造方法，其构造参数为数学成绩、语文成绩和英语成绩
 * 3.还包含一个无参的构造方法，可通过随机数生成各科成绩
 * 4.为数学成绩、语文成绩和英语成绩，提供get和set方法
 * 5.包含实例方法：计算总分，计算平均分。
 * 6.添加主方法测试。
 * @modified By：
 * @version:
 */
public class Score {
    private double mathScores;
    private double languageScores;
    private double englishScores;

    public Score(double mathScores, double languageScores, double englishScores) {
        this.mathScores = mathScores;
        this.languageScores = languageScores;
        this.englishScores = englishScores;
    }

    public Score() {
        Random random = new Random();
        mathScores = random.nextDouble() * 100;
        languageScores = random.nextDouble() * 100;
        englishScores = random.nextDouble() * 100;
    }

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getLanguageScores() {
        return languageScores;
    }

    public void setLanguageScores(double languageScores) {
        this.languageScores = languageScores;
    }

    public double getEnglishScores() {
        return englishScores;
    }

    public void setEnglishScores(double englishScores) {
        this.englishScores = englishScores;
    }

    public double getSum() {
        return englishScores + languageScores + mathScores;
    }

    public double getAverageScore() {
        return getSum() / 3;
    }

    @Override
    public String toString() {
        return "Score{" +
                "mathScores=" + mathScores + "\n" +
                ", languageScores=" + languageScores + "\n" +
                ", englishScores=" + englishScores +
                '}';
    }
}
