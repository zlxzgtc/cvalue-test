package org.example.meaningless;

public class A {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        a = a + b;
        b = 2;
        b = 3;
        for (int i = 0; i < b; i++) {
            b++;
        }
        System.out.println(a);
    }
}
