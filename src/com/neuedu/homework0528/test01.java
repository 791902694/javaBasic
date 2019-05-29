package com.neuedu.homework0528;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<6;i++){
            System.out.println("请输入姓名：");
            String ai=scanner.next();
            System.out.println("请输入学号：");
            int  bi=scanner.nextInt();
            System.out.println("请输入数学成绩：");
            int  ci=scanner.nextInt();
            System.out.println("请输入语文成绩：");
            int  di=scanner.nextInt();
            System.out.println("请输入英语成绩：");
            int  ei=scanner.nextInt();

            work01 studyi=new work01();
            studyi.setName(ai);
            studyi.setXuehao(bi);
            studyi.setMath(ci);
            studyi.setYuwen(di);
            studyi.setYingyu(ei);
            System.out.println(studyi.toString());
        }
//           System.out.println("请输入姓名：");
//           String a1=scanner.next();
//           System.out.println("请输入学号：");
//           int  b1=scanner.nextInt();
//           System.out.println("请输入数学成绩：");
//           int  c1=scanner.nextInt();
//           System.out.println("请输入语文成绩：");
//           int  d1=scanner.nextInt();
//           System.out.println("请输入英语成绩：");
//           int  e1=scanner.nextInt();
//
//           work01 study1=new work01();
//           study1.setName(a1);
//           study1.setXuehao(b1);
//           study1.setMath(c1);
//           study1.setYuwen(d1);
//           study1.setYingyu(e1);
//
//
//        System.out.println("请输入姓名：");
//        String a2=scanner.next();
//        System.out.println("请输入学号：");
//        int  b2=scanner.nextInt();
//        System.out.println("请输入数学成绩：");
//        int  c2=scanner.nextInt();
//        System.out.println("请输入语文成绩：");
//        int  d2=scanner.nextInt();
//        System.out.println("请输入英语成绩：");
//        int  e2=scanner.nextInt();
//
//        work01 study2=new work01();
//        study2.setName(a2);
//        study2.setXuehao(b2);
//        study2.setMath(c2);
//        study2.setYuwen(d2);
//        study2.setYingyu(e2);
//
//        System.out.println("请输入姓名：");
//        String a3=scanner.next();
//        System.out.println("请输入学号：");
//        int  b3=scanner.nextInt();
//        System.out.println("请输入数学成绩：");
//        int  c3=scanner.nextInt();
//        System.out.println("请输入语文成绩：");
//        int  d3=scanner.nextInt();
//        System.out.println("请输入英语成绩：");
//        int  e3=scanner.nextInt();
//
//        work01 study3=new work01();
//        study3.setName(a3);
//        study3.setXuehao(b3);
//        study3.setMath(c3);
//        study3.setYuwen(d3);
//        study3.setYingyu(e3);
//
//        System.out.println("请输入姓名：");
//        String a4=scanner.next();
//        System.out.println("请输入学号：");
//        int  b4=scanner.nextInt();
//        System.out.println("请输入数学成绩：");
//        int  c4=scanner.nextInt();
//        System.out.println("请输入语文成绩：");
//        int  d4=scanner.nextInt();
//        System.out.println("请输入英语成绩：");
//        int  e4=scanner.nextInt();
//
//        work01 study4=new work01();
//        study4.setName(a4);
//        study4.setXuehao(b4);
//        study4.setMath(c4);
//        study4.setYuwen(d4);
//        study4.setYingyu(e4);
//
//
//        System.out.println("请输入姓名：");
//        String a5=scanner.next();
//        System.out.println("请输入学号：");
//        int  b5=scanner.nextInt();
//        System.out.println("请输入数学成绩：");
//        int  c5=scanner.nextInt();
//        System.out.println("请输入语文成绩：");
//        int  d5=scanner.nextInt();
//        System.out.println("请输入英语成绩：");
//        int  e5=scanner.nextInt();
//
//        work01 study5=new work01();
//        study5.setName(a5);
//        study5.setXuehao(b5);
//        study5.setMath(c5);
//        study5.setYuwen(d5);
//        study5.setYingyu(e5);
//        System.out.println(study1.toString());
//        System.out.println(study2.toString());
//        System.out.println(study3.toString());
//        System.out.println(study4.toString());
//        System.out.println(study5.toString());

    }
}
