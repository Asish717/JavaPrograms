package com.java.pratice;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        int t=sc.nextInt();
        System.out.println("Enter the wind speed");
        int v=sc.nextInt();
        if (t<50 && (v>120 || v<3)){
            double w=35.74+(0.6215*Math.abs(t))+((0.4275*Math.abs(t))-35.75)*Math.pow(v,0.16);
            System.out.format("%.4f",w);
        }
        else {
            System.out.println("Give valid values");
        }
    }
}
