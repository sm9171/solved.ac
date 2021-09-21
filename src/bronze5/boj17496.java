package bronze5;


import java.util.Scanner;

public class boj17496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(((a-1)/b)*c*d);
    }
}

