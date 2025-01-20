package m5;

import F0.h;
import J2.w;
import Nb.j;
import U.p;
import ac.B0;
import android.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m0.e;
import n0.M;
import n0.U;
import n0.k;
import n0.n;
import n0.r;
import n0.t;
import p0.g;
import t7.a;

public abstract class b {
    public static StringBuilder A(int v, String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(v);
        stringBuilder0.append(s1);
        return stringBuilder0;
    }

    public static ArrayList B(int v, HashMap hashMap0, ArrayList arrayList0, int v1, String s) {
        hashMap0.put(v, arrayList0);
        ArrayList arrayList1 = new ArrayList(v1);
        arrayList1.add(s);
        return arrayList1;
    }

    public static HashMap C(Class class0, a a0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(class0, a0);
        return hashMap0;
    }

    public static Map D(HashMap hashMap0) {
        return Collections.unmodifiableMap(new HashMap(hashMap0));
    }

    public static AtomicInteger E(int v, Map map0, B0 b00) {
        AtomicInteger atomicInteger0 = new AtomicInteger(v);
        map0.put(b00, atomicInteger0);
        return atomicInteger0;
    }

    public static void F(int v, p p0, int v1, h h0) {
        p0.a0(v);
        p0.b(v1, h0);
    }

    public static String G(int v) {
        switch(v) {
            case 1: {
                return "NONE";
            }
            case 2: {
                return "LEFT";
            }
            case 3: {
                return "TOP";
            }
            case 4: {
                return "RIGHT";
            }
            case 5: {
                return "BOTTOM";
            }
            case 6: {
                return "BASELINE";
            }
            case 7: {
                return "CENTER";
            }
            case 8: {
                return "CENTER_X";
            }
            case 9: {
                return "CENTER_Y";
            }
            default: {
                throw null;
            }
        }
    }

    public static void H(m5.a a0, long v) {
        a0.a(v, M.w(v) > 0.5f, d.b);
    }

    public static String I(int v) {
        switch(v) {
            case 1: {
                return "FROM_NUMBER_WITH_PLUS_SIGN";
            }
            case 2: {
                return "FROM_NUMBER_WITH_IDD";
            }
            case 3: {
                return "FROM_NUMBER_WITHOUT_PLUS_SIGN";
            }
            case 4: {
                return "FROM_DEFAULT_COUNTRY";
            }
            case 5: {
                return "UNSPECIFIED";
            }
            default: {
                return "null";
            }
        }
    }

    public static long a(long v, long v1) {
        return w.m(e.d(v) - m0.b.d(v1), e.b(v) - m0.b.e(v1));
    }

    public static void b(t t0, Path path0) {
        t0.j(path0, 1);
    }

    public static void c(p0.d d0, long v, float f, float f1, long v1, long v2, float f2, p0.h h0, int v3) {
        d0.V(v, f, f1, v1, v2, ((v3 & 0x40) == 0 ? f2 : 1.0f), h0, null, 3);
    }

    public static void d(p0.d d0, long v, float f, long v1, p0.e e0, int v2) {
        long v3 = (v2 & 4) == 0 ? v1 : d0.M();
        p0.e e1 = (v2 & 16) == 0 ? e0 : g.a;
        d0.K(v, f, v3, 1.0f, e1, null, 3);
    }

    public static void e(p0.d d0, n0.g g0, long v, long v1, long v2, float f, n n0, int v3, int v4) {
        d0.a0(g0, ((v4 & 2) == 0 ? v : 0L), v1, 0L, ((v4 & 16) == 0 ? v2 : v1), ((v4 & 0x20) == 0 ? f : 1.0f), g.a, n0, 3, ((v4 & 0x200) == 0 ? v3 : 1));
    }

    public static void f(LayoutNodeDrawScope layoutNodeDrawScope0, n0.g g0, n n0) {
        layoutNodeDrawScope0.X.X.c.u(g0, 0L, layoutNodeDrawScope0.X.b(null, g.a, 1.0f, n0, 3, 1));
    }

