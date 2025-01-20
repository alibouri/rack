package J9;

import Ab.m;
import Fb.c;
import N4.h;
import Nb.j;
import W5.f;
import com.google.firebase.messaging.FirebaseMessaging;
import hb.n;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import mb.a;
import q9.C3;

public final class p {
    public final C3 a;
    public final LinkedHashMap b;

    public p(C3 c30) {
        j.f(c30, "app");
        super();
        this.a = c30;
        this.b = new LinkedHashMap();
    }

    public static void a() {
        n.a("Clear push notification token", null, null, null, null, 30);
        a.a(null, null, new J9.n(2, null), 3);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
    }

    public final Serializable b(c c0) {
        String s;
        o o0;
        if(c0 instanceof o) {
            o0 = (o)c0;
            int v = o0.d0;
            if((v & 0x80000000) == 0) {
                o0 = new o(this, c0);
            }
            else {
                o0.d0 = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, c0);
        }
        Object object0 = o0.b0;
        Serializable serializable0 = Eb.a.X;
        switch(o0.d0) {
            case 0: {
                f.b0(object0);
                try {
                    o6.p p0 = FirebaseMessaging.c().f();
                    j.e(p0, "getToken(...)");
                    o0.d0 = 1;
                    object0 = h.k(p0, o0);
                    if(object0 == serializable0) {
                        return serializable0;
                    label_20:
                        f.b0(object0);
                    }
                    s = (String)object0;
                    goto label_27;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_26;
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw cancellationException0;
    label_26:
        s = f.v(throwable0);
    label_27:
        Throwable throwable1 = Ab.n.a(s);
        if(throwable1 != null) {
            n.a(("User failed to obtain push notification token from Firebase.\nStacktrace: " + U5.a.U(throwable1)), null, null, null, null, 30);
            hd.c.a.n("PushNotificationManager");
            hd.c.a.m(throwable1, "User failed to obtain push notification token from Firebase.", new Object[0]);
            s = null;
        }
        return !(s instanceof m) ? s : null;
    }
}

