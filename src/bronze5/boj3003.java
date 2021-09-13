package bronze5;

import java.util.Scanner;

public class boj3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] orgArr = {1,1,2,2,2,8};
        for(int i=0;i<orgArr.length;i++) {
            int num = scan.nextInt();
            System.out.println(orgArr[i] - num);
        }
    }
}
