package p65;

/**
 * 26三色球问题
 * 若一个口袋中放有12个球，其中有3个红的。3个白的和6个黒的，问从中任取8个共有多少种不同的颜色搭配？
 * <p>
 * 运行结果
 * 　　R W B
 * 1: 0 2 6
 * 2: 0 3 5
 * 3: 1 1 6
 * 4: 1 2 5
 * 5: 1 3 4
 * 6: 2 0 6
 * 7: 2 1 5
 * 8: 2 2 4
 * 9: 2 3 3
 * 10: 3 0 5
 * 11: 3 1 4
 * 12: 3 2 3
 * 13: 3 3 2
 */
public class P26ThreeColoredBall {
    static int N = 8;
    static boolean[][][] V = new boolean[N + 1][N + 1][N + 1];

    public static void main(String[] args) {
        dfs(0, 0, 0);
    }

    private static void dfs(int r, int w, int b) {
        if (r >= 3 || w >= 3 || b >= 6 || r + w + b >= 8) {
            if (r + w + b == 8)
                System.out.println(String.format("%d %d %d", r, w, b));
            return;
        }
        if (!V[r][w][b + 1]) {
            dfs(r, w, b + 1);
            V[r][w][b + 1] = true;
        }
        if (!V[r][w + 1][b]) {
            dfs(r, w + 1, b);
            V[r][w + 1][b] = true;
        }
        if (!V[r + 1][w][b]) {
            dfs(r + 1, w, b);
            V[r + 1][w][b] = true;
        }
        V[r][b][w] = true;
    }
}
