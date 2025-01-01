package com.Chapter_5_Types_Of_Variables;

public class Variables {
//    these are referred as instance variables
    int[] x;
    int[] y = new int[3];
    public static void main(String[] args) {
        Variables v = new Variables();
        System.out.println(v.x); // Null
        System.out.println(v.x[0]); // Null pointer assignment.
        System.out.println(v.y); // Null
        System.out.println(v.y[0]); // Null pointer assignment.
    }
}
