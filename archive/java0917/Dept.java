package com.woniuxy.java0917;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/17 17:45
 * @description：
 * //定义类Dept要求如下：
 * //1、私有属性有：部门编号、部门名称、备注
 * //2、提供getter和setter方法
 * //3、创建实例对象，调用相关属性
 * @modified By：
 * @version:
 */
public class Dept {
    private int departmentid;
    private String departmentName;

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private String remarks;
    //使用快捷键创建getter setter方法


    public int getDepartmentid() {
        return departmentid;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getRemarks() {
        return remarks;
    }
}
