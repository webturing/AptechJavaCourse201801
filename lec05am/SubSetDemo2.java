package lec05am;

public class SubSetDemo2 {

    public static void main(String[] args) {
        for (int i = 0; i < (1 << 5); i++) {
            int a = (i & 1);
            int b = ((i >> 1) & 1);
            int c = ((i >> 2) & 1);
            int d = ((i >> 3) & 1);
            int e = ((i >> 4) & 1);
            System.out.println(String.format("%d%d%d%d%d", e, d, c, b, a));
        }
    }
}
