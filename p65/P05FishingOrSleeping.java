package p65;

import java.util.Date;

/**
 * 5打鱼还是晒网
 * 中国有句俗语叫“三天打鱼两天晒网”。某人从1990年1月1日起开始“三天打鱼两天晒网”，问这个人在以后的某一天中是“打鱼”还是“晒网”。
 * 思考题：请打印出任意年份的日历
 * <p>
 * 运行结果
 * Enter year/month/day:1991 10 25
 * He was fishing at day.
 * Enter year/month/day:1992 10 25
 * He was sleeping at day.
 * Enter year/month/day:1993 10 25
 * He was sleeping at day.
 */
public class P05FishingOrSleeping {
    final static int YEAR = 1990;
    final static int MONTH = 1;
    final static int DAY = 1;

    public static void main(String[] args) {
        testFishingOrSleeping(1991, 10, 25);
        testFishingOrSleeping(1992, 10, 25);
        testFishingOrSleeping(1993, 10, 25);
    }

    private static void testFishingOrSleeping(int year, int month, int day) {

        long days = countDays(year, month, day);
        if (days % 5 < 3) {
            System.out.println("He was fishing at day.");
        } else {
            System.out.println("He was sleeping at day.");
        }
    }

    private static long countDays(int year, int month, int day) {
        Date from = new Date(YEAR - 1900, MONTH - 1, DAY);
        Date to = new Date(year - 1900, month - 1, day);
        long time = to.getTime() - from.getTime();
        return time / 1000 / 3600 / 24;
    }
}
