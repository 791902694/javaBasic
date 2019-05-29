package com.neuedu.homwwork0529.work01;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner top=new Scanner(System.in);
        System.out.println("请输入圆的半径");
        int a=top.nextInt();
        yuan yuan=new yuan();
        yuan.setR(a);
        System.out.println(yuan.toString());

        System.out.println("请输入正方形边长");
        int b=top.nextInt();
        zhengfangxing zhengfangxing=new zhengfangxing();
        zhengfangxing.setL(b);
        System.out.println(zhengfangxing.toString());
    }
}
