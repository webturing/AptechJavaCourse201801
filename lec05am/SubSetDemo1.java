package lec05am;

/**
 * Created by Administrator on 2018/6/3 0003.
 */
public class SubSetDemo1 {
    public static void main(String[] args) {
        for (int a = 0; a <= 1; a++)
            for (int b = 0; b <= 1; b++)
                for (int c = 0; c <= 1; c++)
                    for (int d = 0; d <= 1; d++)
                        for (int e = 0; e <= 1; e++) {
                            System.out.println(String.format("%d%d%d%d%d", a, b, c, d, e));

                        }
    }


}
