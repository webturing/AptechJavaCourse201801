package lec06.ex3;

import java.util.Date;

public class TimeSleepDemo {

    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date().toLocaleString());
            for (int j = 0; j < 2000000000; j++) {
                s += j;
            }

        }
        System.out.println();
    }
}
