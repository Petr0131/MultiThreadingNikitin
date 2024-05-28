package org.example.task7;

import java.util.concurrent.TimeUnit;

public class Ping implements Runnable {
    private PingPong p;
    public Ping(PingPong p) {
        this.p = p;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MICROSECONDS.sleep(2000);
                p.pingF();
                p.pong();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
