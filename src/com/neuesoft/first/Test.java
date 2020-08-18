package com.neuesoft.first;

public class Test {
    public static void main(String[] args) {
        JavaTeacher t1 = new JavaTeacher();
        t1.setName("张三");
        t1.setExperience(8);
        ARMTeacher t2 = new ARMTeacher();
        t2.setName("李四");
        t2.setExperience(2);
        Neuedu n = new Neuedu();
        n.teachers(t1);
        n.teachers(t2);
    }
}
