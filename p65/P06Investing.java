package p65;

/**
 * 6该存多少钱
 * 假设银行一年整存零取的月息为0.63%。现在某人手中有一笔钱，他打算在今后的五年中的年底取出1000元，到第五年时刚好取完，请算出他存钱时应存入多少。
 * <p>
 * 运行结果
 * He must save 4039.44 at first
 */
public class P06Investing {
    final static double RATE_PER_MONTH = 0.63 / 100;
    final static double RATE_PER_YEAR = RATE_PER_MONTH * 12;

    public static void main(String[] args) {
        double[] M = new double[6];
        for (int i = 4; i >= 0; i--) {
            M[i] = (M[i + 1] + 1000) / (1 + RATE_PER_YEAR);
        }
        System.out.println(String.format("He must save %.2f at first", M[0]));

    }
}
