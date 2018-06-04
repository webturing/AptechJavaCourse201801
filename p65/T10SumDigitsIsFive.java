package p65;

/**
 * 思考题
 * 求100到1000之间有多少个其数字之和为5的整数。
 * (答案：104，113，122，131，140，203，212，221，230，302，311，320，401，410，500)
 */
public class T10SumDigitsIsFive {
    public static void main(String[] args) {
        for (int n = 100; n <= 1000; n++) {
            char[] digits = Integer.toString(n).toCharArray();
            int sum = 0;
            for (char digit : digits)
                sum += digit - '0';
            if (sum == 5) {
                System.out.print(n + " ");
            }
        }
    }
}
