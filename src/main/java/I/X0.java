package I;

import Ab.t;
import B.m0;
import Bb.z;
import G0.f0;
import I2.J;
import K.f;
import K.o;
import K.x;
import Nb.j;
import Nb.k;
import Nb.w;
import U0.B;
import U0.n;
import U0.v;
import android.graphics.Rect;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.LayoutDirection;
import e1.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.c;
import m0.e;
import m5.b;
import n0.r;
import nc.a;
import yc.d;

public final class x0 extends k implements Function1 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;

    public x0(B b0, f f0, n n0, m0 m00, F f1) {
        this.X = 1;
        this.Y = b0;
        this.Z = f0;
        this.b0 = n0;
        this.c0 = m00;
        this.d0 = f1;
        super(1);
    }

    public x0(Object object0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.X = v;
        this.Z = object0;
        this.b0 = object1;
        this.Y = object2;
        this.c0 = object3;
        this.d0 = object4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        int v11;
        z z1;
        Object object15;
        double f7;
        Object object14;
        long v2;
        w w1;
        Object object10;
        Object object9;
        Object object8;
        Iterator iterator1;
        t t0 = t.a;
        Object object1 = this.b0;
        Object object2 = this.d0;
        Object object3 = this.c0;
        Object object4 = this.Y;
        Object object5 = this.Z;
        switch(this.X) {
            case 0: {
                ((LayoutNodeDrawScope)object0).a();
                float f18 = ((o)object5).b.k();
                if(f18 != 0.0f) {
                    int v12 = ((v)object1).l(((int)(((B)object4).b >> 0x20)));
                    P0 p00 = ((j0)object3).d();
                    c c2 = p00 == null ? new c(0.0f, 0.0f, 0.0f, 0.0f) : p00.a.c(v12);
                    float f19 = ((LayoutNodeDrawScope)object0).w(z0.a);
                    float f20 = e.d(((LayoutNodeDrawScope)object0).X.Y.A());
                    float f21 = J.m(J.o(c2.a + f19 / 2.0f, f20 - f19 / 2.0f), f19 / 2.0f);
                    b.g(((LayoutNodeDrawScope)object0), ((r)object2), d.d(f21, c2.b), d.d(f21, c2.d), f19, f18, 0x1B0);
                }
                return t0;
            }
            case 1: {
                x x0 = ((f)object5).a;
                ((K.B)object0).h = (B)object4;
                ((K.B)object0).i = (n)object1;
                ((K.B)object0).c = (m0)object3;
                ((K.B)object0).d = (F)object2;
                ((K.B)object0).e = x0 == null ? null : x0.m0;
                ((K.B)object0).f = x0 == null ? null : x0.n0;
                ((K.B)object0).g = x0 == null ? null : ((ViewConfiguration)F0.f.i(x0, f0.q));
                return t0;
            }
            case 2: {
                U.F f22 = (U.F)object0;
                ((u)object5).o0.addView(((u)object5), ((u)object5).p0);
                ((u)object5).l(((Function0)object1), ((e1.x)object4), ((String)object3), ((LayoutDirection)object2));
                return new E.B(10, ((u)object5));
            }
            default: {
                long v = ((Number)object0).longValue();
                long v1 = ((Number)((MutableState)object5).getValue()).longValue() <= 0L ? 0L : v - ((Number)((MutableState)object5).getValue()).longValue();
                ((MutableState)object5).setValue(v);
                w w0 = (w)object4;
                Object object6 = w0.X;
                if(object6 != null) {
                    ArrayList arrayList0 = new ArrayList(Bb.r.b0(((List)object6)));
                    Iterator iterator0 = ((List)object6).iterator();
                    while(iterator0.hasNext()) {
                        Object object7 = iterator0.next();
                        mc.d d0 = (mc.d)object7;
                        mc.b b0 = d0.a;
                        z z0 = z.X;
                        if(Long.compare(System.currentTimeMillis() - d0.b, b0.l) < 0) {
                            iterator1 = iterator0;
                            object8 = object1;
                            object9 = object2;
                            object10 = object3;
                            w1 = w0;
                            v2 = v1;
                        }
                        else {
                            if(d0.a() && ((lc.b)object3) != null) {
                                Object object11 = w0.X;
                                if(object11 != null) {
                                    if(!(((List)object11) instanceof Collection) || !((List)object11).isEmpty()) {
                                        int v3 = 0;
                                        for(Object object12: ((List)object11)) {
                                            if(!((mc.d)object12).a()) {
                                                ++v3;
                                                if(v3 < 0) {
                                                    throw new ArithmeticException("Count overflow has happened.");
                                                }
                                                if(false) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    ((lc.b)object3).p(d0);
                                    goto label_45;
                                }
                                j.p("partySystems");
                                throw null;
                            }
                        label_45:
                            Rect rect0 = (Rect)((MutableState)object2).getValue();
                            j.f(rect0, "drawArea");
                            ArrayList arrayList1 = d0.e;
                            if(d0.c) {
                                nc.d d1 = d0.d;
                                d1.getClass();
                                d1.e += ((float)v1) / 1000.0f;
                                nc.c c0 = d1.a;
                                mc.b b1 = b0;
                                long v4 = c0.a;
                                iterator1 = iterator0;
                                w1 = w0;
                                float f = ((float)v4) / 1000.0f;
                                v2 = v1;
                                float f1 = d1.d;
                                if(f1 == 0.0f && ((float)v1) / 1000.0f <= f) {
                                    d1.e = f;
                                }
                                float f2 = d1.e;
                                float f3 = c0.b;
                                if(f2 >= f3 && (v4 == 0L || f1 < ((float)v4))) {
                                    Sb.d d2 = new Sb.d(1, ((int)(f2 / f3)), 1);  // initializer: LSb/b;-><init>(III)V
                                    z1 = new ArrayList(Bb.r.b0(d2));
                                    Sb.c c1 = d2.a();
                                    while(c1.Z) {
                                        c1.a();
                                        Random random0 = d1.c;
                                        oc.d d3 = (oc.d)b1.f.get(random0.nextInt(b1.f.size()));
                                        mc.e e0 = d1.a(b1.k, rect0);
                                        oc.e e1 = new oc.e(e0.c, e0.d);
                                        float f4 = ((float)d3.a) * d1.b;
                                        float f5 = random0.nextFloat() * d3.c * d3.b + d3.b;
                                        Object object13 = b1.h.get(random0.nextInt(b1.h.size()));
                                        int v5 = ((Number)b1.g.get(random0.nextInt(b1.g.size()))).intValue();
                                        float f6 = Float.compare(b1.d, -1.0f) == 0 ? b1.c : b1.c + random0.nextFloat() * (b1.d - b1.c);
                                        int v6 = b1.b;
                                        int v7 = b1.a;
                                        if(v6 == 0) {
                                            object14 = object3;
                                            f7 = (double)v7;
                                            object15 = object1;
                                        }
                                        else {
                                            object14 = object3;
                                            int v8 = v7 - v6 / 2;
                                            object15 = object1;
                                            f7 = random0.nextDouble() * ((double)(v6 / 2 + v7 - v8)) + ((double)v8);
                                        }
                                        double f8 = Math.toRadians(f7);
                                        float f9 = d1.b(b1.m);
                                        float f10 = d1.b(b1.m);
                                        ((ArrayList)z1).add(new a(e1, v5, f4, f5, ((oc.c)object13), b1.i, b1.j, new oc.e(((float)Math.cos(f8)) * f6, f6 * ((float)Math.sin(f8))), b1.e, f10 * b1.m.e, f9 * b1.m.d, d1.b));
                                        c1 = c1;
                                        object2 = object2;
                                        object3 = object14;
                                        object1 = object15;
                                        b1 = b1;
                                    }
                                    object8 = object1;
                                    object9 = object2;
                                    object10 = object3;
                                    d1.e %= c0.b;
                                }
                                else {
                                    object8 = object1;
                                    object9 = object2;
                                    object10 = object3;
                                    z1 = z0;
                                }
                                d1.d = 1000.0f * (((float)v1) / 1000.0f) + d1.d;
                                arrayList1.addAll(z1);
                            }
                            else {
                                iterator1 = iterator0;
                                object8 = object1;
                                object9 = object2;
                                object10 = object3;
                                w1 = w0;
                                v2 = v1;
                            }
                            for(Object object16: arrayList1) {
                                a a0 = (a)object16;
                                a0.getClass();
                                oc.e e2 = a0.h;
                                e2.a = a0.q.a * (1.0f / a0.d) + e2.a;
                                e2.b = a0.q.b * (1.0f / a0.d) + e2.b;
                                a0.p = ((float)v1) / 1000.0f > 0.0f ? 1.0f / (((float)v1) / 1000.0f) : 60.0f;
                                oc.e e3 = a0.a;
                                if(e3.b > ((float)rect0.height())) {
                                    a0.r = 0;
                                }
                                else {
                                    float f11 = (a0.i.a + e2.a) * a0.j;
                                    a0.i.a = f11;
                                    float f12 = (a0.i.b + e2.b) * a0.j;
                                    a0.i.b = f12;
                                    float f13 = a0.p;
                                    float f14 = ((float)v1) / 1000.0f * f13 * a0.m;
                                    e3.a = f11 * f14 + e3.a;
                                    e3.b = f12 * f14 + e3.b;
                                    long v9 = a0.f - ((long)(1000.0f * (((float)v1) / 1000.0f)));
                                    a0.f = v9;
                                    if(v9 <= 0L) {
                                        if(a0.g) {
                                            int v10 = a0.r - ((int)(5.0f * (((float)v1) / 1000.0f) * f13));
                                            if(v10 >= 0) {
                                                v11 = v10;
                                            }
                                        }
                                        else {
                                            v11 = 0;
                                        }
                                        a0.r = v11;
                                    }
                                    float f15 = a0.l * (((float)v1) / 1000.0f) * f13 + a0.n;
                                    a0.n = f15;
                                    if(f15 >= 360.0f) {
                                        a0.n = 0.0f;
                                    }
                                    float f16 = a0.o - Math.abs(a0.k) * (((float)v1) / 1000.0f) * a0.p;
                                    a0.o = f16;
                                    float f17 = a0.c;
                                    if(Float.compare(f16, 0.0f) < 0) {
                                        a0.o = f17;
                                    }
                                    a0.s = Math.abs(a0.o / f17 - 0.5f) * 2.0f;
                                    a0.t = a0.r << 24 | a0.b & 0xFFFFFF;
                                    a0.u = rect0.contains(((int)e3.a), ((int)e3.b));
                                }
                            }
                            Bb.v.i0(arrayList1, mc.c.X);
                            ArrayList arrayList2 = new ArrayList();
                            for(Object object17: arrayList1) {
                                if(((a)object17).u) {
                                    arrayList2.add(object17);
                                }
                            }
                            z0 = new ArrayList(Bb.r.b0(arrayList2));
                            for(Object object18: arrayList2) {
                                j.f(((a)object18), "<this>");
                                ((ArrayList)z0).add(new mc.a(((a)object18).a.a, ((a)object18).a.b, ((a)object18).c, ((a)object18).c, ((a)object18).t, ((a)object18).n, ((a)object18).s, ((a)object18).e, ((a)object18).r));
                            }
                        }
                        arrayList0.add(z0);
                        t0 = t0;
                        object2 = object9;
                        iterator0 = iterator1;
                        w0 = w1;
                        v1 = v2;
                        object3 = object10;
                        object1 = object8;
                    }
                    ((MutableState)object1).setValue(Bb.r.c0(arrayList0));
                    return t0;
                }
                j.p("partySystems");
                throw null;
            }
        }
    }
}

