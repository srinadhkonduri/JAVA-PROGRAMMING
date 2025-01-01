package com.Chapter_6_Var_Arg_Methods;

public class Test2 {
    public static void main(String[] args) {
        // m1(int... x);✅
        // m1(int ...x);✅
        // m1(int x...);❌
        // m1(int .x..);❌
        // m1(int ..x.);❌
        // m1(int. ..x);❌
        // m1(int x, int... y);
        // m1(String s , double... y);
        // m1(int... x);
        // m1(int[] x);
    }
    public static void m1(int... x){

    }
    public static void m2(int[] x){

    }
}
