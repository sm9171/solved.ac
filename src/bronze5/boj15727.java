package bronze5;

import java.util.Scanner;

public class boj15727 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a%5!=0){
            System.out.println(a/5+1);
        }else{
            System.out.println(a/5);
        }
    }
}

