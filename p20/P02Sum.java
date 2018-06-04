package p20;

public class P02Sum {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int r = p20.Tool.lcm(3, 5);
        System.out.println(sum(start, end, r));

    }

    private static int sum(int start, int end, int r) {
        start = (start + r - 1) / r * r;
        end = end / r * r;
        int n = (end - start) / r + 1;

        return (start + end) * n >> 1;
    }
}
