package contest1164;

public class A {
    public static void main(String[] args) {
        String s = "abc123+xyz.5ABC";
        System.out.println(s.replaceAll("[^a-zA-Z]", ""));
    }
}
