package bronze4;

import java.util.Scanner;

public class boj3004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2!=1) { 		// 짝수의 경우
            num = num/2;
            num = num+1;
            num*=num;

            System.out.println(num);
        }else { 			// 홀수의 경우
            int row = ((num-1)/2)+1;
            int col = ((num+1)/2)+1;

            System.out.println(row*col);
        }
    }
}
