package org.example.task9;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MainTask9 {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        AtomicBoolean flag = new AtomicBoolean(false);
        PingThread pingThread = new PingThread(condition, flag, lock);
        PongThread pongThread = new PongThread(condition, flag, lock);
        pingThread.start();
        pongThread.start();
        try{
            pingThread.join();
            pongThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
