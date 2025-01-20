package com.google.android.gms.common.internal;

import C2.a;
import N5.B;
import N5.g;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final int Z;
    public String b0;
    public IBinder c0;
    public Scope[] d0;
    public Bundle e0;
    public Account f0;
    public Feature[] g0;
    public Feature[] h0;
    public final boolean i0;
    public final int j0;
    public boolean k0;
    public final String l0;
    public static final Scope[] m0;
    public static final Feature[] n0;

    static {
        GetServiceRequest.CREATOR = new a(26);
        GetServiceRequest.m0 = new Scope[0];
        GetServiceRequest.n0 = new Feature[0];
    }

    public GetServiceRequest(int v, int v1, int v2, String s, IBinder iBinder0, Scope[] arr_scope, Bundle bundle0, Account account0, Feature[] arr_feature, Feature[] arr_feature1, boolean z, int v3, boolean z1, String s1) {
        Account account2;
        Scope[] arr_scope1 = arr_scope == null ? GetServiceRequest.m0 : arr_scope;
        Bundle bundle1 = bundle0 == null ? new Bundle() : bundle0;
        Feature[] arr_feature2 = GetServiceRequest.n0;
        Feature[] arr_feature3 = arr_feature == null ? arr_feature2 : arr_feature;
        if(arr_feature1 != null) {
            arr_feature2 = arr_feature1;
        }
        this.X = v;
        this.Y = v1;
        this.Z = v2;
        this.b0 = "com.google.android.gms".equals(s) ? "com.google.android.gms" : s;
        Account account1 = null;
        if(v >= 2) {
            this.c0 = iBinder0;
            account1 = account0;
        }
        else if(iBinder0 != null) {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            g g0 = iInterface0 instanceof g ? ((g)iInterface0) : new B(iBinder0, "com.google.android.gms.common.internal.IAccountAccessor", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
            if(g0 != null) {
                long v4 = Binder.clearCallingIdentity();
                try {
                    Parcel parcel0 = ((B)g0).e(2, ((B)g0).J());
                    account2 = (Account)c6.a.a(parcel0, Account.CREATOR);
                    parcel0.recycle();
                }
                catch(RemoteException unused_ex) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                    goto label_39;
                }
                finally {
                    Binder.restoreCallingIdentity(v4);
                }
                account1 = account2;
            }
        }
    label_39:
        this.f0 = account1;
        this.d0 = arr_scope1;
        this.e0 = bundle1;
        this.g0 = arr_feature3;
        this.h0 = arr_feature2;
        this.i0 = z;
        this.j0 = v3;
        this.k0 = z1;
        this.l0 = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        a.a(this, parcel0, v);
    }
}

