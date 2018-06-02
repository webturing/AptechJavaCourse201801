package lec05am;

import java.util.Arrays;

public class RegexDemo {
    public static void main(String[] args) {
        String s = "0123afsdkj123asfdjka123ikjakjfaoiuew4ir324j53kj345j43kj5W";
        System.out.println(s.replaceAll("\\d+", " "));
        System.out.println(s.replaceAll("\\D+", " "));
        System.out.println(Arrays.toString("I like ACM".split(" ")));
        System.out.println(Arrays.toString("I like    ACM.".split(" ")));
        System.out.println(Arrays.toString("I like    ACM.".split("\\W+")));//?
        String[] numbers = s.split("\\D+");
        System.out.println(Arrays.toString(numbers));
    }
}
