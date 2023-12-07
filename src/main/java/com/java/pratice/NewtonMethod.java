package com.java.pratice;

import java.util.Scanner;

public class NewtonMethod {
    public static double sqrt(double c) {
        double t=c;
        while (Math.abs(t-c/t)>1e-15*t){
            t=(c/t+t)/2;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double input=sc.nextDouble();
        double result=sqrt(input);
        System.out.println(result);
    }
}
