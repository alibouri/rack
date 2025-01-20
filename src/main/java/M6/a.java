package m6;

import L5.c;
import L5.g;
import L5.h;
import N5.f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b4.A0;

public final class a extends f implements c {
    public final Integer A0;
    public final boolean x0;
    public final A0 y0;
    public final Bundle z0;

    public a(Context context0, Looper looper0, A0 a00, Bundle bundle0, g g0, h h0) {
        super(context0, looper0, 44, a00, g0, h0);
        this.x0 = true;
        this.y0 = a00;
        this.z0 = bundle0;
        this.A0 = (Integer)a00.g;
    }

    @Override  // L5.c, N5.e
    public final int f() {
        return 12451000;
    }

    @Override  // L5.c, N5.e
    public final boolean l() {
        return this.x0;
    }

    @Override  // N5.e
    public final IInterface o(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterface0 instanceof m6.c ? ((m6.c)iInterface0) : new m6.c(iBinder0, "com.google.android.gms.signin.internal.ISignInService", 1);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
    }

    @Override  // N5.e
    public final Bundle r() {
        A0 a00 = this.y0;
        Bundle bundle0 = this.z0;
        if(!"com.wave.personal".equals(((String)a00.d))) {
            bundle0.putString("com.google.android.gms.signin.internal.realClientPackageName", ((String)a00.d));
        }
        return bundle0;
    }

    @Override  // N5.e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override  // N5.e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}

