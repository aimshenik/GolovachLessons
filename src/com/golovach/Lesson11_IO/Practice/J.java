package com.golovach.Lesson11_IO.Practice;

import java.io.*;
import java.util.Arrays;


public class J {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        new AppleFruitOutput(new DataOutputStream(buff)).writeApple(new Apple(1, "Green", new Apple.SUPP[]{Apple.SUPP.America}));
        byte[] res = buff.toByteArray();
        System.out.println(Arrays.toString(res));

        Fruit apple = new AppleFruitInput(new DataInputStream(new ByteArrayInputStream(res))).readApple();
        System.out.println(apple);
    }
}
