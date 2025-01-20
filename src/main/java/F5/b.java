package F5;

import L5.c;
import L5.g;
import L5.h;
import M5.r;
import N5.i;
import Y5.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.a;
import b4.A0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import d6.j;

public final class b extends a {
    public final int b;

    public b(int v) {
        this.b = v;
        super();
    }

    @Override  // android.support.v4.media.session.a
    public c t(Context context0, Looper looper0, A0 a00, Object object0, g g0, h h0) {
        switch(this.b) {
            case 0: {
                return new d(context0, looper0, a00, ((F5.c)object0), ((r)g0), ((r)h0));
            }
            case 1: {
                return new I5.d(context0, looper0, a00, ((GoogleSignInOptions)object0), ((r)g0), ((r)h0));
            }
            case 5: {
                l6.a a0 = (l6.a)object0;
                a00.getClass();
                Integer integer0 = (Integer)a00.g;
                Bundle bundle0 = new Bundle();
                bundle0.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if(integer0 != null) {
                    bundle0.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", ((int)integer0));
                }
                bundle0.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle0.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle0.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle0.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle0.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle0.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle0.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle0.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new m6.a(context0, looper0, a00, bundle0, g0, h0);
            }
            case 6: {
                throw v.h.c(object0);
            }
            default: {
                return super.t(context0, looper0, a00, object0, g0, h0);
            }
        }
    }

    @Override  // android.support.v4.media.session.a
    public c u(Context context0, Looper looper0, A0 a00, Object object0, r r0, r r1) {
        switch(this.b) {
            case 2: {
                L5.a a0 = (L5.a)object0;
                return new Z5.g(context0, looper0, 0x7E, a00, r0, r1);  // initializer: LN5/f;-><init>(Landroid/content/Context;Landroid/os/Looper;ILb4/A0;LL5/g;LL5/h;)V
            }
            case 3: {
                return new P5.c(context0, looper0, a00, ((i)object0), r0, r1);
            }
            case 4: {
                L5.a a1 = (L5.a)object0;
                return new j(context0, looper0, a00, r0, r1);
            }
            default: {
                return super.u(context0, looper0, a00, object0, r0, r1);
            }
        }
    }
}

