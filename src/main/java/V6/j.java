package V6;

import android.os.IBinder;
import android.os.IInterface;

public final class j implements l, IInterface {
    public final IBinder d;

    public j(IBinder iBinder0) {
        this.d = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}

