package bronze4;

import java.util.Scanner;

public class boj4299 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int x = (a+b)/2;
        int y = (a-b)/2;

        if(a-b<0){
            System.out.println(-1);
        }else if((a-b)%2==0){
            System.out.println(x);
            System.out.println(y);
        }else{
            System.out.println(-1);
        }
    }
}
