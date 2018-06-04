package lec01am;

import java.util.Scanner;

public class P2333UsingDelimiter {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // cin.useDelimiter(",");//ok
        cin.useDelimiter("\\D+");// better
        int a = cin.nextInt();
        int b = cin.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        System.out.println(String.format("max=%d", max));
        cin.close();
    }
}