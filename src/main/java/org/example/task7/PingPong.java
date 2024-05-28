package org.example.task7;

public class PingPong  {
    private boolean flag;

    public PingPong() {
        flag = false;
    }

    public synchronized void pingF() {
        System.out.println("Ping");
        flag = true;
        notify();
    }

    public synchronized void pongF() {
        System.out.println("Pong");
        flag = false;
        notify();
    }

    public synchronized void ping() throws InterruptedException {
        while (!flag) {
            wait();
        }
    }

    public synchronized void pong() throws InterruptedException {
        while (flag) {
            wait();
        }
    }

}
