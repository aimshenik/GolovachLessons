package com.golovach.Lesson9_IO._1_codePoint;

public class App03 {
    public static void main(String[] args) {
        Character c = new Character('A'); // класс - обертка. у него есть поле value типа char
        Character c1 = 'A';

        char[] chars = Character.toChars(150_000);
        System.out.println(chars.length);
        System.out.println(chars);
        System.out.println((int)chars[0]);
        System.out.println((int)chars[1]);

        chars = Character.toChars(0x11080);
        System.out.println(chars.length);
        System.out.println(chars);
        System.out.println(chars[0]);
        System.out.println(chars[1]);


    }

}

