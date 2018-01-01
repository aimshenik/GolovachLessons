package com.golovach.Lesson11_IO.AdaptorDecoreator.Practice.Decorator;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class TestOutputStream extends OutputStream {
    private final OutputStream out;

    public TestOutputStream(OutputStream out) {
        this.out = out;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println(" > Written 1 byte ");
        out.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println(" >> Written " + b.length + " byte ");
        out.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println(" >>> Written from " + off + " to " + len + " byte ");
        System.out.println(b.length + " | " + Arrays.toString(b));
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
