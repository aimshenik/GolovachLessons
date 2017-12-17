package com.golovach.Lesson9_IO._2_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;

/**
 * Created by Andrey on 16.12.2017.
 */
public class App04 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //у кодировок бывает много алиасов
        Charset iso88591 = StandardCharsets.ISO_8859_1;
        System.out.println(iso88591.name());
        System.out.println(iso88591.aliases());
        System.out.println(iso88591.aliases().size());

        Charset cp819 = Charset.forName("cp819");
        Charset IBM819 = Charset.forName("IBM819");
        Charset latin1 = Charset.forName("latin1");

        System.out.println(cp819.equals(IBM819));
        System.out.println(IBM819.equals(latin1));
        System.out.println(latin1.equals(cp819));

    }
}

