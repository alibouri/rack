package com.google.android.gms.common.internal;

import C2.a;
import N5.B;
import N5.g;
import N5.r;
import R2.f;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final IBinder Y;
    public final ConnectionResult Z;
    public final boolean b0;
    public final boolean c0;

    static {
        zav.CREATOR = new a(22);
    }

    public zav(int v, IBinder iBinder0, ConnectionResult connectionResult0, boolean z, boolean z1) {
        this.X = v;
        this.Y = iBinder0;
        this.Z = connectionResult0;
        this.b0 = z;
        this.c0 = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        g g0;
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zav)) {
            return false;
        }
        if(this.Z.equals(((zav)object0).Z)) {
            Object object1 = null;
            IBinder iBinder0 = this.Y;
            if(iBinder0 == null) {
                g0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                g0 = iInterface0 instanceof g ? ((g)iInterface0) : new B(iBinder0, "com.google.android.gms.common.internal.IAccountAccessor", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
            }
            IBinder iBinder1 = ((zav)object0).Y;
            if(iBinder1 != null) {
                IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if(iInterface1 instanceof g) {
                    return r.m(g0, ((g)iInterface1));
                }
                object1 = new B(iBinder1, "com.google.android.gms.common.internal.IAccountAccessor", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
            }
            return r.m(g0, object1);
        }
        return false;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.D(parcel0, 2, this.Y);
        f.E(parcel0, 3, this.Z, v);
        f.K(parcel0, 4, 4);
        parcel0.writeInt(((int)this.b0));
        f.K(parcel0, 5, 4);
        parcel0.writeInt(((int)this.c0));
        f.J(v1, parcel0);
    }
}