    public static void g(LayoutNodeDrawScope layoutNodeDrawScope0, r r0, long v, long v1, float f, float f1, int v2) {
        float f2 = (v2 & 0x40) == 0 ? f1 : 1.0f;
        p0.b b0 = layoutNodeDrawScope0.X;
        t t0 = b0.X.c;
        n0.h h0 = b0.c();
        if(r0 != null) {
            r0.a(f2, b0.Y.A(), h0);
        }
        else if(((float)((Paint)h0.c).getAlpha()) / 255.0f != f2) {
            h0.u(f2);
        }
        if(!j.a(((n)h0.e), null)) {
            h0.x(null);
        }
        if(h0.b != 3) {
            h0.v(3);
        }
        Paint paint0 = (Paint)h0.c;
        if(paint0.getStrokeWidth() != f) {
            h0.D(f);
        }
        if(paint0.getStrokeMiter() != 4.0f) {
            ((Paint)h0.c).setStrokeMiter(4.0f);
        }
        if(!M.s(h0.k(), 0)) {
            h0.B(0);
        }
        if(!M.t(h0.l(), 0)) {
            h0.C(0);
        }
        if(!j.a(((k)h0.f), null)) {
            h0.z(null);
        }
        if(!M.r(((int)paint0.isFilterBitmap()), 1)) {
            h0.y(1);
        }
        t0.o(v, v1, h0);
    }

    public static void h(p0.d d0, long v, long v1, long v2, float f, int v3, k k0, int v4) {
        d0.g0(v, v1, v2, f, v3, ((v4 & 0x20) == 0 ? k0 : null), 1.0f, null, 3);
    }

    public static void i(p0.d d0, Path path0, r r0, float f, p0.h h0, int v) {
        if((v & 4) != 0) {
            f = 1.0f;
        }
        if((v & 8) != 0) {
            h0 = g.a;
        }
        d0.W(path0, r0, f, h0, null, ((v & 0x20) == 0 ? 0 : 3));
    }

    public static void j(p0.d d0, Path path0, long v, float f, p0.h h0, int v1) {
        if((v1 & 4) != 0) {
            f = 1.0f;
        }
        if((v1 & 8) != 0) {
            h0 = g.a;
        }
        d0.S(path0, v, f, h0, null, 3);
    }

    public static void k(p0.d d0, r r0, long v, long v1, float f, p0.e e0, int v2) {
        long v3 = (v2 & 2) == 0 ? v : 0L;
        long v4 = (v2 & 4) == 0 ? v1 : b.a(d0.d(), v3);
        p0.e e1 = (v2 & 16) == 0 ? e0 : g.a;
        d0.G(r0, v3, v4, ((v2 & 8) == 0 ? f : 1.0f), e1, null, 3);
    }

    public static void l(p0.d d0, long v, long v1, long v2, float f, int v3) {
        long v4 = (v3 & 2) == 0 ? v1 : 0L;
        d0.U(v, v4, ((v3 & 4) == 0 ? v2 : b.a(d0.d(), v4)), ((v3 & 8) == 0 ? f : 1.0f), g.a, null, ((v3 & 0x40) == 0 ? 0 : 3));
    }

    public static void m(LayoutNodeDrawScope layoutNodeDrawScope0, U u0, long v, long v1, long v2, p0.e e0, int v3) {
        long v4 = (v3 & 2) == 0 ? v : 0L;
        long v5 = (v3 & 4) == 0 ? v1 : b.a(layoutNodeDrawScope0.d(), v4);
        p0.e e1 = (v3 & 0x20) == 0 ? e0 : g.a;
        layoutNodeDrawScope0.c(u0, v4, v5, v2, 1.0f, e1, null, 3);
    }

    public static void n(p0.d d0, long v, long v1, long v2, long v3, p0.e e0, int v4) {
        d0.k0(v, ((v4 & 2) == 0 ? v1 : 0L), v2, v3, e0, 1.0f, null, 3);
    }

    public static float o(float f, float f1, float f2, float f3) {
        return (f - f1) * f2 + f3;
    }

    public static int p(int v, float f, int v1) {
        return (Float.floatToIntBits(f) + v) * v1;
    }

    public static int q(List list0, int v, int v1) {
        return (list0.hashCode() + v) * v1;
    }

    public static Object r(int v, ArrayList arrayList0) {
        return arrayList0.get(arrayList0.size() - v);
    }

    public static String s(int v, String s) [...] // Inlined contents

    public static String t(long v, String s) {
        return s + v;
    }

    public static String u(RecyclerView recyclerView0, StringBuilder stringBuilder0) {
        stringBuilder0.append(recyclerView0.C());
        return stringBuilder0.toString();
    }

    public static String v(String s, Integer integer0, String s1) {
        return s + integer0 + s1;
    }

    public static String w(String s, String s1) [...] // Inlined contents

    public static String x(StringBuilder stringBuilder0, float f, char c) {
        stringBuilder0.append(f);
        stringBuilder0.append(c);
        return stringBuilder0.toString();
    }

    public static String y(StringBuilder stringBuilder0, String s, String s1) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    public static String z(StringBuilder stringBuilder0, boolean z, char c) {
        stringBuilder0.append(z);
        stringBuilder0.append(c);
        return stringBuilder0.toString();
    }
}

