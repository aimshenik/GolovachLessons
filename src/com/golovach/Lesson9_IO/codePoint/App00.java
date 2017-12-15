package com.golovach.Lesson9_IO.codePoint;

public class App00 {
    public static void main(String[] args) {
        char c0 = 10_000; // max 65535
        char c1 = 0x0000; //min
        char c2 = 0xFFFF; // F = 1111
        char c3 = 0xabcd; //max
        char c4 = 'Ы'; // символ, который есть в UNICODE
        char c5 = '\u0F0F'; // T = UNICODE
        String s = "\u0F0F\u0F0F\u0F0FHELLO\u0F0F\u0F0F\u0F0F";
        System.out.println((int)c4);
        System.out.println(s);



    }

}
