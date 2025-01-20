package g1;

import D0.V;
import Ec.p;
import I2.J;
import W5.f;
import a1.a;
import a8.Q;
import android.util.Log;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import l1.h;
import o1.b;
import o1.d;
import o1.e;
import p1.c;

public final class j implements c {
    public final e a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final k e;
    public final int[] f;
    public final int[] g;

    public j(Density density0) {
        e e0 = new e(0, 0);  // initializer: Lo1/d;-><init>(II)V
        e0.r0 = new ArrayList();
        e0.s0 = new Q(e0);
        e0.t0 = new p(e0);
        e0.v0 = null;
        e0.w0 = false;
        e0.x0 = new h1.c();
        e0.A0 = 0;
        e0.B0 = 0;
        e0.C0 = new b[4];
        e0.D0 = new b[4];
        e0.E0 = 0x101;
        e0.F0 = false;
        e0.G0 = false;
        e0.H0 = null;
        e0.I0 = null;
        e0.J0 = null;
        e0.K0 = null;
        e0.L0 = new HashSet();
        e0.M0 = new p1.b();  // initializer: Ljava/lang/Object;-><init>()V
        e0.v0 = this;
        e0.t0.g = this;
        this.a = e0;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new k(density0);
        this.f = new int[2];
        this.g = new int[2];
        new ArrayList();
    }

    @Override  // p1.c
    public final void a() {
    }

    @Override  // p1.c
    public final void b(d d0, p1.b b0) {
        int v7;
        boolean z;
        String s = d0.k;
        LinkedHashMap linkedHashMap0 = this.c;
        Integer[] arr_integer = (Integer[])linkedHashMap0.get(s);
        int v = a.h(this.e.l);
        k k0 = this.e;
        j.d(b0.a, b0.c, d0.s, b0.j, (arr_integer == null ? 0 : ((int)arr_integer[1])) == d0.l(), d0.B(), v, this.f);
        int v1 = a.g(k0.l);
        j.d(b0.b, b0.d, d0.t, b0.j, (arr_integer == null ? 0 : ((int)arr_integer[0])) == d0.r(), d0.C(), v1, this.g);
        long v2 = f.b(this.f[0], this.f[1], this.g[0], this.g[1]);
        if(b0.j == 1 || b0.j == 2 || b0.a != 3 || d0.s != 0 || b0.b != 3 || d0.t != 0) {
            long v3 = this.c(d0, v2);
            d0.g = false;
            int v4 = ((Number)J.v(((int)(v3 >> 0x20)), (d0.v > 0 ? ((int)d0.v) : null), (d0.w <= 0 ? null : ((int)d0.w)))).intValue();
            int v5 = ((Number)J.v(((int)(v3 & 0xFFFFFFFFL)), (d0.y > 0 ? ((int)d0.y) : null), (d0.z <= 0 ? null : ((int)d0.z)))).intValue();
            if(v4 == ((int)(v3 >> 0x20))) {
                z = false;
            }
            else {
                v2 = f.b(v4, v4, a.i(v2), a.g(v2));
                z = true;
            }
            if(v5 != ((int)(v3 & 0xFFFFFFFFL))) {
                v2 = f.b(a.j(v2), a.h(v2), v5, v5);
                z = true;
            }
            if(z) {
                this.c(d0, v2);
                d0.g = false;
            }
        }
        V v6 = (V)this.b.get(d0.g0);
        b0.e = v6 == null ? d0.r() : v6.X;
        b0.f = v6 == null ? d0.l() : v6.Y;
        if(v6 == null) {
            v7 = 0x80000000;
        }
        else {
            ArrayList arrayList0 = k0.i;
            if(k0.j) {
                arrayList0.clear();
                for(Object object0: k0.h) {
                    d d1 = ((h)k0.c.get(object0)).a();
                    if(d1 != null) {
                        arrayList0.add(d1);
                    }
                }
                k0.j = false;
            }
            v7 = arrayList0.contains(d0) ? v6.Q(D0.c.a) : 0x80000000;
        }
        b0.h = v7 != 0x80000000;
        b0.g = v7;
        Object object1 = linkedHashMap0.get(s);
        if(object1 == null) {
            object1 = new Integer[]{0, 0, 0x80000000};
            linkedHashMap0.put(s, object1);
        }
        ((Integer[])object1)[0] = (int)b0.e;
        ((Integer[])object1)[1] = (int)b0.f;
        ((Integer[])object1)[2] = (int)b0.g;
        b0.i = b0.e != b0.c || b0.f != b0.d;
    }

    public final long c(d d0, long v) {
        int v2;
        Object object0 = d0.g0;
        String s = d0.k;
        int v1 = 0;
        if(d0 instanceof o1.k) {
            if(a.f(v)) {
                v2 = 0x40000000;
            }
            else {
                v2 = a.d(v) ? 0x80000000 : 0;
            }
            if(a.e(v)) {
                v1 = 0x40000000;
            }
            else if(a.c(v)) {
                v1 = 0x80000000;
            }
            ((o1.k)d0).X(v2, a.h(v), v1, a.g(v));
            return s.h.a(((o1.k)d0).y0, ((o1.k)d0).z0);
        }
        if(object0 instanceof D0.J) {
            V v3 = ((D0.J)object0).a(v);
            this.b.put(object0, v3);
            return s.h.a(v3.X, v3.Y);
        }
        Log.w("CCL", "Nothing to measure for widget: " + s);
        return 0L;
    }

    public static void d(int v, int v1, int v2, int v3, boolean z, boolean z1, int v4, int[] arr_v) {
        String s;
        switch(v.h.d(v)) {
            case 0: {
                arr_v[0] = v1;
                arr_v[1] = v1;
                return;
            }
            case 1: {
                arr_v[0] = 0;
                arr_v[1] = v4;
                return;
            }
            case 2: {
                boolean z2 = z1 || (v3 == 1 || v3 == 2) && (v3 == 2 || v2 != 1 || z);
                arr_v[0] = z2 ? v1 : 0;
                if(!z2) {
                    v1 = v4;
                }
                arr_v[1] = v1;
                return;
            }
            case 3: {
                arr_v[0] = v4;
                arr_v[1] = v4;
                return;
            }
            default: {
                switch(v) {
                    case 1: {
                        s = "FIXED";
                        break;
                    }
                    case 2: {
                        s = "WRAP_CONTENT";
                        break;
                    }
                    case 3: {
                        s = "MATCH_CONSTRAINT";
                        break;
                    }
                    case 4: {
                        s = "MATCH_PARENT";
                        break;
                    }
                    default: {
                        s = "null";
                    }
                }
                throw new IllegalStateException((s + " is not supported").toString());
            }
        }
    }
}

