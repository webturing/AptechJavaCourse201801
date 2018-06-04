package p65;

/**
 * 10 有限5位数
 * 个位数为6且能被3整除的五位数共有多少？
 * 运行结果(错）应该是3000
 * count=2999
 */
public class P10Finite5DigitsNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 10006; n <= 99996; n += 10) {
            if (n % 3 == 0)
                ++count;
        }
        System.out.println(count);
    }
}
