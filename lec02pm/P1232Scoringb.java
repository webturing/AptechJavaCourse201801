package lec02pm;

import java.util.Scanner;

public class P1232Scoringb {

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
            int max = max(scores);
            int min = min(scores);
            int sum = sum(scores);
            double avg = 1.0 * (sum - min - max) / (n - 2);
            System.out.println(String.format("%.2f", avg));
        }
        cin.close();

    }

    static int sum(int[] a) {
        int ret = 0;
        for (int i : a)
            ret += i;
        return ret;
    }

    static int min(int[] a) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < ret)
                ret = a[i];
        }
        return ret;
    }

    static int max(int[] a) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > ret)
                ret = a[i];
        }
        return ret;
    }

}
