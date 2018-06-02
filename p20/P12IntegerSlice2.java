package p20;

public class P12IntegerSlice2 {

    public static void main(String[] args) {
        long n = 68L;
        String s = Long.toString(n);// s=n+"";
        while (s.length() % 3 != 0) {
            s = "0" + s;
        }
        int m = s.length();
        int w = m / 3;
        int head = Integer.parseInt(s.substring(0, w));
        int middle = Integer.parseInt(s.substring(w, 2 * w));
        int tail = Integer.parseInt(s.substring(2 * w));
        System.out.println(head + tail - middle);
    }

}
