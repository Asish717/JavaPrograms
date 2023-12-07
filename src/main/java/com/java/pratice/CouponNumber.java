package com.java.pratice;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of coupon number to be generated");
        int n=sc.nextInt();
        Random ran=new Random();
        for (int i=1;i<=n;i++){
            int result=Math.abs(ran.nextInt());
            System.out.print(result+" ");
        }
    }
}

