package com.google.android.gms.internal.location;

import N5.r;
import S5.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

@Deprecated
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final LocationRequest X;

    static {
        zzeg.CREATOR = new a(11);
    }

    public zzeg(LocationRequest locationRequest0, ArrayList arrayList0, boolean z, boolean z1, boolean z2, boolean z3, long v) {
        int v15;
        int v14;
        WorkSource workSource0;
        int v13;
        boolean z6;
        boolean z5;
        int v10;
        long v9;
        int v1 = locationRequest0.X;
        long v2 = locationRequest0.Y;
        r.a("intervalMillis must be greater than or equal to 0", v2 >= 0L);
        U5.a.Y(v1);
        long v3 = locationRequest0.Z;
        r.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", v3 == -1L || v3 >= 0L);
        long v4 = locationRequest0.b0;
        r.a("maxUpdateDelayMillis must be greater than or equal to 0", v4 >= 0L);
        long v5 = locationRequest0.c0;
        r.a("durationMillis must be greater than 0", v5 > 0L);
        int v6 = locationRequest0.d0;
        r.a("maxUpdates must be greater than 0", v6 > 0);
        float f = locationRequest0.e0;
        r.a("minUpdateDistanceMeters must be greater than or equal to 0", f >= 0.0f);
        boolean z4 = locationRequest0.f0;
        long v7 = locationRequest0.g0;
        r.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", v7 == -1L || v7 >= 0L);
        int v8 = locationRequest0.h0;
        if(v8 == 0) {
            v9 = v7;
            z5 = true;
            v10 = 0;
        }
        else {
            v9 = v7;
            switch(v8) {
                case 1: {
                    z5 = true;
                    v10 = 1;
                    break;
                }
                case 2: {
                    v10 = 2;
                    z5 = true;
                    break;
                }
                default: {
                    v10 = v8;
                    z5 = false;
                }
            }
        }
        int v11 = v8;
        r.c(z5, "granularity %d must be a Granularity.GRANULARITY_* constant", new Object[]{v10});
        int v12 = locationRequest0.i0;
        if(v12 == 0 || v12 == 1) {
            z6 = true;
            v13 = v12;
        }
        else if(v12 == 2) {
            z6 = true;
            v13 = 2;
        }
        else {
            v13 = v12;
            z6 = false;
        }
        r.c(z6, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", new Object[]{v13});
        zze zze0 = locationRequest0.l0;
        r.b(zze0 == null || zze0.d0 == null);
        if(arrayList0 == null) {
            v14 = v11;
            v15 = v12;
            workSource0 = locationRequest0.k0;
        }
        else {
            if(arrayList0.isEmpty()) {
                workSource0 = null;
            }
            else {
                workSource0 = new WorkSource();
                for(Object object0: arrayList0) {
                    f.a(workSource0, ((ClientIdentity)object0).X, ((ClientIdentity)object0).Y);
                    v12 = v12;
                    v11 = v11;
                }
            }
            v14 = v11;
            v15 = v12;
        }
        if(z) {
            v14 = 1;
        }
        boolean z7 = z2 ? true : locationRequest0.j0;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            r.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", v == -1L || v >= 0L);
            v9 = v;
        }
        if(v3 == -1L) {
            v3 = v2;
        }
        else if(v1 != 105) {
            v3 = Math.min(v3, v2);
        }
        new WorkSource(workSource0);
        new LocationRequest(v1, v2, v3, Math.max(v4, v2), 0x7FFFFFFFFFFFFFFFL, v5, v6, f, (z3 ? true : z4), (v9 == -1L ? v2 : v9), v14, (z1 ? 2 : v15), z7, null, zze0);
        this.X = null;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzeg ? r.m(this.X, ((zzeg)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return this.X.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = R2.f.I(0x4F45, parcel0);
        R2.f.E(parcel0, 1, this.X, v);
        R2.f.J(v1, parcel0);
    }
}

