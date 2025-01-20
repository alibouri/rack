package q2;

import android.os.IBinder;
import android.os.Parcel;

public final class l implements m {
    public IBinder d;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override  // q2.m
    public final void r(String[] arr_s) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken(m.b);
            parcel0.writeStringArray(arr_s);
            this.d.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

