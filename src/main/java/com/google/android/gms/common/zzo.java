package com.google.android.gms.common;

import C2.a;
import R2.f;
import V5.b;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final boolean Y;
    public final boolean Z;
    public final Context b0;
    public final boolean c0;
    public final boolean d0;

    static {
        zzo.CREATOR = new a(7);
    }

    public zzo(String s, boolean z, boolean z1, IBinder iBinder0, boolean z2, boolean z3) {
        this.X = s;
        this.Y = z;
        this.Z = z1;
        this.b0 = (Context)b.O(b.N(iBinder0));
        this.c0 = z2;
        this.d0 = z3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 1, this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(((int)this.Y));
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        f.D(parcel0, 4, new b(this.b0));
        f.K(parcel0, 5, 4);
        parcel0.writeInt(((int)this.c0));
        f.K(parcel0, 6, 4);
        parcel0.writeInt(((int)this.d0));
        f.J(v1, parcel0);
    }
}

