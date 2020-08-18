package com.neuesoft.work.work1;

/**
 * 轿车类，别克和宝马类的父类
 */
public class SaloonCar extends Car {

    public SaloonCar(int rmb) {
        super(rmb);
    }

    @Override
    public final void money(int day) {
        int money = this.getRmb() * day;
        System.out.println("您租赁的轿车为"+getName()+"\n租赁天数为："+getDay());
        System.out.println("需要"+money+"元");
    }
}
