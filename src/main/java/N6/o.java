package N6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class o extends l {
    public final IBinder Y;
    public final p Z;

    public o(p p0, IBinder iBinder0) {
        this.Z = p0;
        this.Y = iBinder0;
        super();
    }

    @Override  // N6.l
    public final void a() {
        h h0;
        p p0 = this.Z;
        q q0 = (q)p0.Y;
        IBinder iBinder0 = this.Y;
        if(iBinder0 == null) {
            h0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            h0 = iInterface0 instanceof h ? ((h)iInterface0) : new f(iBinder0);
        }
        q0.m = h0;
        q q1 = (q)p0.Y;
        q1.b.e("linkToDeath", new Object[0]);
        try {
            q1.m.asBinder().linkToDeath(q1.j, 0);
        }
        catch(RemoteException remoteException0) {
            q1.b.c(remoteException0, "linkToDeath failed", new Object[0]);
        }
        q1.g = false;
        for(Object object0: q1.d) {
            ((Runnable)object0).run();
        }
        q1.d.clear();
    }
}

