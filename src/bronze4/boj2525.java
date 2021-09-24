package bronze4;

import java.util.Scanner;

public class boj2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int hour = a+(b+c)/60;
        if(hour>=24){
            hour = hour % 24;
        }
        int min = b+c;
        if(min>=60){
            min = (b+c)%60;
        }
        System.out.println(hour);
        System.out.println(min);
    }
}
