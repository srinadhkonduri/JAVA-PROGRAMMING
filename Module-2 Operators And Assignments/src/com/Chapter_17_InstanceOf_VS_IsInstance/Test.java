package com.Chapter_17_InstanceOf_VS_IsInstance;

public class Test {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread();
        System.out.println(t instanceof Object);

        // example for isInstance
        Thread s = new Thread();
        System.out.println(Class.forName(args[0]).isInstance(s));

        // we can get Error has array index out of bounds Exception.
    }
}
