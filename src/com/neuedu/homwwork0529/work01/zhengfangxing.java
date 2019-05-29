package com.neuedu.homwwork0529.work01;

public class zhengfangxing {
    //定义一个图形类
    //2 创建图形 圆形 正方形 有自己的属性 例如圆形的特征 都有半径 分别定义自己的计算面积和计算周长
    //3 创建main方法 进行测试 创建对象 调用方法计算面积和周长

    private int l;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "正方形面积为：" +l*l+" 正方形周长为："+l*4;
    }
}
