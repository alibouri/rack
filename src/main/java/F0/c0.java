package F0;

import B.L0;
import Bb.q;
import D0.I;
import D0.J;
import D0.L;
import D0.a0;
import D0.b0;
import Nb.j;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import b4.s;
import e0.g;
import g0.n;
import io.sentry.config.a;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import m0.c;
import m0.e;
import n0.D;
import n0.G;
import n0.M;
import n0.W;
import n0.h;
import n0.t;
import q0.b;

public abstract class c0 extends O implements J, j0, LayoutCoordinates {
    public boolean A0;
    public h0 B0;
    public b C0;
    public static final n0.O D0;
    public static final v E0;
    public static final float[] F0;
    public static final d G0;
    public static final d H0;
    public final LayoutNode j0;
    public c0 k0;
    public c0 l0;
    public boolean m0;
    public boolean n0;
    public Function1 o0;
    public Density p0;
    public LayoutDirection q0;
    public float r0;
    public L s0;
    public LinkedHashMap t0;
    public long u0;
    public float v0;
    public s w0;
    public v x0;
    public final L0 y0;
    public final a0 z0;

    static {
        n0.O o0 = new n0.O();  // initializer: Ljava/lang/Object;-><init>()V
        o0.Y = 1.0f;
        o0.Z = 1.0f;
        o0.b0 = 1.0f;
        o0.f0 = D.a;
        o0.g0 = D.a;
        o0.k0 = 8.0f;
        o0.l0 = W.b;
        o0.m0 = M.a;
        o0.o0 = 0;
        o0.p0 = 0x7FC000007FC00000L;
        o0.q0 = Z6.b.b();
        o0.r0 = LayoutDirection.X;
        c0.D0 = o0;
        c0.E0 = new v();
        c0.F0 = G.a();
        c0.G0 = new d(1);
        c0.H0 = new d(2);
    }

    public c0(LayoutNode layoutNode0) {
        this.j0 = layoutNode0;
        this.p0 = layoutNode0.p0;
        this.q0 = layoutNode0.q0;
        this.r0 = 0.8f;
        this.u0 = 0L;
        this.y0 = new L0(3, this);
        this.z0 = new a0(7, this);
    }

    public final void A0(t t0, b b0) {
        n n0 = this.H0(4);
        if(n0 == null) {
            this.S0(t0, b0);
            return;
        }
        this.j0.getClass();
        LayoutNodeDrawScope layoutNodeDrawScope0 = F0.G.a(this.j0).getSharedDrawScope();
        long v = a.a0(this.Z);
        layoutNodeDrawScope0.getClass();
        W.d d0 = null;
        while(n0 != null) {
            if(n0 instanceof o) {
                layoutNodeDrawScope0.b(t0, v, this, ((o)n0), b0);
            }
            else if((n0.Z & 4) != 0 && n0 instanceof F0.n) {
                n n1 = ((F0.n)n0).m0;
                int v1 = 0;
                while(n1 != null) {
                    if((n1.Z & 4) != 0) {
                        ++v1;
                        if(v1 == 1) {
                            n0 = n1;
                        }
                        else {
                            if(d0 == null) {
                                d0 = new W.d(new n[16]);
                            }
                            if(n0 != null) {
                                d0.c(n0);
                                n0 = null;
                            }
                            d0.c(n1);
                        }
                    }
                    n1 = n1.d0;
                }
                if(v1 != 1) {
                    goto label_31;
                }
                continue;
            }
        label_31:
            n0 = f.f(d0);
        }
    }

    public abstract void B0();

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long C() {
        return this.Z;
    }

