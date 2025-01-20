package Z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class e implements IInterface {
    public final IBinder d;

    public e(IBinder iBinder0) {
        this.d = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final void b(int v, Parcel parcel0) {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.d.transact(v, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel0.recycle();
            parcel1.recycle();
        }
    }
}

