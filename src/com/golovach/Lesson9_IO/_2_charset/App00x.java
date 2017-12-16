package com.golovach.Lesson9_IO._2_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import static java.lang.System.out;

public class App00x {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //так не разамно поскольку не ясно в какой кодировке - тут Platform Default Charset
        out.println(Arrays.toString("A".getBytes()));
        out.println(Arrays.toString("A".getBytes("UTF-16"))); //норм
        out.println(Arrays.toString("AA".getBytes("UTF-16"))); //норм
        System.out.println("==========================");
        byte[] bytes = "AA".getBytes("UTF-16");
        String str = new String(bytes);
        // выведет ерунда потому что чары в байти сделали
        // через UTF-16 а обратно отработало в Platform Default Charset UTF-8
        out.println(str); //�� A A
        //надо было использовать одно и то де правило
        str = new String(bytes, "UTF-16");
        out.println(str); //AA
        System.out.println("==========================");
        //получатся разные массивы байтов!
        bytes = "A".getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));
        bytes = "A".getBytes("UTF-16");
        System.out.println(Arrays.toString(bytes));
        bytes = "A".getBytes("UTF-16BE");
        System.out.println(Arrays.toString(bytes));
        bytes = "A".getBytes(StandardCharsets.UTF_16LE);
        System.out.println(Arrays.toString(bytes));
        bytes = "A".getBytes("US-ASCII");
        System.out.println(Arrays.toString(bytes));
        bytes = "A".getBytes("ISO-8859-15");
        System.out.println(Arrays.toString(bytes));


    }
}
