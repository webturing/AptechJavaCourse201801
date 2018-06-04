package p65;

/**
 * 1求最大数
 * 问555555的约数中最大的三位数是多少？
 * <p>
 * 运行结果
 * 输入：555555
 * 输出：The max factor with 3 digits in 555555 is:777
 */
public class P01GetMax3DigitsDivisor {
    public static void main(String[] args) {
        int number = 555555;
        boolean find = false;
        for (int divisor = 999; divisor >= 100; --divisor) {
            if (number % divisor == 0) {
                String format = "The max factor with 3 digits in %d is:%d.";
                System.out.println(String.format(format, number, divisor));
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Not found!");
        }
    }
}
