package F0;

import A7.b;
import Ab.t;
import C.E;
import D.A;
import D0.J;
import D0.L;
import D0.M;
import D0.T;
import E0.d;
import E0.f;
import E0.g;
import Nb.j;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g0.m;
import g0.n;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import k0.a;
import k0.e;
import kotlin.jvm.functions.Function0;
import l0.h;
import l0.k;
import z0.l;
import z0.q;
import z0.r;

public final class c extends n implements d, f, j0, k0, m0, n0, o, p, w, x, a, l0.c, k, l0.n {
    public m l0;
    public E0.a m0;
    public HashSet n0;
    public LayoutCoordinates o0;

    @Override  // F0.w
    public final void C(LayoutCoordinates layoutCoordinates0) {
        this.o0 = layoutCoordinates0;
    }

    @Override  // F0.m0
    public final boolean N() {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((r)m0).b0.getClass();
        return true;
    }

    @Override  // F0.p
    public final void O(c0 c00) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        if(!((E.d)m0).X) {
            ((E.d)m0).X = true;
            kotlin.coroutines.k k0 = ((E.d)m0).Y;
            if(k0 != null) {
                k0.i(t.a);
            }
            ((E.d)m0).Y = null;
        }
    }

    @Override  // F0.m0
    public final void R() {
        this.Y();
    }

    @Override  // E0.f
    public final Object X(g g0) {
        this.n0.add(g0);
        n n0 = this.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n n1 = n0.c0;
        LayoutNode layoutNode0 = F0.f.v(this);
        while(layoutNode0 != null) {
            if((((n)layoutNode0.u0.f).b0 & 0x20) != 0) {
                while(n1 != null) {
                    if((n1.Z & 0x20) != 0) {
                        n n2 = n1;
                        W.d d0 = null;
                        while(n2 != null) {
                            if(n2 instanceof d) {
                                if(((d)n2).i().v(g0)) {
                                    return ((d)n2).i().D(g0);
                                }
                            }
                            else if((n2.Z & 0x20) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x20) != 0) {
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
                                    goto label_33;
                                }
                                continue;
                            }
                        label_33:
                            n2 = F0.f.f(d0);
                        }
                    }
                    n1 = n1.c0;
                }
            }
            layoutNode0 = layoutNode0.s();
            if(layoutNode0 != null) {
                W w0 = layoutNode0.u0;
                if(w0 != null) {
                    n1 = (o0)w0.e;
                    continue;
                }
            }
            n1 = null;
        }
        return ((Function0)g0.a).invoke();
    }

    @Override  // F0.m0
    public final void Y() {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        b b0 = ((r)m0).b0;
        if(b0.Y == 2) {
            long v = SystemClock.uptimeMillis();
            r r0 = (r)b0.b0;
            q q0 = new q(r0, 1);
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            motionEvent0.setSource(0);
            q0.n(motionEvent0);
            motionEvent0.recycle();
            b0.Y = 1;
            r0.Z = false;
        }
    }

    @Override  // F0.n0
    public final boolean Z() {
        return false;
    }

    @Override  // F0.x
    public final int a(O o0, J j0, int v) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.w)m0).a(o0, j0, v);
    }

    @Override  // F0.x
    public final int b(O o0, J j0, int v) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.w)m0).b(o0, j0, v);
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((e)m0).c(layoutNodeDrawScope0);
    }

    @Override  // F0.n0
    public final boolean c0() {
        return false;
    }

    @Override  // k0.a
    public final long d() {
        return io.sentry.config.a.a0(F0.f.t(this, 0x80).Z);
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        m m1 = this.l0;
        j.d(m1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.w)m1).e(m0, j0, v);
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.w)m0).f(o0, j0, v);
    }

    @Override  // F0.o
    public final void f0() {
        F0.f.n(this);
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((D0.w)m0).g(o0, j0, v);
    }

    @Override  // k0.a
    public final Density getDensity() {
        return F0.f.v(this).p0;
    }

    @Override  // k0.a
    public final LayoutDirection getLayoutDirection() {
        return F0.f.v(this).q0;
    }

    @Override  // F0.k0
    public final Object h(Density density0, Object object0) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((T)m0).h();
    }

    @Override  // F0.m0
    public final void h0() {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        r r0 = (r)m0;
    }

    @Override  // E0.d
    public final android.support.v4.media.session.a i() {
        android.support.v4.media.session.a a0 = this.m0;
        return a0 == null ? E0.b.b : a0;
    }

    @Override  // F0.m0
    public final void j() {
        this.Y();
    }

    @Override  // l0.k
    public final void l(h h0) {
        M6.b.T("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override  // F0.m0
    public final void m(z0.f f0, z0.g g0, long v) {
        boolean z;
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        b b0 = ((r)m0).b0;
        Object object0 = f0.a;
        r r0 = (r)b0.b0;
        if(!r0.Z) {
            z = false;
            int v1 = ((List)object0).size();
            int v2 = 0;
            while(true) {
                if(v2 >= v1) {
                    goto label_15;
                }
                z0.n n0 = (z0.n)((List)object0).get(v2);
                if(l.a(n0) || l.c(n0)) {
                    break;
                }
                ++v2;
            }
        }
        z = true;
    label_15:
        z0.g g1 = z0.g.Z;
        if(b0.Y != 3) {
            if(g0 == z0.g.X && z) {
                b0.g(f0);
            }
            if(g0 == g1 && !z) {
                b0.g(f0);
            }
        }
        if(g0 == g1) {
            int v3 = ((List)object0).size();
            for(int v4 = 0; true; ++v4) {
                if(v4 >= v3) {
                    b0.Y = 1;
                    r0.Z = false;
                    break;
                }
                if(!l.c(((z0.n)((List)object0).get(v4)))) {
                    break;
                }
            }
        }
    }

    @Override  // F0.n0
    public final void o(M0.j j0) {
        m m0 = this.l0;
        j.d(m0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        M0.j j1 = new M0.j();
        j1.Y = ((AppendedSemanticsElement)m0).X;
        ((AppendedSemanticsElement)m0).Y.n(j1);
        j.d(j0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if(j1.Y) {
            j0.Y = true;
        }
        if(j1.Z) {
            j0.Z = true;
        }
        for(Object object0: j1.X.entrySet()) {
            M0.t t0 = (M0.t)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            LinkedHashMap linkedHashMap0 = j0.X;
            if(!linkedHashMap0.containsKey(t0)) {
                linkedHashMap0.put(t0, object1);
            }
            else if(object1 instanceof M0.a) {
                Object object2 = linkedHashMap0.get(t0);
                j.d(object2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                String s = ((M0.a)object2).a;
                if(s == null) {
                    s = ((M0.a)object1).a;
                }
                Ab.c c0 = ((M0.a)object2).b;
                if(c0 == null) {
                    c0 = ((M0.a)object1).b;
                }
                linkedHashMap0.put(t0, new M0.a(s, c0));
            }
        }
    }

    @Override  // g0.n
    public final void p0() {
        this.x0(true);
    }

    @Override  // g0.n
    public final void q0() {
        this.y0();
    }

    @Override  // F0.w
    public final void r(long v) {
    }

    @Override
    public final String toString() {
        return this.l0.toString();
    }

    public final void x0(boolean z) {
        if(this.k0) {
            m m0 = this.l0;
            if((this.Z & 0x20) != 0) {
                if(m0 instanceof E0.c) {
                    F0.b b0 = new F0.b(this, 0);
                    W.d d0 = ((AndroidComposeView)F0.f.w(this)).q1;
                    if(!d0.j(b0)) {
                        d0.c(b0);
                    }
                }
                if(m0 instanceof E0.e) {
                    E0.a a0 = this.m0;
                    if(a0 == null || !a0.v(((E0.e)m0).getKey())) {
                        E0.a a1 = new E0.a();  // initializer: Ljava/lang/Object;-><init>()V
                        a1.b = (E0.e)m0;
                        this.m0 = a1;
                        if(F0.f.d(this)) {
                            ModifierLocalManager modifierLocalManager1 = F0.f.w(this).getModifierLocalManager();
                            g g1 = ((E0.e)m0).getKey();
                            modifierLocalManager1.b.c(this);
                            modifierLocalManager1.c.c(g1);
                            modifierLocalManager1.a();
                        }
                    }
                    else {
                        a0.b = (E0.e)m0;
                        ModifierLocalManager modifierLocalManager0 = F0.f.w(this).getModifierLocalManager();
                        g g0 = ((E0.e)m0).getKey();
                        modifierLocalManager0.b.c(this);
                        modifierLocalManager0.c.c(g0);
                        modifierLocalManager0.a();
                    }
                }
            }
            if((this.Z & 4) != 0 && !z) {
                F0.f.t(this, 2).M0();
            }
            if((this.Z & 2) != 0) {
                if(F0.f.d(this)) {
                    c0 c00 = this.f0;
                    j.c(c00);
                    ((z)c00).e1(this);
                    h0 h00 = c00.B0;
                    if(h00 != null) {
                        h00.invalidate();
                    }
                }
                if(!z) {
                    F0.f.t(this, 2).M0();
                    F0.f.v(this).B();
                }
            }
            if(m0 instanceof C.z) {
                LayoutNode layoutNode0 = F0.f.v(this);
                if(((C.z)m0).X == 0) {
                    ((E)((C.z)m0).Y).j = layoutNode0;
                }
                else {
                    ((A)((C.z)m0).Y).h = layoutNode0;
                }
            }
            if((this.Z & 0x100) != 0 && m0 instanceof E.d && F0.f.d(this)) {
                F0.f.v(this).B();
            }
            int v = this.Z;
            if((v & 16) != 0 && m0 instanceof r) {
                ((r)m0).b0.Z = this.f0;
            }
            if((v & 8) != 0) {
                ((AndroidComposeView)F0.f.w(this)).C();
            }
            return;
        }
        M6.b.T("initializeModifier called on unattached node");
        throw null;
    }

    @Override  // F0.j0
    public final boolean y() {
        return this.k0;
    }

    public final void y0() {
        if(this.k0) {
            m m0 = this.l0;
            if((this.Z & 0x20) != 0) {
                if(m0 instanceof E0.e) {
                    ModifierLocalManager modifierLocalManager0 = F0.f.w(this).getModifierLocalManager();
                    g g0 = ((E0.e)m0).getKey();
                    LayoutNode layoutNode0 = F0.f.v(this);
                    modifierLocalManager0.d.c(layoutNode0);
                    modifierLocalManager0.e.c(g0);
                    modifierLocalManager0.a();
                }
                if(m0 instanceof E0.c) {
                    ((E0.c)m0).j(F0.f.a);
                }
            }
            if((this.Z & 8) != 0) {
                ((AndroidComposeView)F0.f.w(this)).C();
            }
            return;
        }
        M6.b.T("unInitializeModifier called on unattached node");
        throw null;
    }

    @Override  // l0.c
    public final void z(l0.p p0) {
        M6.b.T("onFocusEvent called on wrong node");
        throw null;
    }

    public final void z0() {
        if(this.k0) {
            this.n0.clear();
            OwnerSnapshotObserver ownerSnapshotObserver0 = F0.f.w(this).getSnapshotObserver();
            F0.b b0 = new F0.b(this, 1);
            ownerSnapshotObserver0.a(this, F0.e.Y, b0);
        }
    }
}

