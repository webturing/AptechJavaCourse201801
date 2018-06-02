package p20;

public class P17FindNumber {
    public static void main(String[] args) {
        for (int n = 16; ; n += 10) {
            String s = Integer.toString(n);
            int m = Integer.parseInt("6" + s.substring(0, s.length() - 1));
            if (m == 4 * n) {
                System.out.println(n);
                break;
            }
        }
        System.out.println(153846 * 4);
    }

}
