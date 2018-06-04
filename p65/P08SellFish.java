package p65;

/**
 * 8出售金鱼
 * 买卖提将养的一缸金鱼分五次出售系统上一次卖出全部的一半加二分之一条；
 * 第二次卖出余下的三分之一加三分之一条；
 * 第三次卖出余下的四分之一加四分之一条；
 * 第四次卖出余下的五分之一加五分之一条；
 * 最后卖出余下的11条。问原来的鱼缸中共有几条金鱼？
 * <p>
 * 运行结果
 * There are 59 fishes at first.
 */
public class P08SellFish {
    public static void main(String[] args) {
        int[] F = new int[6];
        F[5] = 11;
        for (int n = 4; n >= 1; --n) {
            F[n] = ((n + 1) * F[n + 1] + 1) / n;
        }
        System.out.println(String.format("There are %d fishes at first.", F[1]));

    }
}
