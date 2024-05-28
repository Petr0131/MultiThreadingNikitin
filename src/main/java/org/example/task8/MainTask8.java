package org.example.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MainTask8 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        List<Integer> list = new ArrayList<>();
        Condition condition = lock.newCondition();
        AddThread addThread = new AddThread(list,"addThread", lock, condition);
        DelThread delThread = new DelThread(list, "delThread", lock, condition);
        addThread.start();
        delThread.start();
        try {
            addThread.join();
            delThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
