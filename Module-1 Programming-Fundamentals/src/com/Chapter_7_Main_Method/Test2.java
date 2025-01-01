package com.Chapter_7_Main_Method;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("string");
        main(new int[]{}); // explicitly call of a method.
    }

    public static void main(int[] args) {
        System.out.println("int");
    }
}

    class p {
        public static void main(String[] args) {
            System.out.println("string");
        }
    }
    class c extends p {
        public static void main(String[] args) {
            System.out.println("hello world");
        }
    }
    // java p = parent main
    // java c = child main
