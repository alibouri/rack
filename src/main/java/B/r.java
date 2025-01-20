package B;

import D0.J;
import D0.K;
import D0.V;
import F0.h;
import F0.i;
import F0.j;
import F0.k;
import U.d;
import U.g0;
import U.l0;
import U.p;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.LayoutDirection;
import g0.a;
import g0.b;
import g0.c;
import g0.g;
import java.util.HashMap;

public abstract class r {
    public static final HashMap a;
    public static final HashMap b;
    public static final q c;

    static {
        r.a = r.c(true);
        r.b = r.c(false);
        new u(b.a, false);
        r.c = q.b;
    }

    public static final void a(Modifier modifier0, p p0, int v) {
        p0.S(-211209833);
        if((((v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            int v1 = p0.P;
            Modifier modifier1 = a.d(p0, modifier0);
            g0 g00 = p0.m();
            k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, r.c, j.f);
            d.K(p0, g00, j.e);
            d.K(p0, modifier1, j.d);
            h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new o(v, 0, modifier0);
        }
    }

    public static final void b(Placeable.PlacementScope placeable$PlacementScope0, V v0, J j0, LayoutDirection layoutDirection0, int v1, int v2, c c0) {
        c c1;
        Object object0 = j0.g();
        n n0 = object0 instanceof n ? ((n)object0) : null;
        if(n0 == null) {
            c1 = c0;
        }
        else {
            g g0 = n0.l0;
            c1 = g0 == null ? c0 : g0;
        }
        Placeable.PlacementScope.e(placeable$PlacementScope0, v0, c1.a(io.sentry.config.a.d(v0.X, v0.Y), io.sentry.config.a.d(v1, v2), layoutDirection0));
    }

    public static final HashMap c(boolean z) {
        HashMap hashMap0 = new HashMap(9);
        r.d(hashMap0, z, b.a);
        r.d(hashMap0, z, b.b);
        r.d(hashMap0, z, b.c);
        r.d(hashMap0, z, b.d);
        r.d(hashMap0, z, b.e);
        r.d(hashMap0, z, b.f);
        r.d(hashMap0, z, b.g);
        r.d(hashMap0, z, b.h);
        r.d(hashMap0, z, b.i);
        return hashMap0;
    }

    public static final void d(HashMap hashMap0, boolean z, g g0) {
        hashMap0.put(g0, new u(g0, z));
    }

    public static final K e(c c0, boolean z) {
        K k0 = (K)(z ? r.a : r.b).get(c0);
        return k0 == null ? new u(c0, z) : k0;
    }
}

