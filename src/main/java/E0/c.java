package e0;

import Bb.p;
import Bb.z;
import Nb.j;
import W.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s.E;

public class c extends g {
    public final Function1 e;
    public final Function1 f;
    public int g;
    public E h;
    public ArrayList i;
    public k j;
    public int[] k;
    public int l;
    public boolean m;
    public static final int[] n;

    static {
        c.n = new int[0];
    }

    public c(int v, k k0, Function1 function10, Function1 function11) {
        super(v, k0);
        this.e = function10;
        this.f = function11;
        this.j = k.c0;
        this.k = c.n;
        this.l = 1;
    }

    public final void A(k k0) {
        synchronized(m.b) {
            this.j = this.j.e(k0);
        }
    }

    public void B(E e0) {
        this.h = e0;
    }

    public c C(Function1 function10, Function1 function11) {
        d d0;
        if(!this.c) {
            if(this.m && this.d < 0) {
                U.d.N("Unsupported operation on a disposed or applied snapshot");
                throw null;
            }
            this.z(this.d());
            Object object0 = m.b;
            synchronized(object0) {
                int v = m.d;
                m.d = v + 1;
                m.c = m.c.g(v);
                k k0 = this.e();
                this.r(k0.g(v));
                d0 = new d(v, m.e(k0, this.d() + 1, v), m.l(function10, this.x(), true), m.b(function11, this.i()), this);
            }
            if(!this.m && !this.c) {
                int v1 = this.d();
                synchronized(object0) {
                    int v2 = m.d;
                    m.d = v2 + 1;
                    this.q(v2);
                    m.c = m.c.g(this.d());
                }
                this.r(m.e(this.e(), v1 + 1, this.d()));
                return d0;
            }
            return d0;
        }
        U.d.M("Cannot use a disposed snapshot");
        throw null;
    }

    @Override  // e0.g
    public final void b() {
        m.c = m.c.c(this.d()).a(this.j);
    }

    @Override  // e0.g
    public void c() {
        if(!this.c) {
            this.c = true;
            Object object0 = m.b;
            synchronized(object0) {
                int v1 = this.d;
                if(v1 >= 0) {
                    m.v(v1);
                    this.d = -1;
                }
            }
            this.l();
        }
    }

    @Override  // e0.g
    public Function1 f() {
        return this.x();
    }

    @Override  // e0.g
    public boolean g() {
        return false;
    }

    @Override  // e0.g
    public int h() {
        return this.g;
    }

    @Override  // e0.g
    public Function1 i() {
        return this.f;
    }

    @Override  // e0.g
    public void k() {
        ++this.l;
    }

