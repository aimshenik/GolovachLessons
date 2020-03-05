package com.golovach.Lesson14_Threads._1_;

public class App04 {
    public static final int N = 1_000_000_00;
    public static volatile int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new MyRunable3("HELLO"));

        t0.start();
        t0.join();
        System.out.println("Main");
    }

}

class MyRunable2 implements Runnable {
    private String s;

    public MyRunable2(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(s);
    }

}