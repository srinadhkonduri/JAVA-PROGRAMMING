package com.Chapter_3_Literals;

public class LiteralExamples {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 100;
        int octal = 010; // Octal for 8
        int hex = 0x1F; // Hexadecimal for 31
        int binary = 0b1010; // Binary for 10

        // Floating-point literals
        float pi = 3.14f;
        double scientific = 6.022E23;

        // Character literal
        char letter = 'J';

        // String literal
        String message = "Hello, Java!";

        // Boolean literal
        boolean isFun = true;

        // Null literal
        String empty = null;

        // Print all literals
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Binary: " + binary);
        System.out.println("Float: " + pi);
        System.out.println("Scientific: " + scientific);
        System.out.println("Char: " + letter);
        System.out.println("String: " + message);
        System.out.println("Boolean: " + isFun);
        System.out.println("Null String: " + empty);
    }
}
