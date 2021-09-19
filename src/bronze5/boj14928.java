package bronze5;

import java.util.Scanner;

//https://sseambong.tistory.com/289 내용 참고
public class boj14928 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        long temp = 0;
        for (int i = 0; i < input.length(); i++) {
            temp = (temp * 10 + (input.charAt(i) - '0')) % 20000303;
        }
        System.out.println(temp);
    }
}

