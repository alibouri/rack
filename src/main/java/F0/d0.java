package F0;

import B0.a;
import D0.T;
import M6.b;
import W.d;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import g0.m;
import g0.n;
import k0.e;
import l0.c;
import l0.k;
import l0.q;
import s.y;
import z0.r;

public abstract class d0 {
    public static final y a;

    static {
        d0.a = new y();
    }

    public static final void a(n n0) {
        if(n0.k0) {
            d0.b(n0, -1, 1);
            return;
        }
        b.T("autoInvalidateInsertedNode called on unattached node");
        throw null;
    }

    public static final void b(n n0, int v, int v1) {
        if(n0 instanceof F0.n) {
            d0.c(n0, ((F0.n)n0).l0 & v, v1);
            int v2 = ~((F0.n)n0).l0 & v;
            for(n n1 = ((F0.n)n0).m0; n1 != null; n1 = n1.d0) {
                d0.b(n1, v2, v1);
            }
            return;
        }
        d0.c(n0, v & n0.Z, v1);
    }

    public static final void c(n n0, int v, int v1) {
        if(v1 == 0 && !n0.m0()) {
            return;
        }
        if((v & 2) != 0 && n0 instanceof x) {
            f.o(((x)n0));
            if(v1 == 2) {
                c0 c00 = f.t(n0, 2);
                c00.m0 = true;
                c00.z0.invoke();
                if(c00.B0 != null) {
                    if(c00.C0 != null) {
                        c00.C0 = null;
                    }
                    c00.b1(null, false);
                    c00.j0.S(false);
                }
            }
        }
        if((v & 0x80) != 0 && n0 instanceof w && v1 != 2) {
            f.v(n0).B();
        }
        if((v & 0x100) != 0 && n0 instanceof p && v1 != 2) {
            LayoutNode layoutNode0 = f.v(n0);
            if(!layoutNode0.v0.e && !layoutNode0.v0.d && !layoutNode0.D0) {
                AndroidComposeView androidComposeView0 = (AndroidComposeView)G.a(layoutNode0);
                ((d)androidComposeView0.K0.e.Y).c(layoutNode0);
                layoutNode0.D0 = true;
                androidComposeView0.F(null);
            }
        }
        if((v & 4) != 0 && n0 instanceof o) {
            f.n(((o)n0));
        }
        if((v & 8) != 0 && n0 instanceof n0) {
            f.p(((n0)n0));
        }
        if((v & 0x40) != 0 && n0 instanceof k0) {
            LayoutNode layoutNode1 = f.v(((k0)n0));
            layoutNode1.v0.r.o0 = true;
            I i0 = layoutNode1.v0.s;
            if(i0 != null) {
                i0.t0 = true;
            }
        }
        if((v & 0x400) != 0 && n0 instanceof q && v1 != 2) {
            f.w(((q)n0)).getFocusOwner().k(((q)n0));
        }
        if((v & 0x800) != 0 && n0 instanceof k) {
            g.b = null;
            ((k)n0).l(g.a);
            if(g.b != null) {
                if(v1 == 2) {
                    n n1 = ((n)(((k)n0))).X;
                    if(n1.k0) {
                        d d0 = new d(new n[16]);
                        n n2 = n1.d0;
                        if(n2 == null) {
                            f.b(d0, n1);
                        }
                        else {
                            d0.c(n2);
                        }
                        while(true) {
                            if(!d0.n()) {
                                goto label_85;
                            }
                            n n3 = (n)d0.p(d0.Z - 1);
                            if((n3.b0 & 0x400) == 0) {
                                f.b(d0, n3);
                            }
                            else {
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        d d1 = null;
                                        while(n3 != null) {
                                            if(n3 instanceof q) {
                                                f.w(((q)n3)).getFocusOwner().k(((q)n3));
                                            }
                                            else if((n3.Z & 0x400) != 0 && n3 instanceof F0.n) {
                                                n n4 = ((F0.n)n3).m0;
                                                int v2 = 0;
                                                while(n4 != null) {
                                                    if((n4.Z & 0x400) != 0) {
                                                        ++v2;
                                                        if(v2 == 1) {
                                                            n3 = n4;
                                                        }
                                                        else {
                                                            if(d1 == null) {
                                                                d1 = new d(new n[16]);
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
                                                if(v2 != 1) {
                                                    goto label_79;
                                                }
                                                continue;
                                            }
                                        label_79:
                                            n3 = f.f(d1);
                                        }
                                        break;
                                    }
                                    n3 = n3.d0;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                else {
                    f.w(((k)n0)).getFocusOwner().a(((k)n0));
                }
            }
        }
    label_85:
        if((v & 0x1000) != 0 && n0 instanceof c) {
            f.w(((c)n0)).getFocusOwner().h(((c)n0));
        }
    }

    public static final void d(n n0) {
        if(n0.k0) {
            d0.b(n0, -1, 0);
            return;
        }
        b.T("autoInvalidateUpdatedNode called on unattached node");
        throw null;
    }

    public static final int e(m m0) {
        int v = m0 instanceof D0.w ? 3 : 1;
        if(m0 instanceof e) {
            v |= 4;
        }
        if(m0 instanceof AppendedSemanticsElement) {
            v |= 8;
        }
        if(m0 instanceof r) {
            v |= 16;
        }
        if(m0 instanceof E0.c || m0 instanceof E0.e) {
            v |= 0x20;
        }
        if(m0 instanceof E.d) {
            v |= 0x100;
        }
        return m0 instanceof T ? v | 0x40 : v;
    }

    public static final int f(n n0) {
        int v = n0.Z;
        if(v != 0) {
            return v;
        }
        Class class0 = n0.getClass();
        y y0 = d0.a;
        int v1 = y0.c(class0);
        if(v1 >= 0) {
            return y0.c[v1];
        }
        int v2 = n0 instanceof x ? 3 : 1;
        if(n0 instanceof o) {
            v2 |= 4;
        }
        if(n0 instanceof n0) {
            v2 |= 8;
        }
        if(n0 instanceof m0) {
            v2 |= 16;
        }
        if(n0 instanceof E0.d) {
            v2 |= 0x20;
        }
        if(n0 instanceof k0) {
            v2 |= 0x40;
        }
        if(n0 instanceof w) {
            v2 |= 0x80;
        }
        if(n0 instanceof p) {
            v2 |= 0x100;
        }
        if(n0 instanceof q) {
            v2 |= 0x400;
        }
        if(n0 instanceof k) {
            v2 |= 0x800;
        }
        if(n0 instanceof c) {
            v2 |= 0x1000;
        }
        if(n0 instanceof x0.c) {
            v2 |= 0x2000;
        }
        if(n0 instanceof a) {
            v2 |= 0x4000;
        }
        if(n0 instanceof l) {
            v2 |= 0x8000;
        }
        int v3 = n0 instanceof q0 ? 0x40000 | v2 : v2;
        y0.f(v3, class0);
        return v3;
    }

    public static final int g(n n0) {
        if(n0 instanceof F0.n) {
            int v = ((F0.n)n0).l0;
            for(n n1 = ((F0.n)n0).m0; n1 != null; n1 = n1.d0) {
                v |= d0.g(n1);
            }
            return v;
        }
        return d0.f(n0);
    }

    public static final boolean h(int v) {
        return (v & 0x80) != 0;
    }
}

