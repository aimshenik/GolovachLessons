package com.golovach.Lesson10_IO._1_InputStream_OutoutStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class App00x {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.yandex.ru/");//открывает сокет ОС. Сокетов максимум 2 байта ~65000
        try (InputStream inet = url.openStream();
             ByteArrayOutputStream buff = new ByteArrayOutputStream()) {
            copy(inet, buff);
            byte[] rawData = buff.toByteArray(); //максимум 2гб потому что размер int
            String html = new String(rawData, StandardCharsets.UTF_8);
            System.out.println(html);
        }
    }

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
