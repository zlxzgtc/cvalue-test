package org.example;

public class Main {
    public static void main(String[] args) {
        func1();
    }

    public static void func1(){
        System.out.println("func1");
        func2();
    }

    public static void func2(){
        System.out.println("func2");
        func3();
    }

    public static void func3(){
        System.out.println("func3");
    }
}