package com.golovach.Lesson14_Threads._1_;

public class App03 {
    public static final int N = 1_000_000_00;
    public static volatile int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new MyRunable("HELLO"));

        t0.start();
        System.out.println("Main");
    }

}

class MyRunable implements Runnable {
    private String s;

    public MyRunable(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(s);
    }

}