package bronze5;

import java.util.Scanner;

public class boj1550 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hexInput = scan.next();
        int decimal = Integer.parseInt(hexInput,16);
        System.out.println(decimal);
    }
}
