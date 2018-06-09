package lec06.ex3;

public class Time24Testor {
    static void test2() {
        Time24 start = new Time24(9, 0, 0);
        Time24 end = start.addSeconds(45 * 100);
        System.out.println(end);
        Time24 time3 = new Time24(2, 45, 44);
        Time24 end2 = start.add(new Time24(-100, -45, 0));
        System.out.println(end2);
    }

    public static void main(String[] args) {
        testTime24B();
    }

    private static void testTime24B() {
        Time24 time = new Time24();
        System.out.println(time);//00:00:00
        Time24 time2 = new Time24(15, 56, 0);
        System.out.println(time2);//00:00:00
        System.out.println(time2.toAMPMString());//00:00:00
    }
}
