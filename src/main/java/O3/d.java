package o3;

import android.support.v4.media.session.a;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class d implements Comparable {
    public int X;
    public int Y;
    public int Z;
    public int b0;
    public int c0;
    public int d0;
    public TimeZone e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;

    public d(GregorianCalendar gregorianCalendar0) {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = null;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        Date date0 = gregorianCalendar0.getTime();
        TimeZone timeZone0 = gregorianCalendar0.getTimeZone();
        GregorianCalendar gregorianCalendar1 = (GregorianCalendar)Calendar.getInstance(Locale.US);
        gregorianCalendar1.setGregorianChange(new Date(0x8000000000000000L));
        gregorianCalendar1.setTimeZone(timeZone0);
        gregorianCalendar1.setTime(date0);
        this.X = gregorianCalendar1.get(1);
        this.Y = gregorianCalendar1.get(2) + 1;
        this.Z = gregorianCalendar1.get(5);
        this.b0 = gregorianCalendar1.get(11);
        this.c0 = gregorianCalendar1.get(12);
        this.d0 = gregorianCalendar1.get(13);
        this.f0 = gregorianCalendar1.get(14) * 1000000;
        this.e0 = gregorianCalendar1.getTimeZone();
        this.i0 = true;
        this.h0 = true;
        this.g0 = true;
    }

    public final GregorianCalendar a() {
        GregorianCalendar gregorianCalendar0 = (GregorianCalendar)Calendar.getInstance(Locale.US);
        gregorianCalendar0.setGregorianChange(new Date(0x8000000000000000L));
        if(this.i0) {
            gregorianCalendar0.setTimeZone(this.e0);
        }
        gregorianCalendar0.set(1, this.X);
        gregorianCalendar0.set(2, this.Y - 1);
        gregorianCalendar0.set(5, this.Z);
        gregorianCalendar0.set(11, this.b0);
        gregorianCalendar0.set(12, this.c0);
        gregorianCalendar0.set(13, this.d0);
        gregorianCalendar0.set(14, this.f0 / 1000000);
        return gregorianCalendar0;
    }

    @Override
    public final int compareTo(Object object0) {
        long v = this.a().getTimeInMillis() - ((d)object0).a().getTimeInMillis();
        return v == 0L ? ((int)Math.signum(((long)(this.f0 - ((d)object0).f0)))) : ((int)Math.signum(v));
    }

    @Override
    public final String toString() {
        return a.K(this);
    }
}

