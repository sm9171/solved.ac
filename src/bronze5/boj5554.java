package bronze5;

import java.util.Scanner;

public class boj5554 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int min = (num1+num2+num3+num4)/60;
        int sec = (num1+num2+num3+num4)%60;
        System.out.println(min);
        System.out.println(sec);
    }
}

