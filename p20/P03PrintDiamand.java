package p20;

public class P03PrintDiamand {
    final static char[] CHARS = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static void main(String[] args) {
        int n = 3;
        printDiamand(35);
    }

    private static void printDiamand(int n) {
        char[][] G = new char[2 * n + 1][2 * n + 1];
        for (int i = 0; i < G.length; i++) {
            for (int j = 0; j < G[i].length; j++) {
                int dif = n - (Math.abs(i - n) + Math.abs(j - n));
                G[i][j] = dif >= 0 ? CHARS[dif] : ' ';
            }
        }
        for (int i = 0; i < G.length; i++) {
            System.out.println(new String(G[i]));
        }
    }
}
