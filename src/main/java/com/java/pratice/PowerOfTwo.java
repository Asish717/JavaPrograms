package com.java.pratice;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if (num<31){
            for (int i=0;i<=num;i++){
                int power=(int) Math.pow(2,i);
                System.out.println("2^"+i+" = "+power);
            }
        }
        else {
            System.out.println("Enter value less then 31!!");
        }
    }
}
