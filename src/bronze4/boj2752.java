package bronze4;

import java.util.Scanner;

public class boj2752 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long imsi = 0L;

        if(a>b){
            imsi = a;
            a=b;
            b=imsi;
            imsi = 0;
        }

        if(b>c){
            imsi = c;
            c=b;
            b=imsi;
            imsi = 0;
        }

        if(a>b){
            imsi = a;
            a=b;
            b=imsi;
            imsi = 0;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
