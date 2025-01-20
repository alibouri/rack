package com.google.android.gms.cloudmessaging;

import J5.b;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class zzd implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Messenger X;

    static {
        zzd.CREATOR = new b(1);
    }

    public zzd(IBinder iBinder0) {
        this.X = new Messenger(iBinder0);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        try {
            this.X.getClass();
            IBinder iBinder0 = this.X.getBinder();
            ((zzd)object0).X.getClass();
            return iBinder0.equals(((zzd)object0).X.getBinder());
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        this.X.getClass();
        return this.X.getBinder().hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.X.getClass();
        parcel0.writeStrongBinder(this.X.getBinder());
    }
}

