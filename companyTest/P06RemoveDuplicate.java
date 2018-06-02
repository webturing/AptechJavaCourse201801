package companyTest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class P06RemoveDuplicate {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int size = cin.nextInt();
        for (int i = 0; i < size; i++)
            set.add(cin.nextInt());
        for (Integer i : set)
            System.out.println(i);

    }
}




