package M0;

import Bb.a;
import Bb.p;
import Bb.z;
import D0.b0;
import F0.c0;
import F0.f;
import F0.n0;
import I2.J;
import W.d;
import androidx.compose.ui.node.LayoutNode;
import g0.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function1;
import m0.c;

public final class o {
    public final n a;
    public final boolean b;
    public final LayoutNode c;
    public final j d;
    public boolean e;
    public o f;
    public final int g;

    public o(n n0, boolean z, LayoutNode layoutNode0, j j0) {
        this.a = n0;
        this.b = z;
        this.c = layoutNode0;
        this.d = j0;
        this.g = layoutNode0.Y;
    }

    public final o a(g g0, Function1 function10) {
        j j0 = new j();
        j0.Y = false;
        j0.Z = false;
        function10.n(j0);
        o o0 = new o(new m(function10), false, new LayoutNode(this.g + (g0 == null ? 2000000000 : 1000000000), true), j0);
        o0.e = true;
        o0.f = this;
        return o0;
    }

    public final void b(LayoutNode layoutNode0, ArrayList arrayList0, boolean z) {
        d d0 = layoutNode0.u();
        int v = d0.Z;
        if(v > 0) {
            Object[] arr_object = d0.X;
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(layoutNode1.E() && (z || !layoutNode1.E0)) {
                    if(layoutNode1.u0.f(8)) {
                        arrayList0.add(J.g(layoutNode1, this.b));
                    }
                    else {
                        this.b(layoutNode1, arrayList0, z);
                    }
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final c0 c() {
        if(this.e) {
            o o0 = this.j();
            return o0 == null ? null : o0.c();
        }
        n0 n00 = J.D(this.c);
        if(n00 == null) {
            n00 = this.a;
        }
        return f.t(n00, 8);
    }

    public final void d(List list0) {
        List list1 = this.o(false, false);
        int v1 = list1.size();
        for(int v = 0; v < v1; ++v) {
            o o0 = (o)list1.get(v);
            if(o0.l()) {
                list0.add(o0);
            }
            else if(!o0.d.Z) {
                o0.d(list0);
            }
        }
    }

    public final c e() {
        c0 c00 = this.c();
        if(c00 != null) {
            if(!c00.G0().k0) {
                c00 = null;
            }
            return c00 == null ? c.e : b0.h(c00).x(c00, true);
        }
        return c.e;
    }

    public final c f() {
        c0 c00 = this.c();
        if(c00 != null) {
            if(!c00.G0().k0) {
                c00 = null;
            }
            return c00 == null ? c.e : b0.f(c00);
        }
        return c.e;
    }

    public final List g(boolean z, boolean z1, boolean z2) {
        if(!z && this.d.Z) {
            return z.X;
        }
        if(this.l()) {
            List list0 = new ArrayList();
            this.d(list0);
            return list0;
        }
        return this.o(z1, z2);
    }

    public static List h(o o0, boolean z, int v) {
        int v1 = (v & 1) == 0 ? 0 : !o0.b;
        if((v & 2) != 0) {
            z = false;
        }
        return o0.g(((boolean)v1), z, false);
    }

    public final j i() {
        j j0 = this.d;
        if(this.l()) {
            j j1 = new j();
            j1.Y = j0.Y;
            j1.Z = j0.Z;
            j1.X.putAll(j0.X);
            this.n(j1);
            return j1;
        }
        return j0;
    }

    public final o j() {
        LayoutNode layoutNode1;
        o o0 = this.f;
        if(o0 != null) {
            return o0;
        }
        LayoutNode layoutNode0 = this.c;
        boolean z = this.b;
        if(z) {
            M0.n n0 = M0.n.X;
            layoutNode1 = layoutNode0.s();
            while(layoutNode1 != null) {
                if(((Boolean)n0.n(layoutNode1)).booleanValue()) {
                    goto label_13;
                }
                layoutNode1 = layoutNode1.s();
            }
        }
        layoutNode1 = null;
    label_13:
        if(layoutNode1 == null) {
            for(LayoutNode layoutNode2 = layoutNode0.s(); layoutNode2 != null; layoutNode2 = layoutNode2.s()) {
                if(layoutNode2.u0.f(8)) {
                    return layoutNode2 == null ? null : J.g(layoutNode2, z);
                }
            }
            layoutNode1 = null;
        }
        return layoutNode1 == null ? null : J.g(layoutNode1, z);
    }

    public final j k() {
        return this.d;
    }

    // Deobfuscation rating: LOW(20)
    public final boolean l() {
        return this.b && this.d.Y;
    }

    public final boolean m() {
        if(!this.e && o.h(this, true, 4).isEmpty()) {
            LayoutNode layoutNode0;
            for(layoutNode0 = this.c.s(); true; layoutNode0 = layoutNode0.s()) {
                if(layoutNode0 == null) {
                    layoutNode0 = null;
                    break;
                }
                j j0 = layoutNode0.o();
                if(j0 != null && j0.Y) {
                    break;
                }
            }
            return layoutNode0 == null;
        }
        return false;
    }

    public final void n(j j0) {
        if(!this.d.Z) {
            List list0 = this.o(false, false);
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                o o0 = (o)list0.get(v);
                if(!o0.l()) {
                    for(Object object0: o0.d.X.entrySet()) {
                        t t0 = (t)((Map.Entry)object0).getKey();
                        Object object1 = ((Map.Entry)object0).getValue();
                        LinkedHashMap linkedHashMap0 = j0.X;
                        Object object2 = linkedHashMap0.get(t0);
                        Nb.j.d(t0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object object3 = t0.b.j(object2, object1);
                        if(object3 != null) {
                            linkedHashMap0.put(t0, object3);
                        }
                    }
                    o0.n(j0);
                }
            }
        }
    }

    public final List o(boolean z, boolean z1) {
        if(this.e) {
            return z.X;
        }
        List list0 = new ArrayList();
        this.b(this.c, ((ArrayList)list0), z1);
        if(z) {
            j j0 = this.d;
            LinkedHashMap linkedHashMap0 = j0.X;
            Object object0 = linkedHashMap0.get(q.s);
            if(object0 == null) {
                object0 = null;
            }
            if(((g)object0) != null && j0.Y && !((ArrayList)list0).isEmpty()) {
                ((ArrayList)list0).add(this.a(((g)object0), new a(20, ((g)object0))));
            }
            t t0 = q.a;
            if(linkedHashMap0.containsKey(t0) && !((ArrayList)list0).isEmpty() && j0.Y) {
                Object object1 = linkedHashMap0.get(t0);
                if(object1 == null) {
                    object1 = null;
                }
                String s = ((List)object1) == null ? null : ((String)p.q0(((List)object1)));
                if(s != null) {
                    ((ArrayList)list0).add(0, this.a(null, new l(s, 0)));
                }
            }
        }
        return list0;
    }
}

