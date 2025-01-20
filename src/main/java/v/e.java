package v;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Zb.b;
import Zb.m;
import Zb.o;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e extends j implements Function2 {
    public b c0;
    public int d0;
    public Object e0;
    public final m f0;
    public final v.b g0;
    public final MutableState h0;
    public final MutableState i0;

    public e(m m0, v.b b0, MutableState mutableState0, MutableState mutableState1, g g0) {
        this.f0 = m0;
        this.g0 = b0;
        this.h0 = mutableState0;
        this.i0 = mutableState1;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        e e0 = new e(this.f0, this.g0, this.h0, this.i0, g0);
        e0.e0 = object0;
        return e0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        G g1;
        b b0;
        Object object1 = a.X;
        m m0 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.e0;
                b0 = m0.iterator();
                g1 = g0;
                goto label_18;
            }
            case 1: {
                b0 = this.c0;
                g1 = (G)this.e0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Boolean)object0).booleanValue()) {
            Object object2 = b0.b();
            Object object3 = m0.p();
            if(object3 instanceof o) {
                object3 = null;
            }
            J.q(g1, null, null, new d((object3 == null ? object2 : object3), this.g0, this.h0, this.i0, null), 3);
        label_18:
            this.e0 = g1;
            this.c0 = b0;
            this.d0 = 1;
            object0 = b0.a(this);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        return t.a;
    }
}

