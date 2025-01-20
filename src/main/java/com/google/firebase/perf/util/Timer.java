package com.google.firebase.perf.util;

import C2.a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public long X;
    public long Y;

    static {
        Timer.CREATOR = new a(28);
    }

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public Timer(long v, long v1) {
        this.X = v;
        this.Y = v1;
    }

    public final long b() {
        return new Timer().Y - this.Y;
    }

    public final long c(Timer timer0) {
        return timer0.Y - this.Y;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long f() {
        return this.X;
    }

    public final void g() {
        this.X = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.Y = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.X);
        parcel0.writeLong(this.Y);
    }
}

