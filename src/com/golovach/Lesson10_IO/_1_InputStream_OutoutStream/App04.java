package com.golovach.Lesson10_IO._1_InputStream_OutoutStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class App04 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.yandex.ru/");
        try (InputStream inet = url.openStream();
             ByteArrayOutputStream buff = new ByteArrayOutputStream()) {
            long t0 = System.currentTimeMillis();
            copy(inet, buff);
            long t1 = System.currentTimeMillis();
            System.out.println("DELTA = " + (t1-t0));
            byte[] rawData = buff.toByteArray();
            String html = new String(rawData, StandardCharsets.UTF_8);
            System.out.println(html);
        }
    }

    //правим МЕТОД copy() - чтение по 1 байту не очень удобно
    private static void copy(InputStream src, OutputStream dst) throws IOException {
        byte[] buff = new byte[1024];
        int count = 0;
        while ((buff[count] = (byte) src.read()) != -1) {
            if (count == 1023) {
                dst.write(buff, 0, count + 1);
                count = -1;
            }
            count++;
        }
        dst.write(buff, 0, count);
    }
}
