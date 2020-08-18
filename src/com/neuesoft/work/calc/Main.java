package com.neuesoft.work.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        double num;
        Calc calc = new Calc();
        System.out.println("请输入需要计算的第一个参数:");
        num = scanner.nextDouble();
        calc.setX(num);
        System.out.println("请输入需要计算的第一个参数:");
        num = scanner.nextDouble();
        calc.setY(num);
        System.out.println("请选择计算方式：\n1、加\t2、减\n3、乘\t4、除)");
        int nextInt = scanner.nextInt();
        switch (nextInt){
            case 1:
                Add add = new Add();
                add.add(calc.getX(),calc.getY());
                add.print();
                break;
            case 2:
                Sub sub = new Sub();
                sub.sub(calc.getX(),calc.getY());
                sub.print();
                break;
            case 3:
                Mul mul = new Mul();
                mul.mul(calc.getX(),calc.getY());
                mul.print();
                break;
            case 4:
                Div div = new Div();
                div.div(calc.getX(),calc.getY());
                div.print();
                break;
        }
    }
}
