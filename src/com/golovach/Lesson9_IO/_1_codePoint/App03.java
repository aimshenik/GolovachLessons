package com.golovach.Lesson9_IO._1_codePoint;

public class App03 {
    public static void main(String[] args) {
        char[] chars = Character.toChars(150_000);
        System.out.println(chars.length);
        System.out.println(chars);
        System.out.println((int)chars[0]);
        System.out.println((int)chars[1]);
    }

}

