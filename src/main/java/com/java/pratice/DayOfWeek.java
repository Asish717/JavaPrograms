package com.java.pratice;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day=sc.nextInt();
        System.out.println("Enter the month: ");
        int month=sc.nextInt();
        System.out.println("Enter the year: ");
        int year=sc.nextInt();
        int y,x,m,d;
        if (day<=31 && month<=12){
            y=year-(14-month)/12;
            x=y+y/4-y/100+y/400;
            m=month+12*((14-month)/12)-2;
            d=(day+x+31*m/12)%7;
            System.out.println(d);
        }
        else {
            System.out.println("Enter valid dates!!");
        }
    }
}
