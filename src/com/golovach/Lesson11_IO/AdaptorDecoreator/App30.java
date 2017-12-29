package com.golovach.Lesson11_IO.AdaptorDecoreator;

import java.io.*;
import java.util.Arrays;

public class App30 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        new EntityDataOutput(
                new DataOutputStream(buff)).writePerson(
                new Person(null, 45, new Person.Sex[]{Person.Sex.M}));
        buff.flush();
        byte[] bytes = buff.toByteArray();
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        Person p = new EntityDataInput(
                new DataInputStream(
                        new ByteArrayInputStream(bytes))).readPerson();
        System.out.println(p.toString());
        //End of 11 Lection!!!
    }
}
