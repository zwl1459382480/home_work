package com.neuesoft.think;

public class A {
    int i;
    A(){
        add(1);
    }
    void add(int v){
        i=i+v;
    }
    void print(){
        System.out.println(i);
    }
}
