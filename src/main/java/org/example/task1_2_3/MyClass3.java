package org.example.task1_2_3;

public class MyClass3 implements Runnable {
    public MyClass3() {
    }

    @Override
    public void run() {
        System.out.println( "3: " + Thread.currentThread() + " " + Thread.currentThread().getState());
    }
}
