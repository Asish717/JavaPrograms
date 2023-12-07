package com.java.demo;

import java.util.Scanner;

public class ForLoop {
    public void method1() {
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
    public void method2(){
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }
        }
    }
    public void method3(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void method4(){
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void method5(){
        int arr[]={1,2,7,8,5};
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public void method6(){
        int arr[][]={{1,2},{3,4,5},{6,7,8,9}};
        for (int[] i:arr){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void method7(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows");
        int row=sc.nextInt();
        System.out.println("Enter no.of cols");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output");
        for (int[] i:arr){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ForLoop obj=new ForLoop();
//        obj.method1();
//        obj.method2();
//        obj.method3();
//        obj.method4();
//        obj.method5();
//        obj.method6();
        obj.method7();
    }
}
