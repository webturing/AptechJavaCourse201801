package lec05pm;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/3 0003.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toLocaleString());
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        Date nationDay = new Date(1949 - 1900, 10 - 1, 1);
        System.out.println(nationDay.toLocaleString());
        long days = (date.getTime() - nationDay.getTime()) / 1000 / 3600 / 24;
        System.out.println(days);
    }
}
