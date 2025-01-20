package com.google.android.material.datepicker;

import java.util.Calendar;

public final class b {
    public Long a;
    public static final int b;

    static {
        Month month0 = Month.c(1900, 0);
        Calendar calendar0 = t.c(null);
        calendar0.setTimeInMillis(month0.d0);
        t.a(calendar0).getTimeInMillis();
        Month month1 = Month.c(2100, 11);
        Calendar calendar1 = t.c(null);
        calendar1.setTimeInMillis(month1.d0);
        t.a(calendar1).getTimeInMillis();
    }
}

