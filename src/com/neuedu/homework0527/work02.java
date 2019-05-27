package com.neuedu.homework0527;


import java.util.Scanner;

public class work02 {
    /*
    2 定义圆类，它有一个变量radius(半径)。
    从键盘输入数据，将半径传递给radius，
    编程计算并输出圆的周长和面积（
    确保输入的数据不为负数）。并对其进行测试
     */
    int radius;
    public void setRadius(int radius1){
        if (radius1>0){
            radius=radius1;
        }else {
            System.out.println("请输入正确半径");
        }
    }
    public void yuan(){
        System.out.println("圆的周长："+(radius*2)*3.14);
        System.out.println("圆的面积："+(radius*radius)*3.14);
    }
}
