package com.woniuxy.java0918;

/**
 * @author ：Mashiro
 * @date ：Created in 2024/9/18 9:56
 * @description：
 * @modified By：
 * @version:
 */
public class Demo {
    public static void main(String[] args) {
        /*
        方法重载demo1
        MethodOverload eat01 = new MethodOverload();
        eat01.eat();
        eat01.eat("桃子");
        eat01.eat("梨",10);*/

        /*
        方法重载demo2
        ShoppingPoints cus01 = new ShoppingPoints();
        cus01.setId(1201);
        cus01.setPoint(1000);
        cus01.totalPoints(1000);
        cus01.totalPoints(1000,1.5);
        ShoppingPoints cus02=new ShoppingPoints(2000);
        cus02.totalPoints(1);
        ShoppingPoints cus03 = new ShoppingPoints(1000, 1201, "wow");
        cus03.totalPoints(2);
        System.out.println(cus03.getCustomerSName());*/
    ShoppingPoints[] shoppingPoints=new ShoppingPoints[10];
    shoppingPoints[0]=new ShoppingPoints(1000,1001,"t");
        System.out.println(ShoppingPoints.count);
    shoppingPoints[1]=new ShoppingPoints();
        System.out.println(ShoppingPoints.count);
    shoppingPoints[2]=new ShoppingPoints(1200);
        System.out.println(ShoppingPoints.count);

        for (ShoppingPoints shoppingPoint : shoppingPoints) {
            if (shoppingPoint != null) {
                System.out.println(shoppingPoint);
            }
        }

    }
}
