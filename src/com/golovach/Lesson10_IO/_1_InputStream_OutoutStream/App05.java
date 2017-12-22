package com.golovach.Lesson10_IO._1_InputStream_OutoutStream;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

public class App05 {

}

class X {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream(new File("..."));
        //обжимает FOS так, чтобы писалось не по байту а по 64кб
        BufferedOutputStream buffOut = new BufferedOutputStream(out,64 * 1024);
        //а это из FOS получим сжатый буферизированный поток
        GZIPOutputStream buffOutZipped = new GZIPOutputStream(out);

        //Это очень в стиле java.io
        new DataOutputStream(
                new GZIPOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        new File("...")))))
                .writeDouble(123.456);

        //end of Lection 10.
    }
}