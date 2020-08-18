package com.neuesoft.work.work1;

/**
 * 客车类
 */
public class Coach extends Car {
    public Coach(int rmb) {
        super(rmb);
    }

    @Override
    public final void money(int day) {
        int money = this.getRmb() * day;
        System.out.println("您租赁的客车为"+getName()+"\n租赁天数为："+getDay());
        System.out.println("需要"+money+"元");
    }
}
