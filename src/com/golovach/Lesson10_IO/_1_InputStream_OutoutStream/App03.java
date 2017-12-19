package com.golovach.Lesson10_IO._1_InputStream_OutoutStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class App03 {
    public static void main(String[] args) throws IOException {

        //СМОТРИМ МЕТОД copy()

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
        int elem;
        while ((elem = src.read()) != -1) { // (elem = src.read() - это и statement и expression. это и действие и значение
            dst.write(elem);
        }
        //так можно записать
        int x,y,z,t;
        x=y=z=t=1;

        //10_2 Finished!!!
    }
}
