package p65;

public class P03DistributeBooks {
    static int[] books = new int[]{1, 2, 3, 4, 5};
    static int kids = 3;
    static boolean[] used = new boolean[books.length];

    public static void main(String[] args) {
        dfs(0);
    }

    private static void dfs(int k) {
        if (k == 3) {
            for (int i = 0; i < books.length; i++)
                if (used[i]) {
                    System.out.print(books[i] + ",");
                }
            System.out.println();
        }
        for (int i = 0; i < books.length; i++) {
            if (!used[i]) {
                used[i] = true;
                dfs(k + 1);
                used[i] = false;
            }
        }
    }
}
