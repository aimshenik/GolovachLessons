package com.golovach.Lesson14_Threads._1_;

public class App06 {
    public static void main(String[] args) throws InterruptedException {
       Thread.currentThread().join(); //Deadlock
    }

}
