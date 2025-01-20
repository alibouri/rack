package F0;

import Ab.t;
import Nb.j;
import Nb.k;
import W.d;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import n0.W;

public final class e extends k implements Function1 {
    public final int X;
    public static final e Y;
    public static final e Z;
    public static final e b0;
    public static final e c0;
    public static final e d0;
    public static final e e0;
    public static final e f0;
    public static final e g0;
    public static final e h0;
    public static final e i0;
    public static final e j0;
    public static final e k0;
    public static final e l0;

    static {
        e.Y = new e(1, 0);
        e.Z = new e(1, 1);
        e.b0 = new e(1, 2);
        e.c0 = new e(1, 3);
        e.d0 = new e(1, 4);
        e.e0 = new e(1, 5);
        e.f0 = new e(1, 6);
        e.g0 = new e(1, 7);
        e.h0 = new e(1, 8);
        e.i0 = new e(1, 9);
        e.j0 = new e(1, 10);
        e.k0 = new e(1, 11);
        e.l0 = new e(1, 12);
    }

    public e(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                ((c)object0).z0();
                return t.a;
            }
            case 1: {
                if(((l0)object0).y()) {
                    ((l0)object0).Y.h0(((l0)object0));
                }
                return t.a;
            }
            case 2: {
                h0 h00 = ((c0)object0).B0;
                if(h00 != null) {
                    h00.invalidate();
                }
                return t.a;
            }
            case 3: {
                if(((c0)object0).y()) {
                    v v0 = ((c0)object0).x0;
                    if(v0 == null) {
                        ((c0)object0).c1(true);
                        return t.a;
                    }
                    c0.E0.getClass();
                    c0.E0.a = v0.a;
                    c0.E0.b = v0.b;
                    c0.E0.c = v0.c;
                    c0.E0.d = v0.d;
                    c0.E0.e = v0.e;
                    c0.E0.f = v0.f;
                    c0.E0.g = v0.g;
                    c0.E0.h = v0.h;
                    c0.E0.i = v0.i;
                    ((c0)object0).c1(true);
                    if(c0.E0.a == v0.a || c0.E0.b == v0.b || c0.E0.c == v0.c || c0.E0.d == v0.d || c0.E0.e == v0.e || c0.E0.f == v0.f || c0.E0.g == v0.g || c0.E0.h == v0.h || !W.a(c0.E0.i, v0.i)) {
                        LayoutNode layoutNode0 = ((c0)object0).j0;
                        L l0 = layoutNode0.v0;
                        if(l0.n > 0) {
                            if(l0.m || l0.l) {
                                layoutNode0.S(false);
                            }
                            l0.r.m0();
                        }
                        AndroidComposeView androidComposeView0 = layoutNode0.g0;
                        if(androidComposeView0 != null) {
                            ((d)androidComposeView0.K0.e.Y).c(layoutNode0);
                            layoutNode0.D0 = true;
                            androidComposeView0.F(null);
                        }
                    }
                }
                return t.a;
            }
            case 4: {
                if(((f0)object0).y()) {
                    ((f0)object0).X.F();
                }
                return t.a;
            }
            case 5: {
                j.d(object0, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((j0)object0).y());
            }
            case 6: {
                if(((LayoutNode)object0).E()) {
                    ((LayoutNode)object0).S(false);
                }
                return t.a;
            }
            case 7: {
                if(((LayoutNode)object0).E()) {
                    ((LayoutNode)object0).S(false);
                }
                return t.a;
            }
            case 8: {
                if(((LayoutNode)object0).E()) {
                    ((LayoutNode)object0).Q(false);
                }
                return t.a;
            }
            case 9: {
                if(((LayoutNode)object0).E()) {
                    ((LayoutNode)object0).Q(false);
                }
                return t.a;
            }
            case 10: {
                if(((LayoutNode)object0).E()) {
                    LayoutNode.R(((LayoutNode)object0), false, 7);
                }
                return t.a;
            }
            case 11: {
                if(((LayoutNode)object0).E()) {
                    LayoutNode.T(((LayoutNode)object0), false, 7);
                }
                return t.a;
            }
            default: {
                if(((LayoutNode)object0).E()) {
                    ((LayoutNode)object0).C();
                }
                return t.a;
            }
        }
    }
}

