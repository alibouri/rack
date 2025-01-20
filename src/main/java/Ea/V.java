package Ea;

import A3.e;
import Aa.P;
import Ab.t;
import Bb.A;
import C.n;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.LayoutDirection;
import g1.i;
import g1.j;
import g1.k;
import h1.c;
import io.sentry.config.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l1.b;
import l1.f;
import l1.g;
import l1.h;
import o1.d;

public final class v implements K {
    public final MutableState a;
    public final j b;
    public final i c;
    public final MutableState d;

    public v(MutableState mutableState0, j j0, i i0, MutableState mutableState1) {
        this.a = mutableState0;
        this.b = j0;
        this.c = i0;
        this.d = mutableState1;
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return e.e(this, o0, list0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        f f1;
        f f0;
        long v1;
        this.a.getValue();
        LayoutDirection layoutDirection0 = m0.getLayoutDirection();
        j j0 = this.b;
        j0.getClass();
        if(list0.isEmpty()) {
            v1 = a.d(a1.a.j(v), a1.a.i(v));
        }
        else {
            String s = f.i;
            if(a1.a.f(v)) {
                f0 = f.b(a1.a.h(v));
            }
            else {
                f0 = new f(s);
                int v2 = a1.a.j(v);
                if(v2 >= 0) {
                    f0.a = v2;
                }
            }
            k k0 = j0.e;
            k0.f.d0 = f0;
            if(a1.a.e(v)) {
                f1 = f.b(a1.a.g(v));
            }
            else {
                f1 = new f(s);
                int v3 = a1.a.i(v);
                if(v3 >= 0) {
                    f1.a = v3;
                }
            }
            b b0 = k0.f;
            b0.e0 = f1;
            o1.e e0 = j0.a;
            b0.d0.a(e0, 0);
            b0.e0.a(e0, 1);
            k0.l = v;
            k0.b = (layoutDirection0 == LayoutDirection.Y ? 1 : 0) ^ 1;
            j0.b.clear();
            j0.c.clear();
            j0.d.clear();
            i i0 = this.c;
            ArrayList arrayList0 = i0.d0;
            if(i0.b0 || list0.size() != arrayList0.size()) {
            label_46:
                HashMap hashMap0 = k0.c;
                for(Object object1: hashMap0.keySet()) {
                    ((h)hashMap0.get(object1)).a().D();
                }
                hashMap0.clear();
                hashMap0.put(0, b0);
                HashMap hashMap1 = k0.d;
                hashMap1.clear();
                k0.e.clear();
                k0.h.clear();
                k0.j = true;
                arrayList0.clear();
                n n0 = new n(list0, i0, k0, 8);
                i0.Z.c(t.a, i0.c0, n0);
                i0.b0 = false;
                R2.f.p(k0, list0);
                e0.r0.clear();
                b0.d0.a(e0, 0);
                b0.e0.a(e0, 1);
                for(Object object2: hashMap1.keySet()) {
                    o1.i i1 = ((g)hashMap1.get(object2)).s();
                    if(i1 != null) {
                        h h0 = (h)hashMap0.get(object2);
                        if(h0 == null) {
                            h0 = k0.b(object2);
                        }
                        h0.b(i1);
                    }
                }
                for(Object object3: hashMap0.keySet()) {
                    h h1 = (h)hashMap0.get(object3);
                    if(h1 != b0 && h1.c() instanceof g) {
                        o1.i i2 = ((g)h1.c()).s();
                        if(i2 != null) {
                            h h2 = (h)hashMap0.get(object3);
                            if(h2 == null) {
                                h2 = k0.b(object3);
                            }
                            h2.b(i2);
                        }
                    }
                }
                for(Object object4: hashMap0.keySet()) {
                    h h3 = (h)hashMap0.get(object4);
                    if(h3 == b0) {
                        h3.b(e0);
                    }
                    else {
                        d d0 = h3.a();
                        d0.i0 = h3.getKey().toString();
                        d0.U = null;
                        if(h3.c() instanceof m1.g) {
                            h3.apply();
                        }
                        e0.V(d0);
                    }
                }
                for(Object object5: hashMap1.keySet()) {
                    g g0 = (g)hashMap1.get(object5);
                    if(g0.s() != null) {
                        for(Object object6: g0.m0) {
                            d d1 = ((h)hashMap0.get(object6)).a();
                            g0.s().V(d1);
                        }
                    }
                    g0.apply();
                }
                for(Object object7: hashMap0.keySet()) {
                    h h4 = (h)hashMap0.get(object7);
                    if(h4 != b0 && h4.c() instanceof g) {
                        g g1 = (g)h4.c();
                        o1.i i3 = g1.s();
                        if(i3 != null) {
                            for(Object object8: g1.m0) {
                                h h5 = (h)hashMap0.get(object8);
                                if(h5 != null) {
                                    i3.V(h5.a());
                                }
                                else if(object8 instanceof h) {
                                    i3.V(((h)object8).a());
                                }
                                else {
                                    System.out.println("couldn\'t find reference for " + object8);
                                }
                            }
                            h4.apply();
                        }
                    }
                }
                for(Object object9: hashMap0.keySet()) {
                    h h6 = (h)hashMap0.get(object9);
                    h6.apply();
                    d d2 = h6.a();
                    if(d2 != null && object9 != null) {
                        d2.k = object9.toString();
                    }
                }
            }
            else {
                int v4 = list0.size();
                int v5 = 0;
                while(v5 < v4) {
                    Object object0 = ((J)list0.get(v5)).g();
                    if(!Nb.j.a((object0 instanceof g1.e ? ((g1.e)object0) : null), arrayList0.get(v5))) {
                        goto label_46;
                    }
                    ++v5;
                }
                R2.f.p(k0, list0);
            }
            e0.S(a1.a.h(v));
            e0.N(a1.a.g(v));
            e0.s0.X(e0);
            e0.E0 = 0x101;
            c.q = e0.c0(0x200);
            e0.a0(e0.E0, 0, 0, 0, 0, 0, 0);
            v1 = a.d(e0.r(), e0.l());
        }
        this.d.getValue();
        P p0 = new P(j0, 5, list0);
        return m0.L(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)), A.X, p0);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        return e.h(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        return e.k(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        return e.b(this, o0, list0, v);
    }
}

