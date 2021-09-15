package bronze5;

import java.util.Scanner;

public class boj14652 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(num3/num2);
        System.out.println(num3-(num2*(num3/num2)));
    }
}

