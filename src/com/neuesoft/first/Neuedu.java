package com.neuesoft.first;

public class Neuedu{
    //多态的呈现    多态的体现需要有重写
    public void teachers(Teacher name){
        System.out.println("东软老师试讲");
        name.jiangke();
        System.out.println("试讲结束");
    }
}
