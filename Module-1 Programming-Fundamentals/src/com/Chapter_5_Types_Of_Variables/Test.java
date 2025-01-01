package com.Chapter_5_Types_Of_Variables;

public class Test {
//    instance variables.
int x;
    double ch;
    boolean b;
//    static variable.
    static String st;
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.x + " " + t1.ch + " " + t1.b + " " +
                st);
//        for declaring static variables object reference is not
//        required.
        Test t2 = new Test();
        System.out.println(Test.st);
    }

//    we can access instance variables from instance methods without
//    static modifier.
    public void m1(){
        System.out.println(st);
    }
}
