package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class DateValidatorPointForward implements DateValidator {
    public static final Parcelable.Creator CREATOR;
    public final long X;

    static {
        DateValidatorPointForward.CREATOR = new m(1);
    }

    public DateValidatorPointForward(long v) {
        this.X = v;
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
        return object0 instanceof DateValidatorPointForward ? this.X == ((DateValidatorPointForward)object0).X : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.X)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.X);
    }
}

