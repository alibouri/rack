package e0;

import A7.b;
import Bb.n;
import Bb.z;
import E.f0;
import Nb.j;
import R2.w;
import U.C;
import U.R0;
import U.e;
import W.f;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s.E;

public abstract class m {
    public static final w a;
    public static final Object b;
    public static k c;
    public static int d;
    public static final f0 e;
    public static final b f;
    public static Object g;
    public static Object h;
    public static final AtomicReference i;
    public static final g j;
    public static final e k;

    static {
        m.a = new w(20, 0);
        m.b = new Object();
        k k0 = k.c0;
        m.c = k0;
        m.d = 2;
        f0 f00 = new f0(4);
        f00.d = new int[16];
        f00.e = new int[16];
        int[] arr_v = new int[16];
        for(int v = 0; v < 16; ++v) {
            arr_v[v] = v + 1;
        }
        f00.f = arr_v;
        m.e = f00;
        b b0 = new b(7, false);
        b0.Z = new int[16];
        b0.b0 = new R0[16];
        m.f = b0;
        m.g = z.X;
        m.h = z.X;
        int v1 = m.d;
        m.d = v1 + 1;
        e0.b b1 = new e0.b(v1, k0);
        m.c = m.c.g(b1.b);
        AtomicReference atomicReference0 = new AtomicReference(b1);
        m.i = atomicReference0;
        m.j = (g)atomicReference0.get();
        m.k = new e(0);  // initializer: Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
    }

    public static final void a() {
        m.f(l.Y);
    }

    public static final Function1 b(Function1 function10, Function1 function11) {
        if(function10 != null && function11 != null && function10 != function11) {
            return new a(function10, function11, 2);
        }
        return function10 == null ? function11 : function10;
    }

