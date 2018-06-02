package p20;

public class P12IntegerSlice {

    public static void main(String[] args) {
        long n = 68L;
        String s = "00" + Long.toString(n);// s=n+"";
        int m = s.length();
        int w = m / 3;
        int head = Integer.parseInt(s.substring(0, m - 2 * w));
        int middle = Integer.parseInt(s.substring(m - 2 * w, m - w));
        int tail = Integer.parseInt(s.substring(m - w));
        System.out.println(head + tail - middle);
    }

}
