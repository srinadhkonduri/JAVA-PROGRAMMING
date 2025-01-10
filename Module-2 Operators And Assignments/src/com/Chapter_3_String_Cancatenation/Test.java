package com.Chapter_3_String_Cancatenation;

public class Test {
    public static void main(String[] args) {
        String a = "tony";
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a + b + c + d);
        System.out.println(b + c + d + a);
        System.out.println(c + d + a + b);
        System.out.println(d + a + b + c);

        // Case (i) : assigning int to string
        // a(String) = b(int) + c + d inValid

        // Case (ii) : assigning int to int
        // a(String) = a(String) + b + c; valid

        // Case (iii) : assigning String to int
        // b(int) = a(String) + c + d; Invalid

        // Case (iv) : assigning int to int
        // b(int) = b(int) + c + d; Valid
    }
}
