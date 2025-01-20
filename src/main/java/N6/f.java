package N6;

import M6.i;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class f implements h, IInterface {
    public final IBinder d;

    public f(IBinder iBinder0) {
        this.d = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override  // N6.h
    public final void m(String s, Bundle bundle0, M6.h h0) {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcel0.writeString(s);
        parcel0.writeInt(1);
        bundle0.writeToParcel(parcel0, 0);
        parcel0.writeStrongBinder(h0);
        try {
            this.d.transact(3, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // N6.h
    public final void y(String s, Bundle bundle0, i i0) {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcel0.writeString(s);
        parcel0.writeInt(1);
        bundle0.writeToParcel(parcel0, 0);
        parcel0.writeStrongBinder(i0);
        try {
            this.d.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

