package bronze4;

import java.util.Scanner;

public class boj5596 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        int g = scan.nextInt();
        int h = scan.nextInt();

        int minkuk = a+b+c+d;
        int manse = e+f+g+h;

        if(manse>minkuk){
            System.out.println(manse);
        }else{
            System.out.println(minkuk);
        }
    }

}
