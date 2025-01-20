package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Y8.G6;
import Y8.R6;
import Y8.y7;
import android.content.Context;
import hd.c;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.l;
import q9.m;
import q9.o0;

public final class v2 extends j implements Function2 {
    public int c0;
    public final R6 d0;
    public final y7 e0;
    public final Context f0;

    public v2(R6 r60, y7 y70, Context context0, g g0) {
        this.d0 = r60;
        this.e0 = y70;
        this.f0 = context0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((v2)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new v2(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    this.c0 = 1;
                    if(this.d0.f(this.e0, G6.X, this) == object1) {
                        return object1;
                    label_7:
                        f.b0(object0);
                    }
                    l l0 = new l(new m(this.f0, "Sent"));
                    o0.O(l0, w2.a, Boolean.TRUE);
                    l0.apply();
                    return t.a;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_7;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        c.a.n("ClientInfo");
        c.a.e(throwable0, "Unable to save clientInfo to server", new Object[0]);
        return t.a;
    }
}

