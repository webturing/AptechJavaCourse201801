package p65;

/**
 * 47减式还原
 * 编写程序求解下式中各字母所代表的数字，不同的字母代表不同的数字。
 * PEAR
 * - ARA
 * --------
 * 　　PEA
 * <p>
 * 运行结果
 * PEAR 1098
 * ARA – 989
 * ----------
 * PEA 109
 */
public class P47SubstractionRecover {
    public static void main(String[] args) {
        for (int p = 1; p <= 9; ++p)
            for (int e = 0; e <= 9; ++e)
                for (int a = 0; a <= 9; ++a)
                    for (int r = 0; r <= 9; ++r) {
                        int x = p * 1000 + e * 100 + a * 10 + r;
                        int y = a * 100 + r * 10 + a;
                        int z = x - y;
                        if (z == p * 100 + e * 10 + a) {
                            System.out.printf("%4d\n-%3d\n----\n%4d", x, y, z);
                        }
                    }
    }
}
