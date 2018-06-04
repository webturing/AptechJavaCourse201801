package lec02pm;

import java.util.Scanner;

public class P1232Scoring {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] scores = new int[n];
            for (int i = 0; i < scores.length; i++) {
                scores[i] = cin.nextInt();
            }
            int max, min, sum;
            max = min = sum = scores[0];
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] > max)
                    max = scores[i];
                if (scores[i] < min)
                    min = scores[i];
                sum += scores[i];
            }
            double avg = 1.0 * (sum - min - max) / (n - 2);
            System.out.println(String.format("%.2f", avg));
        }
        cin.close();
    }
}
