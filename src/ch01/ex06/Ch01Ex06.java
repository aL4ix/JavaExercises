package ch01.ex06;

import java.math.BigInteger;

public class Ch01Ex06 {
    public static BigInteger factorial(long num) {
        BigInteger result = BigInteger.valueOf(num);
        for (long i = num - 1; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Ch01Ex06 Factorial of 1000");
        System.out.println(factorial(1000));
    }
}
