package com.woniuxy.java0918;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/18 9:52
 * @description：1.尝试方法重载
 * @modified By：
 * @version:
 */
public class MethodOverload {

    public void eat(){
        System.out.println("吃水果");
    }  public void eat(String type){
        System.out.println("吃"+type);
    }  public void eat(String type, int num){
        System.out.println("吃"+num+"个"+type);
    }

}
