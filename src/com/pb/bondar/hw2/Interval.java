package com.pb.bondar.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Введите целое число и нажмите Enter:");
        a = scan.nextInt();
        if(a>=0&&a<=100){
            if(a<=14){
                System.out.println("Число попадает в промежуток [0-14]");
            }
            if(a>=15&&a<=35){
                System.out.println("Число попадает в промежуток [15-35]");
            }
            if(a>=36&&a<=50){
                System.out.println("Число попадает в промежуток [36-50]");
            }
            if(a>=51){
                System.out.println("Число попадает в промежуток [51-100]");
            }
        }
        else{
            System.out.println("Число не попадает ни в один из промежутков");
        }
    }

}
