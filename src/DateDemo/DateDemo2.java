package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "08/31/2023"; // MM/dd/yyyy

        System.out.println(dateStr);

        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println(date);

        String dateStr0= "23-June-2016" ;
        //→ dd-MMMM-yyyy
        System.out.println(dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);

        String dateStr1= "23 | June 16  8:34";
        //→ dd | MMMM yy h:mm
        System.out.println(dateStr1);

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy h:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);

        String dateStr2= "2016-06-23 | 8:34:23";
        //→ yyyy-MM-dd | h:mm:ss
        System.out.println(dateStr2);

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | h:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(date2);



    }
}
