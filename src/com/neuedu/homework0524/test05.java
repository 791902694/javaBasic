package com.neuedu.homework0524;

public class test05 {
    public static void main(String[] args) {
        //分别计算1-100之间的奇数和 和偶数和
        int a=0;
        int b=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                a+=i;
            }else if(i%2==1) {
                b+=i;
            }
        }
        System.out.println("偶数和为："+a+" "+"奇数和为："+b);

    }
}
