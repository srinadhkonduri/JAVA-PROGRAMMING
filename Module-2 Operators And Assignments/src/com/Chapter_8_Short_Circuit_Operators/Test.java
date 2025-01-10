package com.Chapter_8_Short_Circuit_Operators;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        if (++x < 10 & ++y > 15){
            x++;
        } else {
            y++;
        }
        System.out.println(x + "..." + y);
        // single & condition 11 and 17
        // double && condition 11 and 16.
    }
}
