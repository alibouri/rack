package B;

import Bb.q;
import C.n;
import D0.J;
import D0.M;
import D0.V;
import J2.w;
import M0.i;
import N.L;
import N.P;
import N.z0;
import Nb.j;
import Nb.k;
import Nb.u;
import R.A0;
import U.N0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import io.sentry.config.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.e;
import m5.b;
import n0.l;
import n0.v;
import p0.d;
import p0.g;
import p0.h;
import v.h0;

public final class t extends k implements Function1 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;

    public t(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        this.c0 = object3;
        this.d0 = object4;
        this.e0 = object5;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        float f3;
        Object object1 = Ab.t.a;
        Object object2 = this.c0;
        Object object3 = this.b0;
        Object object4 = this.e0;
        Object object5 = this.Y;
        Object object6 = this.Z;
        Object object7 = this.d0;
        switch(this.X) {
            case 0: {
                int v1 = 0;
                for(int v = 0; v1 < ((V[])object5).length; ++v) {
                    V v2 = ((V[])object5)[v1];
                    j.d(v2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    r.b(((Placeable.PlacementScope)object0), v2, ((J)((List)object6).get(v)), ((M)object3).getLayoutDirection(), ((u)object2).X, ((u)object7).X, ((B.u)object4).a);
                    ++v1;
                }
                return object1;
            }
            case 1: {
                float f = (float)Math.floor(((d)object0).w(P.d));
                long v3 = ((v)((N0)object6).getValue()).a;
                long v4 = ((v)((N0)object3).getValue()).a;
                float f1 = ((d)object0).w(P.e);
                h h0 = new h(f, 0.0f, 0, 0, 30);
                float f2 = e.d(((d)object0).d());
                g g0 = g.a;
                if(v.c(v3, v4)) {
                    b.n(((d)object0), v3, 0L, w.m(f2, f2), q.a(f1, f1), g0, 0xE2);
                    f3 = f;
                }
                else {
                    float f4 = f2 - f * 2.0f;
                    float f5 = Math.max(0.0f, f1 - f);
                    f3 = f;
                    b.n(((d)object0), v3, yc.d.d(f, f), w.m(f4, f4), q.a(f5, f5), g0, 0xE0);
                    float f6 = f1 - f / 2.0f;
                    b.n(((d)object0), v4, yc.d.d(f / 2.0f, f / 2.0f), w.m(f2 - f3, f2 - f3), q.a(f6, f6), h0, 0xE0);
                }
                long v5 = ((v)((N0)object2).getValue()).a;
                float f7 = ((Number)((h0)object7).f0.getValue()).floatValue();
                float f8 = ((Number)((h0)object4).f0.getValue()).floatValue();
                h h1 = new h(f3, 0.0f, 2, 0, 26);
                float f9 = e.d(((d)object0).d());
                ((L)object5).a.reset();
                Path path0 = ((L)object5).a;
                path0.a(0.2f * f9, a.V(0.5f, 0.5f, f8) * f9);
                path0.c(a.V(0.4f, 0.5f, f8) * f9, a.V(0.7f, 0.5f, f8) * f9);
                path0.c(0.8f * f9, f9 * a.V(0.3f, 0.5f, f8));
                l l0 = ((L)object5).b;
                l0.getClass();
                if(!(path0 instanceof n0.j)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                l0.a.setPath(((n0.j)path0).a, false);
                ((L)object5).c.reset();
                l0.a(0.0f, l0.a.getLength() * f7, ((L)object5).c);
                b.j(((d)object0), ((L)object5).c, v5, 0.0f, h1, 52);
                return object1;
            }
            default: {
                M0.a a0 = new M0.a(((String)object6), new z0(((Function0)object7), 1));
                ((M0.j)object0).c(i.t, a0);
                A0 a00 = (A0)((R.z0)object5).c.d.getValue();
                A0 a01 = A0.Z;
                if(a00 == a01) {
                    M0.a a1 = new M0.a(((String)object3), new n(((R.z0)object5), ((dc.e)object4), ((R.z0)object5), 7));
                    ((M0.j)object0).c(i.r, a1);
                    return object1;
                }
                if(((Map)((R.z0)object5).c.h().a).containsKey(a01)) {
                    M0.a a2 = new M0.a(((String)object2), new D.j(((R.z0)object5), 20, ((dc.e)object4)));
                    ((M0.j)object0).c(i.s, a2);
                }
                return object1;
            }
        }
    }
}

