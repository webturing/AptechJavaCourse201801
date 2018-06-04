package p65;

public class P03DistributeBooks {
    static int[] books = new int[]{1, 2, 3, 4, 5};
    static int kids = 3;
    static boolean[] used = new boolean[books.length];
    static int[] select = new int[kids];

    public static void main(String[] args) {
        dfs(0);
    }

    private static void dfs(int k) {
        if (k == kids) {
            for (int i = 0; i < kids; i++)
                System.out.print(select[i] + ",");
            System.out.println();
            return;//thanks for cathy~
        }
        for (int i = 0; i < books.length; i++) {
            if (!used[i]) {
                used[i] = true;
                select[k] = books[i];
                dfs(k + 1);
                used[i] = false;
            }
        }
    }
}
