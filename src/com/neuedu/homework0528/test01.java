package com.neuedu.homework0528;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("请输入姓名：");
           String a1=scanner.next();
           System.out.println("请输入学号：");
           int  b1=scanner.nextInt();
           System.out.println("请输入数学成绩：");
           int  c1=scanner.nextInt();
           System.out.println("请输入语文成绩：");
           int  d1=scanner.nextInt();
           System.out.println("请输入英语成绩：");
           int  e1=scanner.nextInt();

           work01 study1=new work01();
           study1.setName(a1);
           study1.setXuehao(b1);
           study1.setMath(c1);
           study1.setYuwen(d1);
           study1.setYingyu(e1);
           System.out.println(study1.toString());

        System.out.println("请输入姓名：");
        String a2=scanner.next();
        System.out.println("请输入学号：");
        int  b2=scanner.nextInt();
        System.out.println("请输入数学成绩：");
        int  c2=scanner.nextInt();
        System.out.println("请输入语文成绩：");
        int  d2=scanner.nextInt();
        System.out.println("请输入英语成绩：");
        int  e2=scanner.nextInt();

        work01 study2=new work01();
        study2.setName(a2);
        study2.setXuehao(b2);
        study2.setMath(c2);
        study2.setYuwen(d2);
        study2.setYingyu(e2);
        System.out.println(study1.toString());
        System.out.println(study2.toString());

    }
}
