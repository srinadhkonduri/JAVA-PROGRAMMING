package com.Chapter_6_Var_Arg_Methods;

//var-arg = valid
// normal , var-arg = valid
// var-arg , normal = invalid
// var-arg , var-arg = invalid
// m1(int[] x) -> m1(int... x) valid same as string
// m1(int[]... x) -> m1(int[] x) // invalid

//var-arg parameters should be in the last of the list.


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        m1();
        m1(10); // hello world  10
        m1(10,20);
        m1(10,20,30);
        m1(23,93,100);
        m1(10); // hello world  10
        m2('s',"sri","tony stark","captain");
    }
//    creating a method for var arg methods.
    public static void m1(int... x){
        int total = 0;
        for (int x1 : x){ // for each loop 1.5 Version
            total = total + x1;
        }
        System.out.println("sum is : " + total);
    }
    public static void m1(int x){
        System.out.println("hello world  " + x);
    }

//    example 2
    public static void m2(char ch, String... st){
//        if we want to print multiple strings better to wrap
//        them with Arrays.toString method.
        System.out.println("[" + ch + "] ," + " " + Arrays.toString(st));
    }
}
