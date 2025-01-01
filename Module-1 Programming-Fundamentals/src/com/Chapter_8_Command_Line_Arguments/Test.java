package com.Chapter_8_Command_Line_Arguments;

public class Test {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        System.out.println(n + " = " + (n * n));
        for (int i = 0; i < 3; i++) {
            System.out.println(args[i]);
        }

        String[] argh = {"x","y","z"};
        args = argh;
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " ");
        }

        System.out.println(args[0] + args[1]);
        System.out.println(args[0]);

//        in the all the cases we will get
//        ARRAY INDEX OUT OF BOUNDS EXCEPTION.
    }
}
