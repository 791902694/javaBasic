package com.neuedu.homework0524;

public class test04 {
    public static void main(String[] args) {
        //题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
        // 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
        int y=0;
        int x=0;
        for(int a=1;a<=4;a++){
            for(int b=1;b<=4;b++){
                for(int c=1;c<=4;c++){
                    if(a!=b&&b!=c){
                        x=a*100+b*10+c;
                        y=y+1;
                        System.out.println(" "+x);
                    }

                }
            }
        }
        System.out.println("总共有"+y+"个数字");
    }
}
