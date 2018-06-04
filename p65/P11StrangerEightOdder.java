package p65;

/**
 * 11 8除不尽的数
 * 一个自然数被8除余1，所得的商被8除也余1，
 * 再将第二次的商被8除后余7，最后得到一个商为a。
 * 又知这个自然数被17除余4，所得的商被17除余15，
 * 最后得到一个商是a的2倍。求这个自然数。
 * <p>
 * 运行结果
 * The required number is:1993
 */
public class P11StrangerEightOdder {
    public static void main(String[] args) {
        for (int num = 1; ; ++num) {
            if (num % 8 != 1)
                continue;
            if (num / 8 % 8 != 1)
                continue;
            int b = num / 8 / 8;
            if (b % 8 != 7)
                continue;
            int a = b / 8;
            if (num % 17 != 4)
                continue;
            if (num / 17 % 17 != 15)
                continue;
            int c = num / 17 / 17;
            if (c != 2 * a)
                continue;
            System.out.println(num);
            break;
        }
    }
}
