package p65;

/**
 * 14求车速
 * 一辆以固定速度行驶的汽车，司机在上午10点看到里程表上的读数是一个对称数
 * (即这个数从左向右读和从右向左读是完全一样的)，为95859。
 * 两小时后里程表上出现了一个新的对称数。问该车的速度是多少？新的对称数是多少？
 * <p>
 * 运行结果
 * The new symmetrical number kilometers is:95959.
 * The velocity of the car is:50.00
 */
public class P14SystemerticalOdograph {
    public static void main(String[] args) {
        int odograph = 95859;
        for (int speed = 1;/*???*/ ; speed++) {
            odograph += speed * 2;
            if (Tools.isSysmetric(Integer.toString(odograph))) {
                System.out.println("The new symmetrical number kilometers is:" + odograph);
                System.out.println("The velocity of the car is:" + speed);
                break;
            }
        }
    }
}
