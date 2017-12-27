package com.golovach.Lesson11_IO.AdaptorDecoreator;

import java.io.*;

public class App04 {

    //сохр 1000 даблов в файл
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("C:/temp/123.txt")));
        for (int i = 0; i < 1000; i++) {
            out.writeDouble(123.456);
        }
        out.flush();
        out.close();

        //читаем назад
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File("C:/temp/123.txt")));
        for (int i = 0; i < 1000; i++) {
            System.out.println(dataInputStream.readDouble());
        }
    }
}
