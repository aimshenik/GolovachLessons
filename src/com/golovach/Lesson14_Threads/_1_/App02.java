package com.golovach.Lesson14_Threads._1_;

public class App02 {
    public static final int N = 1_000_000_00;
    public static volatile int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread0 = new Thread(() -> {
            for (int i = 0; i < N; i++) {
                inc();
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < N; i++) {
                inc();
            }
        });
        thread0.start();
        thread1.start();
        thread0.join();
        thread1.join();
        System.out.println(counter);
    }

    private static synchronized void inc() {
        counter++;
    }

}
