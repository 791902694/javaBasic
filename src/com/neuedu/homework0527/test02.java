package com.neuedu.homework0527;


import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        work02 yuan=new work02();
        yuan.setRadius(a);
        yuan.yuan();
    }
}
