package d6;

import M5.r;
import N5.f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b4.A0;
import com.google.android.gms.common.Feature;
import g6.c;
import s.J;

public final class j extends f {
    public final J x0;
    public final J y0;
    public final J z0;

    public j(Context context0, Looper looper0, A0 a00, r r0, r r1) {
        super(context0, looper0, 23, a00, r0, r1);
        this.x0 = new J(0);
        this.y0 = new J(0);
        this.z0 = new J(0);
    }

    public final boolean C(Feature feature0) {
        Feature[] arr_feature = this.h();
        if(arr_feature != null) {
            for(int v = 0; v < arr_feature.length; ++v) {
                Feature feature1 = arr_feature[v];
                if(feature0.X.equals(feature1.X)) {
                    return feature1 == null ? false : feature1.g() >= feature0.g();
                }
            }
            return false;
        }
        return false;
    }

    @Override  // N5.e, L5.c
    public final int f() {
        return 11717000;
    }

    @Override  // N5.e
    public final IInterface o(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterface0 instanceof t ? ((t)iInterface0) : new t(iBinder0, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 4);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
    }

    @Override  // N5.e
    public final Feature[] q() {
        return c.c;
    }

    @Override  // N5.e
    public final String u() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override  // N5.e
    public final String v() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override  // N5.e
    public final void x() {
        synchronized(this.x0) {
            this.x0.clear();
        }
        synchronized(this.y0) {
            this.y0.clear();
        }
        synchronized(this.z0) {
            this.z0.clear();
        }
    }

    @Override  // N5.e
    public final boolean y() {
        return true;
    }
}

