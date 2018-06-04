package lec02am;

public class RemoveFirstDigit2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 1023;
        int n2 = n;
        int len = 0;
        while (n2 > 0) {
            n2 /= 10;
            len++;
        }

        int M = 1;
        for (int i = 1; i < len; i++)
            M *= 10;
        System.out.println(M);
        System.out.println(n % M);

    }

}
