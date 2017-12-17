package com.golovach.Lesson9_IO._2_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

/**
 * Created by Andrey on 16.12.2017.
 */
public class App03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //скольо кодировок есть в Java
        Map<String, Charset> allCharsets = Charset.availableCharsets();
        Set<String> charsetNames = allCharsets.keySet();
        System.out.println(charsetNames);
        System.out.println(charsetNames.size());
    }
}
