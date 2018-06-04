package contest1166;

public class D {
    public static void main(String[] args) {
        String hex = "88D7";
        for (char c : hex.toCharArray()) {
            int x = Integer.parseInt(Character.toString(c), 16);
            String b = Integer.toBinaryString(x);
            while (b.length() < 4)
                b = "0" + b;
            System.out.print(b);
        }
        System.out.println();
    }

}
