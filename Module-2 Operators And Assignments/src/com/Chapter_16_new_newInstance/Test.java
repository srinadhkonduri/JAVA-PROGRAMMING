package com.Chapter_16_new_newInstance;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        Test t = new Test();
        Student s = new Student();


        Object o = Class.forName(args[0]).newInstance();
        System.out.println(o.getClass().getName());
    }
    static class Student {

    }
}
