package com.java.demo;

public class Main {
    public int method(){
        int b=7;
        System.out.println(b);
        return b;
    }
    public static void main(String[] args) {
        Pratice s=new Pratice();
        Main m=new Main();
        System.out.println(s.a);
        System.out.println(s.n);
        int c=10%m.method();
        System.out.println(c);
    }
}
