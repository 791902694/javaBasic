package com.neuedu.homeword;

import java.util.Scanner;

public class work0523 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b=(a%10);
        int c=(a%100-b)/10;
        int d=(a%1000-b-c*10)/100;
        System.out.println(b*100+c*10+d);
    }
}
