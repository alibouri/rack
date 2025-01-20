package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.q;
import d6.s;
import g6.d;
import g6.e;
import g6.f;
import g6.h;

@Deprecated
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final zzeg Y;
    public final h Z;
    public final e b0;
    public final PendingIntent c0;
    public final s d0;
    public final String e0;

    static {
        zzei.CREATOR = new a(12);
    }

    public zzei(int v, zzeg zzeg0, IBinder iBinder0, IBinder iBinder1, PendingIntent pendingIntent0, IBinder iBinder2, String s) {
        e e0;
        h h0;
        this.X = v;
        this.Y = zzeg0;
        s s1 = null;
        if(iBinder0 == null) {
            h0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            h0 = iInterface0 instanceof h ? ((h)iInterface0) : new f(iBinder0, "com.google.android.gms.location.ILocationListener", 4);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
        }
        this.Z = h0;
        this.c0 = pendingIntent0;
        if(iBinder1 == null) {
            e0 = null;
        }
        else {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            e0 = iInterface1 instanceof e ? ((e)iInterface1) : new d(iBinder1, "com.google.android.gms.location.ILocationCallback", 4);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
        }
        this.b0 = e0;
        if(iBinder2 != null) {
            IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            s1 = iInterface2 instanceof s ? ((s)iInterface2) : new q(iBinder2, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 4);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
        }
        this.d0 = s1;
        this.e0 = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = R2.f.I(0x4F45, parcel0);
        R2.f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        R2.f.E(parcel0, 2, this.Y, v);
        IBinder iBinder0 = null;
        R2.f.D(parcel0, 3, (this.Z == null ? null : this.Z.asBinder()));
        R2.f.E(parcel0, 4, this.c0, v);
        R2.f.D(parcel0, 5, (this.b0 == null ? null : this.b0.asBinder()));
        s s0 = this.d0;
        if(s0 != null) {
            iBinder0 = s0.asBinder();
        }
        R2.f.D(parcel0, 6, iBinder0);
        R2.f.F(parcel0, 8, this.e0);
        R2.f.J(v1, parcel0);
    }
}

