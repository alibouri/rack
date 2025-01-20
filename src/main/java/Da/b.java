package da;

import Ab.t;
import B.v;
import B.y0;
import J2.w;
import N.M0;
import N.m2;
import Nb.j;
import U.p;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import n0.U;
import t0.a;
import t0.d;
import t0.e;
import t0.i;
import t0.l;
import t0.m;
import t0.o;

public final class b implements Function3 {
    public final int X;
    public static final b Y;
    public static final b Z;
    public static final b b0;

    static {
        b.Y = new b(0);
        b.Z = new b(1);
        b.b0 = new b(2);
    }

    public b(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        Object object3 = t.a;
        switch(this.X) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$WavePrimaryButton");
                if((v1 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                m2.b(w.S(0x7F1202DC, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p)object1), 0, 0, 0x1FFFE);  // string:ok "OK"
                return object3;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                j.f(((v)object0), "$this$ButtonWithIcon");
                if((v2 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                e e0 = N4.j.e;
                if(e0 == null) {
                    d d0 = new d("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60);
                    U u0 = new U(n0.v.b);
                    ArrayList arrayList0 = new ArrayList(0x20);
                    arrayList0.add(new m(12.0f, 2.0f));
                    arrayList0.add(new t0.j(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f));
                    arrayList0.add(new t0.w(4.48f, 10.0f, 10.0f, 10.0f));
                    arrayList0.add(new t0.w(10.0f, -4.48f, 10.0f, -10.0f));
                    arrayList0.add(new o(17.52f, 2.0f, 12.0f, 2.0f));
                    arrayList0.add(i.c);
                    arrayList0.add(new m(10.0f, 17.0f));
                    arrayList0.add(new t0.t(-5.0f, -5.0f));
                    arrayList0.add(new t0.t(1.41f, -1.41f));
                    arrayList0.add(new l(10.0f, 14.17f));
                    arrayList0.add(new t0.t(7.59f, -7.59f));
                    arrayList0.add(new l(19.0f, 8.0f));
                    arrayList0.add(new t0.t(-9.0f, 9.0f));
                    arrayList0.add(i.c);
                    d.a(d0, arrayList0, u0);
                    e0 = d0.b();
                    N4.j.e = e0;
                }
                long v3 = yc.d.h(0x7F060034, ((p)object1));  // color:SuccessGreen500
                M0.a(a.c(e0, ((p)object1)), null, g0.l.X, v3, ((p)object1), 56, 0);
                return object3;
            }
            default: {
                int v = ((Number)object2).intValue();
                j.f(((v)object0), "$this$ButtonWithIcon");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                M0.a(yc.l.y(0x7F080202, ((p)object1), 0), null, null, yc.d.h(0x7F06000D, ((p)object1)), ((p)object1), 0x30, 4);  // drawable:ic_cancel_circle
                return object3;
            }
        }
    }
}

