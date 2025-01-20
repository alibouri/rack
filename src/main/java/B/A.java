package b;

import android.os.IBinder;

public final class a implements b {
    public IBinder d;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}

