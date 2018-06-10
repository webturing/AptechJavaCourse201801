package zj.util;

public class Polynomials {
    void resize(int index) {
        int[] coefficients2 = new int[index + 1];
        System.arraycopy(coefficients, 0, coefficients2, 0, Math.min(coefficients.length, coefficients2.length));
        this.index = index;
        coefficients = coefficients2;
    }

    int index;
    int[] coefficients;

    Polynomials(int[] arr) {
        this.coefficients = arr.clone();
        index = arr.length - 1;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(coefficients[0]);
        for (int i = 1; i < coefficients.length; i++) {
            if (coefficients[i] == 0) continue;
            if (coefficients[i] > 0)
                buffer.append(String.format("+%dx^%d", coefficients[i], i));
            else
                buffer.append(String.format("-%dx^%d", -coefficients[i], i));
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Polynomials polynomials = new Polynomials(new int[]{1, 1, 1, 1});
        System.out.println(polynomials.getValue(2));
        System.out.println(polynomials);
        polynomials.resize(10);
        System.out.println(polynomials);
        polynomials.resize(5);
        System.out.println(polynomials);
        Polynomials polynomials2 = new Polynomials(new int[]{1, 1, 1, 1});
        System.out.println(polynomials.add(polynomials2));
        System.out.println(polynomials.substract(polynomials2));
        System.out.println(polynomials.multiply(polynomials2).getValue(10));

    }

    private Polynomials multiply(Polynomials that) {
        int[] coeff = new int[(this.index + 1) * (that.index + 1)];
        for (int i = 0; i < this.coefficients.length; i++)
            for (int j = 0; j < that.coefficients.length; j++)
                coeff[i + j] += this.coefficients[i] * that.coefficients[j];
        return new Polynomials(coeff);
    }


    private Polynomials add(Polynomials that) {
        int maxIndex = Math.max(this.index, that.index);
        int[] coeff = new int[maxIndex + 1];
        for (int i = 0; i <= this.index; i++)
            coeff[i] += this.coefficients[i];
        for (int i = 0; i <= that.index; i++)
            coeff[i] += that.coefficients[i];
        return new Polynomials(coeff);
    }

    private Polynomials substract(Polynomials that) {
        int maxIndex = Math.max(this.index, that.index);
        int[] coeff = new int[maxIndex + 1];
        for (int i = 0; i <= this.index; i++)
            coeff[i] += this.coefficients[i];
        for (int i = 0; i <= that.index; i++)
            coeff[i] -= that.coefficients[i];
        return new Polynomials(coeff);
    }

    public int getValue(int x) {
        int s = coefficients[index];
        for (int i = index - 1; i >= 0; i--) {
            s = s * x + coefficients[i];
        }
        return s;
    }
}