package com.neuedu.homework0524;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        //一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
        System.out.println("请输入一个五位数：");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=a/10000;//万位
        int c=a%10000/1000;//千位
        int d=a%1000/100;//百位
        int e=a%100/10;//十位
        int f=a%10;//个位
        if (10000<=a&&a<=100000) {
            if(b==f&&c==e){
                System.out.println(a+"：这个数字是回文数");
            }else {
                System.out.println(a+"：这个数字不是回文数");
            }
        }else {
            System.out.println("输入的不是个五位数");
        }

    }
}
