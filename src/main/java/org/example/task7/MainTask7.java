package org.example.task7;

public class MainTask7 {
    public static void main(String[] args) throws InterruptedException {
        // 7
        PingPong p = new PingPong();
        Thread ping = new Thread(new Ping(p));
        Thread pong = new Thread(new Pong(p));

        ping.start();
        pong.start();

        ping.join();
        pong.join();


        System.out.println("finish main thread");
    }
}
