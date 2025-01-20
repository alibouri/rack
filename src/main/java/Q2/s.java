package q2;

import Nb.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

public final class s extends Binder implements n {
    public final MultiInstanceInvalidationService d;

    public s(MultiInstanceInvalidationService multiInstanceInvalidationService0) {
        this.d = multiInstanceInvalidationService0;
        super();
        this.attachInterface(this, n.c);
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void b(int v, String[] arr_s) {
        j.f(arr_s, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.d;
        synchronized(multiInstanceInvalidationService0.Z) {
            String s = (String)multiInstanceInvalidationService0.Y.get(v);
            if(s == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int v2 = multiInstanceInvalidationService0.Z.beginBroadcast();
            try {
                for(int v3 = 0; v3 < v2; ++v3) {
                    Object object0 = multiInstanceInvalidationService0.Z.getBroadcastCookie(v3);
                    j.d(object0, "null cannot be cast to non-null type kotlin.Int");
                    if(v != ((int)(((Integer)object0))) && s.equals(((String)multiInstanceInvalidationService0.Y.get(((Integer)object0))))) {
                        try {
                            ((m)multiInstanceInvalidationService0.Z.getBroadcastItem(v3)).r(arr_s);
                        }
                        catch(RemoteException remoteException0) {
                            Log.w("ROOM", "Error invoking a remote callback", remoteException0);
                        }
                    }
                }
            }
            finally {
                multiInstanceInvalidationService0.Z.finishBroadcast();
            }
        }
    }

    public final int c(m m0, String s) {
        j.f(m0, "callback");
        int v = 0;
        if(s == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.d;
        synchronized(multiInstanceInvalidationService0.Z) {
            int v2 = multiInstanceInvalidationService0.X + 1;
            multiInstanceInvalidationService0.X = v2;
            if(multiInstanceInvalidationService0.Z.register(m0, v2)) {
                multiInstanceInvalidationService0.Y.put(v2, s);
                v = v2;
            }
            else {
                --multiInstanceInvalidationService0.X;
            }
            return v;
        }
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        String s = n.c;
        if(v >= 1 && v <= 0xFFFFFF) {
            parcel0.enforceInterface(s);
        }
        m m0 = null;
        if(v == 0x5F4E5446) {
            parcel1.writeString(s);
            return true;
        }
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface(m.b);
                    if(iInterface0 == null || !(iInterface0 instanceof m)) {
                        m0 = new l();  // initializer: Ljava/lang/Object;-><init>()V
                        m0.d = iBinder0;
                    }
                    else {
                        m0 = (m)iInterface0;
                    }
                }
                int v2 = this.c(m0, parcel0.readString());
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface(m.b);
                    if(iInterface1 == null || !(iInterface1 instanceof m)) {
                        m0 = new l();  // initializer: Ljava/lang/Object;-><init>()V
                        m0.d = iBinder1;
                    }
                    else {
                        m0 = (m)iInterface1;
                    }
                }
                int v3 = parcel0.readInt();
                j.f(m0, "callback");
                synchronized(this.d.Z) {
                    this.d.Z.unregister(m0);
                    String s1 = (String)this.d.Y.remove(v3);
                }
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                this.b(parcel0.readInt(), parcel0.createStringArray());
                return true;
            }
            default: {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
        }
    }
}

