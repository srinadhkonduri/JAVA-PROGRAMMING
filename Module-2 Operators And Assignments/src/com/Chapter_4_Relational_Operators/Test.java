package com.Chapter_4_Relational_Operators;

public class Test {
    public static void main(String[] args) {
        // relational operators
        System.out.println(10 < 20);
        System.out.println('a' < 10);
        System.out.println('a' < 97.6);
        // System.out.println(true > false);
        // Error : operator > cannot be applied to Boolean.
        // System.out.println("tony123" > "tony");
        // Error : relational operators we cannot apply to objects.(Strings)
        // System.out.println(10 < 20 < 30);
        // here 10 < 20 will become true means true < 30 --> Error
        // Error: operator < cannot be applied to Boolean , int.
    }
}
