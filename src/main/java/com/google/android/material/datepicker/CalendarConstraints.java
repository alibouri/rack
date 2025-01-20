package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class CalendarConstraints implements Parcelable {
    public interface DateValidator extends Parcelable {
    }

    public static final Parcelable.Creator CREATOR;
    public final Month X;
    public final Month Y;
    public final DateValidator Z;
    public final Month b0;
    public final int c0;
    public final int d0;

    static {
        CalendarConstraints.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public CalendarConstraints(Month month0, Month month1, DateValidator calendarConstraints$DateValidator0, Month month2) {
        this.X = month0;
        this.Y = month1;
        this.b0 = month2;
        this.Z = calendarConstraints$DateValidator0;
        if(month2 != null && month0.X.compareTo(month2.X) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if(month2 != null && month2.b(month1) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.d0 = month0.j(month1) + 1;
        this.c0 = month1.Z - month0.Z + 1;
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
        return object0 instanceof CalendarConstraints ? this.X.equals(((CalendarConstraints)object0).X) && this.Y.equals(((CalendarConstraints)object0).Y) && Objects.equals(this.b0, ((CalendarConstraints)object0).b0) && this.Z.equals(((CalendarConstraints)object0).Z) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.b0, this.Z});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.X, 0);
        parcel0.writeParcelable(this.Y, 0);
        parcel0.writeParcelable(this.b0, 0);
        parcel0.writeParcelable(this.Z, 0);
    }
}

