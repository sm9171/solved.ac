package bronze4;

import java.util.Scanner;

public class boj1297 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        long diag = a * a;
        long height = b * b;
        long width = c * c;

        double ratio = (double) diag / (double) (height + width);
        System.out.println((int)Math.sqrt(ratio * height));
        System.out.println((int)Math.sqrt(ratio*width));
    }
}
