package org.example.task1_2_3;

public class MainTask1_2_3 {
    public static void main(String[] args) throws InterruptedException {
        // 3
        Thread thread1 = new Thread(new MyClass1());
        Thread thread2 = new Thread(new MyClass2());
        Thread thread3 = new Thread(new MyClass3());

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
