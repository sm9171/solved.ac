package bronze5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class boj10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);

        System.out.println(format);
    }
}

