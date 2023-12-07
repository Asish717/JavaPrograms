package com.java.pratice;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x value: ");
        int x=sc.nextInt();
        System.out.println("Enter y value: ");
        int y=sc.nextInt();
        double dis=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        /*for the above x is taken as input value and
        * 2 as the power value which is equals x*x for pow(x,2)*/
        System.out.format("%.3f",dis);
    }
}
