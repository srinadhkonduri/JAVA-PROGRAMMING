package com.Chapter_18_ClassNotFoundException_VS_NoClassDefFoundExecption;

public class test {
    public static void main(String[] args) {
        Thread t = new Thread();
        // if Class File not available Error Occurs
        // RE : No Class Def Found Error

//         Object o =Class.forName(args[0].newInstance());
        // RE : Class not found Exception : Student
        // Here Student class is not defined.
    }
}
