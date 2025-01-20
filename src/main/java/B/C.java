package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.os.ResultReceiver;

public final class c extends Binder implements b {
    public final ResultReceiver d;
    public static final int e;

    public c(ResultReceiver resultReceiver0) {
        this.d = resultReceiver0;
        super();
        this.attachInterface(this, b.a);
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        String s = b.a;
        if(v >= 1 && v <= 0xFFFFFF) {
            parcel0.enforceInterface(s);
        }
        switch(v) {
            case 1: {
                int v2 = parcel0.readInt();
                Parcelable.Creator parcelable$Creator0 = Bundle.CREATOR;
                Object object0 = parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0);
                this.d.getClass();
                this.d.b(v2, ((Bundle)object0));
                return true;
            }
            case 0x5F4E5446: {
                parcel1.writeString(s);
                return true;
            }
            default: {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
        }
    }
}

