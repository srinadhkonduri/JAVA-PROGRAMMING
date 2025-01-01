package com.Chapter_5_Types_Of_Variables;

public class Test2 {
//    static variable.
    static int x = 10;
//    instance variable.
    int y = 20;
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.x = 888;
        t1.y = 999;
        Test2 t2 = new Test2();
        System.out.println(t2.x + "..." + t2.y);
    }
}
