package bronze5;

import java.util.Scanner;

public class boj2475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for(int i =0;i<5;i++){
            int num = scan.nextInt();
            sum+=num*num;
        }
        int result = sum%10;
        System.out.println(result);

    }
}
