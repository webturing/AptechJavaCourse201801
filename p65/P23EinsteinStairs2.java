package p65;

/**
 * 23爱因斯坦的数学题
 * 爱因斯坦出了一道这样的数学题：有一条长阶梯，若每步跨2阶，则最后剩一阶，若每步跨3 阶，
 * 则最后剩2阶，若每步跨5阶，则最后剩4阶，若每步跨6阶则最后剩5阶。只有每次跨7阶
 * ，最后才正好一阶不剩。请问这条阶梯共有多少阶？
 * <p>
 * 运行结果
 * Staris_number=119
 */

public class P23EinsteinStairs2 {
    static class ExGcd {
        int g, x, y;

        void swap() {
            int t = x;
            x = y;
            y = t;
        }

        public static ExGcd gcd(int a, int b) {
            ExGcd g = new ExGcd();
            if (b == 0) {
                g.y = 1;
                g.x = 0;
                g.g = a;
                return g;
            }
            ExGcd h = gcd(b, a % b);
            h.y -= a / b * h.x;
            h.swap();
            return h;
        }
    }


    static int chineseRemainder(int r[], int prime[]) {
        int len = r.length;
        int i, m, n = 1, sum = 0;
        //计算所以除数的积n，也是所以除数的最小公倍数
        for (i = 0; i < len; i++)
            n *= prime[i];
        //计算符合所以条件的
        for (i = 0; i < len; i++) {
            m = n / prime[i];//计算除去本身的所有除数的积m
            ExGcd g = ExGcd.gcd(prime[i], m);//计算w[i]*x+m*y=gcd(w[i],m)的一个解y
            //累加整数解y的同并不断对n取余，其利用公式:(a+b)%c=(a%c+b%c)%c
            sum = (sum + g.x * m * r[i]) % n;
        }
        return (n + sum % n) % n;//满足所以方程的最小解
    }

    public static void main(String[] args) {
        int[] p = {2, 3, 5, 7,};
        int[] r = {1, 2, 4, 0};
        int ans = chineseRemainder(r, p);
        while (ans % 6 != 5) ans += 210;
        System.out.println(ans);

    }
}
