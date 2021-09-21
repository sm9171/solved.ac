package bronze5;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class boj16170 {
    public static void main(String[] args) {
        SimpleDateFormat year = new SimpleDateFormat( "yyyy");
        SimpleDateFormat month = new SimpleDateFormat( "MM");
        SimpleDateFormat day = new SimpleDateFormat( "dd");

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR,-9);
        Date time = cal.getTime();

        System.out.println(year.format(time));
        System.out.println(month.format(time));
        System.out.println(day.format(time));
    }
}

