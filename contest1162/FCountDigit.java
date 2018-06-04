package contest1162;

import java.util.Arrays;

public class FCountDigit {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] freq = new int[10];//hashTable
        for (int page = 1; page <= 11; ++page) {
            int x = page;
            while (x > 0) {
                int d = x % 10;
                freq[d]++;
                x /= 10;
            }
        }
        System.out.println(Arrays.toString(freq));
    }

}
