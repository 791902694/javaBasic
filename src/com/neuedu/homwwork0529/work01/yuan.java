package com.neuedu.homwwork0529.work01;

public class yuan {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "圆的面积为："+r*r*31.4+" 周长为："+r*2*3.14;
    }
}
