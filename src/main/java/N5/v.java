package N5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class v extends l {
    public final IBinder g;
    public final e h;

    public v(e e0, int v, IBinder iBinder0, Bundle bundle0) {
        this.h = e0;
        super(e0, v, bundle0);
        this.g = iBinder0;
    }

    @Override  // N5.l
    public final void a(ConnectionResult connectionResult0) {
        c c0 = this.h.n0;
        if(c0 != null) {
            c0.e(connectionResult0);
        }
    }

    @Override  // N5.l
    public final boolean b() {
        String s;
        IBinder iBinder0;
        try {
            iBinder0 = this.g;
            r.j(iBinder0);
            s = iBinder0.getInterfaceDescriptor();
        }
        catch(RemoteException unused_ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        e e0 = this.h;
        if(!e0.u().equals(s)) {
            Log.w("GmsClient", "service descriptor mismatch: " + e0.u() + " vs. " + s);
            return false;
        }
        IInterface iInterface0 = e0.o(iBinder0);
        if(iInterface0 != null && (e.A(e0, 2, 4, iInterface0) || e.A(e0, 3, 4, iInterface0))) {
            e0.r0 = null;
            b b0 = e0.m0;
            if(b0 != null) {
                b0.c();
            }
            return true;
        }
        return false;
    }
}

