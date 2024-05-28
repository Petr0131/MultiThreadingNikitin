package org.example.task4_5_6;

import java.util.List;
import java.util.Random;

public class MyClass5 implements Runnable {
    private List<Integer> list;
    public MyClass5(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized(list) {
            Random r = new Random();
            for (int i = 0; i < 10000; i++) {
                int k = r.nextInt(list.size());
                list.remove(k);
            }
        }
    }
}
