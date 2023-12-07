package com.java.pratice;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2=sc.nextInt();
        System.out.println("Before swapping  "+n1+"    "+n2);
        //int n;
        //n=n1;
        n1=n2;
        n2=n1;
        //n2=n;
        System.out.println("After swapping  "+n1+"    "+n2);
    }
}
