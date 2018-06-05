package p65;

/**
 * 20求具有abcd=(ab+cd)^2性质的四位数
 * 3025这个数具有一种独特的性质：将它平分为二段，即30和25，使之相加后求平方，即(30+25)^2，恰好等于3025本身。请求出具有这样性质的全部四位数。
 * <p>
 * 运行结果
 * There are following numbers with 4 digits satisfied condition:
 * 2025 3025 9801
 */
public class P20SpecialFourDigitsNumber {
    public static void main(String[] args) {
        System.out.println("There are following numbers with 4 digits satisfied condition:");
        for (int n = 1000; n <= 9999; n++) {
            int high = n / 100;
            int low = n % 100;
            if (n == Tools.square(high + low)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
