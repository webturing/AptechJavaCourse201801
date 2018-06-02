package companyTest;

public class P01FindNumber {
    public static void main(String[] args) {
        for (int n = 10 * 10; n <= 7 * 7 * 7 - 1; ++n) {
            String seven = Integer.toString(n, 7);
            String nine = Integer.toString(n, 9);
            String rSeven = new StringBuffer(seven).reverse().toString();
            if (nine.equals(rSeven)) {
                System.out.println(String.format("%d(10)=%s(7)=%s(9)", n, seven, nine));
            }
        }

    }
}
