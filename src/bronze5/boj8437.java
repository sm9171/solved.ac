package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class boj8437 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = scan.nextBigInteger();
        BigInteger num2 = scan.nextBigInteger();

        System.out.println(num1.add(num2).divide(BigInteger.valueOf(2)));
        System.out.println(num1.subtract(num2).divide(BigInteger.valueOf(2)));
    }
}

