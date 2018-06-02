package p20;

import java.util.Random;

public class P01 {
    static Random rand = new Random();

    public static void main(String[] args) {

        while (true) {
            //int cur = MathRandomDemo.doss(1, 100);
            int cur = rand.nextInt(100) + 1;
            System.out.print(cur + " ");
            if (cur == 50) {
                break;
            }
        }
    }
}
