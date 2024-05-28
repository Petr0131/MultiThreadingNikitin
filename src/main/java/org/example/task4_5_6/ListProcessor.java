package org.example.task4_5_6;

import java.util.List;
import java.util.Random;

public class ListProcessor {
    private List<Integer> list;
    public ListProcessor(List<Integer> list) {
        this.list = list;
    }

    public synchronized void fill() {
        for (int i = 0; i < 10000; i++) {
            list.add((int) (Math.random() * 10000));
        }
    }
    public synchronized void clear() {
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            int k = r.nextInt(list.size());
            list.remove(k);
        }
    }



}
