package p65;

/**
 * 27马克思手稿中的数学题
 * 马克思手稿中有一道趣味数学问题：有30个人，其中有男人、女人和小孩，在一家饭馆吃饭花了50先令；每个男人花3先令，每个女人花2先令，每个小孩花1先令；问男人、女人和小孩各有几人？
 * <p>
 * 运行结果
 * M  W  C
 * 1: 0 20 10
 * 2: 1 18 11
 * 3: 2 16 12
 * 4: 3 14 13
 * 5: 4 12 14
 * 6: 5 10 15
 * 7: 6 8 16
 * 8: 7 6 17
 * 9: 8 4 18
 * 10: 9 2 19
 * 11: 10 0 20
 */
public class P27MarxistManuscript {
    static int N = 30 + 1;
    static boolean[][][] V = new boolean[N][N][N];

    public static void main(String[] args) {
        dfs(0, 0, 0);
    }

    private static void dfs(int x, int y, int z) {
        if (x + y + z >= 30) {
            if (3 * x + 2 * y + z == 50) {
                System.out.println(x + " " + y + " " + z);
            }
            return;
        }

        if (!V[x][y + 1][z]) {
            V[x][y + 1][z] = true;
            dfs(x, y + 1, z);
        }
        if (!V[x][y][z + 1]) {
            V[x][y][z + 1] = true;
            dfs(x, y, z + 1);
        }
        if (!V[x + 1][y][z]) {
            V[x + 1][y][z] = true;
            dfs(x + 1, y, z);
        }
    }
}
