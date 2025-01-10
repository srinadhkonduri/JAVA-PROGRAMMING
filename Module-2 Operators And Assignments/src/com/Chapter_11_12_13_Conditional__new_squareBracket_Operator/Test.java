package com.Chapter_11_12_13_Conditional__new_squareBracket_Operator;

public class Test {
    public static void main(String[] args) {
        // chapter 11 conditional operator
        int x = (10 <= 10) ? 30 : 40;
        System.out.println(x); // output is 30

        int y = (10 > 20) ? 30 : ((40 > 50) ? 60 : 70);
        System.out.println(y); // output is 70

        // chapter 12 new operator
        Test t = new Test();
        System.out.println(t);

        // chapter 13 [] operator
        int[] s = new int[4];
        s[0] = 12;
        s[1] = 34;
        s[2] = 45;
        s[3] = 56;
        for (int i : s) { // somewhat it is called for each loop to
            // print all the elements of the array
            System.out.println(i + " ");
        }
    }
}
