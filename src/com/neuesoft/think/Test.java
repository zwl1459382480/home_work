package com.neuesoft.think;

public class Test {
    public static void main(String[] args) {
        show(new AA());
    }
    static void show(A b){
        b.add(8);
        b.print();
    }
}
