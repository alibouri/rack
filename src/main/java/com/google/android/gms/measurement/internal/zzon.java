package com.google.android.gms.measurement.internal;

import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;
import j6.p1;

public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final String Y;
    public final long Z;
    public final Long b0;
    public final String c0;
    public final String d0;
    public final Double e0;

    static {
        zzon.CREATOR = new c(5);
    }

    public zzon(int v, String s, long v1, Long long0, Float float0, String s1, String s2, Double double0) {
        this.X = v;
        this.Y = s;
        this.Z = v1;
        this.b0 = long0;
        if(v == 1) {
            this.e0 = float0 == null ? null : float0.doubleValue();
        }
        else {
            this.e0 = double0;
        }
        this.c0 = s1;
        this.d0 = s2;
    }

    public zzon(long v, Object object0, String s, String s1) {
        r.f(s);
        this.X = 2;
        this.Y = s;
        this.Z = v;
        this.d0 = s1;
        if(object0 == null) {
            this.b0 = null;
            this.e0 = null;
            this.c0 = null;
            return;
        }
        if(object0 instanceof Long) {
            this.b0 = (Long)object0;
            this.e0 = null;
            this.c0 = null;
            return;
        }
        if(object0 instanceof String) {
            this.b0 = null;
            this.e0 = null;
            this.c0 = (String)object0;
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.b0 = null;
        this.e0 = (Double)object0;
        this.c0 = null;
    }

    public zzon(p1 p10) {
        this(p10.d, p10.e, p10.c, p10.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.F(parcel0, 2, this.Y);
        f.K(parcel0, 3, 8);
        parcel0.writeLong(this.Z);
        Long long0 = this.b0;
        if(long0 != null) {
            f.K(parcel0, 4, 8);
            parcel0.writeLong(((long)long0));
        }
        f.F(parcel0, 6, this.c0);
        f.F(parcel0, 7, this.d0);
        Double double0 = this.e0;
        if(double0 != null) {
            f.K(parcel0, 8, 8);
            parcel0.writeDouble(((double)double0));
        }
        f.J(v1, parcel0);
    }

    public final Object zza() {
        Object object0 = this.b0;
        if(object0 != null) {
            return object0;
        }
        Object object1 = this.e0;
        if(object1 != null) {
            return object1;
        }
        return this.c0 == null ? null : this.c0;
    }
}

