package N5;

import N6.d;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.util.Log;
import c6.a;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;

public final class t extends d {
    public e e;
    public final int f;

    public t(e e0, int v) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 5);
        this.e = e0;
        this.f = v;
    }

    @Override  // N6.d
    public final boolean M(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                int v1 = parcel0.readInt();
                IBinder iBinder0 = parcel0.readStrongBinder();
                Bundle bundle0 = (Bundle)a.a(parcel0, Bundle.CREATOR);
                a.b(parcel0);
                r.k(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
                e e0 = this.e;
                e0.getClass();
                v v2 = new v(e0, v1, iBinder0, bundle0);
                Message message0 = e0.d0.obtainMessage(1, this.f, -1, v2);
                e0.d0.sendMessage(message0);
                this.e = null;
                break;
            }
            case 2: {
                parcel0.readInt();
                Bundle bundle1 = (Bundle)a.a(parcel0, Bundle.CREATOR);
                a.b(parcel0);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                break;
            }
            case 3: {
                int v3 = parcel0.readInt();
                IBinder iBinder1 = parcel0.readStrongBinder();
                zzk zzk0 = (zzk)a.a(parcel0, zzk.CREATOR);
                a.b(parcel0);
                e e1 = this.e;
                r.k(e1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                r.j(zzk0);
                e1.t0 = zzk0;
                if(e1.y()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = zzk0.b0;
                    h h0 = h.a();
                    RootTelemetryConfiguration rootTelemetryConfiguration0 = connectionTelemetryConfiguration0 == null ? null : connectionTelemetryConfiguration0.X;
                    synchronized(h0) {
                        if(rootTelemetryConfiguration0 == null) {
                            h0.a = h.c;
                        }
                        else if(h0.a == null || h0.a.X < rootTelemetryConfiguration0.X) {
                            h0.a = rootTelemetryConfiguration0;
                        }
                    }
                }
                Bundle bundle2 = zzk0.X;
                r.k(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
                e e2 = this.e;
                e2.getClass();
                v v4 = new v(e2, v3, iBinder1, bundle2);
                Message message1 = e2.d0.obtainMessage(1, this.f, -1, v4);
                e2.d0.sendMessage(message1);
                this.e = null;
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

