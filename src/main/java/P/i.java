package P;

import Ab.t;
import Bb.v;
import Nb.a;
import Nb.j;
import Qa.G;
import Qa.Y;
import Qa.c;
import Xb.J;
import Y8.N;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import f9.D;
import f9.E;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k2.C1;
import k2.M;
import k2.Q1;
import k2.b1;
import k2.c0;
import k2.c1;
import k2.d0;
import k2.d;
import k2.f;
import k2.g0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class i extends a implements Function2 {
    public final int f0;

    public i(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.f0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.f0) {
            case 0: {
                float f = ((Number)object0).floatValue();
                g g1 = (g)object1;
                n n0 = (n)this.X;
                float f1 = 0.0f;
                if(!n0.b()) {
                    if(n0.a() > n0.g.k()) {
                        ((Function0)n0.b.getValue()).invoke();
                    }
                    m m0 = new m(n0, 0.0f, null);
                    J.q(n0.a, null, null, m0, 3);
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = n0.f;
                    if(parcelableSnapshotMutableFloatState0.k() == 0.0f) {
                        f = 0.0f;
                    }
                    else if(f < 0.0f) {
                        f = 0.0f;
                    }
                    parcelableSnapshotMutableFloatState0.m(0.0f);
                    f1 = f;
                }
                return new Float(f1);
            }
            case 1: {
                int v = ((Number)object1).intValue();
                j.f(((c)object0), "p0");
                ((Y)this.X).getClass();
                G g2 = new G(((Y)this.X), ((c)object0), v, null);
                N.k(((Y)this.X), ((Y)this.X).f0, true, g2);
                return t.a;
            }
            case 2: {
                g g3 = (g)object1;
                k2.g g4 = ((D)this.X).d;
                int v1 = g4.f + 1;
                g4.f = v1;
                c1 c10 = g4.d;
                if(((c1)object0) != c10) {
                    d d0 = g4.h;
                    f f2 = g4.j;
                    if(c10 != null && ((c1)object0) instanceof M) {
                        j.f(f2, "callback");
                        V2.a a0 = new V2.a(16, f2);
                        v.i0(c10.d0, a0);
                        j.f(d0, "listener");
                        b1 b10 = new b1(d0, 0);
                        v.i0(c10.e0, b10);
                        g4.g.b(g0.X, c0.b);
                        d0 d00 = new d0(false);  // initializer: Lk2/e0;-><init>(Z)V
                        g4.g.b(g0.Y, d00);
                        d0 d01 = new d0(false);  // initializer: Lk2/e0;-><init>(Z)V
                        g4.g.b(g0.Z, d01);
                        return t.a;
                    }
                    c1 c11 = g4.e;
                    c1 c12 = c11 == null ? c10 : c11;
                    if(((c1)object0) == null) {
                        if(c11 == null) {
                            c11 = c10;
                        }
                        int v2 = c11 == null ? 0 : c11.b0.e();
                        if(c10 != null) {
                            j.f(f2, "callback");
                            V2.a a1 = new V2.a(16, f2);
                            v.i0(c10.d0, a1);
                            j.f(d0, "listener");
                            b1 b11 = new b1(d0, 0);
                            v.i0(c10.e0, b11);
                            g4.d = null;
                        }
                        else if(g4.e != null) {
                            g4.e = null;
                        }
                        ((androidx.recyclerview.widget.a)g4.a()).a(0, v2);
                        g4.b(c12, null);
                        return t.a;
                    }
                    if(c11 == null) {
                        c11 = c10;
                    }
                    if(c11 == null) {
                        g4.d = (c1)object0;
                        j.f(d0, "listener");
                        v.i0(((c1)object0).e0, k2.v.b0);
                        WeakReference weakReference0 = new WeakReference(d0);
                        ((c1)object0).e0.add(weakReference0);
                        ((c1)object0).c(d0);
                        ((c1)object0).a(f2);
                        ((androidx.recyclerview.widget.a)g4.a()).c(0, ((c1)object0).b0.e());
                        g4.b(null, ((c1)object0));
                        return t.a;
                    }
                    if(c10 != null) {
                        j.f(f2, "callback");
                        V2.a a2 = new V2.a(16, f2);
                        v.i0(c10.d0, a2);
                        j.f(d0, "listener");
                        b1 b12 = new b1(d0, 0);
                        v.i0(c10.e0, b12);
                        if(!c10.i()) {
                            c10 = new Q1(c10);
                        }
                        g4.e = c10;
                        g4.d = null;
                    }
                    c1 c13 = g4.e;
                    if(c13 == null || g4.d != null) {
                        throw new IllegalStateException("must be in snapshot state to diff");
                    }
                    c1 c14 = ((c1)object0).i() ? ((c1)object0) : new Q1(((c1)object0));
                    C1 c15 = new C1();
                    ((c1)object0).a(c15);
                    ((ExecutorService)g4.b.Y).execute(new k2.a(c13, c14, g4, v1, ((c1)object0), c15));
                    return t.a;
                }
                return t.a;
            }
            default: {
                g g0 = (g)object1;
                ((E)this.X).q(((List)object0));
                return t.a;
            }
        }
    }
}

