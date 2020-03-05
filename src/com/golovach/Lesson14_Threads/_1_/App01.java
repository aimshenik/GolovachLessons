package com.golovach.Lesson14_Threads._1_;

import java.util.concurrent.atomic.AtomicInteger;

public class App01 {
    public static final int N = 1_000_000;
    public static volatile AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread0 = new Thread(() -> {
            for (int i = 0; i < N; i++) {
                counter.incrementAndGet();
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < N; i++) {
                counter.incrementAndGet();
            }
        });
        thread0.start();
        thread1.start();
        thread0.join();
        thread1.join();
        System.out.println(counter);
    }

}
