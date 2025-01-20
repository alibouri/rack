package a5;

import Nb.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class a implements IInterface {
    public final IBinder d;

    public a(IBinder iBinder0) {
        this.d = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final String b() {
        Parcel parcel0 = Parcel.obtain();
        j.e(parcel0, "obtain()");
        Parcel parcel1 = Parcel.obtain();
        j.e(parcel1, "obtain()");
        try {
            parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.d.transact(1, parcel0, parcel1, 0);
            parcel1.readException();
            return parcel1.readString();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    public final boolean c() {
        Parcel parcel0 = Parcel.obtain();
        j.e(parcel0, "obtain()");
        Parcel parcel1 = Parcel.obtain();
        j.e(parcel1, "obtain()");
        try {
            parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z = true;
            parcel0.writeInt(1);
            this.d.transact(2, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) {
                z = false;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

