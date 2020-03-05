package com.golovach.Lesson14_Threads._1_;

public class App00 {
    public static final int N = 1_000_000;
    public static volatile int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread0 = new Thread(() -> {
            for (int i = 0; i < N; i++) {
                counter++;
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < N; i++) {
                counter++;
            }
        });
        thread0.start();
        thread1.start();
        thread0.join();
        thread1.join();
        System.out.println(counter);
    }

}
