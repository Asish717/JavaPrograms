package com.java.pratice;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int divid= sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divis=sc.nextInt();
        int quotient,remainder;
        quotient=divid/divis;
        remainder=divid%divis;
        System.out.println("The quotient is: "+quotient);
        System.out.println("The remainder is: "+remainder);
    }
}
