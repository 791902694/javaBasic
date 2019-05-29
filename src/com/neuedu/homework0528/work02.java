package com.neuedu.homework0528;

public class work02 {
    //2、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。
    //2.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
    //2.2 输出笔记本信息的方法 3.3 然后编写一个测试类，测试笔记本类的各个方法。
    private char color;
    private int cpu;

    public work02(){
          color='红';
          cpu=45;
    }
    public  work02(char color,int cpu){
           this.color=color;
           this.cpu=cpu;

    }

    @Override
    public String toString() {
        return "颜色为："+color+" 型号为"+cpu;
    }
}
