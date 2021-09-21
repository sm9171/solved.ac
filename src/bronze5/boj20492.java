package bronze5;


import java.util.Scanner;

public class boj20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println((int)(a*0.78));
        System.out.println((int)(a*0.8+a*0.2*0.78));
    }
}