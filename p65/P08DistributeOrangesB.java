package p65;

import java.util.Arrays;

/**
 * 思考题
 * 日本著名数学游戏专家中村义作教授提出这样一个问题：父亲将2520个桔子分给六个儿子。
 * 分完后父亲说：“老大将分给你的桔子的1/8给老二；老二拿到后连同原先的桔子分1/7给老三；
 * 老三拿到后连同原先的桔子分1/6给老四；老四拿到后连同原先的桔子分1/5给老五；
 * 老五拿到后连同原先的桔子分1/4给老六；老六拿到后连同原先的桔子分1/3给老大”。
 * 结果大家手中的桔子正好一样多。问六兄弟原来手中各有多少桔子？
 */
public class P08DistributeOrangesB {
    public static void main(String[] args) {
        int[] a = new int[6];//存放六个儿子原先手中的橘子数目
        int left = 0;//存放下一个儿子得到的橘子数目
        int ave = 420;
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                a[i] = (ave - ave / 2) * (8 - i) / (8 - i - 1);//第一个儿子的数目,
                left = a[i] - ave / 2;
            } else {
                a[i] = ave * (8 - i) / (8 - i - 1) - left;//由left求第i+1个儿子的橘子数目
                left = ave / (8 - i - 1);//第i+1个儿子得到的橘子数目
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
