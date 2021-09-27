package bronze4;

import java.util.Scanner;

public class boj5543 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        System.out.println(Math.min(Math.min(a,b),c)+Math.min(d,e)-50);

    }
}
