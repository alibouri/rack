package k2;

import Eb.a;
import Nb.j;
import W5.f;
import ac.h;
import android.os.Build;
import android.util.Log;
import ha.a0;
import io.sentry.internal.debugmeta.c;
import kotlin.jvm.functions.Function1;

public final class w0 {
    public final Object a;
    public final Object b;
    public final f1 c;
    public final c d;
    public final c e;
    public final h f;

    public w0(Function1 function10, Object object0, f1 f10) {
        this.a = function10;
        this.b = object0;
        this.c = f10;
        this.d = new c(14);
        this.e = new c(14);
        this.f = H.e(new u0(this, null));
    }

    public static final Object a(w0 w00, y1 y10, Fb.c c0) {
        v0 v00;
        w00.getClass();
        if(c0 instanceof v0) {
            v00 = (v0)c0;
            int v = v00.f0;
            if((v & 0x80000000) == 0) {
                v00 = new v0(w00, c0);
            }
            else {
                v00.f0 = v ^ 0x80000000;
            }
        }
        else {
            v00 = new v0(w00, c0);
        }
        Object object0 = v00.d0;
        Object object1 = a.X;
        switch(v00.f0) {
            case 0: {
                f.b0(object0);
                v00.b0 = w00;
                v00.c0 = y10;
                v00.f0 = 1;
                object0 = ((Function1)w00.a).n(v00);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                y10 = v00.c0;
                w00 = v00.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object1 = (y1)object0;
        if(object1 instanceof X) {
            ((X)object1).e(w00.c.a);
        }
        if(object1 == y10) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        a0 a00 = new a0(0, w00, w0.class, "invalidate", "invalidate()V", 0, 7);
        object1.getClass();
        object1.a.o(a00);
        if(y10 != null) {
            a0 a01 = new a0(0, w00, w0.class, "invalidate", "invalidate()V", 0, 8);
            y10.a.q(a01);
        }
        if(y10 != null) {
            y10.c();
        }
        if(Build.ID != null && Log.isLoggable("Paging", 3)) {
            j.f(("Generated new PagingSource " + object1), "message");
            Log.d("Paging", "Generated new PagingSource " + object1, null);
        }
        return object1;
    }
}

