package com.google.android.gms.location;

import M.J;
import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zze;
import d6.k;
import java.util.Arrays;

public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long X;
    public final int Y;
    public final boolean Z;
    public final zze b0;

    static {
        LastLocationRequest.CREATOR = new a(18);
    }

    public LastLocationRequest(long v, int v1, boolean z, zze zze0) {
        this.X = v;
        this.Y = v1;
        this.Z = z;
        this.b0 = zze0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof LastLocationRequest ? this.X == ((LastLocationRequest)object0).X && this.Y == ((LastLocationRequest)object0).Y && this.Z == ((LastLocationRequest)object0).Z && r.m(this.b0, ((LastLocationRequest)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.X), ((int)this.Y), Boolean.valueOf(this.Z)});
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = J.i("LastLocationRequest[");
        long v = this.X;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append("maxAge=");
            k.a(v, stringBuilder0);
        }
        int v1 = this.Y;
        if(v1 != 0) {
            stringBuilder0.append(", ");
            switch(v1) {
                case 1: {
                    s = "GRANULARITY_COARSE";
                    break;
                }
                case 2: {
                    s = "GRANULARITY_FINE";
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            stringBuilder0.append(s);
        }
        if(this.Z) {
            stringBuilder0.append(", bypass");
        }
        zze zze0 = this.b0;
        if(zze0 != null) {
            stringBuilder0.append(", impersonation=");
            stringBuilder0.append(zze0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 8);
        parcel0.writeLong(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        f.E(parcel0, 5, this.b0, v);
        f.J(v1, parcel0);
    }
}

