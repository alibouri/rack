package v3;

import Ab.t;
import Eb.a;
import Fb.j;
import U.V;
import W5.f;
import Xb.G;
import Xb.r0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.F;

public final class c extends j implements Function2 {
    public int c0;
    public final l d0;
    public final r0 e0;
    public final int f0;
    public final int g0;
    public final h h0;

    public c(l l0, r0 r00, int v, int v1, h h0, g g0) {
        this.d0 = l0;
        this.e0 = r00;
        this.f0 = v;
        this.g0 = v1;
        this.h0 = h0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c(this.d0, this.e0, this.f0, this.g0, this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                goto label_8;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(!((Boolean)object0).booleanValue()) {
                return t.a;
            }
        label_8:
            int v = b.a[this.d0.ordinal()] != 1 || this.e0.b() ? this.f0 : this.g0;
            this.c0 = 1;
            h h0 = this.h0;
            h0.getClass();
            if(v == 0x7FFFFFFF) {
                object0 = F.a(new e(h0, 0x7FFFFFFF, 0), this);
            }
            else {
                e e0 = new e(h0, v, 1);
                object0 = V.a(this.a()).v(e0, this);
            }
        }
        while(object0 != object1);
        return object1;
    }
}

