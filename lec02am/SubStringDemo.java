package lec02am;

public class SubStringDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String s = "abcdefgh";
        System.out.println(s.substring(1));
        System.out.println(s.substring(3, 6));//"def"
        System.out.println(s.substring(s.length() - 2));

    }

}
