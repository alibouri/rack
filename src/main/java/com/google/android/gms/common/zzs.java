package com.google.android.gms.common;

import C2.a;
import K5.l;
import N5.C;
import N5.m;
import R2.f;
import V5.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final l Y;
    public final boolean Z;
    public final boolean b0;

    static {
        zzs.CREATOR = new a(9);
    }

    public zzs(String s, l l0, boolean z, boolean z1) {
        this.X = s;
        this.Y = l0;
        this.Z = z;
        this.b0 = z1;
    }

    public zzs(String s, IBinder iBinder0, boolean z, boolean z1) {
        V5.a a0;
        this.X = s;
        l l0 = null;
        if(iBinder0 != null) {
            try {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                m m0 = iInterface0 instanceof m ? ((m)iInterface0) : new C(iBinder0, "com.google.android.gms.common.internal.ICertData", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
                a0 = m0.a();
            }
            catch(RemoteException remoteException0) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", remoteException0);
                this.Y = l0;
                this.Z = z;
                this.b0 = z1;
                return;
            }
            byte[] arr_b = a0 == null ? null : ((byte[])b.O(a0));
            if(arr_b == null) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            }
            else {
                l0 = new l(arr_b);
            }
        }
        this.Y = l0;
        this.Z = z;
        this.b0 = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 1, this.X);
        l l0 = this.Y;
        if(l0 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            l0 = null;
        }
        f.D(parcel0, 2, l0);
        f.K(parcel0, 3, 4);
        parcel0.writeInt(((int)this.Z));
        f.K(parcel0, 4, 4);
        parcel0.writeInt(((int)this.b0));
        f.J(v1, parcel0);
    }
}

