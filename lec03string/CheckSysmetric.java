package lec03string;

public class CheckSysmetric {

    public static void main(String[] args) {
        System.out.println(true == isSys("A"));// expectedValue==actualValue
        System.out.println(true == isSys("AA"));
        System.out.println(true == isSys("ABA"));
        System.out.println(true == isSys("ABBAABBA"));
        System.out.println(false == isSys("AB"));

    }

    private static boolean isSys2(String s) {
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
    }

    static boolean isSys(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
