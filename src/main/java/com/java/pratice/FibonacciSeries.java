package com.java.pratice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int a,b=0,c=1;
        for (int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+"  ");
        }
    }
}
