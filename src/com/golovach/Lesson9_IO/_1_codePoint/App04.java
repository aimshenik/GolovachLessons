package com.golovach.Lesson9_IO._1_codePoint;

import javax.sound.midi.Soundbank;

public class App04 {
    public static void main(String[] args) {
        char[] array = Character.toChars(150_000);
        char ch0 = array[0];
        char ch1 = array[1];
        System.out.println((int)ch0);
        System.out.println((int)ch1);
        String str = new String(new char[]{ch0,ch1});
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.codePointCount(0,2));
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
    }

}

