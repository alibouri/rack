package com.google.android.gms.location;

import M.J;
import N5.r;
import S5.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.os.WorkSource;
import android.support.v4.media.a;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zze;
import d6.k;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int X;
    public long Y;
    public long Z;
    public final long b0;
    public final long c0;
    public final int d0;
    public final float e0;
    public final boolean f0;
    public long g0;
    public final int h0;
    public final int i0;
    public final boolean j0;
    public final WorkSource k0;
    public final zze l0;

    static {
        LocationRequest.CREATOR = new a(20);
    }

    public LocationRequest(int v, long v1, long v2, long v3, long v4, long v5, int v6, float f, boolean z, long v7, int v8, int v9, boolean z1, WorkSource workSource0, zze zze0) {
        long v10;
        this.X = v;
        if(v == 105) {
            this.Y = 0x7FFFFFFFFFFFFFFFL;
            v10 = v1;
        }
        else {
            v10 = v1;
            this.Y = v10;
        }
        this.Z = v2;
        this.b0 = v3;
        this.c0 = v4 == 0x7FFFFFFFFFFFFFFFL ? v5 : Math.min(Math.max(1L, v4 - SystemClock.elapsedRealtime()), v5);
        this.d0 = v6;
        this.e0 = f;
        this.f0 = z;
        if(v7 != -1L) {
            v10 = v7;
        }
        this.g0 = v10;
        this.h0 = v8;
        this.i0 = v9;
        this.j0 = z1;
        this.k0 = workSource0;
        this.l0 = zze0;
    }

    // Deobfuscation rating: MEDIUM(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof LocationRequest && (this.X == ((LocationRequest)object0).X && (this.X == 105 || this.Y == ((LocationRequest)object0).Y) && this.Z == ((LocationRequest)object0).Z && this.l() == ((LocationRequest)object0).l() && (!this.l() || this.b0 == ((LocationRequest)object0).b0) && this.c0 == ((LocationRequest)object0).c0 && this.d0 == ((LocationRequest)object0).d0 && this.e0 == ((LocationRequest)object0).e0 && this.f0 == ((LocationRequest)object0).f0 && this.h0 == ((LocationRequest)object0).h0 && this.i0 == ((LocationRequest)object0).i0 && this.j0 == ((LocationRequest)object0).j0 && this.k0.equals(((LocationRequest)object0).k0) && r.m(this.l0, ((LocationRequest)object0).l0));
    }

    public static LocationRequest g() {
        new WorkSource();
        return new LocationRequest(102, 3600000L, 600000L, 0L, 0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFF, 0.0f, true, 3600000L, 0, 0, false, null, null);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.X), ((long)this.Y), ((long)this.Z), this.k0});
    }

    public final boolean l() {
        return this.b0 > 0L && this.b0 >> 1 >= this.Y;
    }

    public final void o() {
        long v = this.Y;
        if(this.Z == v / 6L) {
            this.Z = 20000L;
        }
        if(Long.compare(this.g0, v) == 0) {
            this.g0 = 120000L;
        }
        this.Y = 120000L;
    }

    public static String r(long v) {
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            return "∞";
        }
        StringBuilder stringBuilder0 = k.b;
        synchronized(stringBuilder0) {
            stringBuilder0.setLength(0);
            k.a(v, stringBuilder0);
        }
        return stringBuilder0.toString();
    }

    @Override
    public final String toString() {
        int v5;
        String s1;
        String s;
        StringBuilder stringBuilder0 = J.i("Request[");
        boolean z = false;
        long v = this.b0;
        if(this.X == 105) {
            stringBuilder0.append("PASSIVE");
            if(v > 0L) {
                stringBuilder0.append("/");
                k.a(v, stringBuilder0);
            }
        }
        else {
            stringBuilder0.append("@");
            if(this.l()) {
                k.a(this.Y, stringBuilder0);
                stringBuilder0.append("/");
                k.a(v, stringBuilder0);
            }
            else {
                k.a(this.Y, stringBuilder0);
            }
            stringBuilder0.append(" ");
            stringBuilder0.append(U5.a.Z(this.X));
        }
        if(this.X == 105 || this.Z != this.Y) {
            stringBuilder0.append(", minUpdateInterval=");
            stringBuilder0.append(LocationRequest.r(this.Z));
        }
        float f = this.e0;
        if(((double)f) > 0.0) {
            stringBuilder0.append(", minUpdateDistance=");
            stringBuilder0.append(f);
        }
        if(this.X != 105) {
            if(this.g0 != this.Y) {
                stringBuilder0.append(", maxUpdateAge=");
                stringBuilder0.append(LocationRequest.r(this.g0));
            }
        }
        else if(this.g0 != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append(", maxUpdateAge=");
            stringBuilder0.append(LocationRequest.r(this.g0));
        }
        long v1 = this.c0;
        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append(", duration=");
            k.a(v1, stringBuilder0);
        }
        int v2 = this.d0;
        if(v2 != 0x7FFFFFFF) {
            stringBuilder0.append(", maxUpdates=");
            stringBuilder0.append(v2);
        }
        int v3 = this.i0;
        if(v3 != 0) {
            stringBuilder0.append(", ");
            switch(v3) {
                case 1: {
                    s = "THROTTLE_ALWAYS";
                    break;
                }
                case 2: {
                    s = "THROTTLE_NEVER";
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            stringBuilder0.append(s);
        }
        int v4 = this.h0;
        if(v4 != 0) {
            stringBuilder0.append(", ");
            switch(v4) {
                case 1: {
                    s1 = "GRANULARITY_COARSE";
                    break;
                }
                case 2: {
                    s1 = "GRANULARITY_FINE";
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            stringBuilder0.append(s1);
        }
        if(this.f0) {
            stringBuilder0.append(", waitForAccurateLocation");
        }
        if(this.j0) {
            stringBuilder0.append(", bypass");
        }
        Method method0 = f.d;
        WorkSource workSource0 = this.k0;
        if(method0 == null) {
        label_72:
            Method method1 = f.c;
            if(method1 == null) {
                v5 = 0;
            }
            else {
                try {
                    Object object1 = method1.invoke(workSource0, null);
                    r.j(object1);
                    v5 = (int)(((Integer)object1));
                }
                catch(Exception exception1) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception1);
                    v5 = 0;
                }
            }
            if(v5 == 0) {
                z = true;
            }
        }
        else {
            try {
                Object object0 = method0.invoke(workSource0, null);
                r.j(object0);
                z = ((Boolean)object0).booleanValue();
            }
            catch(Exception exception0) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", exception0);
                goto label_72;
            }
        }
        if(!z) {
            stringBuilder0.append(", ");
            stringBuilder0.append(workSource0);
        }
        zze zze0 = this.l0;
        if(zze0 != null) {
            stringBuilder0.append(", impersonation=");
            stringBuilder0.append(zze0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = R2.f.I(0x4F45, parcel0);
        int v2 = this.X;
        R2.f.K(parcel0, 1, 4);
        parcel0.writeInt(v2);
        long v3 = this.Y;
        R2.f.K(parcel0, 2, 8);
        parcel0.writeLong(v3);
        long v4 = this.Z;
        R2.f.K(parcel0, 3, 8);
        parcel0.writeLong(v4);
        R2.f.K(parcel0, 6, 4);
        parcel0.writeInt(this.d0);
        R2.f.K(parcel0, 7, 4);
        parcel0.writeFloat(this.e0);
        R2.f.K(parcel0, 8, 8);
        parcel0.writeLong(this.b0);
        R2.f.K(parcel0, 9, 4);
        parcel0.writeInt(((int)this.f0));
        R2.f.K(parcel0, 10, 8);
        parcel0.writeLong(this.c0);
        long v5 = this.g0;
        R2.f.K(parcel0, 11, 8);
        parcel0.writeLong(v5);
        R2.f.K(parcel0, 12, 4);
        parcel0.writeInt(this.h0);
        R2.f.K(parcel0, 13, 4);
        parcel0.writeInt(this.i0);
        R2.f.K(parcel0, 15, 4);
        parcel0.writeInt(((int)this.j0));
        R2.f.E(parcel0, 16, this.k0, v);
        R2.f.E(parcel0, 17, this.l0, v);
        R2.f.J(v1, parcel0);
    }
}

