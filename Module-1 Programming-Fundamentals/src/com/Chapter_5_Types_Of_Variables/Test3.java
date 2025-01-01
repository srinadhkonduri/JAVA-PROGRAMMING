package com.Chapter_5_Types_Of_Variables;

public class Test3 {
    int s = 10; // instance-primitive
    static String st = "tony"; // static-reference
    public static void main(String[] args) {
//        code for local variable
        int[] arr = new int[3]; // local-reference.
        System.out.println(arr);
        System.out.println(arr[0]);
        int i = 0;
        for (int j = 0; j < 3; j++) {
            i = i + j;
        }
        System.out.println(i + "..." + "j");
//        here j will throw error because j scope is for loop.

//        example 2
        try {
            int z = Integer.parseInt("ten");
        } catch (NumberFormatException e) {
            int z = 10;
        }
//        System.out.println(z);
//        here z throws error because scope not defined.

//        example 3
        int x; // no default values assigned to local variable.
//        don't initialize local variable to control flow statements.
        if (args.length > 0){
            x = 10;
        }
//        ERROR : variable x might not be initialized.
//        System.out.println(x);
        if (args.length > 0){
            x = 10;
        } else {
            x = 20;
        }
        System.out.println(x);
    }
}
