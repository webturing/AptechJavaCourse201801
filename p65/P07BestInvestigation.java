package p65;

/**
 * 7怎样存钱利最大
 * 假设银行整存整取存款不同期限的月息利率分别为：
 * 0.63% 期限=1年
 * 0.66% 期限=2年
 * 0.69% 期限=3年
 * 0.75% 期限=5年
 * 0.84% 期限=8年
 * 利息=本金*月息利率*12*存款年限。
 * 现在某人手中有2000元钱，请通过计算选择一种存钱方案，使得钱存入银行20年后得到的利息最多(假定银行对超过存款期限的那一部分时间不付利息)。
 * <p>
 * 运行结果
 * For maxinum profit,he should so save his money in a bank:
 * made fixed deposit for 8 year: 0times
 * made fixed deposit for 5 year: 4times
 * made fixed deposit for 3 year: 0times
 * made fixed deposit for 2 year: 0times
 * made fixed deposit for 1 year: 0times
 * Total:8841.01
 * 可见最佳的存款方案为连续四次存5年期。
 */
public class P07BestInvestigation {
    static double[] I = new double[9];
    static double M0 = 2000.0;

    static {
        I[1] = 63e-4 * 12;
        I[2] = 66e-4 * 12;
        I[3] = 69e-4 * 12;
        I[5] = 75e-4 * 12;
        I[8] = 84e-4 * 12;
    }

    static void solve(int years) {
        double max = 0;
        int Y1 = 0, Y2 = 0, Y3 = 0, Y5 = 0, Y8 = 0;
        for (int y1 = 0; y1 <= years; ++y1)
            for (int y2 = 0; y2 <= years / 2; ++y2)
                for (int y3 = 0; y3 <= years / 3; ++y3)
                    for (int y5 = 0; y5 <= years / 5; ++y5)
                        for (int y8 = 0; y8 <= years / 8; ++y8) {
                            if (y1 + y2 * 2 + y3 * 3 + y5 * 5 + y8 * 8 > years)
                                continue;
                            double cur = M0
                                    * Math.pow(I[1] * 1 + 1, y1)
                                    * Math.pow(I[2] * 2 + 1, y2)
                                    * Math.pow(I[3] * 3 + 1, y3)
                                    * Math.pow(I[5] * 5 + 1, y5)
                                    * Math.pow(I[8] * 8 + 1, y8);
                            if (cur > max) {
                                max = cur;
                                Y1 = y1;
                                Y2 = y2;
                                Y3 = y3;
                                Y5 = y5;
                                Y8 = y8;
                            }

                        }
        System.out.println("For maxinum profit,he should so save his money in a bank:");
        System.out.println(String.format("made fixed deposit for 8 year: %d times", Y8));
        System.out.println(String.format("made fixed deposit for 5 year: %d times", Y5));
        System.out.println(String.format("made fixed deposit for 3 year: %d times", Y3));
        System.out.println(String.format("made fixed deposit for 2 year: %d times", Y2));
        System.out.println(String.format("made fixed deposit for 1 year: %d times", Y1));
        System.out.println(String.format("Total %.2f", max));


    }

    public static void main(String[] args) {
        solve(20);
    }

}
