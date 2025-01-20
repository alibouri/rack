package V6;

import N6.p;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

public final class q extends n {
    public final IBinder Y;
    public final p Z;

    public q(p p0, IBinder iBinder0) {
        this.Z = p0;
        this.Y = iBinder0;
        super();
    }

    @Override  // V6.n
    public final void b() {
        l l0;
        p p0 = this.Z;
        a a0 = (a)p0.Y;
        a0.i.getClass();
        IBinder iBinder0 = this.Y;
        if(iBinder0 == null) {
            l0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            l0 = iInterface0 instanceof l ? ((l)iInterface0) : new j(iBinder0);
        }
        a0.n = l0;
        a a1 = (a)p0.Y;
        a1.b.a("linkToDeath", new Object[0]);
        try {
            a1.n.asBinder().linkToDeath(a1.k, 0);
        }
        catch(RemoteException remoteException0) {
            m m0 = a1.b;
            m0.getClass();
            if(Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", m.b(m0.a, "linkToDeath failed", new Object[0]), remoteException0);
            }
        }
        a1.g = false;
        for(Object object0: a1.d) {
            ((Runnable)object0).run();
        }
        a1.d.clear();
    }
}

