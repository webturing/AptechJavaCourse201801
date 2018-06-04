package lec02am;

public class RemoveFirstDigit4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int n = 12;
        String s = Integer.toString(n);//better than (n+"") "1023"

        String t = s.substring(1);

        int m = Integer.parseInt(t);//m=23
        System.out.println(m);


    }

}
