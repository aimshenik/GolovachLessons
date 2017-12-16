package com.golovach.Lesson9_IO._2_charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Created by Andrey on 16.12.2017.
 */
public class App00 {
    public static void main(String[] args) {
        Charset iso88591 = StandardCharsets.ISO_8859_1;
        Charset ascii = StandardCharsets.US_ASCII;
        Charset utf16 = StandardCharsets.UTF_16;
        Charset utf16be = StandardCharsets.UTF_16BE;
        Charset utf16le = StandardCharsets.UTF_16LE;
        Charset utf8 = StandardCharsets.UTF_8;
        //всегда когда пишешь ПО надо учитывать Charset
        //это всё разные правила кодирование кодепоинтов
    }
}
