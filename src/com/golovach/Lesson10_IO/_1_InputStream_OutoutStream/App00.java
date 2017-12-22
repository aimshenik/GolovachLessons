package com.golovach.Lesson10_IO._1_InputStream_OutoutStream;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class App00 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.yandex.ru/");//открывает сокет ОС. Сокетов максимум 2 байта ~65000
        InputStream inet = url.openStream();
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        copy(inet, buff);
        byte[] rawData = buff.toByteArray(); //максимум 2гб потому что размер int
        String html = new String(rawData, StandardCharsets.UTF_8);
        System.out.println(html);
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
