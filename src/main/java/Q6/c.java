package Q6;

import V6.b;
import V6.j;
import V6.l;
import V6.m;
import V6.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import o6.i;

public final class c extends n {
    public final byte[] Y;
    public final Long Z;
    public final i b0;
    public final h c0;
    public final e d0;

    public c(e e0, i i0, byte[] arr_b, Long long0, i i1, h h0) {
        this.d0 = e0;
        this.Y = arr_b;
        this.Z = long0;
        this.b0 = i1;
        this.c0 = h0;
        super(i0);
    }

    @Override  // V6.n
    public final void a(Exception exception0) {
        if(exception0 instanceof b) {
            super.a(new a(-9, exception0));
            return;
        }
        super.a(exception0);
    }

    @Override  // V6.n
    public final void b() {
        e e0;
        i i0;
        try {
            i0 = this.b0;
            e0 = this.d0;
            l l0 = e0.c.n;
            Bundle bundle0 = e.a(e0, this.Y, this.Z);
            d d0 = new d(e0, i0);
            ((j)l0).getClass();
            Parcel parcel0 = Parcel.obtain();
            parcel0.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            parcel0.writeInt(1);
            bundle0.writeToParcel(parcel0, 0);
            parcel0.writeStrongBinder(d0);
            try {
                ((j)l0).d.transact(2, parcel0, null, 1);
            }
            finally {
                parcel0.recycle();
            }
        }
        catch(RemoteException remoteException0) {
            m m0 = e0.a;
            Object[] arr_object = {this.c0};
            m0.getClass();
            if(Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", m.b(m0.a, "requestIntegrityToken(%s)", arr_object), remoteException0);
            }
            i0.c(new a(-100, remoteException0));
        }
    }
}

