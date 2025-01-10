package com.Chapter_8_Short_Circuit_Operators;

public class Test2 {
    public static void main(String[] args) {
        int x = 10;
        if (++x < 10 && x/0 > 0){
            System.out.println("hello");
        } else {
            System.out.println("hi");
        }
        // output = hi
    }
}
