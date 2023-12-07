package com.java.pratice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int flag=0;
        for (int i=2;i<num;i++){
            if (num%i==0){
                flag=0;
                break;
            }
            else {
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("Not a prime number");
        }
        else {
            System.out.println("A prime number");
        }
    }
}
