package com.Chapter_5_Equality_Operators;

public class Test {
    public static void main(String[] args) {
        System.out.println(10 == 20);
        System.out.println('a' == 'b');
        System.out.println('a' == 97.0);
        System.out.println(false == false);
        // Note : We can apply equality operators for every primitive type including
        // Boolean also.

        System.out.println("tony123" == "tony");
        // We can apply equality operators for object type also.

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);


        Object o = new Object();
        String s = new String("tony stark");
        System.out.println(t1 == o);
        System.out.println(o == s);
        //System.out.println(t1 == s);
        // Error : Operator '==' cannot be applied to 'java. lang. Thread',
        // 'java. lang. String'

        // Difference between == and .equals() method.
        String s1 = new String("Tony");
        String s2 = new String("Tony");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true



        System.out.println(s1 == null); // flase

        String s3 = null;
        System.out.println(s3 == null); // true

        System.out.println(null == null); // true
    }
}
