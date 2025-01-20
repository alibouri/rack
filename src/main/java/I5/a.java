package i5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class a implements c {
    public IBinder d;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final int b(Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
            parcel0.writeInt(1);
            bundle0.writeToParcel(parcel0, 0);
            this.d.transact(1, parcel0, parcel1, 0);
            parcel1.readException();
            return parcel1.readInt();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

