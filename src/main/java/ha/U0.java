package ha;

import Nb.j;
import java.util.Date;
import q9.r1;

public final class u0 {
    public static String a(Date date0, Date date1) {
        j.f(date1, "now");
        if(date0.getYear() != date1.getYear()) {
            return r1.d(0x7F12028A, new Object[]{date0});  // string:month_day_and_year "%1$tb %1$td, %1$tY"
        }
        return date0.getMonth() == date1.getMonth() ? r1.d(0x7F120289, new Object[]{date0}) : r1.d(0x7F120288, new Object[]{date0});  // string:month_day_and_time "%1$tb %1$td, %1$tR"
    }
}

