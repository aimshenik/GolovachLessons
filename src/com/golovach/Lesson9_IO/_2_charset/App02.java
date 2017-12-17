package com.golovach.Lesson9_IO._2_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created by Andrey on 16.12.2017.
 */
public class App02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println(defaultCharset);

    }
}
