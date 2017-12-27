package com.golovach.Lesson11_IO.AdaptorDecoreator;

import java.io.*;

public class App03x {
    public static void main(String[] args) throws IOException {

        char[] charBuff = {'H', 'e', 'l', 'l', 'o'};
        f(new CharArrayReader(charBuff));
    }

    private static void f(Reader reader) throws IOException {
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.println((char) ch);
        }
    }
}
