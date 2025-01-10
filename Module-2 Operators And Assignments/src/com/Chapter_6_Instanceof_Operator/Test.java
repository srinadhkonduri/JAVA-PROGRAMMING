package com.Chapter_6_Instanceof_Operator;

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
        System.out.println();
    }

}
