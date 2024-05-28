package org.example.task7;

import java.util.concurrent.TimeUnit;

public class Pong implements Runnable {
    private PingPong p;
    public Pong(PingPong p) {
        this.p = p;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                p.ping();
                TimeUnit.MICROSECONDS.sleep(2000);
                p.pongF();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
