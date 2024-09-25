package com.woniuxy.java0919;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/19 11:39
 * @description：
 * @modified By：
 * @version:
 */
public class XiaoWang extends LaoWang {
  public XiaoWang(){
      super();
  }

    @Override
    public void makeToFU() {
        super.makeToFU();
        System.out.println("buy");
        System.out.println("sold");
    }

    @Override
    public void makeToFU(int a1) {
        super.makeToFU(a1);
        System.out.println(a1);
    }
    public void makeFood(){
        System.out.println("ok");
    }
}
