package org.example.task4_5_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTask4_5_6 {
    public static void main(String[] args) throws InterruptedException {
        // 4
        ArrayList<Integer> arrayList = new ArrayList<>();
        s4(arrayList);
        System.out.println(arrayList);

        // 5
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        s5(arrayList1);
        System.out.println(arrayList1);

        // 6
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        s6(list);
        System.out.println(list);

    }
    public static void s4(ArrayList<Integer> arrayList) throws InterruptedException {
        Thread thread4 = new Thread(new MyClass4(arrayList));
        Thread thread5 = new Thread(new MyClass5(arrayList));


        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();

    }

    public static void s5(ArrayList<Integer> arrayList) throws InterruptedException {
        ListProcessor listProcessor1 = new ListProcessor(arrayList);
        Thread thread4 = new Thread(listProcessor1::fill);
        Thread thread5 = new Thread(listProcessor1::clear);

        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();
    }

    public static void s6(List<Integer> list) throws InterruptedException {
        ListProcessor listProcessor2 = new ListProcessor(list);
        Thread thread4 = new Thread(listProcessor2::fill);
        Thread thread5 = new Thread(listProcessor2::clear);

        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();
    }
}
