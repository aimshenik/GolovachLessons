package com.golovach.Lesson9_IO._1_codePoint;

public class App01 {
    public static void main(String[] args) {
        byte b = 0;
//        b = b + 1; error! операция +1 делает автоматическое преобразование к int
        b += 1; //так работает!!!
        b++; //так работает!!!
        char c = 0;
//        c = c + 1; error!
        c = (char) (c + 1);
        short s = 0;
//        s = s + 1; error!
        int k = Integer.MAX_VALUE;
        System.out.println(k);
        k++;
        System.out.println(k);


    }

}
