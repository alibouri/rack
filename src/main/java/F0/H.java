package F0;

import Ab.t;
import D0.K;
import G0.f0;
import Nb.j;
import Nb.k;
import U.d;
import U.u;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c0.f;
import g0.n;
import k0.b;
import kotlin.jvm.functions.Function2;

public final class h extends k implements Function2 {
    public final int X;
    public static final h Y;
    public static final h Z;
    public static final h b0;
    public static final h c0;

    static {
        h.Y = new h(2, 0);
        h.Z = new h(2, 1);
        h.b0 = new h(2, 2);
        h.c0 = new h(2, 3);
    }

    public h(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                ((Number)object1).intValue();
                ((F0.k)object0).getClass();
                return t.a;
            }
            case 1: {
                ((LayoutNode)(((F0.k)object0))).Y(((K)object1));
                return t.a;
            }
            case 2: {
                ((LayoutNode)(((F0.k)object0))).Z(((Modifier)object1));
                return t.a;
            }
            default: {
                ((LayoutNode)(((F0.k)object0))).s0 = (u)object1;
                ((f)(((u)object1))).getClass();
                ((LayoutNode)(((F0.k)object0))).W(((Density)d.E(((f)(((u)object1))), f0.f)));
                LayoutDirection layoutDirection0 = (LayoutDirection)d.E(((f)(((u)object1))), f0.l);
                if(((LayoutNode)(((F0.k)object0))).q0 == layoutDirection0) {
                label_46:
                    ViewConfiguration viewConfiguration0 = (ViewConfiguration)d.E(((f)(((u)object1))), f0.q);
                    if(j.a(((LayoutNode)(((F0.k)object0))).r0, viewConfiguration0)) {
                    label_82:
                        n n6 = (n)((LayoutNode)(((F0.k)object0))).u0.f;
                        if((n6.b0 & 0x8000) != 0) {
                            while(n6 != null) {
                                if((n6.Z & 0x8000) != 0) {
                                    n n7 = n6;
                                    W.d d2 = null;
                                    while(n7 != null) {
                                        if(n7 instanceof l) {
                                            n n8 = ((n)(((l)n7))).X;
                                            if(n8.k0) {
                                                d0.d(n8);
                                            }
                                            else {
                                                n8.h0 = true;
                                            }
                                        }
                                        else if((n7.Z & 0x8000) != 0 && n7 instanceof F0.n) {
                                            n n9 = ((F0.n)n7).m0;
                                            int v2 = 0;
                                            while(n9 != null) {
                                                if((n9.Z & 0x8000) != 0) {
                                                    ++v2;
                                                    if(v2 == 1) {
                                                        n7 = n9;
                                                    }
                                                    else {
                                                        if(d2 == null) {
                                                            d2 = new W.d(new n[16]);
                                                        }
                                                        if(n7 != null) {
                                                            d2.c(n7);
                                                            n7 = null;
                                                        }
                                                        d2.c(n9);
                                                    }
                                                }
                                                n9 = n9.d0;
                                            }
                                            if(v2 != 1) {
                                                goto label_114;
                                            }
                                            continue;
                                        }
                                    label_114:
                                        n7 = F0.f.f(d2);
                                    }
                                }
                                if((n6.b0 & 0x8000) == 0) {
                                    break;
                                }
                                n6 = n6.d0;
                            }
                        }
                    }
                    else {
                        ((LayoutNode)(((F0.k)object0))).r0 = viewConfiguration0;
                        n n3 = (n)((LayoutNode)(((F0.k)object0))).u0.f;
                        if((n3.b0 & 16) == 0) {
                            goto label_82;
                        }
                        else {
                            while(true) {
                                if(n3 == null) {
                                    goto label_82;
                                }
                                if((n3.Z & 16) != 0) {
                                    n n4 = n3;
                                    W.d d1 = null;
                                    while(n4 != null) {
                                        if(n4 instanceof m0) {
                                            ((m0)n4).R();
                                        }
                                        else if((n4.Z & 16) != 0 && n4 instanceof F0.n) {
                                            n n5 = ((F0.n)n4).m0;
                                            int v1 = 0;
                                            while(n5 != null) {
                                                if((n5.Z & 16) != 0) {
                                                    ++v1;
                                                    if(v1 == 1) {
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
                                            if(v1 != 1) {
                                                goto label_77;
                                            }
                                            continue;
                                        }
                                    label_77:
                                        n4 = F0.f.f(d1);
                                    }
                                }
                                if((n3.b0 & 16) != 0) {
                                    n3 = n3.d0;
                                    continue;
                                }
                                goto label_82;
                            }
                        }
                    }
                }
                else {
                    ((LayoutNode)(((F0.k)object0))).q0 = layoutDirection0;
                    ((LayoutNode)(((F0.k)object0))).B();
                    LayoutNode layoutNode0 = ((LayoutNode)(((F0.k)object0))).s();
                    if(layoutNode0 != null) {
                        layoutNode0.z();
                    }
                    ((LayoutNode)(((F0.k)object0))).A();
                    n n0 = (n)((LayoutNode)(((F0.k)object0))).u0.f;
                    if((n0.b0 & 4) == 0) {
                        goto label_46;
                    }
                    else {
                        while(true) {
                            if(n0 == null) {
                                goto label_46;
                            }
                            if((n0.Z & 4) != 0) {
                                n n1 = n0;
                                W.d d0 = null;
                                while(n1 != null) {
                                    if(!(n1 instanceof o)) {
                                        if((n1.Z & 4) != 0 && n1 instanceof F0.n) {
                                            n n2 = ((F0.n)n1).m0;
                                            int v = 0;
                                            while(n2 != null) {
                                                if((n2.Z & 4) != 0) {
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
                                                goto label_41;
                                            }
                                            continue;
                                        }
                                    }
                                    else if(((o)n1) instanceof b) {
                                        ((b)(((o)n1))).x0();
                                    }
                                label_41:
                                    n1 = F0.f.f(d0);
                                }
                            }
                            if((n0.b0 & 4) != 0) {
                                n0 = n0.d0;
                                continue;
                            }
                            goto label_46;
                        }
                    }
                }
                return t.a;
            }
        }
    }
}

