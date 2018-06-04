package lec02am;

public class RerverseInteger {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // ��Ԫ���� expectedValue==actualValue
        System.out.println(321 == rev(123));
        System.out.println(1 == rev(100));
        System.out.println(0 == rev(0));
        System.out.println(700000001 == rev(100000007));

    }

    private static int rev(int n) {//Java-Style
        String sn = Integer.toString(n);
        String sm = new StringBuffer(sn).reverse().toString();
        return Integer.parseInt(sm);
    }

    private static int rev3(int n) {
        String sn = Integer.toString(n);
        String sm = "";
        for (int i = sn.length() - 1; i >= 0; i--) {
            sm = sm + sn.charAt(i);
        }
        return Integer.parseInt(sm);
    }

    private static int rev2(int n) {//C-Style
        int ret = 0;
        while (n > 0) {
            int d = n % 10;
            ret = ret * 10 + d;
            n /= 10;
        }
        return ret;
    }

}
