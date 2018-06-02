package p20;

public class BitOperations {
    public static void main(String[] args) {
        // 位操作
        int x = 17;
        System.out.println(x << 4);// a<<n <=> a*2^n
        System.out.println(x >> 2);// a>>n <=> a/2^n
        System.out.println(~x);//  ~x=-(x+1)

        int a = 3, b = 4;
        System.out.println(a & b);// *&0=0 *&1=* a&a=a
        System.out.println(a | b);// *|0=* *&1=1 a|a=a
        System.out.println(a ^ b);// 0^1=1^0=1 a^a=0
        int t = 1023;
        int y = t * t;
        int z = ((y >> 8) & 0xffff);
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toHexString(z));

        System.out.println(Integer.MAX_VALUE);// ((1<<31)-1)
        System.out.println(Integer.MIN_VALUE);
        int max = 0x7fffffff;
        int min = 0x80000000;
        System.out.println(max);
        System.out.println(min);

    }
}
