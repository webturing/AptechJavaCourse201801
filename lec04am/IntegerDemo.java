package lec04am;

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);// -2^31
        System.out.println(Integer.MAX_VALUE);// 2^31-1 <13!
        System.out.println(40000 * 40000);
        System.out.println(50000 * 50000);
        System.out.println(Long.MIN_VALUE);// -2^63
        System.out.println(Long.MAX_VALUE);// 2^63-1<21!

        // radix
        int n = 1023;
        System.out.println(Integer.toString(n));// ʮ����
        System.out.println(Integer.toBinaryString(n));// ������
        System.out.println(Integer.toHexString(n));// ʮ������
        System.out.println(Integer.toOctalString(n));// �˽���

        System.out.println(Integer.toString(n, 10));// ʮ����
        System.out.println(Integer.toString(n, 2));
        System.out.println(Integer.toString(n, 16));// ʮ������
        System.out.println(Integer.toString(n, 8));// �˽���

        String s = "10111";
        System.out.println(Integer.parseInt(s));
        System.out.println(Integer.parseInt(s, 2));
        System.out.println(Integer.parseInt(s, 8));
        System.out.println(Integer.parseInt(s, 16));

        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(~-1));
        // System.out.println(Integer.parseInt("11111111111111111111111111111100",2));
        for (int i = -10; i < 10; i++)
            System.out.println(i + " " + (~i));// ~x=-(x+1)

    }
}
