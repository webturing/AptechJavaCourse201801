package lec03string;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "abcdefghijff";
        System.out.println(s.length());// 10
        System.out.println(s.charAt(5));// 'f'
        System.out.println(s.substring(1));// "bcdefghij"
        System.out.println(s.substring(2, 4));// ""
        System.out.println(s.indexOf('f'));
        System.out.println(s.indexOf("bc"));
        System.out.println(s.indexOf("bd"));
        System.out.println(s.replace("f", "XXXX"));
        System.out.println(s.equals("happy"));
        System.out.println(s.equalsIgnoreCase("happy"));
        System.out.println(s.toUpperCase());
        System.out.println("ABBAABBA".substring(0, 4));
        System.out.println(Arrays.toString(" ABCDEF ".trim().split("")));

    }
}
