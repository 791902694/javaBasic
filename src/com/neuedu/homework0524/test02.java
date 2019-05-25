package com.neuedu.homework0524;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        //题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
        // 60-89分之间的用B表示，60分以下 的用C表示。
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        if(a>=90&&a<=100){
            System.out.println("成绩为：A");
        }else if(a>=60&&a<90){
            System.out.println("成绩为：B");
        }else if(0<=a&&a<60){
            System.out.println("成绩为：C");
        }else {
            System.out.println("请输入正确成绩");
        }
    }
}