    @Override  // e0.g
    public void l() {
        int v = this.l;
        if(v > 0) {
            this.l = v - 1;
            if(v - 1 == 0 && !this.m) {
                E e0 = this.w();
                if(e0 != null) {
                    if(this.m) {
                        U.d.N("Unsupported operation on a snapshot that has been applied");
                        throw null;
                    }
                    this.B(null);
                    int v1 = this.d();
                    Object[] arr_object = e0.b;
                    long[] arr_v = e0.a;
                    int v2 = arr_v.length - 2;
                    if(v2 >= 0) {
                        int v3 = 0;
                        while(true) {
                            long v4 = arr_v[v3];
                            if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_30;
                            }
                            int v5 = 8 - (~(v3 - v2) >>> 0x1F);
                            for(int v6 = 0; v6 < v5; ++v6) {
                                if((0xFFL & v4) < 0x80L) {
                                    for(v v7 = ((t)arr_object[(v3 << 3) + v6]).c(); v7 != null; v7 = v7.b) {
                                        if(v7.a == v1 || p.k0(this.j, ((int)v7.a))) {
                                            v7.a = 0;
                                        }
                                    }
                                }
                                v4 >>= 8;
                            }
                            if(v5 == 8) {
                            label_30:
                                if(v3 != v2) {
                                    ++v3;
                                    continue;
                                }
                            }
                            this.a();
                            return;
                        }
                        U.d.N("Unsupported operation on a snapshot that has been applied");
                        throw null;
                    }
                }
                this.a();
            }
            return;
        }
        U.d.M("no pending nested snapshots");
        throw null;
    }

    @Override  // e0.g
    public void m() {
        if(!this.m && !this.c) {
            this.u();
        }
    }

    @Override  // e0.g
    public void n(t t0) {
        E e0 = this.w();
        if(e0 == null) {
            e0 = new E();
            this.B(e0);
        }
        e0.a(t0);
    }

    @Override  // e0.g
    public final void o() {
        for(int v = 0; v < this.k.length; ++v) {
            m.v(this.k[v]);
        }
        int v1 = this.d;
        if(v1 >= 0) {
            m.v(v1);
            this.d = -1;
        }
    }

    @Override  // e0.g
    public void s(int v) {
        this.g = v;
    }

    @Override  // e0.g
    public g t(Function1 function10) {
        g g0;
        if(!this.c) {
            if(this.m && this.d < 0) {
                U.d.N("Unsupported operation on a disposed or applied snapshot");
                throw null;
            }
            int v = this.d();
            this.z(this.d());
            Object object0 = m.b;
            synchronized(object0) {
                int v1 = m.d;
                m.d = v1 + 1;
                m.c = m.c.g(v1);
                g0 = new e(v1, m.e(this.e(), v + 1, v1), m.l(function10, this.x(), true), this);
            }
            if(!this.m && !this.c) {
                int v2 = this.d();
                synchronized(object0) {
                    int v3 = m.d;
                    m.d = v3 + 1;
                    this.q(v3);
                    m.c = m.c.g(this.d());
                }
                this.r(m.e(this.e(), v2 + 1, this.d()));
                return g0;
            }
            return g0;
        }
        U.d.M("Cannot use a disposed snapshot");
        throw null;
    }

    public final void u() {
        this.z(this.d());
        if(!this.m && !this.c) {
            int v = this.d();
            synchronized(m.b) {
                int v2 = m.d;
                m.d = v2 + 1;
                this.q(v2);
                m.c = m.c.g(this.d());
            }
            this.r(m.e(this.e(), v + 1, this.d()));
        }
    }

    public q v() {
        q q0;
        E e1;
        E e0 = this.w();
        HashMap hashMap0 = e0 == null ? null : m.c(((c)m.i.get()), this, m.c.c(((b)m.i.get()).b));
        Object object0 = z.X;
        Object object1 = m.b;
        __monitor_enter(object1);
        try {
            m.d(this);
            if(e0 == null || e0.d == 0) {
                this.b();
                b b0 = (b)m.i.get();
                m.w(b0, l.Z);
                e1 = b0.h;
                if(e1 != null && e1.h()) {
                    object0 = m.g;
                    goto label_29;
                }
                e1 = null;
                goto label_29;
            }
            b b1 = (b)m.i.get();
            q0 = this.y(m.d, hashMap0, m.c.c(b1.b));
            if(q0.equals(i.b)) {
                this.b();
                m.w(b1, l.Z);
                e1 = b1.h;
                this.B(null);
                b1.h = null;
                object0 = m.g;
                goto label_29;
            }
            goto label_107;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object1);
        throw throwable0;
    label_29:
        __monitor_exit(object1);
        this.m = true;
        if(e1 != null) {
            f f0 = new f(e1);
            if(!e1.g()) {
                int v = ((List)object0).size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((Function2)((List)object0).get(v1)).j(f0, this);
                }
            }
        }
        if(e0 != null && e0.h()) {
            f f1 = new f(e0);
            int v2 = ((List)object0).size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((Function2)((List)object0).get(v3)).j(f1, this);
            }
        }
        synchronized(m.b) {
            this.o();
            m.g();
            if(e1 == null) {
            label_74:
                if(e0 == null) {
                label_94:
                    ArrayList arrayList0 = this.i;
                    if(arrayList0 != null) {
                        int v15 = arrayList0.size();
                        for(int v16 = 0; v16 < v15; ++v16) {
                            m.r(((t)arrayList0.get(v16)));
                        }
                    }
                }
                else {
                    Object[] arr_object1 = e0.b;
                    long[] arr_v1 = e0.a;
                    int v10 = arr_v1.length - 2;
                    if(v10 >= 0) {
                        int v11 = 0;
                        while(true) {
                            long v12 = arr_v1[v11];
                            if((~v12 << 7 & v12 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_91;
                            }
                            int v13 = 8 - (~(v11 - v10) >>> 0x1F);
                            for(int v14 = 0; v14 < v13; ++v14) {
                                if((v12 & 0xFFL) < 0x80L) {
                                    m.r(((t)arr_object1[(v11 << 3) + v14]));
                                }
                                v12 >>= 8;
                            }
                            if(v13 == 8) {
                            label_91:
                                if(v11 != v10) {
                                    ++v11;
                                    continue;
                                }
                            }
                            goto label_94;
                        }
                    }
                    else {
                        goto label_94;
                    }
                }
            }
            else {
                Object[] arr_object = e1.b;
                long[] arr_v = e1.a;
                int v5 = arr_v.length - 2;
                if(v5 >= 0) {
                    int v6 = 0;
                    while(true) {
                        long v7 = arr_v[v6];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_70;
                        }
                        int v8 = 8 - (~(v6 - v5) >>> 0x1F);
                        for(int v9 = 0; v9 < v8; ++v9) {
                            if((v7 & 0xFFL) < 0x80L) {
                                m.r(((t)arr_object[(v6 << 3) + v9]));
                            }
                            v7 >>= 8;
                        }
                        if(v8 == 8) {
                        label_70:
                            if(v6 != v5) {
                                ++v6;
                                arr_v = arr_v;
                                continue;
                            }
                        }
                        goto label_74;
                    }
                }
                else {
                    goto label_74;
                }
            }
            this.i = null;
            return i.b;
        }
    label_107:
        __monitor_exit(object1);
        return q0;
    }

    public E w() {
        return this.h;
    }

    public Function1 x() {
        return this.e;
    }

    public final q y(int v, HashMap hashMap0, k k0) {
        v v11;
        k k2;
        long[] arr_v1;
        Object[] arr_object1;
        ArrayList arrayList0;
        List list0;
        k k1 = this.e().g(this.d()).e(this.j);
        E e0 = this.w();
        j.c(e0);
        Object[] arr_object = e0.b;
        long[] arr_v = e0.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            list0 = null;
            arrayList0 = null;
            while(true) {
                long v3 = arr_v[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_69;
                }
                int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        t t0 = (t)arr_object[(v2 << 3) + v5];
                        v v6 = t0.c();
                        arr_object1 = arr_object;
                        arr_v1 = arr_v;
                        v v7 = m.t(v6, v, k0);
                        if(v7 == null) {
                            k2 = k1;
                        }
                        else {
                            v v8 = m.t(v6, this.d(), k1);
                            if(v8 == null) {
                                k2 = k1;
                            }
                            else {
                                k2 = k1;
                                if(v8.a != 1 && !v7.equals(v8)) {
                                    v v9 = m.t(v6, this.d(), this.e());
                                    if(v9 == null) {
                                        m.s();
                                        throw null;
                                    }
                                    if(hashMap0 == null) {
                                        v11 = t0.g(v8, v7, v9);
                                    }
                                    else {
                                        v v10 = (v)hashMap0.get(v7);
                                        if(v10 != null) {
                                            v11 = v10;
                                        }
                                    }
                                    if(v11 == null) {
                                        return new h();  // initializer: Ljava/lang/Object;-><init>()V
                                    }
                                    if(!v11.equals(v9)) {
                                        if(v11.equals(v7)) {
                                            if(list0 == null) {
                                                list0 = new ArrayList();
                                            }
                                            list0.add(new Ab.k(t0, v7.b()));
                                            if(arrayList0 == null) {
                                                arrayList0 = new ArrayList();
                                            }
                                            arrayList0.add(t0);
                                        }
                                        else {
                                            if(list0 == null) {
                                                list0 = new ArrayList();
                                            }
                                            list0.add((v11.equals(v8) ? new Ab.k(t0, v8.b()) : new Ab.k(t0, v11)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        k2 = k1;
                        arr_object1 = arr_object;
                        arr_v1 = arr_v;
                    }
                    v3 >>= 8;
                    ++v5;
                    arr_object = arr_object1;
                    arr_v = arr_v1;
                    k1 = k2;
                }
                k k3 = k1;
                Object[] arr_object2 = arr_object;
                long[] arr_v2 = arr_v;
                if(v4 == 8) {
                    goto label_72;
                label_69:
                    k3 = k1;
                    arr_object2 = arr_object;
                    arr_v2 = arr_v;
                label_72:
                    if(v2 != v1) {
                        ++v2;
                        arr_object = arr_object2;
                        arr_v = arr_v2;
                        k1 = k3;
                        continue;
                    }
                    break;
                }
                goto label_83;
            }
            arrayList0 = arrayList0;
            list0 = list0;
        }
        else {
            arrayList0 = null;
            list0 = null;
        }
    label_83:
        if(list0 != null) {
            this.u();
            int v12 = list0.size();
            for(int v13 = 0; v13 < v12; ++v13) {
                Ab.k k4 = (Ab.k)list0.get(v13);
                ((v)k4.Y).a = this.d();
                synchronized(m.b) {
                    ((v)k4.Y).b = ((t)k4.X).c();
                    ((t)k4.X).l(((v)k4.Y));
                }
            }
        }
        if(arrayList0 != null) {
            int v15 = arrayList0.size();
            for(int v16 = 0; v16 < v15; ++v16) {
                e0.j(((t)arrayList0.get(v16)));
            }
            ArrayList arrayList1 = this.i;
            if(arrayList1 != null) {
                arrayList0 = p.F0(arrayList1, arrayList0);
            }
            this.i = arrayList0;
        }
        return i.b;
    }

    public final void z(int v) {
        synchronized(m.b) {
            this.j = this.j.g(v);
        }
    }
}

