package T6;

import android.os.IBinder;
import android.os.IInterface;

public final class b implements d, IInterface {
    public final IBinder d;

    public b(IBinder iBinder0) {
        this.d = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}

