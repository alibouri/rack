package F0;

import Ab.t;
import D0.I;
import D0.J;
import D0.L;
import Nb.j;
import a1.g;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import io.sentry.config.a;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

public abstract class P extends O implements J {
    public final c0 j0;
    public long k0;
    public LinkedHashMap l0;
    public final I m0;
    public L n0;
    public final LinkedHashMap o0;

    public P(c0 c00) {
        this.j0 = c00;
        this.k0 = 0L;
        this.m0 = new I(this);
        this.o0 = new LinkedHashMap();
    }

    @Override  // D0.V
    public final void Z(long v, float f, Function1 function10) {
        this.w0(v);
        if(this.e0) {
            return;
        }
        this.v0();
    }

    @Override  // D0.J, D0.V
    public final Object g() {
        return this.j0.g();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.j0.getDensity();
    }

    @Override  // D0.o
    public final LayoutDirection getLayoutDirection() {
        return this.j0.j0.q0;
    }

    @Override  // F0.O
    public final O l0() {
        c0 c00 = this.j0.k0;
        return c00 != null ? c00.E0() : null;
    }

    @Override  // F0.O
    public final LayoutCoordinates m0() {
        return this.m0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.j0.n();
    }

    @Override  // F0.O
    public final boolean n0() {
        return this.n0 != null;
    }

    @Override  // F0.O
    public final LayoutNode o0() {
        return this.j0.j0;
    }

    @Override  // F0.O
    public final L p0() {
        L l0 = this.n0;
        if(l0 == null) {
            throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
        }
        return l0;
    }

    @Override  // F0.O
    public final O q0() {
        c0 c00 = this.j0.l0;
        return c00 != null ? c00.E0() : null;
    }

    @Override  // F0.O
    public final long r0() {
        return this.k0;
    }

    @Override  // F0.O
    public final boolean s() {
        return true;
    }

    @Override  // F0.O
    public final void t0() {
        this.Z(this.k0, 0.0f, null);
    }

    public static final void u0(P p0, L l0) {
        t t0;
        if(l0 == null) {
            t0 = null;
        }
        else {
            p0.c0(a.d(l0.l(), l0.e()));
            t0 = t.a;
        }
        if(t0 == null) {
            p0.c0(0L);
        }
        if(!j.a(p0.n0, l0) && l0 != null && ((p0.l0 == null && !p0.l0.isEmpty() || !l0.m().isEmpty()) && !j.a(l0.m(), p0.l0))) {
            F0.I i0 = p0.j0.j0.v0.s;
            j.c(i0);
            i0.p0.f();
            LinkedHashMap linkedHashMap0 = p0.l0;
            if(linkedHashMap0 == null) {
                linkedHashMap0 = new LinkedHashMap();
                p0.l0 = linkedHashMap0;
            }
            linkedHashMap0.clear();
            linkedHashMap0.putAll(l0.m());
        }
        p0.n0 = l0;
    }

    public void v0() {
        this.p0().n();
    }

    public final void w0(long v) {
        if(!g.b(this.k0, v)) {
            this.k0 = v;
            c0 c00 = this.j0;
            F0.I i0 = c00.j0.v0.s;
            if(i0 != null) {
                i0.l0();
            }
            O.s0(c00);
        }
        if(!this.f0) {
            this.h0(new l0(this.p0(), this));
        }
    }

    public final long x0(P p0, boolean z) {
        long v = 0L;
        P p1 = this;
        while(!p1.equals(p0)) {
            if(!p1.d0 || !z) {
                v = g.d(v, p1.k0);
            }
            c0 c00 = p1.j0.l0;
            j.c(c00);
            p1 = c00.E0();
            j.c(p1);
        }
        return v;
    }
}

