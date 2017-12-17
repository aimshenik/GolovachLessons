package com.golovach.Lesson9_IO._1_codePoint;

public class App03x {
    public static void main(String[] args) {
        char[] chars = Character.toChars(0x11080);
        System.out.println(chars.length);
        System.out.println(chars);
        System.out.println(chars[0]);
        System.out.println(chars[1]);
    }

}

