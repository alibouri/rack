package c0;

import Ab.c;
import D0.u;
import E.E;
import E.K;
import Mb.e;
import Mb.f;
import Mb.g;
import Mb.h;
import Mb.i;
import Mb.j;
import Nb.z;
import R.n0;
import U.l0;
import U.p;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import o9.s2;

public final class b implements c, Mb.b, Mb.c, e, f, g, h, i, j, Function2, Function3 {
    public final int X;
    public final boolean Y;
    public Object Z;
    public l0 b0;
    public ArrayList c0;

    public b(int v, Object object0, boolean z) {
        this.X = v;
        this.Y = z;
        this.Z = object0;
    }

    public final Object a(Object object0, p p0, int v) {
        p0.S(this.X);
        this.k(p0);
        int v1 = p0.f(this) ? 0x20 : 16;
        Object object1 = this.Z;
        Nb.j.d(object1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        z.d(3, object1);
        Object object2 = ((Function3)object1).h(object0, p0, ((int)(v1 | v)));
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 10, this, object0);
        }
        return object2;
    }

    public final Object b(Object object0, Object object1, p p0, int v) {
        p0.S(this.X);
        this.k(p0);
        int v1 = p0.f(this) ? 0x100 : 0x80;
        Object object2 = this.Z;
        Nb.j.d(object2, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        z.d(4, object2);
        Object object3 = ((e)object2).r(object0, object1, p0, ((int)(v1 | v)));
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(this, object0, object1, v, 11, false);
        }
        return object3;
    }

    public final Object c(Object object0, Object object1, Object object2, p p0, int v) {
        p0.S(this.X);
        this.k(p0);
        int v1 = p0.f(this) ? 0x800 : 0x400;
        Object object3 = this.Z;
        Nb.j.d(object3, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        z.d(5, object3);
        Object object4 = ((f)object3).d(object0, object1, object2, p0, ((int)(v1 | v)));
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new K(this, object0, object1, object2, v, 4);
        }
        return object4;
    }

    @Override  // Mb.f
    public final Object d(Object object0, Object object1, Object object2, Object object3, Serializable serializable0) {
        return this.c(object0, object1, object2, ((p)object3), ((Number)serializable0).intValue());
    }

    @Override  // Mb.h
    public final Object e(s2 s20, String s, String s1, Boolean boolean0, Object object0, Object object1, Serializable serializable0) {
        return this.i(s20, s, s1, boolean0, object0, ((p)object1), ((Number)serializable0).intValue());
    }

    @Override  // Mb.g
    public final Object f(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        return this.g(object0, object1, object2, object3, ((p)object4), ((Number)object5).intValue());
    }

    public final Object g(Object object0, Object object1, Object object2, Object object3, p p0, int v) {
        p0.S(this.X);
        this.k(p0);
        int v1 = p0.f(this) ? 0x4000 : 0x2000;
        Object object4 = this.Z;
        Nb.j.d(object4, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        z.d(6, object4);
        Object object5 = ((g)object4).f(object0, object1, object2, object3, p0, ((int)(v | v1)));
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new a(this, object0, object1, object2, object3, v, 0);
        }
        return object5;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        return this.a(object0, ((p)object1), ((Number)object2).intValue());
    }

    public final Object i(s2 s20, String s, String s1, Boolean boolean0, Object object0, p p0, int v) {
        p0.S(this.X);
        this.k(p0);
        int v1 = p0.f(this) ? 0x20000 : 0x10000;
        Object object1 = this.Z;
        Nb.j.d(object1, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        z.d(7, object1);
        Object object2 = ((h)object1).e(s20, s, s1, boolean0, object0, p0, ((int)(v | v1)));
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new n0(this, s20, s, s1, boolean0, object0, v);
        }
        return object2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        ((p)object0).S(this.X);
        this.k(((p)object0));
        int v1 = ((p)object0).f(this) ? 4 : 2;
        Object object2 = this.Z;
        Nb.j.d(object2, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        z.d(2, object2);
        Object object3 = ((Function2)object2).j(((p)object0), ((int)(v | v1)));
        l0 l00 = ((p)object0).r();
        if(l00 != null) {
            z.d(2, this);
            l00.d = this;
        }
        return object3;
    }

    public final void k(p p0) {
        if(this.Y) {
            l0 l00 = p0.v();
            if(l00 != null) {
                p0.getClass();
                l00.a |= 1;
                if(c0.c.d(this.b0, l00)) {
                    this.b0 = l00;
                    return;
                }
                ArrayList arrayList0 = this.c0;
                if(arrayList0 == null) {
                    ArrayList arrayList1 = new ArrayList();
                    this.c0 = arrayList1;
                    arrayList1.add(l00);
                    return;
                }
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(c0.c.d(((l0)arrayList0.get(v1)), l00)) {
                        arrayList0.set(v1, l00);
                        return;
                    }
                }
                arrayList0.add(l00);
            }
        }
    }

    public final void m(c c0) {
        if(!Nb.j.a(this.Z, c0)) {
            boolean z = this.Z == null;
            this.Z = c0;
            if(!z && this.Y) {
                l0 l00 = this.b0;
                if(l00 != null) {
                    l00.c();
                    this.b0 = null;
                }
                ArrayList arrayList0 = this.c0;
                if(arrayList0 != null) {
                    int v1 = arrayList0.size();
                    for(int v = 0; v < v1; ++v) {
                        ((l0)arrayList0.get(v)).c();
                    }
                    arrayList0.clear();
                }
            }
        }
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        return this.b(object0, object1, ((p)object2), ((Number)object3).intValue());
    }
}

