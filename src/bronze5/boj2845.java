package bronze5;

import java.util.Scanner;

public class boj2845 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int realNum = num1*num2;
        for(int i=0;i<5;i++){
            int num = scan.nextInt();
            System.out.println(num-realNum);
        }

    }
}
