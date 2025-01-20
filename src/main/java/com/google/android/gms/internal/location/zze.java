package com.google.android.gms.internal.location;

import Nb.j;
import R2.f;
import Vb.q;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.o;
import d6.p;
import java.util.ArrayList;
import java.util.Arrays;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final String Y;
    public final String Z;
    public final String b0;
    public final o c0;
    public final zze d0;

    static {
        zze.CREATOR = new a(13);
        Process.myUid();
        Process.myPid();
    }

    public zze(int v, String s, String s1, String s2, ArrayList arrayList0, zze zze0) {
        j.f(s, "packageName");
        super();
        if(zze0 != null && zze0.d0 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.X = v;
        this.Y = s;
        this.Z = s1;
        o o0 = null;
        if(s2 == null) {
            s2 = zze0 == null ? null : zze0.b0;
        }
        this.b0 = s2;
        if(arrayList0 == null) {
            if(zze0 != null) {
                o0 = zze0.c0;
            }
            arrayList0 = o0;
            if(arrayList0 == null) {
                arrayList0 = p.c0;
                j.e(arrayList0, "of(...)");
            }
        }
        Object[] arr_object = arrayList0.toArray();
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            if(arr_object[v1] == null) {
                throw new NullPointerException("at index " + v1);
            }
        }
        p p0 = arr_object.length == 0 ? p.c0 : new p(arr_object.length, arr_object);
        j.e(p0, "copyOf(...)");
        this.c0 = p0;
        this.d0 = zze0;
    }

    // Deobfuscation rating: MEDIUM(60)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zze && this.X == ((zze)object0).X && j.a(this.Y, ((zze)object0).Y) && j.a(this.Z, ((zze)object0).Z) && j.a(this.b0, ((zze)object0).b0) && j.a(this.d0, ((zze)object0).d0) && j.a(this.c0, ((zze)object0).c0);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.X), this.Y, this.Z, this.b0, this.d0});
    }

    @Override
    public final String toString() {
        String s = this.Y;
        String s1 = this.Z;
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 18 + (s1 == null ? 0 : s1.length()));
        stringBuilder0.append(this.X);
        stringBuilder0.append("/");
        stringBuilder0.append(s);
        if(s1 != null) {
            stringBuilder0.append("[");
            if(q.O(s1, s, false)) {
                stringBuilder0.append(s1, s.length(), s1.length());
            }
            else {
                stringBuilder0.append(s1);
            }
            stringBuilder0.append("]");
        }
        String s2 = this.b0;
        if(s2 != null) {
            stringBuilder0.append("/");
            stringBuilder0.append(Integer.toHexString(s2.hashCode()));
        }
        String s3 = stringBuilder0.toString();
        j.e(s3, "toString(...)");
        return s3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.F(parcel0, 3, this.Y);
        f.F(parcel0, 4, this.Z);
        f.F(parcel0, 6, this.b0);
        f.E(parcel0, 7, this.d0, v);
        f.H(parcel0, 8, this.c0);
        f.J(v1, parcel0);
    }
}

