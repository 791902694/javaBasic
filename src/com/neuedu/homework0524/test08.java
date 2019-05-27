package com.neuedu.homework0524;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        //编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
        while (true){
            System.out.println("请输入一个字母：");
            Scanner scanner = new Scanner(System.in);
            char a = scanner.next().charAt(0);
            int b=a;
            char c;
            if(b>=65&&b<=90){
                c=(char)b;
                System.out.println("这个字母是大写字母："+c);
            }else if(b>=97&&b<=122){
                b=b-32;
                c=(char)b;
                System.out.println("这个字母是小写写字母："+a+"转换为大写是："+c);
            }else {
                System.out.println("不是英文字母请重新输入：");
            }
        }
    }
}
