package org.example.lomback;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class B {
    private int a;
    private int b;
    public B() {
        a = 1;
        b = 2;
    }
    public int add(int a, int b) {
        return a + b;
    }
}
