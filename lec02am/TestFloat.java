package lec02am;

public class TestFloat {

    /**
     * @param args
     */
    public static void main(String[] args) {
        float x = 2.7f;
        float y = x - 0.11f;
        System.out.println(y);
        if (y == 2.59f)//���ɿ����е�
        {
            System.out.println("never appeared");
        }
        if (Math.abs(y - 2.59f) <= 1E-6)//С���ж����
        {
            System.out.println("will appeared");
        }
    }

}
