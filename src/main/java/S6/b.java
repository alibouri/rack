package S6;

import N6.p;
import T6.d;
import T6.e;
import T6.f;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import o6.i;

public final class b extends f {
    public final int Y;
    public final Object Z;
    public final Object b0;

    public b(p p0, IBinder iBinder0) {
        this.Y = 1;
        this.Z = iBinder0;
        this.b0 = p0;
        super();
    }

    public b(c c0, i i0, i i1) {
        this.Y = 0;
        this.Z = i1;
        this.b0 = c0;
        super(i0);
    }

    @Override  // T6.f
    public final void a() {
        HashMap hashMap0;
        d d0 = null;
        if(this.Y != 0) {
            IBinder iBinder0 = (IBinder)this.Z;
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                d0 = iInterface0 instanceof d ? ((d)iInterface0) : new T6.b(iBinder0);
            }
            p p0 = (p)this.b0;
            T6.i i0 = (T6.i)p0.Y;
            i0.m = d0;
            e e0 = i0.b;
            e0.b("linkToDeath", new Object[0]);
            try {
                i0.m.asBinder().linkToDeath(i0.j, 0);
            }
            catch(RemoteException remoteException0) {
                e0.getClass();
                if(Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", e.d(e0.a, "linkToDeath failed", new Object[0]), remoteException0);
                }
            }
            T6.i i1 = (T6.i)p0.Y;
            i1.g = false;
            for(Object object0: i1.d) {
                ((Runnable)object0).run();
            }
            i1.d.clear();
            return;
        }
        try {
            d d1 = ((c)this.b0).a.m;
            String s = ((c)this.b0).b;
            Bundle bundle0 = new Bundle();
            synchronized(S6.d.class) {
                hashMap0 = S6.d.a;
                hashMap0.put("java", 20002);
            }
            bundle0.putInt("playcore_version_code", ((int)(((Integer)hashMap0.get("java")))));
            if(hashMap0.containsKey("native")) {
                bundle0.putInt("playcore_native_version", ((int)(((Integer)hashMap0.get("native")))));
            }
            if(hashMap0.containsKey("unity")) {
                bundle0.putInt("playcore_unity_version", ((int)(((Integer)hashMap0.get("unity")))));
            }
            com.google.android.play.core.review.c c0 = new com.google.android.play.core.review.c(((c)this.b0), ((i)this.Z));
            ((T6.b)d1).getClass();
            Parcel parcel0 = Parcel.obtain();
            parcel0.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            parcel0.writeString(s);
            parcel0.writeInt(1);
            bundle0.writeToParcel(parcel0, 0);
            parcel0.writeStrongBinder(c0);
            try {
                ((T6.b)d1).d.transact(2, parcel0, null, 1);
            }
            finally {
                parcel0.recycle();
            }
            return;
        }
        catch(RemoteException remoteException1) {
        }
        e e1 = c.c;
        Object[] arr_object = {((c)this.b0).b};
        e1.getClass();
        if(Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e.d(e1.a, "error requesting in-app review for %s", arr_object), remoteException1);
        }
        RuntimeException runtimeException0 = new RuntimeException(remoteException1);
        ((i)this.Z).c(runtimeException0);
    }
}

