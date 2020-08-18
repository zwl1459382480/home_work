package com.neuesoft.work.work1;

import java.util.Scanner;

/**
 * 测试类，主页面
 */
public class Test {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("请输入您要租赁的车辆类型");
        System.out.println("1、轿车\t2、客车");
        System.out.println("******************************************");
        int carStr = scanner.nextInt();
        switch (carStr){
            case 1:
                System.out.println("您选择的汽车类型为轿车");
                System.out.println("请输入您要租赁的轿车");
                System.out.println("1、宝马（800/天）\t2、别克（300/天）");
                int carName = scanner.nextInt();
                switch (carName){
                    case 1:
                        BaoMa baoMa = new BaoMa();
                        baoMa.setName("宝马");
                        System.out.println("请输入您要租赁的天数");
                        int day1 = scanner.nextInt();
                        baoMa.setDay(day1);
                        baoMa.money(day1);
                        break;
                    case 2:
                        BieKe bieKe = new BieKe();
                        bieKe.setName("别克");
                        System.out.println("请输入您要租赁的天数");
                        int day2 = scanner.nextInt();
                        bieKe.setDay(day2);
                        bieKe.money(day2);
                        break;
                    default:
                        System.out.println("您的输入不符合要求");
                        break;
                }
                break;
            case 2:
                System.out.println("您选择的汽车类型为客车");
                System.out.println("请输入您要租赁的客车类型");
                System.out.println("1、15座以下（金杯）【500/天】\t2、15座以上（金龙）【1200/天】");
                int carType = scanner.nextInt();
                switch (carType){
                    case 1:
                        Coach coach1 = new Coach(500);
                        coach1.setName("15座以下");
                        System.out.println("请输入您要租赁的天数");
                        int day3 = scanner.nextInt();
                        coach1.setDay(day3);
                        coach1.money(day3);
                        break;
                    case 2:
                        Coach coach2 = new Coach(1200);
                        coach2.setName("15座以上");
                        System.out.println("请输入您要租赁的天数");
                        int day4 = scanner.nextInt();
                        coach2.setDay(day4);
                        coach2.money(day4);
                        break;
                    default:
                        System.out.println("您的输入不符合要求");
                        break;
                }
                break;
                default:
                    System.out.println("您的输入不符合要求");
                    break;
        }
    }
}
