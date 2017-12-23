package com.golovach.Lesson11_IO.AdaptorDecoreator;

import javax.sound.midi.Soundbank;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class App00 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        for (int i = 0; i < 10; i++) {
            buff.write(new byte[]{0, 1, 2});
        }
        byte[] bytes = buff.toByteArray();
        System.out.println(Arrays.toString(bytes));
    }
}
