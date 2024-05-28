package org.example.task1_2_3;

public class MyClass1 implements Runnable {
    public MyClass1() {
    }

    @Override
    public void run() {
        System.out.println( "1: " + Thread.currentThread() + " " + Thread.currentThread().getState());
    }
}
