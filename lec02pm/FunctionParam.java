package lec02pm;

public class FunctionParam {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = 3;
        f(x);
        System.out.println(x);//?

    }

    private static void f(int x) {//x is primary DataType  pass by Value
        x++;

    }

}
