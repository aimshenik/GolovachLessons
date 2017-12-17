package com.golovach.Lesson9_IO._1_codePoint;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created by Andrey on 17.12.2017.
 */
public class App04x {
    public static void main(String[] args) {
        char[] array = Character.toChars(150_000);
        char ch0 = array[0];
        char ch1 = array[1];
        System.out.println((int) ch0);
        System.out.println((int) ch1);
        String str = new String(new char[]{ch0, ch1});
        System.out.println(str);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s);

    }
}
