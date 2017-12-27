package com.golovach.Lesson11_IO.AdaptorDecoreator;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;

public class App02 {
    public static void main(String[] args) throws IOException {
        CharArrayWriter buff = new CharArrayWriter();
        for (int i = 0; i < 10; i++) {
            buff.write(new char[]{'H','e','l','l','o'});
        }
        char[] chart = buff.toCharArray();
        System.out.println(chart);
    }
}
