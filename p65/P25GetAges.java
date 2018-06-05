package p65;

/**
 * 25年龄几何
 * 张三、李四、王五、刘六的年龄成一等差数列，他们四人的年龄相加是26，相乘是880，求以他们的年龄为前4项的等差数列的前20项。
 * <p>
 * 运行结果
 * The series with equal difference are:
 * 2 5 8 11 14 17 20 23 26 29 32 35 38 41 44 47 50 53 56 59
 */
public class P25GetAges {
    public static void main(String[] args) {
        int[] ans = findAD();//a -> 2, d -> 3 OR a -> 11, d -> -3
        int a = ans[0], d = ans[1];
        for (int i = 0; i < 20; i++) {
            System.out.print(a + i * d + " ");
        }

    }

    private static int[] findAD() {
        int a, d;
        for (a = 0; 4 * a <= 26; ++a) {
            for (d = 0; 3 * d <= 26 - a; ++d) {
                if (a * (a + d) * (a + 2 * d) * (a + 3 * d) == 880) {
                    return new int[]{a, d};
                }
            }
        }
        return null;
    }

}
