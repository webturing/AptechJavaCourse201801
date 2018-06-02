package lec05am;

public class TestTimeMills {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int s = 0;
        for (int i = 0; i < 1000000000; i++) {
            s = s + i;
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
