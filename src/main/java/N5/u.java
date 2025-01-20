package N5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;

public final class u implements ServiceConnection {
    public final int X;
    public final e Y;

    public u(e e0, int v) {
        this.Y = e0;
        this.X = v;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        e e0 = this.Y;
        if(iBinder0 == null) {
            e.z(e0);
            return;
        }
        synchronized(e0.f0) {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            this.Y.g0 = iInterface0 == null || !(iInterface0 instanceof n) ? new n(iBinder0) : ((n)iInterface0);
        }
        this.Y.getClass();
        w w0 = new w(this.Y, 0);
        Message message0 = this.Y.d0.obtainMessage(7, this.X, -1, w0);
        this.Y.d0.sendMessage(message0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        synchronized(this.Y.f0) {
            this.Y.g0 = null;
        }
        Message message0 = this.Y.d0.obtainMessage(6, this.X, 1);
        this.Y.d0.sendMessage(message0);
    }
}

