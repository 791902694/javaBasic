package com.neuedu.homework0527;

public class work01 {
    /*
    1 定义长方形类，含：
    特征：宽、高（整型）；
    方法：求周长、面积；
   方法3个：（1）无参——宽、高默认值为1；
            （2）1个参数——宽、高均为参数值；
            （3）2个参数——宽、高各为参数值。
    并对其进行测试
     */
    int width;
    int height;
    //无参
    public  void  wucan(){
        width=1;
        height=1;
        System.out.println("无参的方法");
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+(width*height));
    }
    //含有一个参数
    public  void youcan01(int a){
        width=a;
        height=a;
        System.out.println("用1个参数的方法");
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+(width*height));
    }
    //含有俩个参数
    public  void  youcan02(int b,int c){
        width=b;
        height=c;
        System.out.println("用2个参数的方法");
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+(width*height));
    }



}