    public final c0 C0(c0 c00) {
        LayoutNode layoutNode0 = c00.j0;
        LayoutNode layoutNode1 = this.j0;
        if(layoutNode0 == layoutNode1) {
            n n0 = c00.G0();
            n n1 = this.G0().X;
            if(n1.k0) {
                for(n n2 = n1.c0; n2 != null; n2 = n2.c0) {
                    if((n2.Z & 2) != 0 && n2 == n0) {
                        return c00;
                    }
                }
                return this;
            }
            M6.b.T("visitLocalAncestors called on an unattached node");
            throw null;
        }
        while(layoutNode0.i0 > layoutNode1.i0) {
            layoutNode0 = layoutNode0.s();
            j.c(layoutNode0);
        }
        LayoutNode layoutNode2 = layoutNode1;
        while(layoutNode2.i0 > layoutNode0.i0) {
            layoutNode2 = layoutNode2.s();
            j.c(layoutNode2);
        }
        while(layoutNode0 != layoutNode2) {
            layoutNode0 = layoutNode0.s();
            layoutNode2 = layoutNode2.s();
            if(layoutNode0 == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
            if(false) {
                break;
            }
        }
        if(layoutNode2 == layoutNode1) {
            return this;
        }
        return layoutNode0 != c00.j0 ? ((F0.t)layoutNode0.u0.c) : c00;
    }

    public final long D0(long v, boolean z) {
        if(z || !this.d0) {
            v = yc.d.d(m0.b.d(v) - ((float)(((int)(this.u0 >> 0x20)))), m0.b.e(v) - ((float)(((int)(this.u0 & 0xFFFFFFFFL)))));
        }
        return this.B0 == null ? v : this.B0.a(v, true);
    }

    public abstract P E0();

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long F(long v) {
        if(this.G0().k0) {
            this.P0();
            for(c0 c00 = this; c00 != null; c00 = c00.l0) {
                v = c00.Y0(v, true);
            }
            return v;
        }
        M6.b.T("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final long F0() {
        return this.p0.P(this.j0.r0.g());
    }

    public abstract n G0();

    public final n H0(int v) {
        n n1;
        boolean z = d0.h(v);
        n n0 = this.G0();
        if(z) {
            n1 = this.I0(z);
        label_8:
            while(n1 != null && (n1.b0 & v) != 0) {
                if((n1.Z & v) != 0) {
                    return n1;
                }
                if(n1 == n0) {
                    break;
                }
                n1 = n1.d0;
            }
        }
        else {
            n0 = n0.c0;
            if(n0 != null) {
                n1 = this.I0(z);
                goto label_8;
            }
        }
        return null;
    }

    public final n I0(boolean z) {
        F0.W w0 = this.j0.u0;
        if(((c0)w0.d) == this) {
            return (n)w0.f;
        }
        if(z) {
            c0 c00 = this.l0;
            if(c00 != null) {
                n n0 = c00.G0();
                return n0 == null ? null : n0.d0;
            }
            return null;
        }
        return this.l0 == null ? null : this.l0.G0();
    }

    public final void J0(n n0, d d0, long v, r r0, boolean z, boolean z1) {
        if(n0 == null) {
            this.L0(d0, v, r0, z, z1);
            return;
        }
        r0.c(n0, -1.0f, z1, new Z(this, n0, d0, v, r0, z, z1));
        c0 c00 = n0.f0;
        if(c00 != null) {
            n n1 = c00.I0(false);
            if(n1 != null && n1.k0) {
                n n2 = n1.X;
                if(!n2.k0) {
                    M6.b.T("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                else if((n2.b0 & 16) != 0) {
                    while(n2 != null) {
                        if((n2.Z & 16) != 0) {
                            n n3 = n2;
                            W.d d1 = null;
                            while(n3 != null) {
                                if(n3 instanceof m0) {
                                    if(((m0)n3).N()) {
                                        return;
                                    }
                                }
                                else if((n3.Z & 16) != 0 && n3 instanceof F0.n) {
                                    n n4 = ((F0.n)n3).m0;
                                    int v1 = 0;
                                    while(n4 != null) {
                                        if((n4.Z & 16) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                n3 = n4;
                                            }
                                            else {
                                                if(d1 == null) {
                                                    d1 = new W.d(new n[16]);
                                                }
                                                if(n3 != null) {
                                                    d1.c(n3);
                                                    n3 = null;
                                                }
                                                d1.c(n4);
                                            }
                                        }
                                        n4 = n4.d0;
                                    }
                                    if(v1 != 1) {
                                        goto label_37;
                                    }
                                    continue;
                                }
                            label_37:
                                n3 = f.f(d1);
                            }
                        }
                        n2 = n2.d0;
                    }
                }
            }
            r0.c0 = false;
        }
    }

    public final void K0(d d0, long v, r r0, boolean z, boolean z1) {
        n n0 = this.H0(d0.a());
        if(yc.d.n(v) && (this.B0 == null || !this.n0 || this.B0.l(v))) {
            if(n0 == null) {
                this.L0(d0, v, r0, z, z1);
                return;
            }
            float f1 = m0.b.d(v);
            float f2 = m0.b.e(v);
            if(f1 < 0.0f && f2 < 0.0f && f1 >= ((float)this.X()) && f2 >= ((float)this.R())) {
                this.J0(n0, d0, v, r0, z, z1);
                return;
            }
            float f3 = z ? this.x0(v, this.F0()) : Infinityf;
            if(!Float.isInfinite(f3) && !Float.isNaN(f3) && (r0.Z == q.y(r0) || f.h(r0.a(), f.a(f3, z1)) > 0)) {
                r0.c(n0, f3, z1, new F0.a0(this, n0, d0, v, r0, z, z1, f3, 0));
                return;
            }
            this.W0(n0, d0, v, r0, z, z1, f3);
        }
        else if(z) {
            float f = this.x0(v, this.F0());
            if(!Float.isInfinite(f) && !Float.isNaN(f) && (r0.Z == q.y(r0) || f.h(r0.a(), f.a(f, false)) > 0)) {
                if(n0 == null) {
                    this.L0(d0, v, r0, z, false);
                    return;
                }
                r0.c(n0, f, false, new F0.a0(this, n0, d0, v, r0, z, false, f, 0));
            }
        }
    }

    public void L0(d d0, long v, r r0, boolean z, boolean z1) {
        c0 c00 = this.k0;
        if(c00 != null) {
            c00.K0(d0, c00.D0(v, true), r0, z, z1);
        }
    }

    public final void M0() {
        h0 h00 = this.B0;
        if(h00 != null) {
            h00.invalidate();
            return;
        }
        c0 c00 = this.l0;
        if(c00 != null) {
            c00.M0();
        }
    }

    public final boolean N0() {
        if(this.B0 != null && this.r0 > 0.0f) {
            return true;
        }
        return this.l0 == null ? false : this.l0.N0();
    }

    public final long O0(LayoutCoordinates layoutCoordinates0, long v) {
        if(layoutCoordinates0 instanceof I) {
            ((I)layoutCoordinates0).X.j0.P0();
            return ((I)layoutCoordinates0).b(this, v ^ 0x8000000080000000L) ^ 0x8000000080000000L;
        }
        c0 c00 = c0.X0(layoutCoordinates0);
        c00.P0();
        c0 c01 = this.C0(c00);
        while(c00 != c01) {
            v = c00.Y0(v, true);
            c00 = c00.l0;
            j.c(c00);
        }
        return this.v0(c01, v);
    }

    public final void P0() {
        F0.L l0 = this.j0.v0;
        int v = l0.a.v0.c;
        if(v == 3 || v == 4) {
            if(l0.r.v0) {
                l0.e(true);
            }
            else {
                l0.d(true);
            }
        }
        if(v == 4) {
            if(l0.s != null && l0.s.s0) {
                l0.g(true);
                return;
            }
            l0.f(true);
        }
    }

    public final void Q0() {
        n n0 = this.I0(true);
        if(n0 != null && (n0.X.b0 & 0x80) != 0) {
            g g0 = e0.q.c();
            Function1 function10 = g0 == null ? null : g0.f();
            g g1 = e0.q.d(g0);
            try {
                n n1 = this.G0();
                n n2 = this.I0(true);
                while(n2 != null && (n2.b0 & 0x80) != 0) {
                    if((n2.Z & 0x80) != 0) {
                        W.d d0 = null;
                        n n3 = n2;
                        while(n3 != null) {
                            if(n3 instanceof w) {
                                ((w)n3).r(this.Z);
                            }
                            else if((n3.Z & 0x80) != 0 && n3 instanceof F0.n) {
                                n n4 = ((F0.n)n3).m0;
                                int v1 = 0;
                                while(n4 != null) {
                                    if((n4.Z & 0x80) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            n3 = n4;
                                        }
                                        else {
                                            if(d0 == null) {
                                                d0 = new W.d(new n[16]);
                                            }
                                            if(n3 != null) {
                                                d0.c(n3);
                                                n3 = null;
                                            }
                                            d0.c(n4);
                                        }
                                    }
                                    n4 = n4.d0;
                                }
                                if(v1 != 1) {
                                    goto label_34;
                                }
                                continue;
                            }
                        label_34:
                            n3 = f.f(d0);
                        }
                    }
                    if(n2 == n1) {
                        break;
                    }
                    n2 = n2.d0;
                }
            }
            finally {
                e0.q.g(g0, g1, function10);
            }
        }
    }

    public final void R0() {
        n n0 = this.G0();
        n n1 = this.I0(true);
        while(n1 != null && (n1.b0 & 0x80) != 0) {
            if((n1.Z & 0x80) != 0) {
                n n2 = n1;
                W.d d0 = null;
                while(n2 != null) {
                    if(n2 instanceof w) {
                        ((w)n2).C(this);
                    }
                    else if((n2.Z & 0x80) != 0 && n2 instanceof F0.n) {
                        n n3 = ((F0.n)n2).m0;
                        int v = 0;
                        while(n3 != null) {
                            if((n3.Z & 0x80) != 0) {
                                ++v;
                                if(v == 1) {
                                    n2 = n3;
                                }
                                else {
                                    if(d0 == null) {
                                        d0 = new W.d(new n[16]);
                                    }
                                    if(n2 != null) {
                                        d0.c(n2);
                                        n2 = null;
                                    }
                                    d0.c(n3);
                                }
                            }
                            n3 = n3.d0;
                        }
                        if(v != 1) {
                            goto label_28;
                        }
                        continue;
                    }
                label_28:
                    n2 = f.f(d0);
                }
            }
            if(n1 == n0) {
                break;
            }
            n1 = n1.d0;
        }
    }

    public abstract void S0(t arg1, b arg2);

    public final void T0(long v, float f, Function1 function10, b b0) {
        LayoutNode layoutNode0 = this.j0;
        if(b0 == null) {
            if(this.C0 != null) {
                this.C0 = null;
                this.b1(null, false);
            }
            this.b1(function10, false);
        }
        else {
            if(function10 != null) {
                M6.b.S("both ways to create layers shouldn\'t be used together");
                throw null;
            }
            if(this.C0 != b0) {
                this.C0 = null;
                this.b1(null, false);
                this.C0 = b0;
            }
            if(this.B0 == null) {
                h0 h00 = ((AndroidComposeView)F0.G.a(layoutNode0)).k(this.y0, this.z0, b0);
                h00.b(this.Z);
                h00.h(v);
                this.B0 = h00;
                layoutNode0.y0 = true;
                this.z0.invoke();
            }
        }
        if(!a1.g.b(this.u0, v)) {
            this.u0 = v;
            layoutNode0.v0.r.m0();
            h0 h01 = this.B0;
            if(h01 == null) {
                c0 c00 = this.l0;
                if(c00 != null) {
                    c00.M0();
                }
            }
            else {
                h01.h(v);
            }
            O.s0(this);
            AndroidComposeView androidComposeView0 = layoutNode0.g0;
            if(androidComposeView0 != null) {
                androidComposeView0.z(layoutNode0);
            }
        }
        this.v0 = f;
        if(!this.f0) {
            this.h0(new l0(this.p0(), this));
        }
    }

    public final void U0(s s0, boolean z, boolean z1) {
        h0 h00 = this.B0;
        if(h00 != null) {
            if(this.n0) {
                if(z1) {
                    long v = this.F0();
                    float f = e.d(v);
                    float f1 = e.b(v);
                    s0.a(-(f / 2.0f), -(f1 / 2.0f), ((float)(((int)(this.Z >> 0x20)))) + f / 2.0f, ((float)(((int)(this.Z & 0xFFFFFFFFL)))) + f1 / 2.0f);
                }
                else if(z) {
                    s0.a(0.0f, 0.0f, ((float)(((int)(this.Z >> 0x20)))), ((float)(((int)(this.Z & 0xFFFFFFFFL)))));
                }
                if(s0.b()) {
                    return;
                }
            }
            h00.c(s0, false);
        }
        float f2 = (float)(((int)(this.u0 >> 0x20)));
        s0.b += f2;
        s0.d += f2;
        float f3 = (float)(((int)(this.u0 & 0xFFFFFFFFL)));
        s0.c += f3;
        s0.e += f3;
    }

    public final void V0(L l0) {
        L l1 = this.s0;
        if(l0 != l1) {
            this.s0 = l0;
            LayoutNode layoutNode0 = this.j0;
            if(l1 == null || l0.l() != l1.l() || l0.e() != l1.e()) {
                int v = l0.l();
                int v1 = l0.e();
                h0 h00 = this.B0;
                if(h00 != null) {
                    h00.b(a.d(v, v1));
                }
                else if(layoutNode0.F()) {
                    c0 c00 = this.l0;
                    if(c00 != null) {
                        c00.M0();
                    }
                }
                this.c0(a.d(v, v1));
                if(this.o0 != null) {
                    this.c1(false);
                }
                n n0 = this.G0().c0;
                if(n0 == null) {
                label_52:
                    AndroidComposeView androidComposeView0 = layoutNode0.g0;
                    if(androidComposeView0 != null) {
                        androidComposeView0.z(layoutNode0);
                    }
                }
                else {
                    n n1 = this.I0(false);
                    while(true) {
                        if(n1 == null || (n1.b0 & 4) == 0) {
                            goto label_52;
                        }
                        if((n1.Z & 4) != 0) {
                            n n2 = n1;
                            W.d d0 = null;
                            while(n2 != null) {
                                if(n2 instanceof o) {
                                    ((o)n2).f0();
                                }
                                else if((n2.Z & 4) != 0 && n2 instanceof F0.n) {
                                    n n3 = ((F0.n)n2).m0;
                                    int v2 = 0;
                                    while(n3 != null) {
                                        if((n3.Z & 4) != 0) {
                                            ++v2;
                                            if(v2 == 1) {
                                                n2 = n3;
                                            }
                                            else {
                                                if(d0 == null) {
                                                    d0 = new W.d(new n[16]);
                                                }
                                                if(n2 != null) {
                                                    d0.c(n2);
                                                    n2 = null;
                                                }
                                                d0.c(n3);
                                            }
                                        }
                                        n3 = n3.d0;
                                    }
                                    if(v2 != 1) {
                                        goto label_47;
                                    }
                                    continue;
                                }
                            label_47:
                                n2 = f.f(d0);
                            }
                        }
                        if(n1 != n0) {
                            n1 = n1.d0;
                            continue;
                        }
                        goto label_52;
                    }
                }
            }
            if((this.t0 == null && !this.t0.isEmpty() || !l0.m().isEmpty()) && !j.a(l0.m(), this.t0)) {
                layoutNode0.v0.r.s0.f();
                LinkedHashMap linkedHashMap0 = this.t0;
                if(linkedHashMap0 == null) {
                    linkedHashMap0 = new LinkedHashMap();
                    this.t0 = linkedHashMap0;
                }
                linkedHashMap0.clear();
                linkedHashMap0.putAll(l0.m());
            }
        }
    }

    public final void W0(n n0, d d0, long v, r r0, boolean z, boolean z1, float f) {
        if(n0 == null) {
            this.L0(d0, v, r0, z, z1);
            return;
        }
        if(d0.X == 1) {
            W.d d1 = null;
            n n1 = n0;
            while(true) {
                int v1 = 0;
                if(n1 == null) {
                    break;
                }
                if(n1 instanceof m0) {
                    ((m0)n1).h0();
                }
                else if((n1.Z & 16) != 0 && n1 instanceof F0.n) {
                    for(n n2 = ((F0.n)n1).m0; n2 != null; n2 = n2.d0) {
                        if((n2.Z & 16) != 0) {
                            ++v1;
                            if(v1 == 1) {
                                n1 = n2;
                            }
                            else {
                                if(d1 == null) {
                                    d1 = new W.d(new n[16]);
                                }
                                if(n1 != null) {
                                    d1.c(n1);
                                    n1 = null;
                                }
                                d1.c(n2);
                            }
                        }
                    }
                    if(v1 != 1) {
                        goto label_28;
                    }
                    continue;
                }
            label_28:
                n1 = f.f(d1);
            }
        }
        this.W0(f.e(n0, d0.a()), d0, v, r0, z, z1, f);
    }

    public static c0 X0(LayoutCoordinates layoutCoordinates0) {
        I i0 = layoutCoordinates0 instanceof I ? ((I)layoutCoordinates0) : null;
        if(i0 != null) {
            c0 c00 = i0.X.j0;
            if(c00 != null) {
                return c00;
            }
        }
        j.d(layoutCoordinates0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (c0)layoutCoordinates0;
    }

    public final long Y0(long v, boolean z) {
        h0 h00 = this.B0;
        if(h00 != null) {
            v = h00.a(v, false);
        }
        return !z && this.d0 ? v : yc.d.d(m0.b.d(v) + ((float)(((int)(this.u0 >> 0x20)))), m0.b.e(v) + ((float)(((int)(this.u0 & 0xFFFFFFFFL)))));
    }

    public final void Z0(c0 c00, float[] arr_f) {
        if(!j.a(c00, this)) {
            c0 c01 = this.l0;
            j.c(c01);
            c01.Z0(c00, arr_f);
            if(!a1.g.b(this.u0, 0L)) {
                G.d(c0.F0);
                G.i(c0.F0, -((float)(((int)(this.u0 >> 0x20)))), -((float)(((int)(this.u0 & 0xFFFFFFFFL)))));
                G.g(arr_f, c0.F0);
            }
            h0 h00 = this.B0;
            if(h00 != null) {
                h00.e(arr_f);
            }
        }
    }

    public final void a1(c0 c00, float[] arr_f) {
        c0 c01 = this;
        while(!c01.equals(c00)) {
            h0 h00 = c01.B0;
            if(h00 != null) {
                h00.d(arr_f);
            }
            long v = c01.u0;
            if(!a1.g.b(v, 0L)) {
                G.d(c0.F0);
                G.i(c0.F0, ((float)(((int)(v >> 0x20)))), ((float)(((int)(v & 0xFFFFFFFFL)))));
                G.g(arr_f, c0.F0);
            }
            c01 = c01.l0;
            j.c(c01);
        }
    }

    @Override  // D0.V
    public abstract void b0(long arg1, float arg2, b arg3);

    public final void b1(Function1 function10, boolean z) {
        if(function10 == null || this.C0 == null) {
            LayoutNode layoutNode0 = this.j0;
            boolean z1 = z || this.o0 != function10 || !j.a(this.p0, layoutNode0.p0) || this.q0 != layoutNode0.q0;
            this.p0 = layoutNode0.p0;
            this.q0 = layoutNode0.q0;
            a0 a00 = this.z0;
            if(!layoutNode0.E() || function10 == null) {
                this.o0 = null;
                h0 h01 = this.B0;
                if(h01 != null) {
                    h01.g();
                    layoutNode0.y0 = true;
                    a00.invoke();
                    if(this.G0().k0) {
                        AndroidComposeView androidComposeView0 = layoutNode0.g0;
                        if(androidComposeView0 != null) {
                            androidComposeView0.z(layoutNode0);
                        }
                    }
                }
                this.B0 = null;
                this.A0 = false;
            }
            else {
                this.o0 = function10;
                if(this.B0 == null) {
                    h0 h00 = ((AndroidComposeView)F0.G.a(layoutNode0)).k(this.y0, a00, null);
                    h00.b(this.Z);
                    h00.h(this.u0);
                    this.B0 = h00;
                    this.c1(true);
                    layoutNode0.y0 = true;
                    a00.invoke();
                    return;
                }
                if(z1) {
                    this.c1(true);
                    return;
                }
            }
            return;
        }
        M6.b.S("layerBlock can\'t be provided when explicitLayer is provided");
        throw null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long c(long v) {
        if(this.G0().k0) {
            LayoutCoordinates layoutCoordinates0 = b0.h(this);
            AndroidComposeView androidComposeView0 = (AndroidComposeView)F0.G.a(this.j0);
            androidComposeView0.D();
            return this.O0(layoutCoordinates0, m0.b.h(G.b(v, androidComposeView0.Q0), layoutCoordinates0.F(0L)));
        }
        M6.b.T("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void c1(boolean z) {
        if(this.C0 != null) {
            return;
        }
        h0 h00 = this.B0;
        if(h00 != null) {
            Function1 function10 = this.o0;
            if(function10 != null) {
                n0.O o0 = c0.D0;
                o0.h(1.0f);
                o0.i(1.0f);
                o0.a(1.0f);
                o0.o(0.0f);
                o0.p(0.0f);
                o0.j(0.0f);
                o0.b(D.a);
                o0.l(D.a);
                o0.e(0.0f);
                o0.f(0.0f);
                o0.g(0.0f);
                if(o0.k0 != 8.0f) {
                    o0.X |= 0x800;
                    o0.k0 = 8.0f;
                }
                o0.m(W.b);
                o0.k(M.a);
                o0.c(false);
                if(!j.a(null, null)) {
                    o0.X |= 0x20000;
                }
                if(o0.o0 != 0) {
                    o0.X |= 0x8000;
                    o0.o0 = 0;
                }
                o0.p0 = 0x7FC000007FC00000L;
                o0.s0 = null;
                o0.X = 0;
                LayoutNode layoutNode0 = this.j0;
                o0.q0 = layoutNode0.p0;
                o0.r0 = layoutNode0.q0;
                o0.p0 = a.a0(this.Z);
                OwnerSnapshotObserver ownerSnapshotObserver0 = F0.G.a(layoutNode0).getSnapshotObserver();
                F0.b0 b00 = new F0.b0(0, function10);
                ownerSnapshotObserver0.a(this, F0.e.c0, b00);
                v v0 = this.x0;
                if(v0 == null) {
                    v0 = new v();
                    this.x0 = v0;
                }
                v0.a = o0.Y;
                v0.b = o0.Z;
                v0.c = o0.c0;
                v0.d = o0.d0;
                v0.e = o0.h0;
                v0.f = o0.i0;
                v0.g = o0.j0;
                v0.h = o0.k0;
                v0.i = o0.l0;
                h00.k(o0);
                this.n0 = o0.n0;
                this.r0 = o0.b0;
                if(!z) {
                    return;
                }
                AndroidComposeView androidComposeView0 = layoutNode0.g0;
                if(androidComposeView0 == null) {
                    return;
                }
                androidComposeView0.z(layoutNode0);
                return;
            }
            M6.b.U("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        if(this.o0 == null) {
            return;
        }
        M6.b.T("null layer with a non-null layerBlock");
        throw null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final void e(LayoutCoordinates layoutCoordinates0, float[] arr_f) {
        c0 c00 = c0.X0(layoutCoordinates0);
        c00.P0();
        c0 c01 = this.C0(c00);
        G.d(arr_f);
        c00.a1(c01, arr_f);
        this.Z0(c01, arr_f);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long f(long v) {
        long v1 = this.F(v);
        AndroidComposeView androidComposeView0 = (AndroidComposeView)F0.G.a(this.j0);
        androidComposeView0.D();
        return G.b(v1, androidComposeView0.P0);
    }

    @Override  // D0.J, D0.V
    public final Object g() {
        LayoutNode layoutNode0 = this.j0;
        if(layoutNode0.u0.f(0x40)) {
            this.G0();
            n n0 = (o0)layoutNode0.u0.e;
            Object object0 = null;
            while(n0 != null) {
                if((n0.Z & 0x40) != 0) {
                    n n1 = n0;
                    W.d d0 = null;
                    while(n1 != null) {
                        if(n1 instanceof k0) {
                            object0 = ((k0)n1).h(layoutNode0.p0, object0);
                        }
                        else if((n1.Z & 0x40) != 0 && n1 instanceof F0.n) {
                            n n2 = ((F0.n)n1).m0;
                            int v = 0;
                            while(n2 != null) {
                                if((n2.Z & 0x40) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        n1 = n2;
                                    }
                                    else {
                                        if(d0 == null) {
                                            d0 = new W.d(new n[16]);
                                        }
                                        if(n1 != null) {
                                            d0.c(n1);
                                            n1 = null;
                                        }
                                        d0.c(n2);
                                    }
                                }
                                n2 = n2.d0;
                            }
                            if(v != 1) {
                                goto label_31;
                            }
                            continue;
                        }
                    label_31:
                        n1 = f.f(d0);
                    }
                }
                n0 = n0.c0;
            }
            return object0;
        }
        return null;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.j0.p0.getDensity();
    }

    @Override  // D0.o
    public final LayoutDirection getLayoutDirection() {
        return this.j0.q0;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates h() {
        if(this.G0().k0) {
            this.P0();
            return ((c0)this.j0.u0.d).l0;
        }
        M6.b.T("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long j(LayoutCoordinates layoutCoordinates0, long v) {
        return this.O0(layoutCoordinates0, v);
    }

    @Override  // F0.O
    public final O l0() {
        return this.k0;
    }

    @Override  // F0.O
    public final LayoutCoordinates m0() {
        return this;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.j0.p0.n();
    }

    @Override  // F0.O
    public final boolean n0() {
        return this.s0 != null;
    }

    @Override  // F0.O
    public final LayoutNode o0() {
        return this.j0;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long p(long v) {
        if(this.G0().k0) {
            long v1 = ((AndroidComposeView)F0.G.a(this.j0)).G(v);
            return this.O0(b0.h(this), v1);
        }
        M6.b.T("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override  // F0.O
    public final L p0() {
        L l0 = this.s0;
        if(l0 == null) {
            throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
        }
        return l0;
    }

    @Override  // F0.O
    public final O q0() {
        return this.l0;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean r() {
        return this.G0().k0;
    }

    @Override  // F0.O
    public final long r0() {
        return this.u0;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final void t(float[] arr_f) {
        i0 i00 = F0.G.a(this.j0);
        this.a1(c0.X0(b0.h(this)), arr_f);
        ((AndroidComposeView)i00).D();
        G.g(arr_f, ((AndroidComposeView)i00).P0);
        float f = m0.b.d(((AndroidComposeView)i00).T0);
        float f1 = m0.b.e(((AndroidComposeView)i00).T0);
        G.d(((AndroidComposeView)i00).O0);
        G.i(((AndroidComposeView)i00).O0, f, f1);
        G0.G.n(arr_f, ((AndroidComposeView)i00).O0);
    }

    @Override  // F0.O
    public final void t0() {
        b b0 = this.C0;
        if(b0 != null) {
            this.b0(this.u0, this.v0, b0);
            return;
        }
        this.Z(this.u0, this.v0, this.o0);
    }

    public final void u0(c0 c00, s s0, boolean z) {
        if(c00 == this) {
            return;
        }
        c0 c01 = this.l0;
        if(c01 != null) {
            c01.u0(c00, s0, z);
        }
        float f = (float)(((int)(this.u0 >> 0x20)));
        s0.b -= f;
        s0.d -= f;
        float f1 = (float)(((int)(this.u0 & 0xFFFFFFFFL)));
        s0.c -= f1;
        s0.e -= f1;
        h0 h00 = this.B0;
        if(h00 != null) {
            h00.c(s0, true);
            if(this.n0 && z) {
                s0.a(0.0f, 0.0f, ((float)(((int)(this.Z >> 0x20)))), ((float)(((int)(this.Z & 0xFFFFFFFFL)))));
            }
        }
    }

    public final long v0(c0 c00, long v) {
        if(c00 == this) {
            return v;
        }
        c0 c01 = this.l0;
        return c01 == null || j.a(c00, c01) ? this.D0(v, true) : this.D0(c01.v0(c00, v), true);
    }

    public final long w0(long v) {
        return J2.w.m(Math.max(0.0f, (e.d(v) - ((float)this.X())) / 2.0f), Math.max(0.0f, (e.b(v) - ((float)this.R())) / 2.0f));
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final c x(LayoutCoordinates layoutCoordinates0, boolean z) {
        if(this.G0().k0) {
            if(layoutCoordinates0.r()) {
                c0 c00 = c0.X0(layoutCoordinates0);
                c00.P0();
                c0 c01 = this.C0(c00);
                s s0 = this.w0;
                if(s0 == null) {
                    s0 = new s();
                    s0.b = 0.0f;
                    s0.c = 0.0f;
                    s0.d = 0.0f;
                    s0.e = 0.0f;
                    this.w0 = s0;
                }
                s0.b = 0.0f;
                s0.c = 0.0f;
                s0.d = (float)(((int)(layoutCoordinates0.C() >> 0x20)));
                s0.e = (float)(((int)(layoutCoordinates0.C() & 0xFFFFFFFFL)));
                while(c00 != c01) {
                    c00.U0(s0, z, false);
                    if(s0.b()) {
                        return c.e;
                    }
                    c00 = c00.l0;
                    j.c(c00);
                }
                this.u0(c01, s0, z);
                return new c(s0.b, s0.c, s0.d, s0.e);
            }
            M6.b.T(("LayoutCoordinates " + layoutCoordinates0 + " is not attached!"));
            throw null;
        }
        M6.b.T("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final float x0(long v, long v1) {
        if(Float.compare(this.X(), e.d(v1)) >= 0 && ((float)this.R()) < e.b(v1)) {
            return Infinityf;
        }
        long v2 = this.w0(v1);
        float f = e.d(v2);
        float f1 = e.b(v2);
        float f2 = m0.b.d(v);
        float f3 = m0.b.e(v);
        long v3 = yc.d.d(Math.max(0.0f, (f2 < 0.0f ? -f2 : f2 - ((float)this.X()))), Math.max(0.0f, (f3 < 0.0f ? -f3 : f3 - ((float)this.R()))));
        if((f <= 0.0f || f1 <= 0.0f) && m0.b.d(v3) > f && m0.b.e(v3) > f1) {
            float f4 = Float.intBitsToFloat(((int)(v3 >> 0x20)));
            float f5 = Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL)));
            return f5 * f5 + f4 * f4;
        }
        return Infinityf;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // F0.j0
    public final boolean y() {
        return this.B0 != null && !this.m0 && this.j0.E();
    }

    public final void y0(t t0, b b0) {
        h0 h00 = this.B0;
        if(h00 != null) {
            h00.f(t0, b0);
            return;
        }
        float f = (float)(((int)(this.u0 >> 0x20)));
        float f1 = (float)(((int)(this.u0 & 0xFFFFFFFFL)));
        t0.k(f, f1);
        this.A0(t0, b0);
        t0.k(-f, -f1);
    }

    public final void z0(t t0, h h0) {
        t0.d(new c(0.5f, 0.5f, ((float)(((int)(this.Z >> 0x20)))) - 0.5f, ((float)(((int)(this.Z & 0xFFFFFFFFL)))) - 0.5f), h0);
    }
}

