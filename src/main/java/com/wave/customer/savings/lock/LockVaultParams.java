package com.wave.customer.savings.lock;

import Ca.h;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.FragmentHandle;

public final class LockVaultParams implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final FragmentHandle X;

    static {
        LockVaultParams.CREATOR = new h();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public LockVaultParams(FragmentHandle fragmentHandle0) {
        j.f(fragmentHandle0, "savingsHandle");
        super();
        this.X = fragmentHandle0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LockVaultParams ? j.a(this.X, ((LockVaultParams)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.X.hashCode();
    }

    @Override
    public final String toString() {
        return "LockVaultParams(savingsHandle=" + this.X + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeParcelable(this.X, v);
    }
}

