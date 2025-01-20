package q9;

import E9.a;
import Nb.j;
import W5.f;
import Wc.k;
import Xb.N;
import Z6.g;
import android.content.Context;
import h7.b;
import h7.c;
import hb.n;
import io.sentry.i1;
import java.io.IOException;
import java.util.concurrent.CancellationException;

public final class j0 {
    public final a a;
    public N b;

    public j0(Context context0, a a0) {
        j.f(context0, "appContext");
        j.f(a0, "analytics");
        super();
        this.a = a0;
        g.f(context0);
        c c0 = (c)g.c().b(c.class);
        j.e(c0, "getInstance()");
        c0.a.h();
        c0.h = (l7.c)c0.a.b(l7.c.class);
        c0.d.getClass();
    }

    public static final Object a(j0 j00, Fb.c c0) {
        f0 f00;
        if(c0 instanceof f0) {
            f00 = (f0)c0;
            int v = f00.e0;
            if((v & 0x80000000) == 0) {
                f00 = new f0(j00, c0);
            }
            else {
                f00.e0 = v ^ 0x80000000;
            }
        }
        else {
            f00 = new f0(j00, c0);
        }
        Object object0 = f00.c0;
        Object object1 = Eb.a.X;
        switch(f00.e0) {
            case 0: {
                f.b0(object0);
                try {
                    k k0 = new k(2000L);
                    g0 g00 = new g0(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
                    T1.f f0 = new T1.f(1, null, 1);
                    f00.b0 = j00;
                    f00.e0 = 1;
                    object0 = Y8.N.e(0x7FFFFFFF, k0, g00, f0, f00, 12);
                    if(object0 == object1) {
                        return object1;
                    label_22:
                        j00 = f00.b0;
                        f.b0(object0);
                    }
                    j00.a.b("appcheck", "true", false);
                    return ((b)object0).a;
                }
                catch(CancellationException exception0) {
                    break;
                }
                catch(IOException | Exception unused_ex) {
                    return null;
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j00.getClass();
        n.b(exception0, i1.WARNING, null, 12);
        hd.c.a.c(exception0);
        j00.a.b("appcheck", "false", false);
        return null;
    }
}

