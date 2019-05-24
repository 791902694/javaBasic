package com.neuedu.homework0524;

public class test02 {
    public static void main(String[] args) {
        //程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
        for (int i=100;i<1000;i++){
            int a=i/100;
            int b=i%100/10;
            int c=i%10;
            System.out.println("百位数："+a+" "+"十位数："+b+" "+"个位数："+c);
        }
    }
}
