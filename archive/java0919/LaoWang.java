package com.woniuxy.java0919;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 11:38
 * @description：
 * @modified By：
 * @version:
 */
public class LaoWang {
    public void makeToFU(){
        System.out.println("step1");
        System.out.println("step2");
        System.out.println("step3");
        System.out.println("step4");
    }
    public void makeToFU(int a){
        System.out.println("做"+a);

    }
    private int ID;
    private String name ;
public LaoWang(){

}
    public LaoWang(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
