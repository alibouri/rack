package d1;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class d extends j implements Function2 {
    public int c0;
    public final boolean d0;
    public final h e0;
    public final long f0;

    public d(boolean z, h h0, long v, g g0) {
        this.d0 = z;
        this.e0 = h0;
        this.f0 = v;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                h h0 = this.e0;
                if(this.d0) {
                    this.c0 = 2;
                    if(h0.b0.a(this.f0, 0L, this) == object1) {
                        return object1;
                    }
                }
                else {
                    this.c0 = 1;
                    if(h0.b0.a(0L, this.f0, this) == object1) {
                        return object1;
                    }
                }
                return t.a;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

