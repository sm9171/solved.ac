package bronze4;

import java.util.Scanner;

public class boj5532 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        Double A = scan.nextDouble();
        Double B = scan.nextDouble();
        Double C = scan.nextDouble();
        Double D = scan.nextDouble();
        System.out.println((int)(L-Math.ceil(Math.max(A/C,B/D))));
    }
}
