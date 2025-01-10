package com.Chapter_9_Type_Casting_OPerators;

public class Test {
    public static void main(String[] args) {
        // implicit type casting L ---> R
        double d = 10;
        System.out.println(d); // 10.0

        // explicit type casting L <--- R
        int a = 130; // here we are changing int to short
        short s = (short) a;
        System.out.println(s); // 130
        byte b = (byte) a;
        System.out.println(b); // -126.

        double dd = 150.456;
        int ii = (int) dd;
        System.out.println(ii);
        byte bb = (byte) dd;
        System.out.println(bb); // -106


        int z = 130;
        byte w = (byte) z;
        System.out.println(w); // -126
    }
}
