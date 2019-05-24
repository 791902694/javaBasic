package com.neuedu.homework0524;

public class test09 {
    public static void main(String[] args) {
        //用 while 循环，计算 1~200 之间所有 3 的倍数之和。
        int a=0;
        int b=0;
        while (a<=200){
            b=b+a;
            a=a+3;
        }
        System.out.println("1~200之间所有3的倍数之和为"+b);
    }
}
