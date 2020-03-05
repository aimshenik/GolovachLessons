package com.golovach.Lesson14_Threads._1_;

public class App05 {
    public static final int N = 1_000_000_00;
    public static volatile int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new MyRunable3("HELLO___"));
        Thread t1 = new Thread(new MyRunable3("___BYE"));
        t0.start();
        t1.start();
        t0.join();
        t1.join();
        System.out.println("__Main__");
    }

}

class MyRunable3 implements Runnable {
    private String s;

    public MyRunable3(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(s);
        }
    }

}