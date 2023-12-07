package com.java.pratice;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        int P=sc.nextInt();
        System.out.println("Enter the years to pay");
        int Y=sc.nextInt();
        System.out.println("Enter the interest rate");
        int R=sc.nextInt();
        double payment=(P*(R/1200))/(1-Math.pow(1+(R/1200),-(12*Y)));
        System.out.println(payment);
    }
}
