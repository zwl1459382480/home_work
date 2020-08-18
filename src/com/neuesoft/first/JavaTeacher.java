package com.neuesoft.first;

//继承的呈现
public class JavaTeacher extends Teacher{

    //调用父类的构造器
    public JavaTeacher() {
        super("java");
    }
    //方法的重写（多态）
    public void jiangke(){
        super.jiangke();
        System.out.println("使用IDEA讲课");
    }
}
