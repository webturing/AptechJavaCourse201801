package lec05am;

import java.util.Random;

public class RandomTestor {
    static Random rand = new Random();

    public static void main(String[] args) {
        int testCoin = rand.nextInt(2);
        int testDoss = rand.nextInt(6) + 1;
    }
}
