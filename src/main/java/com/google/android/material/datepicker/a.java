package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return new CalendarConstraints(((Month)parcel0.readParcelable(Month.class.getClassLoader())), ((Month)parcel0.readParcelable(Month.class.getClassLoader())), ((DateValidator)parcel0.readParcelable(DateValidator.class.getClassLoader())), ((Month)parcel0.readParcelable(Month.class.getClassLoader())));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CalendarConstraints[v];
    }
}

