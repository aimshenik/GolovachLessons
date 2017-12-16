package com.golovach.Lesson9_IO._2_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created by Andrey on 16.12.2017.
 */
public class App01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Charset iso88591 = StandardCharsets.ISO_8859_1;
        Charset ascii = StandardCharsets.US_ASCII;
        Charset utf16 = StandardCharsets.UTF_16;
        Charset utf16be = StandardCharsets.UTF_16BE;
        Charset utf16le = StandardCharsets.UTF_16LE;
        Charset utf8 = StandardCharsets.UTF_8;
        System.out.println(Arrays.toString("ABC".getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString("\uFFFF".getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString("\uFFFF".getBytes(StandardCharsets.US_ASCII)));
        System.out.println(Arrays.toString("\u003F".getBytes(StandardCharsets.US_ASCII)));
        // latin1 записывает в виде 1 байта а это значит что разные символы могут одинаково записаться
        System.out.println(Arrays.toString("\uFFFF".getBytes(Charset.forName("latin1"))));//63
        System.out.println(Arrays.toString("\u003F".getBytes("latin1")));//63


        // закончил на 9_4 26:40
        //в следующий раз подышать!

    }
}
