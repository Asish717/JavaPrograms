package com.java.pratice;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        String al = sc.next();
        //for (int i = 0; i < al.length(); i++) {
            char alphabet=al.charAt(0);
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
                System.out.println("Its an vowel");
            } else {
                System.out.println("Its an consonent");
            }
        //}
    }
}
