package lec06.ex3;

public class Time24App {

    public static void main(String[] args) {
        Time24 time24 = new Time24();
        for (int i = 0; i < 24 * 3600; i++) {
            time24.ticToc();
            System.out.println(time24.toAMPMString());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }
}
