package I5;

import A7.b;
import L5.e;
import L5.n;
import M.J;
import M5.m;
import M5.u;
import N5.r;
import N6.d;
import S5.c;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import o6.i;

public final class k extends d {
    public final RevocationBoundService e;

    public k(RevocationBoundService revocationBoundService0) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 3);
        this.e = revocationBoundService0;
    }

    @Override  // N6.d
    public final boolean K(int v, Parcel parcel0, Parcel parcel1) {
        m m0;
        f f0;
        int v1 = 0;
        RevocationBoundService revocationBoundService0 = this.e;
        switch(v) {
            case 1: {
                this.N();
                a a0 = a.a(revocationBoundService0);
                GoogleSignInAccount googleSignInAccount0 = a0.b();
                GoogleSignInOptions googleSignInOptions0 = googleSignInAccount0 == null ? GoogleSignInOptions.i0 : a0.c();
                r.j(googleSignInOptions0);
                e e0 = new e(new M5.a(), Looper.getMainLooper());  // initializer: Ljava/lang/Object;-><init>()V
                H5.a a1 = new H5.a(this.e, null, F5.a.a, googleSignInOptions0, e0);  // initializer: LL5/f;-><init>(Landroid/content/Context;Landroid/app/Activity;LR2/k;LL5/b;LL5/e;)V
                u u0 = a1.h;
                Context context0 = a1.a;
                if(googleSignInAccount0 != null) {
                    boolean z = a1.d() == 3;
                    b b0 = g.a;
                    if(b0.Y <= 3) {
                        Log.d(((String)b0.Z), ((String)b0.b0) + "Revoking access");
                    }
                    String s = a.a(context0).e("refreshToken");
                    g.a(context0);
                    if(!z) {
                        f0 = new f(u0, 1);
                        u0.b(f0);
                    }
                    else if(s == null) {
                        Status status0 = new Status(4, null, null, null);
                        if(status0.X <= 0) {
                            v1 = 1;
                        }
                        r.a("Status code must not be SUCCESS", ((boolean)(v1 ^ 1)));
                        f0 = new n(status0);
                        f0.setResult(status0);
                    }
                    else {
                        I5.b b1 = new I5.b(s);
                        new Thread(b1).start();
                        f0 = b1.Y;
                    }
                    v7.d d0 = new v7.d(9);
                    f0.addStatusListener(new M5.n(f0, new i(), d0));
                    return true;
                }
                boolean z1 = a1.d() == 3;
                b b2 = g.a;
                if(b2.Y <= 3) {
                    Log.d(((String)b2.Z), ((String)b2.b0) + "Signing out");
                }
                g.a(context0);
                if(z1) {
                    r.k(Status.c0, "Result must not be null");
                    m0 = new m(u0);  // initializer: Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(LM5/u;)V
                    m0.setResult(Status.c0);
                }
                else {
                    f f1 = new f(u0, 0);
                    u0.b(f1);
                    m0 = f1;
                }
                v7.d d1 = new v7.d(9);
                m0.addStatusListener(new M5.n(m0, new i(), d1));
                return true;
            }
            case 2: {
                this.N();
                h.x(revocationBoundService0).y();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void N() {
        int v = Binder.getCallingUid();
        if(!c.e(this.e, v)) {
            throw new SecurityException(J.d(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}

