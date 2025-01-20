package com.google.firebase.perf.metrics;

import C2.a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final AtomicLong Y;

    static {
        Counter.CREATOR = new a(16);
    }

    public Counter(Parcel parcel0) {
        this.X = parcel0.readString();
        this.Y = new AtomicLong(parcel0.readLong());
    }

    public Counter(String s) {
        this.X = s;
        this.Y = new AtomicLong(0L);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.X);
        parcel0.writeLong(this.Y.get());
    }
}

