package com.golovach.Lesson11_IO.AdaptorDecoreator.Practice.Decorator;

import java.io.IOException;
import java.io.Reader;

public class TestInputReader extends Reader {
    private final Reader reader;

    public TestInputReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        System.out.println("It was read " + cbuf.length + " char");
        return reader.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
