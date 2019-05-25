package com.neuedu.homework0524;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b=0;
        int e=a;
           while (a%9!=0) {
                  b = b + (a % 10);
                  a = a /10;
            }
            if(b%9==0){
                System.out.println(e+":这个数能被9整除");
            }else {
                System.out.println(e+":这个数不能被9整除");

        }

        }
//        int b=a/100;
//        int c=a%10/10;
//        int d=a%10;
//        int e=b+c+d;
//        if(e%9==0){
//            System.out.println(a+"此数能被9整除");
//        }else {
//            System.out.println(a+"此数不能被9整除");
//        }

    }

