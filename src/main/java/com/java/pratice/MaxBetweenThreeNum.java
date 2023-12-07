package com.java.pratice;

import java.util.Scanner;

public class MaxBetweenThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd value:");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd value:");
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is largest");
        }
        else if (n2 > n1 && n2>n3) {
            System.out.println(n2 + " is largest");
        }
        else {
            System.out.println(n3 + " is largest");
        }
    }
}
