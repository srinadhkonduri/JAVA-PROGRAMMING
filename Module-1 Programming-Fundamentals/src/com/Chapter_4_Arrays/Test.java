package com.Chapter_4_Arrays;

public class Test {
    public static void main(String[] args) {
//        1D array declaration
        int[] array = new int[3];
        int[] arr = {10,20,30};
        int[][] arr1 = {{10,20},{30,40,50}};
        int[][][] arr2 = {{
                {10,20,30},
                {40,50,60},
                {70,80,90}
        }};
        System.out.println(array.getClass().getName());
        // output [I = single dimensional array.
        System.out.println(args.length);
        // output : 0

        int[] x = new int['a'];
        System.out.println(x);

        int [] y = new int[10];
        // output : found long || provided int

        int[] z = new int[2147483647];
        // output : Runtime Error : memory exceeds virtual
        // machine limit

        int[] s = new int[2147483647];
        // output : Compile Time Error : int too large

        int[][][] sri = new int[2][][];
        sri[0] = new int[2][];
        sri[0][1] = new int[3];

        int[] v = new int[3];
        System.out.println(v); // garbage value : [I@3e25a5
        System.out.println(v[0]); // 0


    }
}
