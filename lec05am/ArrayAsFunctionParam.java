package lec05am;

import java.util.Arrays;

public class ArrayAsFunctionParam {

    static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    static void swap(int[] a) {
        int t = a[0];
        a[0] = a[1];
        a[1] = t;
    }

    public static void main(String[] args) {
        int a = 3, b = 4;
        swap(a, b);
        System.out.println(a + " " + b);
        int[] arr = new int[]{a, b};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

}
