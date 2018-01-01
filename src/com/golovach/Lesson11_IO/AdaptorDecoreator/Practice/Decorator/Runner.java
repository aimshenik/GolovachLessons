package com.golovach.Lesson11_IO.AdaptorDecoreator.Practice.Decorator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public class Runner {
    public static void main(String[] args) throws IOException {
        FileOutputStream buff = new FileOutputStream(new File("C:/temp/111.txt"));
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new TestOutputStream(new FileOutputStream(new File("C:/temp/111.txt")))));
        for (int i = 0; i < 11; i++) {
            out.writeDouble(123.456);
        }
        out.flush();
        out.close();

        /*Reader reader = new TestInputReader(new FileReader(new File("C:/temp/111.txt")));
        int c;
        String s = "";
        while ((c = reader.read()) != -1) {
            s += (char) c;
        }
        System.out.println(s);
        reader.close();*/

        BufferedReader reader1 = new BufferedReader(
                new InputStreamReader(new BufferedInputStream(new FileInputStream(new File("C:/temp/111.txt")))));

        /*String s1 = reader1.readLine();
        System.out.println(s1);
*/
        Writer writer = new BufferedWriter(new FileWriter(new File("C:/temp/222.txt")));
        int i;
        while ((i = reader1.read()) != -1) {
            writer.write(i);
        }
        writer.flush();
        writer.close();
    }
}
