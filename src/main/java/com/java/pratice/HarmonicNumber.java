package com.java.pratice;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        float sum=1;
        for (int i=2;i<=num;i++){
            sum+=(float) 1/i;
        }
        System.out.println(sum);
    }
}
