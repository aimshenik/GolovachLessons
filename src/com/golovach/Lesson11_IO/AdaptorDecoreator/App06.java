package com.golovach.Lesson11_IO.AdaptorDecoreator;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class App06 {

    //сохр 1000 даблов в файл + GZIP + буферизация
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new GZIPOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        new File("C:/temp/123.txt")))));
        for (int i = 0; i < 1000; i++) {
            out.writeDouble(123.456);
        }
        out.flush();
        out.close();

        //читаем назад
        try (DataInputStream dataInputStream = new DataInputStream(
                new GZIPInputStream(
                        new BufferedInputStream(
                                new FileInputStream(
                                        new File("C:/temp/123.txt")))))) {
            for (int i = 0; i < 1000; i++) {
                System.out.println(dataInputStream.readDouble());
            }
        }
    }
}
