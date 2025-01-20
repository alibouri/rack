package j6;

import android.os.RemoteException;

public final class O0 implements Runnable {
    public final int X;
    public P0 Y;

    public O0(int v) {
        this.X = v;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            P0 p00 = this.Y;
            C c0 = p00.c0;
            if(c0 == null) {
                p00.b().e0.d("Failed to send Dma consent settings to service");
                return;
            }
            try {
                c0.z(p00.J(false));
                p00.I();
            }
            catch(RemoteException remoteException0) {
                p00.b().e0.b(remoteException0, "Failed to send Dma consent settings to the service");
            }
            return;
        }
        P0 p01 = this.Y;
        C c1 = p01.c0;
        if(c1 == null) {
            p01.b().e0.d("Failed to send storage consent settings to service");
            return;
        }
        try {
            c1.n(p01.J(false));
            p01.I();
        }
        catch(RemoteException remoteException1) {
            p01.b().e0.b(remoteException1, "Failed to send storage consent settings to the service");
        }
    }
}

