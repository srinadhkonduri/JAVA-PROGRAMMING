package com.Chapter_4_Arrays;

public class Test2 {
    public static void main(String[] args) {
        int result = array(new int[] {10,20,30,40});
        System.out.println("total sum is : " + result);


        Object[] a = new Object[10];
        Number[] b = new Number[10];
        // allowed data type are byte, short, int, long, float, double
        Runnable[] r = new Runnable[10];
        // for, Interface it's implementation class objects are only allowed

        int[] w = {10,20,30,40,50,60};
        int[] z = {70,80};
        w = z;

    }
//    creating a function for anonymous array
    public static int array(int[] x){
        int total = 0;
        for (int val : x){
            total = total + val;
        }
        return total;
    }
}
