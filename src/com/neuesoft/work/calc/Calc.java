package com.neuesoft.work.calc;

/**
 * x--->键入的第一个参数
 * y--->键入的第二个参数
 * num-->计算后的结果
 */
public class Calc {
    private double x;
    private double y;
    private double num;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    protected final void print(){
        System.out.println(getNum());
    }
}
