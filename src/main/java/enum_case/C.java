package enum_case;

import java.math.BigInteger;

public class C {
    public static void main(String[] args) {
        BigInteger c = c(8, 4);
        BigInteger c1 = c(8, 5);
        BigInteger c2 = c(8, 3);
        BigInteger multiply = c.multiply(c1).multiply(c2);
        BigInteger c3 = c(24, 8);
        double v = c3.doubleValue();
        double v1 = multiply.doubleValue();
        System.out.println(v1 * 3 / v);
    }

    public static BigInteger c(int m, int n) {
        BigInteger up = new BigInteger("1");
        for (int i = m; i >= (m - n + 1); i--) {
            up = up.multiply(new BigInteger(String.valueOf(i)));
        }
        BigInteger down = new BigInteger("1");
        for (int i = n; i >= 1; i--) {
            down = down.multiply(new BigInteger(String.valueOf(i)));
        }
        return up.divide(down);
    }
}
