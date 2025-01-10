package com.Chapter_10_Assignment_Operators;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        // a = b = c = d = 20; // b c d and are not defined in the scope
        byte b = 10;
        // b = b + 1; // found int | required byte.
        // condition 2
        b++;
        System.out.println(b);

        // condition 3
        b += 1;
        System.out.println(b);

    }
}
