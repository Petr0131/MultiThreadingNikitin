package org.example.task8;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AddThread extends Thread {
    private final List<Integer> list;
    private ReentrantLock locker;
    private final Condition condition;

    public AddThread(List<Integer> list, String name, ReentrantLock locker, Condition condition) {
        super(name);
        this.list = list;
        this.locker = locker;
        this.condition = condition;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            locker.lock();
            System.out.printf(Thread.currentThread().getName() + " " + list.size() + "; \n");
            list.add((int) (Math.random() * Integer.MAX_VALUE * 2 + 1) - Integer.MAX_VALUE);
            condition.signal();
            locker.unlock();
        }
    }
}
