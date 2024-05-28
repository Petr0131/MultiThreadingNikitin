package org.example.task1_2_3;
public class MyClass2 implements Runnable {
    public MyClass2() {
    }

    @Override
    public void run() {
        System.out.println( "2: " + Thread.currentThread() + " " + Thread.currentThread().getState());
    }
}
