package y0;

import F0.q0;
import Fb.c;
import U0.D;
import Xb.G;
import a1.l;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import g0.n;
import kotlin.coroutines.g;
import m0.b;

public final class f extends n implements q0, a {
    public a l0;
    public NestedScrollDispatcher m0;
    public final String n0;

    public f(a a0, NestedScrollDispatcher nestedScrollDispatcher0) {
        this.l0 = a0;
        if(nestedScrollDispatcher0 == null) {
            nestedScrollDispatcher0 = new NestedScrollDispatcher();
        }
        this.m0 = nestedScrollDispatcher0;
        this.n0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override  // y0.a
    public final Object B(long v, g g0) {
        long v3;
        f f1;
        e e0;
        if(g0 instanceof e) {
            e0 = (e)g0;
            int v1 = e0.f0;
            if((v1 & 0x80000000) == 0) {
                e0 = new e(this, ((c)g0));
            }
            else {
                e0.f0 = v1 ^ 0x80000000;
            }
        }
        else {
            e0 = new e(this, ((c)g0));
        }
        Object object0 = e0.d0;
        Object object1 = Eb.a.X;
        switch(e0.f0) {
            case 0: {
                W5.f.b0(object0);
                f f0 = this.k0 ? ((f)F0.f.k(this)) : null;
                if(f0 == null) {
                    v3 = 0L;
                    f1 = this;
                }
                else {
                    e0.b0 = this;
                    e0.c0 = v;
                    e0.f0 = 1;
                    object0 = f0.B(v, e0);
                    if(object0 == object1) {
                        return object1;
                    }
                    f1 = this;
                    v3 = ((l)object0).a;
                }
                break;
            }
            case 1: {
                v = e0.c0;
                f1 = e0.b0;
                W5.f.b0(object0);
                v3 = ((l)object0).a;
                break;
            }
            case 2: {
                long v2 = e0.c0;
                W5.f.b0(object0);
                return new l(l.e(v2, ((l)object0).a));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        e0.b0 = null;
        e0.c0 = v3;
        e0.f0 = 2;
        object0 = f1.l0.B(l.d(v, v3), e0);
        return object0 == object1 ? object1 : new l(l.e(v3, ((l)object0).a));
    }

    @Override  // y0.a
    public final long Q(long v, long v1, int v2) {
        long v3 = this.l0.Q(v, v1, v2);
        f f0 = this.k0 ? ((f)F0.f.k(this)) : null;
        return f0 == null ? b.i(v3, 0L) : b.i(v3, f0.Q(b.i(v, v3), b.h(v1, v3), v2));
    }

    @Override  // y0.a
    public final long e0(int v, long v1) {
        f f0 = this.k0 ? ((f)F0.f.k(this)) : null;
        if(f0 != null) {
            long v2 = f0.e0(v, v1);
            return b.i(v2, this.l0.e0(v, b.h(v1, v2)));
        }
        return b.i(0L, this.l0.e0(v, b.h(v1, 0L)));
    }

    @Override  // F0.q0
    public final Object p() {
        return this.n0;
    }

    @Override  // g0.n
    public final void p0() {
        NestedScrollDispatcher nestedScrollDispatcher0 = this.m0;
        nestedScrollDispatcher0.a = this;
        nestedScrollDispatcher0.b = new D(28, this);
        nestedScrollDispatcher0.c = this.l0();
    }

    @Override  // g0.n
    public final void q0() {
        NestedScrollDispatcher nestedScrollDispatcher0 = this.m0;
        if(nestedScrollDispatcher0.a == this) {
            nestedScrollDispatcher0.a = null;
        }
    }

    @Override  // y0.a
    public final Object t(long v, long v1, g g0) {
        f f0;
        long v5;
        long v4;
        d d0;
        if(g0 instanceof d) {
            d0 = (d)g0;
            int v2 = d0.g0;
            if((v2 & 0x80000000) == 0) {
                d0 = new d(this, ((c)g0));
            }
            else {
                d0.g0 = v2 ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, ((c)g0));
        }
        Object object0 = d0.e0;
        Object object1 = Eb.a.X;
        switch(d0.g0) {
            case 0: {
                W5.f.b0(object0);
                d0.b0 = this;
                v4 = v;
                d0.c0 = v4;
                v5 = v1;
                d0.d0 = v5;
                d0.g0 = 1;
                object0 = this.l0.t(v, v1, d0);
                if(object0 == object1) {
                    return object1;
                }
                f0 = this;
                break;
            }
            case 1: {
                long v6 = d0.d0;
                long v7 = d0.c0;
                f0 = d0.b0;
                W5.f.b0(object0);
                v5 = v6;
                v4 = v7;
                break;
            }
            case 2: {
                long v3 = d0.c0;
                W5.f.b0(object0);
                return new l(l.e(v3, ((l)object0).a));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v8 = ((l)object0).a;
        f f1 = f0.k0 ? ((f)F0.f.k(f0)) : null;
        if(f1 != null) {
            d0.b0 = null;
            d0.c0 = v8;
            d0.g0 = 2;
            object0 = f1.t(l.e(v4, v8), l.d(v5, v8), d0);
            return object0 == object1 ? object1 : new l(l.e(v8, ((l)object0).a));
        }
        return new l(l.e(v8, 0L));
    }

    public final G x0() {
        f f0 = this.k0 ? ((f)F0.f.k(this)) : null;
        if(f0 != null) {
            return f0.x0();
        }
        G g0 = this.m0.c;
        if(g0 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return g0;
    }
}

