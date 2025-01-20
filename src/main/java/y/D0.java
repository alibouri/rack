package y;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.w;
import W5.f;
import Zb.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class d0 extends j implements Function2 {
    public w c0;
    public int d0;
    public Object e0;
    public final w f0;
    public final f0 g0;

    public d0(w w0, f0 f00, g g0) {
        this.f0 = w0;
        this.g0 = f00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d0)this.t(((Function1)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new d0(this.f0, this.g0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        w w0;
        Function1 function10;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                function10 = (Function1)this.e0;
                goto label_11;
            }
            case 1: {
                w0 = this.c0;
                function10 = (Function1)this.e0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            O o0 = (O)object0;
            while(true) {
                w0.X = o0;
            label_11:
                o0 = null;
                w0 = this.f0;
                Object object2 = w0.X;
                if(object2 instanceof N || object2 instanceof K) {
                    break alab1;
                }
                L l0 = object2 instanceof L ? ((L)object2) : null;
                if(l0 != null) {
                    function10.n(l0);
                }
                i i0 = this.g0.r0;
                if(i0 == null) {
                    continue;
                }
                this.e0 = function10;
                this.c0 = w0;
                this.d0 = 1;
                object0 = i0.t(this);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return t.a;
    }
}

