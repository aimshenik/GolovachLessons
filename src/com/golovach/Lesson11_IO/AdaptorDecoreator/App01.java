package com.golovach.Lesson11_IO.AdaptorDecoreator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class App01 {
    public static void main(String[] args) throws IOException {
        StringWriter buff = new StringWriter();
        for (int i = 0; i < 10; i++) {
            buff.write(new char[]{'H','e','l','l','o'});
        }
        String str = buff.toString();
        System.out.println(str);
    }
}
