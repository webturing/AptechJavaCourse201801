package p20;

public class P06 {
    static boolean isRight(int p, int q) {
        return p + 1 == q || (p == 4 && q == 0);
    }

    static boolean isLeft(int p, int q) {
        return isRight(q, p);
    }

    static boolean isNear(int p, int q) {
        return isLeft(p, q) || isRight(p, q);
    }

    public static void main(String[] args) {
        int zhao, qian, sun, li, zhou;
        zhao = 0;
        for (qian = 1; qian <= 4; qian++) {
            for (sun = 1; sun <= 4; sun++) {
                if (qian == sun)
                    continue;
                for (li = 1; li <= 4; li++) {
                    if (li == qian || li == sun)
                        continue;
                    zhou = 10 - qian - sun - li;
                    boolean zhouFirst = isNear(zhao, qian);
                    boolean zhouSecond = isLeft(sun, qian) || isLeft(li, qian);
                    boolean liFirst = isLeft(qian, sun);
                    boolean liSecond = isNear(li, sun);
                    if (!(zhouFirst || zhouSecond || liFirst || liSecond))
                        System.out.println(String.format("%d%d%d%d%d", zhao,
                                qian, sun, li, zhou));
                }
            }
        }
    }
}
