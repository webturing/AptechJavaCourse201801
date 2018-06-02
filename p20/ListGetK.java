package p20;

import java.util.LinkedList;

public class ListGetK {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add((int) (Math.random() * 100));
        System.out.println(list);
        System.out.println(list.get(6));
    }
}
