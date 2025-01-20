package X4;

import Nb.j;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

public final class d implements ServiceConnection {
    public final CountDownLatch X;
    public IBinder Y;

    public d() {
        this.X = new CountDownLatch(1);
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        j.f(componentName0, "name");
        this.X.countDown();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        j.f(componentName0, "name");
        j.f(iBinder0, "serviceBinder");
        this.Y = iBinder0;
        this.X.countDown();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        j.f(componentName0, "name");
    }
}

