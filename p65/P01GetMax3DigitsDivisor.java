package p65;

public class P01GetMax3DigitsDivisor {
    public static void main(String[] args) {
        int number = 555555;
        boolean find = false;
        for (int divisor = 999; divisor >= 100; --divisor) {
            if (number % divisor == 0) {
                String format = "The max factor with 3 digits in %d is:%d.";
                System.out.println(String.format(format, number, divisor));
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Not found!");
        }
    }
}
