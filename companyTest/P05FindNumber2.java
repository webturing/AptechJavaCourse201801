package companyTest;

public class P05FindNumber2 {
    public static void main(String[] args) {
        for (int n = 16; ; n += 10) {
            String sn = Integer.toString(n);
            String sm = "6" + Integer.toString(n / 10);
            int m = Integer.parseInt(sm);
            if (m == 4 * n) {
                System.out.println(String.format("%d * 4 = %d", n, m));
                break;
            }
        }
    }
}
