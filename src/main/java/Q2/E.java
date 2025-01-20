package q2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.H;
import ac.i;
import java.util.concurrent.Callable;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e extends j implements Function2 {
    public int c0;
    public Object d0;
    public final boolean e0;
    public final v f0;
    public final String[] g0;
    public final Callable h0;

    public e(boolean z, v v0, String[] arr_s, Callable callable0, g g0) {
        this.e0 = z;
        this.f0 = v0;
        this.g0 = arr_s;
        this.h0 = callable0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        e e0 = new e(this.e0, this.f0, this.g0, this.h0, g0);
        e0.d0 = object0;
        return e0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                d d0 = new d(this.e0, this.f0, ((i)this.d0), this.g0, this.h0, null);
                this.c0 = 1;
                return H.c(d0, this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

