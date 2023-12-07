package com.java.pratice;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coin flip time: ");
        int flip=sc.nextInt();
        if (flip<=0){
            System.out.println("please enter positive number");
            return;
        }
        Random ran=new Random();
        int heads=0,tails=0;
        for (int i=0;i<flip;i++){
            if (ran.nextDouble()<0.5){
                heads++;
            }
            else {
                tails++;
            }
        }
        double headsPercentage=(double) heads/flip*100;
        double tailsPercentage=(double) tails/flip*100;
        System.out.printf("Heads percentage: %.3f%%\n",headsPercentage);
        System.out.printf("Tails percentage: %.3f%%",tailsPercentage);
    }
}
