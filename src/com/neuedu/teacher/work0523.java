package com.neuedu.teacher;

import java.util.Random;
import java.util.Scanner;

public class work0523 {
    public static void main(String[] args) {
        //定义变量 int a=1；
//        数据类型

        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        //拆分 百位 十位 个位 数字 一次拆分
        int a=result/100;
        int b=result%100/10;
        int c=result%10;
        System.out.println(c*100+b*10+a);

         /*debug 打断点 模式可以查看步骤进行
        for (int i=1;i<=20;i++){
            System.out.println(i);
        }
        */
         /*随机生成随机数
        Random rando = new Random();
        int result=rando.nextInt(10);
        System.out.println(result);
        */
//1.预习面向对象 2.思维导图细化 3.java的思维导图 4.作业

    }
}
