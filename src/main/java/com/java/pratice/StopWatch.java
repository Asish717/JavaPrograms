package com.java.pratice;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press enter to start time");
        sc.nextLine();
        long start,end,elapsedTime; //taking long due to currentTimeMillis has long data type
        start=System.currentTimeMillis();
        System.out.println(start);
        System.out.println("Press enter to stop time");
        sc.nextLine();
        end=System.currentTimeMillis();
        System.out.println(end);
        elapsedTime=end-start;
        System.out.println(elapsedTime+" is the elapsed time");
    }
}
