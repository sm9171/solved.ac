package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class boj15894 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = scan.nextBigInteger();
        System.out.println(num1.multiply(BigInteger.valueOf(4)));
    }
}

