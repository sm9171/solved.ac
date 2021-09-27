package bronze4;

import java.util.Scanner;

public class boj5575 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i =0;i<3;i++) {
            int sh = scan.nextInt();
            int sm = scan.nextInt();
            int ss = scan.nextInt();
            int eh = scan.nextInt();
            int em = scan.nextInt();
            int es = scan.nextInt();

            if (es  < ss) {
                em -= 1;
                es = 60 + es - ss;
            } else {
                es = es - ss;
            }

            if (em  < sm) {
                eh -= 1;
                em = 60 + em - sm;
            } else {
                em = em - sm;
            }
            eh = eh - sh;

            System.out.println(eh);
            System.out.println(em);
            System.out.println(es);
        }
    }

}
