package com.neuedu.homework0528;

public class work01 {
    //1 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩
    String name;
    int xuehao;
    int math;
    int yuwen;
    int yingyu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getYingyu() {
        return yingyu;
    }

    public void setYingyu(int yingyu) {
        this.yingyu = yingyu;
    }

    @Override
    public String toString() {
        return " 姓名为："+getName()+" 学号为："+getXuehao()+" 数学成绩："
                +getMath()+" 语文成绩："+getYuwen()+" 英语成绩："+getYingyu()+
                " 三门平均成绩："+(getMath()+getYuwen()+getYingyu()/3);
    }
}
