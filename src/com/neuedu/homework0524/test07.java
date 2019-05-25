package com.neuedu.homework0524;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        //判断一个年份是平年还是闰年
        //能被4整除但不能被100整除的年份为普通闰年。
        //能被400整除的为世纪闰年。
        System.out.println("请输入一个年份：");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        if(a%4==0&&a%100!=0){
            System.out.println(a+"此年为普通闰年");
        }else if(a%400==0){
            System.out.println(a+"此年为世纪闰年");
        }else {
            System.out.println(a+"此年不是闰年");
        }
    }
}