    public static final HashMap c(c c0, c c1, k k0) {
        k k3;
        int v12;
        long[] arr_v2;
        k k2;
        int v9;
        long[] arr_v1;
        E e0 = c1.w();
        int v = c0.d();
        if(e0 != null) {
            k k1 = c1.e().g(c1.d()).e(c1.j);
            Object[] arr_object = e0.b;
            long[] arr_v = e0.a;
            int v1 = arr_v.length - 2;
            if(v1 >= 0) {
                int v2 = 0;
                HashMap hashMap0 = null;
                while(true) {
                    long v3 = arr_v[v2];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                        arr_v2 = arr_v;
                        v12 = v;
                        k3 = k1;
                    }
                    else {
                        int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                        int v5 = 0;
                        while(v5 < v4) {
                            if((0xFFL & v3) < 0x80L) {
                                t t0 = (t)arr_object[(v2 << 3) + v5];
                                v v6 = t0.c();
                                v v7 = m.t(v6, v, k0);
                                if(v7 == null) {
                                    arr_v1 = arr_v;
                                }
                                else {
                                    arr_v1 = arr_v;
                                    v v8 = m.t(v6, v, k1);
                                    if(v8 != null && !v7.equals(v8)) {
                                        v9 = v;
                                        k2 = k1;
                                        v v10 = m.t(v6, c1.d(), c1.e());
                                        if(v10 != null) {
                                            v v11 = t0.g(v8, v7, v10);
                                            if(v11 == null) {
                                                return null;
                                            }
                                            if(hashMap0 == null) {
                                                hashMap0 = new HashMap();
                                            }
                                            hashMap0.put(v7, v11);
                                            hashMap0 = hashMap0;
                                            goto label_44;
                                        }
                                        m.s();
                                        throw null;
                                    }
                                }
                            }
                            else {
                                arr_v1 = arr_v;
                            }
                            v9 = v;
                            k2 = k1;
                        label_44:
                            v3 >>= 8;
                            ++v5;
                            arr_v = arr_v1;
                            v = v9;
                            k1 = k2;
                        }
                        arr_v2 = arr_v;
                        v12 = v;
                        k3 = k1;
                        if(v4 != 8) {
                            break;
                        }
                    }
                    if(v2 == v1) {
                        break;
                    }
                    ++v2;
                    arr_v = arr_v2;
                    v = v12;
                    k1 = k3;
                }
                return hashMap0;
            }
            return null;
        }
        return null;
    }

    public static final void d(g g0) {
        int v1;
        if(!m.c.d(g0.d())) {
            StringBuilder stringBuilder0 = new StringBuilder("Snapshot is not open: id=");
            stringBuilder0.append(g0.d());
            stringBuilder0.append(", disposed=");
            stringBuilder0.append(g0.c);
            stringBuilder0.append(", applied=");
            c c0 = g0 instanceof c ? ((c)g0) : null;
            Boolean boolean0 = c0 == null ? "read-only" : Boolean.valueOf(c0.m);
            stringBuilder0.append(boolean0);
            stringBuilder0.append(", lowestPin=");
            synchronized(m.b) {
                v1 = m.e.b <= 0 ? -1 : ((int[])m.e.d)[0];
            }
            stringBuilder0.append(v1);
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
    }

    public static final k e(k k0, int v, int v1) {
        while(v < v1) {
            k0 = k0.g(v);
            ++v;
        }
        return k0;
    }

    public static final Object f(Function1 function10) {
        Object object2;
        E e0;
        Object object1;
        j.d(m.j, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        e0.b b0 = (e0.b)m.j;
        synchronized(m.b) {
            object1 = m.i.get();
            e0 = ((e0.b)object1).h;
            if(e0 != null) {
                m.k.addAndGet(1);
            }
            object2 = m.w(((g)object1), function10);
        }
        if(e0 != null) {
            try {
                Object object3 = m.g;
                int v2 = ((List)object3).size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    ((Function2)((List)object3).get(v3)).j(new f(e0), object1);
                }
            }
            finally {
                m.k.addAndGet(-1);
            }
        }
        synchronized(m.b) {
            m.g();
            if(e0 != null) {
                Object[] arr_object = e0.b;
                long[] arr_v = e0.a;
                int v5 = arr_v.length - 2;
                if(v5 >= 0) {
                    int v6 = 0;
                    while(true) {
                        long v7 = arr_v[v6];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v8 = 8 - (~(v6 - v5) >>> 0x1F);
                            for(int v9 = 0; v9 < v8; ++v9) {
                                if((0xFFL & v7) < 0x80L) {
                                    m.r(((t)arr_object[(v6 << 3) + v9]));
                                }
                                v7 >>= 8;
                            }
                            if(v8 == 8) {
                                goto label_46;
                            }
                            break;
                        }
                    label_46:
                        if(v6 == v5) {
                            break;
                        }
                        ++v6;
                    }
                }
            }
            return object2;
        }
    }

    public static final void g() {
        b b0 = m.f;
        int v = b0.Y;
        int v2 = 0;
        for(int v1 = 0; true; ++v1) {
            Object object0 = null;
            if(v1 >= v) {
                break;
            }
            R0 r00 = ((R0[])b0.b0)[v1];
            if(r00 != null) {
                object0 = r00.get();
            }
            if(object0 != null && m.q(((t)object0))) {
                if(v2 != v1) {
                    ((R0[])b0.b0)[v2] = r00;
                    int[] arr_v = (int[])b0.Z;
                    arr_v[v2] = arr_v[v1];
                }
                ++v2;
            }
        }
        for(int v3 = v2; v3 < v; ++v3) {
            ((R0[])b0.b0)[v3] = null;
            ((int[])b0.Z)[v3] = 0;
        }
        if(v2 != v) {
            b0.Y = v2;
        }
    }

    public static final g h(g g0, Function1 function10, boolean z) {
        if(!(g0 instanceof c) && g0 != null) {
            return new y(g0, function10, z);
        }
        return g0 instanceof c ? new x(((c)g0), function10, null, false, z) : new x(null, function10, null, false, z);
    }

    public static final v i(v v0) {
        v v3;
        g g0 = m.k();
        v v1 = m.t(v0, g0.d(), g0.e());
        if(v1 == null) {
            synchronized(m.b) {
                g g1 = m.k();
                v3 = m.t(v0, g1.d(), g1.e());
            }
            if(v3 != null) {
                return v3;
            }
            m.s();
            throw null;
        }
        return v1;
    }

    public static final v j(v v0, g g0) {
        v v1 = m.t(v0, g0.d(), g0.e());
        if(v1 != null) {
            return v1;
        }
        m.s();
        throw null;
    }

    public static final g k() {
        g g0 = (g)m.a.p();
        return g0 == null ? ((g)m.i.get()) : g0;
    }

    public static final Function1 l(Function1 function10, Function1 function11, boolean z) {
        if(!z) {
            function11 = null;
        }
        if(function10 != null && function11 != null && function10 != function11) {
            return new a(function10, function11, 1);
        }
        return function10 == null ? function11 : function10;
    }

    public static final v m(v v0, t t0) {
        v v1 = t0.c();
        int v2 = m.d;
        f0 f00 = m.e;
        if(f00.b > 0) {
            v2 = ((int[])f00.d)[0];
        }
        k k0 = k.c0;
        v v3 = null;
        v v4 = null;
        while(v1 != null) {
            int v5 = v1.a;
            if(v5 == 0) {
                v3 = v1;
                break;
            }
            if(v5 != 0 && v5 <= v2 - 1 && !k0.d(v5)) {
                if(v4 == null) {
                    v4 = v1;
                    goto label_20;
                }
                if(v1.a >= v4.a) {
                    v3 = v4;
                    break;
                }
                v3 = v1;
                break;
            }
        label_20:
            v1 = v1.b;
        }
        if(v3 != null) {
            v3.a = 0x7FFFFFFF;
            return v3;
        }
        v3 = v0.b();
        v3.a = 0x7FFFFFFF;
        v3.b = t0.c();
        t0.l(v3);
        return v3;
    }

    public static final v n(v v0, C c0, g g0) {
        synchronized(m.b) {
            v v2 = m.m(v0, c0);
            v2.a(v0);
            v2.a = g0.d();
            return v2;
        }
    }

    public static final void o(g g0, t t0) {
        g0.s(g0.h() + 1);
        Function1 function10 = g0.i();
        if(function10 != null) {
            function10.n(t0);
        }
    }

    public static final v p(v v0, u u0, g g0, v v1) {
        v v4;
        if(g0.g()) {
            g0.n(u0);
        }
        int v2 = g0.d();
        if(v1.a == v2) {
            return v1;
        }
        synchronized(m.b) {
            v4 = m.m(v0, u0);
        }
        v4.a = v2;
        if(v1.a != 1) {
            g0.n(u0);
        }
        return v4;
    }

    public static final boolean q(t t0) {
        v v6;
        v v0 = t0.c();
        int v1 = m.d;
        f0 f00 = m.e;
        if(f00.b > 0) {
            v1 = ((int[])f00.d)[0];
        }
        v v2 = null;
        v v3 = null;
        int v4 = 0;
        while(v0 != null) {
            int v5 = v0.a;
            if(v5 != 0) {
                if(v5 >= v1) {
                    ++v4;
                }
                else if(v2 == null) {
                    ++v4;
                    v2 = v0;
                }
                else {
                    if(v5 < v2.a) {
                        v6 = v2;
                        v2 = v0;
                    }
                    else {
                        v6 = v0;
                    }
                    if(v3 == null) {
                        v3 = t0.c();
                        v v7 = v3;
                        while(true) {
                            if(v3 != null) {
                                int v8 = v3.a;
                                if(v8 < v1) {
                                    if(v7.a < v8) {
                                        v7 = v3;
                                    }
                                    v3 = v3.b;
                                    continue;
                                }
                                else {
                                    break;
                                }
                            }
                            v3 = v7;
                            break;
                        }
                    }
                    v2.a = 0;
                    v2.a(v3);
                    v2 = v6;
                }
            }
            v0 = v0.b;
        }
        return v4 > 1;
    }

    public static final void r(t t0) {
        if(m.q(t0)) {
            b b0 = m.f;
            int v = b0.Y;
            int v1 = System.identityHashCode(t0);
            int v2 = -1;
            if(v > 0) {
                int v3 = b0.Y - 1;
                int v4 = 0;
                while(v4 <= v3) {
                    int v5 = v4 + v3 >>> 1;
                    int v6 = ((int[])b0.Z)[v5];
                    if(v6 < v1) {
                        v4 = v5 + 1;
                        continue;
                    }
                    if(v6 > v1) {
                        v3 = v5 - 1;
                        continue;
                    }
                    R0 r00 = ((R0[])b0.b0)[v5];
                    if(t0 == (r00 == null ? null : r00.get())) {
                        v2 = v5;
                    }
                    else {
                        int v7 = v5 - 1;
                    alab1:
                        while(true) {
                            if(-1 >= v7 || ((int[])b0.Z)[v7] != v1) {
                                int v8 = b0.Y;
                                for(v7 = v5 + 1; v7 < v8; ++v7) {
                                    if(((int[])b0.Z)[v7] != v1) {
                                        v7 = -(v7 + 1);
                                        break alab1;
                                    }
                                    R0 r02 = ((R0[])b0.b0)[v7];
                                    if((r02 == null ? null : r02.get()) == t0) {
                                        break alab1;
                                    }
                                }
                                v7 = -(b0.Y + 1);
                                break;
                            }
                            R0 r01 = ((R0[])b0.b0)[v7];
                            if((r01 == null ? null : r01.get()) == t0) {
                                break;
                            }
                            --v7;
                        }
                        v2 = v7;
                    }
                    goto label_42;
                }
                v2 = -(v4 + 1);
            label_42:
                if(v2 < 0) {
                    goto label_43;
                }
            }
            else {
            label_43:
                R0[] arr_r0 = (R0[])b0.b0;
                if(v == arr_r0.length) {
                    R0[] arr_r01 = new R0[arr_r0.length * 2];
                    int[] arr_v = new int[arr_r0.length * 2];
                    int v9 = -(v2 + 1) + 1;
                    n.i0(v9, -(v2 + 1), v, arr_r0, arr_r01);
                    n.l0(0, -(v2 + 1), 6, ((R0[])b0.b0), arr_r01);
                    n.h0(v9, -(v2 + 1), v, ((int[])b0.Z), arr_v);
                    n.k0(0, -(v2 + 1), 6, ((int[])b0.Z), arr_v);
                    b0.b0 = arr_r01;
                    b0.Z = arr_v;
                }
                else {
                    int v10 = -(v2 + 1) + 1;
                    n.i0(v10, -(v2 + 1), v, arr_r0, arr_r0);
                    int[] arr_v1 = (int[])b0.Z;
                    n.h0(v10, -(v2 + 1), v, arr_v1, arr_v1);
                }
                R0[] arr_r02 = (R0[])b0.b0;
                arr_r02[-(v2 + 1)] = new R0(t0);  // initializer: Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
                ((int[])b0.Z)[-(v2 + 1)] = v1;
                ++b0.Y;
            }
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final v t(v v0, int v1, k k0) {
        v v2 = null;
        while(v0 != null) {
            if(v0.a != 0 && v0.a <= v1 && !k0.d(v0.a) && (v2 == null || v2.a < v0.a)) {
                v2 = v0;
            }
            v0 = v0.b;
        }
        return v2 == null ? null : v2;
    }

    public static final v u(v v0, t t0) {
        g g0 = m.k();
        Function1 function10 = g0.f();
        if(function10 != null) {
            function10.n(t0);
        }
        v v1 = m.t(v0, g0.d(), g0.e());
        if(v1 == null) {
            synchronized(m.b) {
                g g1 = m.k();
                v v3 = t0.c();
                j.d(v3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                v v4 = m.t(v3, g1.d(), g1.e());
                if(v4 != null) {
                    return v4;
                }
                m.s();
            }
            throw null;
        }
        return v1;
    }

    public static final void v(int v) {
        f0 f00 = m.e;
        int v1 = ((int[])f00.f)[v];
        f00.h(v1, f00.b - 1);
        --f00.b;
        int[] arr_v = (int[])f00.d;
        int v2 = arr_v[v1];
        for(int v3 = v1; v3 > 0; v3 = v4) {
            int v4 = (v3 + 1 >> 1) - 1;
            if(arr_v[v4] <= v2) {
                break;
            }
            f00.h(v4, v3);
        }
        int[] arr_v1 = (int[])f00.d;
        int v5 = f00.b >> 1;
        while(v1 < v5) {
            int v6 = v1 + 1 << 1;
            int v7 = v6 - 1;
            if(v6 < f00.b) {
                int v8 = arr_v1[v6];
                if(v8 < arr_v1[v7]) {
                    if(v8 >= arr_v1[v1]) {
                        break;
                    }
                    f00.h(v6, v1);
                    v1 = v6;
                    continue;
                }
            }
            if(arr_v1[v7] >= arr_v1[v1]) {
                break;
            }
            f00.h(v7, v1);
            v1 = v7;
        }
        ((int[])f00.f)[v] = f00.c;
        f00.c = v;
    }

    public static final Object w(g g0, Function1 function10) {
        Object object0 = function10.n(m.c.c(g0.d()));
        synchronized(m.b) {
            int v1 = m.d;
            m.d = v1 + 1;
            k k0 = m.c.c(g0.d());
            m.c = k0;
            e0.b b0 = new e0.b(v1, k0);
            m.i.set(b0);
            g0.c();
            m.c = m.c.g(v1);
            return object0;
        }
    }

    public static final v x(v v0, t t0, g g0) {
        if(g0.g()) {
            g0.n(t0);
        }
        int v1 = g0.d();
        v v2 = m.t(v0, v1, g0.e());
        if(v2 != null) {
            if(v2.a == g0.d()) {
                return v2;
            }
            synchronized(m.b) {
                v v4 = m.t(t0.c(), v1, g0.e());
                if(v4 != null) {
                    if(v4.a != v1) {
                        v v5 = m.m(v4, t0);
                        v5.a(v4);
                        v5.a = g0.d();
                        v4 = v5;
                    }
                    if(v2.a != 1) {
                        g0.n(t0);
                    }
                    return v4;
                }
                m.s();
            }
            throw null;
        }
        m.s();
        throw null;
    }
}

