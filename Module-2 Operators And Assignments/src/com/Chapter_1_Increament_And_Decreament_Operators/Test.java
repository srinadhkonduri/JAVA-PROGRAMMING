package com.Chapter_1_Increament_And_Decreament_Operators;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        ++x; // First increment then assignment
        x++; // first assignment then increment
        System.out.println(x);

        int a = 10;
        // int b = ++10; // error : found value required variable.

        int b = 10;
        // int c = ++ (++b); // List of incre and decre are not allowed.

        final int d = 45;
        // d = 56; // cannot assign a variable to final variable
        char ch = 'a';
        ch++;
        System.out.println(ch); // OUTPUT : b

        double e = 10.5;
        e++;
        System.out.println(e); // OUTPUT : 11.5

        byte g = 5;
        byte h = 5;
        byte c = (byte) (g + h); // type casting.
        System.out.println(c);

        byte bbb = 10;
        bbb++;
        System.out.println(bbb);

    }
}
