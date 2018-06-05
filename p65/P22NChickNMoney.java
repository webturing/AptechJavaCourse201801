package p65;

/**
 * 22百钱百鸡问题
 * 中国古代数学家张丘建在他的《算经》中提出了著名的“百钱买百鸡问题”：鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一，百钱买百鸡，问翁、母、雏各几何？
 * <p>
 * 运行结果
 * Follwing are possible plans to buy 100 fowls with 100 Yuan.
 * 1:cock=0 hen=25 chicken=75
 * 2:cock=4 hen=18 chicken=78
 * 3:cock=8 hen=11 chicken=81
 * 4:cock=12 hen=4 chicken=84
 */
public class P22NChickNMoney {
    final static int TOTAL = 100;
    final static int MONEY = 100;

    public static void main(String[] args) {
        System.out.println(String.format("Follwing are possible plans to buy %d fowls with %d Yuan.", TOTAL, MONEY));
        for (int cock = 0, cnt = 0; cock <= TOTAL; ++cock) {
            for (int hen = 0; hen <= TOTAL - cock; ++hen) {
                int chick = TOTAL - cock - hen;
                if (chick % 3 != 0)
                    continue;
                if (5 * cock + 3 * hen + chick / 3 == MONEY) {
                    System.out.println(String.format("%d:cock=%d hen=%d chicken=%d", ++cnt, chick, hen, chick));
                }
            }
        }

    }
}

