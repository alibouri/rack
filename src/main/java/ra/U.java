package ra;

import Ab.t;
import C.E;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class u extends j implements Function2 {
    public int c0;
    public final K d0;
    public final E e0;
    public final N f0;
    public final MutableState g0;

    public u(K k0, E e0, N n0, MutableState mutableState0, g g0) {
        this.d0 = k0;
        this.e0 = e0;
        this.f0 = n0;
        this.g0 = mutableState0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((u)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new u(this.d0, this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        MutableState mutableState0 = this.g0;
        K k0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                boolean z = ((K)mutableState0.getValue()) instanceof ra.G;
                E e0 = this.e0;
                if(z || !(k0 instanceof ra.G)) {
                    goto label_14;
                }
                this.c0 = 1;
                if(E.i(e0, 0, this) == object1) {
                    return object1;
                label_14:
                    if(this.f0.m) {
                        this.c0 = 2;
                        if(E.i(e0, 0, this) == object1) {
                            return object1;
                        }
                    }
                    return t.a;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutableState0.setValue(k0);
        return t.a;
    }
}

