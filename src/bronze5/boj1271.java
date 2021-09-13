package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class boj1271 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger num1 = scan.nextBigInteger();
        BigInteger num2 = scan.nextBigInteger();

        System.out.println(num1.divide(num2));
        System.out.println(num1.mod(num2));
    }
}
