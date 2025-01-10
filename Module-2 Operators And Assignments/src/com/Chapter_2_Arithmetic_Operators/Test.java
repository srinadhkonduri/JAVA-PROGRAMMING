package com.Chapter_2_Arithmetic_Operators;

public class Test {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println('a' + 0.89); // 97.89
        System.out.println(10/0); // All getting arithmetic exception
        System.out.println(10/0.0); // Infinity
        System.out.println(0/0); // Arithmetic exception
        System.out.println(0.0/0); // NaN (Not a Number)
        System.out.println(10 < Float.NaN); // false
        System.out.println(10 <= Float.NaN); // false
        System.out.println(10 > Float.NaN); // false
        System.out.println(10 >= Float.NaN); // false
        System.out.println(10 == Float.NaN); // false
        System.out.println(Float.NaN == Float.NaN); // false
        System.out.println(10 != Float.NaN); // true
        System.out.println(Float.NaN != Float.NaN); // true
    }
}
