package com.woniuxy.java0917;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/17 18:02
 * @description：
 * 开发出一个职称类要求如下：
 * 1、私有属性有：编号、职称名称、职称级别，是否可用
 * 2、提供getter和setter方法
 * 3、创建实例对象，调用相关属性
 * @modified By：
 * @version:
 */
public class ProfTitle {
    private int profid;
    private String profname;
    private String jobTitleLevel;
    private boolean isavailable=false;

    public int getProfid() {
        return profid;
    }

    public String getProfname() {
        return profname;
    }

    public String getJobTitleLevel() {
        return jobTitleLevel;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

    public void setProfid(int profid) {
        this.profid = profid;
    }

    public void setProfname(String profname) {
        this.profname = profname;
    }

    public void setJobTitleLevel(String jobTitleLevel) {
        this.jobTitleLevel = jobTitleLevel;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }
}
