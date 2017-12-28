package com.golovach.Lesson11_IO.AdaptorDecoreator;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class App20 {

    // пишем свой декоратор
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new GZIPOutputStream(
                        new LogOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream(
                                                new File("C:/temp/123.txt")), 256))));
        for (int i = 0; i < 1000; i++) {
            out.writeDouble(Math.random());
        }
        out.flush();
        out.close();

        //читаем назад
        try (DataInputStream dataInputStream = new DataInputStream(
                new GZIPInputStream(
                        new BufferedInputStream(
                                new FileInputStream(
                                        new File("C:/temp/123.txt")), 256)))) {
            for (int i = 0; i < 1000; i++) {
                System.out.println(dataInputStream.readDouble());
            }
        }
    }
}

class LogOutputStream extends OutputStream {
    private final OutputStream out;


    LogOutputStream(OutputStream out) {
        this.out = out;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println(" > Log: 1");
        out.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println(" >> Log: " + b.length);
        out.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println(" >>> Log: " + len);
        out.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}
