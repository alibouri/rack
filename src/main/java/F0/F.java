package F0;

import Ab.e;
import D0.o;
import M6.b;
import Nb.j;
import U.j0;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import g0.a;
import g0.n;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import v.h;
import z0.i;

public abstract class f {
    public static final d a;

    static {
        f.a = new d(0);
    }

    public static final long a(float f, boolean z) {
        long v = (long)Float.floatToIntBits(f);
        return z ? 1L | v << 0x20 : v << 0x20;
    }

    public static final void b(W.d d0, n n0) {
        W.d d1 = f.v(n0).v();
        int v = d1.Z;
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = d1.X;
            while(true) {
                d0.c(((n)((LayoutNode)arr_object[v1]).u0.f));
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    public static final int c(O o0, D0.n n0) {
        O o1 = o0.l0();
        if(o1 != null) {
            if(o0.p0().m().containsKey(n0)) {
                Integer integer0 = (Integer)o0.p0().m().get(n0);
                return integer0 == null ? 0x80000000 : ((int)integer0);
            }
            int v = o1.Q(n0);
            if(v != 0x80000000) {
                o1.e0 = true;
                o0.f0 = true;
                o0.t0();
                o1.e0 = false;
                o0.f0 = false;
                return n0 instanceof D0.n ? v + ((int)(o1.r0() & 0xFFFFFFFFL)) : v + ((int)(o1.r0() >> 0x20));
            }
            return 0x80000000;
        }
        b.T(("Child of " + o0 + " cannot be null when calculating alignment line"));
        throw null;
    }

    public static final boolean d(c c0) {
        o0 o00 = (o0)f.v(c0).u0.e;
        j.d(o00, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return o00.l0;
    }

    public static final n e(m m0, int v) {
        n n0 = ((n)m0).X.d0;
        if(n0 != null && (n0.b0 & v) != 0) {
            while(n0 != null) {
                int v1 = n0.Z;
                if((v1 & 2) != 0) {
                    break;
                }
                if((v1 & v) != 0) {
                    return n0;
                }
                n0 = n0.d0;
            }
        }
        return null;
    }

    public static final n f(W.d d0) {
        return d0 == null || d0.m() ? null : ((n)d0.p(d0.Z - 1));
    }

    public static final x g(n n0) {
        if((n0.Z & 2) != 0) {
            if(n0 instanceof x) {
                return (x)n0;
            }
            if(n0 instanceof F0.n) {
                for(n n1 = ((F0.n)n0).m0; n1 != null; n1 = n1 instanceof F0.n && (n1.Z & 2) != 0 ? ((F0.n)n1).m0 : n1.d0) {
                    if(n1 instanceof x) {
                        return (x)n1;
                    }
                }
            }
        }
        return null;
    }

    public static final int h(long v, long v1) {
        int v2 = 0;
        int v3 = ((int)(v & 0xFFFFFFFFL)) == 0 ? 0 : 1;
        if(((int)(0xFFFFFFFFL & v1)) != 0) {
            v2 = 1;
        }
        if(v3 != v2) {
            return v3 == 0 ? 1 : -1;
        }
        return (int)Math.signum(Float.intBitsToFloat(((int)(v >> 0x20))) - Float.intBitsToFloat(((int)(v1 >> 0x20))));
    }

    public static final Object i(l l0, j0 j00) {
        if(((n)l0).X.k0) {
            c0.f f0 = (c0.f)f.v(l0).s0;
            f0.getClass();
            return U.d.E(f0, j00);
        }
        b.T("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        throw null;
    }

    public static final q0 j(m m0, Object object0) {
        n n0 = ((n)m0).X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n n1 = n0.c0;
        LayoutNode layoutNode0 = f.v(m0);
        while(layoutNode0 != null) {
            if((((n)layoutNode0.u0.f).b0 & 0x40000) != 0) {
                while(n1 != null) {
                    if((n1.Z & 0x40000) != 0) {
                        n n2 = n1;
                        W.d d0 = null;
                        while(n2 != null) {
                            if(n2 instanceof q0) {
                                if(object0.equals(((q0)n2).p())) {
                                    return (q0)n2;
                                }
                            }
                            else if((n2.Z & 0x40000) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x40000) != 0) {
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
                                    goto label_32;
                                }
                                continue;
                            }
                        label_32:
                            n2 = f.f(d0);
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
        return null;
    }

    public static final q0 k(q0 q00) {
        n n0 = ((n)q00).X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n n1 = n0.c0;
        LayoutNode layoutNode0 = f.v(q00);
        while(layoutNode0 != null) {
            if((((n)layoutNode0.u0.f).b0 & 0x40000) != 0) {
                while(n1 != null) {
                    if((n1.Z & 0x40000) != 0) {
                        n n2 = n1;
                        W.d d0 = null;
                        while(n2 != null) {
                            if(n2 instanceof q0) {
                                if(j.a(q00.p(), ((q0)n2).p()) && a.a(q00, ((q0)n2))) {
                                    return (q0)n2;
                                }
                            }
                            else if((n2.Z & 0x40000) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x40000) != 0) {
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
                                    goto label_32;
                                }
                                continue;
                            }
                        label_32:
                            n2 = f.f(d0);
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
        return null;
    }

    public static final ArrayList l(o o0) {
        j.d(o0, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode0 = ((O)o0).o0();
        boolean z = f.q(layoutNode0);
        W.a a0 = (W.a)layoutNode0.p();
        ArrayList arrayList0 = new ArrayList(a0.X.Z);
        int v = a0.X.Z;
        for(int v1 = 0; v1 < v; ++v1) {
            LayoutNode layoutNode1 = (LayoutNode)a0.get(v1);
            arrayList0.add((z ? layoutNode1.l() : layoutNode1.m()));
        }
        return arrayList0;
    }

    public static final int m(int[] arr_v) {
        return Math.min(arr_v[2] - arr_v[0], arr_v[3] - arr_v[1]);
    }

    public static final void n(F0.o o0) {
        if(((n)o0).X.k0) {
            f.t(o0, 1).M0();
        }
    }

    public static final void o(x x0) {
        f.v(x0).B();
    }

    public static final void p(n0 n00) {
        f.v(n00).C();
    }

    public static final boolean q(LayoutNode layoutNode0) {
        switch(h.d(layoutNode0.v0.c)) {
            case 0: 
            case 2: {
                return false;
            }
            case 1: 
            case 3: {
                return true;
            }
            case 4: {
                LayoutNode layoutNode1 = layoutNode0.s();
                if(layoutNode1 == null) {
                    throw new IllegalArgumentException("no parent for idle node");
                }
                return f.q(layoutNode1);
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final boolean r(LayoutNode layoutNode0) {
        if(layoutNode0.Z != null) {
            LayoutNode layoutNode1 = layoutNode0.s();
            return (layoutNode1 == null ? null : layoutNode1.Z) == null || layoutNode0.v0.b;
        }
        return false;
    }

    public static final void s(n n0, Function0 function00) {
        f0 f00 = n0.e0;
        if(f00 == null) {
            f00 = new f0(((e0)n0));
            n0.e0 = f00;
        }
        f.w(n0).getSnapshotObserver().a(f00, F0.e.d0, function00);
    }

    public static final c0 t(m m0, int v) {
        c0 c00 = ((n)m0).X.f0;
        j.c(c00);
        if(c00.G0() == m0 && d0.h(v)) {
            c00 = c00.k0;
            j.c(c00);
        }
        return c00;
    }

    public static final c0 u(m m0) {
        if(((n)m0).X.k0) {
            c0 c00 = f.t(m0, 2);
            if(c00.G0().k0) {
                return c00;
            }
            b.T("LayoutCoordinates is not attached.");
            throw null;
        }
        b.T("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        throw null;
    }

    public static final LayoutNode v(m m0) {
        c0 c00 = ((n)m0).X.f0;
        if(c00 != null) {
            return c00.j0;
        }
        b.U("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final i0 w(m m0) {
        i0 i00 = f.v(m0).g0;
        if(i00 != null) {
            return i00;
        }
        b.U("This node does not have an owner.");
        throw null;
    }

    public static final View x(m m0) {
        if(((n)m0).X.k0) {
            return (View)G.a(f.v(m0));
        }
        b.T("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    public static final void y(i i0, Function1 function10) {
        n n0 = i0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n n1 = n0.c0;
        LayoutNode layoutNode0 = f.v(i0);
        while(layoutNode0 != null) {
            if((((n)layoutNode0.u0.f).b0 & 0x40000) != 0) {
                while(n1 != null) {
                    if((n1.Z & 0x40000) != 0) {
                        n n2 = n1;
                        W.d d0 = null;
                        while(true) {
                            boolean z = true;
                            if(n2 == null) {
                                break;
                            }
                            if(n2 instanceof q0) {
                                if("androidx.compose.ui.input.pointer.PointerHoverIcon".equals(((q0)n2).p()) && a.a(i0, ((q0)n2))) {
                                    z = ((Boolean)function10.n(((q0)n2))).booleanValue();
                                }
                                if(!z) {
                                    return;
                                }
                            }
                            else if((n2.Z & 0x40000) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x40000) != 0) {
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
                                    goto label_35;
                                }
                                continue;
                            }
                        label_35:
                            n2 = f.f(d0);
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
    }

    public static final void z(q0 q00, Function1 function10) {
        n n0 = ((n)q00).X;
        if(n0.k0) {
            W.d d0 = new W.d(new n[16]);
            n n1 = n0.d0;
            if(n1 == null) {
                f.b(d0, n0);
            }
            else {
                d0.c(n1);
            }
        label_8:
            while(d0.n()) {
                n n2 = (n)d0.p(d0.Z - 1);
                if((n2.b0 & 0x40000) != 0) {
                    n n3 = n2;
                    while(n3 != null) {
                        if((n3.Z & 0x40000) != 0) {
                            W.d d1 = null;
                            n n4 = n3;
                            while(n4 != null) {
                                if(n4 instanceof q0) {
                                    p0 p00 = !j.a(q00.p(), ((q0)n4).p()) || !a.a(q00, ((q0)n4)) ? p0.X : ((p0)function10.n(((q0)n4)));
                                    if(p00 == p0.Z) {
                                        return;
                                    }
                                    if(p00 == p0.Y) {
                                        continue label_8;
                                    }
                                }
                                else if((n4.Z & 0x40000) != 0 && n4 instanceof F0.n) {
                                    n n5 = ((F0.n)n4).m0;
                                    int v = 0;
                                    while(n5 != null) {
                                        if((n5.Z & 0x40000) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                n4 = n5;
                                            }
                                            else {
                                                if(d1 == null) {
                                                    d1 = new W.d(new n[16]);
                                                }
                                                if(n4 != null) {
                                                    d1.c(n4);
                                                    n4 = null;
                                                }
                                                d1.c(n5);
                                            }
                                        }
                                        n5 = n5.d0;
                                    }
                                    if(v != 1) {
                                        goto label_41;
                                    }
                                    continue;
                                }
                            label_41:
                                n4 = f.f(d1);
                            }
                        }
                        n3 = n3.d0;
                    }
                }
                f.b(d0, n2);
            }
            return;
        }
        b.T("visitSubtreeIf called on an unattached node");
        throw null;
    }
}

