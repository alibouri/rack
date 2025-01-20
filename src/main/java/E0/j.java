package e0;

import Ab.t;
import Eb.a;
import Fb.i;
import Ub.h;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j extends i implements Function2 {
    public int[] Z;
    public int b0;
    public int c0;
    public int d0;
    public Object e0;
    public final k f0;

    public j(k k0, g g0) {
        this.f0 = k0;
        super(g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((h)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        int v4;
        h h2;
        int v3;
        h h1;
        Object object2;
        int v1;
        int v;
        int[] arr_v;
        h h0;
        Object object1 = a.X;
        k k0 = this.f0;
    alab1:
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                h0 = (h)this.e0;
                arr_v = k0.b0;
                if(arr_v != null) {
                    v = arr_v.length;
                    v1 = 0;
                    goto label_17;
                }
                goto label_25;
            }
            case 1: {
                v = this.c0;
                int v2 = this.b0;
                arr_v = this.Z;
                h0 = (h)this.e0;
                f.b0(object0);
                v1 = v2 + 1;
            label_17:
                if(v1 < v) {
                    this.e0 = h0;
                    this.Z = arr_v;
                    this.b0 = v1;
                    this.c0 = v;
                    this.d0 = 1;
                    h0.d(new Integer(arr_v[v1]), this);
                    return object1;
                }
            label_25:
                if(k0.Y == 0L) {
                    object2 = object1;
                }
                else {
                    h1 = h0;
                    v3 = 0;
                    goto label_37;
                }
                goto label_47;
            }
            case 2: {
                v3 = this.b0;
                h1 = (h)this.e0;
                f.b0(object0);
                object2 = object1;
                while(true) {
                    ++v3;
                    object1 = object2;
                label_37:
                    object2 = object1;
                    if(v3 >= 0x40) {
                        break;
                    }
                    if((k0.Y & 1L << v3) == 0L) {
                        continue;
                    }
                    this.e0 = h1;
                    this.Z = null;
                    this.b0 = v3;
                    this.d0 = 2;
                    h1.d(new Integer(k0.Z + v3), this);
                    return object2;
                }
                h0 = h1;
            label_47:
                if(k0.X != 0L) {
                    h2 = h0;
                    v4 = 0;
                    goto label_56;
                }
                break;
            }
            case 3: {
                int v5 = this.b0;
                h2 = (h)this.e0;
                f.b0(object0);
                object2 = object1;
                while(true) {
                    v4 = v5 + 1;
                label_56:
                    if(v4 >= 0x40) {
                        break alab1;
                    }
                    if((k0.X & 1L << v4) != 0L) {
                        this.e0 = h2;
                        this.Z = null;
                        this.b0 = v4;
                        this.d0 = 3;
                        h2.d(new Integer(0x40 + v4 + k0.Z), this);
                        return object2;
                    }
                    v5 = v4;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

