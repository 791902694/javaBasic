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



    }
}
