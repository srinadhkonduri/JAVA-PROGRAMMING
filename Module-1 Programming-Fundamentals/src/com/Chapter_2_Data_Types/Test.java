package com.Chapter_2_Data_Types;

public class Test {
    public static void main(String[] args) {
        byte b = 127; // byte range from : -128 to 127
        short s = 32767; // short ranges from : -32768 to 32767
        int i = 2147483647; // int ranges from : -2147473648 to 2147483647
        long l = 9223372036854775807L;
        float f = 3.4028235E38F;
        double d = 1.7976931348623157E308D;
        boolean bo = true; // only true or false
        char ch = 'a'; // 2 bytes uni code based.
        System.out.println(b + " " + s + " " + i + " " + l + " " +
                f + " " + d + " " + bo + " " + ch);

    }
}
