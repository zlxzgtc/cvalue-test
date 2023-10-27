package org.example.meaningless;

public class A {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        a = a + b;
        b = 2;
        for (int i = 0; i < a; i++) {
            b = b + 1;
        }
    }
}

class innerA {
    private int a;

    public void outputA() {
        System.out.println("a is " + a);
    }
}