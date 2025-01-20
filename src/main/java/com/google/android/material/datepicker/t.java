package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class t {
    public static final AtomicReference a;

    static {
        t.a = new AtomicReference();
    }

    public static Calendar a(Calendar calendar0) {
        Calendar calendar1 = t.c(calendar0);
        Calendar calendar2 = t.c(null);
        calendar2.set(calendar1.get(1), calendar1.get(2), calendar1.get(5));
        return calendar2;
    }

    public static Calendar b() {
        s s0 = (s)t.a.get();
        Calendar calendar0 = Calendar.getInstance();
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        calendar0.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar0;
    }

    public static Calendar c(Calendar calendar0) {
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if(calendar0 == null) {
            calendar1.clear();
            return calendar1;
        }
        calendar1.setTimeInMillis(calendar0.getTimeInMillis());
        return calendar1;
    }
}

