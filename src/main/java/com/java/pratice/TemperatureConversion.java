package com.java.pratice;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select conversion type:\n 1: Celsius to Fahrenheit\n 2: Fahrenheit to celsius");
        int choose=sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("Enter the celsius temperature: ");
                double c=sc.nextDouble();
                double fahrenheit=(c*9/5)+32;
                System.out.println("Converted temperature = "+fahrenheit+" °F");
                break;
            case 2:
                System.out.println("Enter the fahrenheit temperature: ");
                double f=sc.nextDouble();
                double celsius=(f-32)*5/9;
                System.out.println("Converted temperature = "+celsius+" °C");
                break;
            default:
                System.out.println("Incorrect selection!!");
                break;
        }
    }
}
