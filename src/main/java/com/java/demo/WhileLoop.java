package com.java.demo;

import java.util.Scanner;

public class WhileLoop {
    public void method1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        while (n<=10){
            System.out.println(n);
            n++;
        }
    }

    public static void main(String[] args) {
        WhileLoop obj=new WhileLoop();
        obj.method1();
    }
}
