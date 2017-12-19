package com.golovach.Lesson10_IO._1_InputStream_OutoutStream;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class App01 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.yandex.ru/");//открывает сокет ОС. Сокетов максимум 2 байта ~65000
        InputStream inet = url.openStream();
        OutputStream out = new FileOutputStream(new File("C:\\temp\\1.txt"));
        copy(inet, out);

    }

    //fst snd
    //src dst
    private static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int elem = src.read();
            if (elem != -1) {
                dst.write(elem);
            } else {
                break;
            }
        }
    }
}
