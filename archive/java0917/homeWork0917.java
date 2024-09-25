package com.woniuxy.java0917;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/17 16:17
 * @description：
 * @modified By：
 * @version:
 */
public class homeWork0917 {
    public static void main(String[] args) {
        //创建员工实例
        Employee emp01 = new Employee();
        emp01.setId(1);
        emp01.setName("okk");
        emp01.setAddress("sdfafdafds.sdfasfa");
        emp01.setSalary(9000);
        System.out.println(emp01.getName() + "id是" + emp01.getId() + "薪水是" + emp01.getSalary());
        //创建部门实例
        Dept dept01 = new Dept();
        dept01.setDepartmentid(100);
        dept01.setDepartmentName("研发部");
        dept01.setRemarks("研发部一共有7人");
        System.out.println(dept01.getDepartmentName() + "的部门id是" + dept01.getDepartmentid() + "备注是" + dept01.getRemarks());
        //创建职称实例
        ProfTitle prof01 = new ProfTitle();
        prof01.setProfname("java工程师");
        prof01.setProfid(120);
        prof01.setJobTitleLevel("p1");
        prof01.setIsavailable(true);
        System.out.println(prof01.getProfname() + "的id是" + prof01.getProfid() + "是否可用" + prof01.isIsavailable() + "职阶是" + prof01.getJobTitleLevel());
    }


}
