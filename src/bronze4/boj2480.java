package bronze4;

import java.util.Scanner;

public class boj2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((a==b)&&(b==c)){
            System.out.println(10000+a*1000);
        }else if((a==b)||(b==c)){
            System.out.println(1000+b*100);
        }else if(a==c){
            System.out.println(1000+a*100);
        }else{
            System.out.println(Math.max(Math.max(a,b),c)*100);
        }
    }
}
