package com.Chapter_7_Bitwise_Operators;

public class Test {
    public static void main(String[] args) {
        System.out.println(true & false); // both should be true.
        System.out.println(true | false); // at least one condition should become true.
        System.out.println(true ^ false); // if true represents false and false represents true
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        // System.out.println(~true); // Operator tilda can only be applied to
        // integer types
        System.out.println(~5); // tilda can be only applied to integers.


        // Boolean complement types
        System.out.println(!true); // operator ! can only be applied to Boolean types.
        // System.out.println(!4); Error : cannot be applied to integer which is an exclamatory symbol
    }
}
