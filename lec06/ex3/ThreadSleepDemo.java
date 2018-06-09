package lec06.ex3;

import java.util.Date;

public class ThreadSleepDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date().toLocaleString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }
}
