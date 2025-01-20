package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

final class Month implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final Calendar X;
    public final int Y;
    public final int Z;
    public final int b0;
    public final int c0;
    public final long d0;
    public String e0;

    static {
        Month.CREATOR = new m(0);
    }

    public Month(Calendar calendar0) {
        calendar0.set(5, 1);
        Calendar calendar1 = t.a(calendar0);
        this.X = calendar1;
        this.Y = calendar1.get(2);
        this.Z = calendar1.get(1);
        this.b0 = calendar1.getMaximum(7);
        this.c0 = calendar1.getActualMaximum(5);
        this.d0 = calendar1.getTimeInMillis();
    }

    public final int b(Month month0) {
        return this.X.compareTo(month0.X);
    }

    public static Month c(int v, int v1) {
        Calendar calendar0 = t.c(null);
        calendar0.set(1, v);
        calendar0.set(2, v1);
        return new Month(calendar0);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.b(((Month)object0));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Month ? this.Y == ((Month)object0).Y && this.Z == ((Month)object0).Z : false;
    }

    public static Month f(long v) {
        Calendar calendar0 = t.c(null);
        calendar0.setTimeInMillis(v);
        return new Month(calendar0);
    }

    public final int g() {
        int v = this.X.get(7) - this.X.getFirstDayOfWeek();
        return v >= 0 ? v : v + this.b0;
    }

    public final String h(Context context0) {
        if(this.e0 == null) {
            long v = this.X.getTimeInMillis();
            this.e0 = DateUtils.formatDateTime(context0, v - ((long)TimeZone.getDefault().getOffset(v)), 36);
        }
        return this.e0;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.Y), ((int)this.Z)});
    }

    public final int j(Month month0) {
        if(!(this.X instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return month0.Y - this.Y + (month0.Z - this.Z) * 12;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.Z);
        parcel0.writeInt(this.Y);
    }
}

