package com.neuesoft.work.work1;

/**
 * 车类，所有车的父类
 */
public abstract class Car {
    private String name;
    private int day;
    private int rmb;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getRmb() {
        return rmb;
    }

    public Car(int rmb) {
        this.rmb = rmb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void money(int day);
}
