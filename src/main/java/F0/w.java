package F0;

import Bb.q;
import E7.o;
import M6.b;
import Ma.w;
import N6.p;
import N9.l;
import Nb.j;
import R9.K1;
import U.t0;
import Ub.f;
import Y8.R6;
import ac.B0;
import ac.j0;
import ac.o0;
import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import com.sendwave.util.Country;
import com.wave.customer.CustomerApp;
import g0.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jc.i;
import pb.d;
import q9.n;
import s.D;
import s.E;
import s.r;
import wa.a;

public final class W {
    public final int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public W(R6 r60, w w0, n n0, Country country0) {
        this.a = 3;
        j.f(r60, "repo");
        j.f(w0, "transactionHistoryDao");
        j.f(n0, "assetLoader");
        j.f(country0, "localCountry");
        super();
        this.b = r60;
        this.c = w0;
        this.d = n0;
        this.e = country0;
        B0 b00 = o0.c(Boolean.TRUE);
        this.f = b00;
        B0 b01 = o0.c(a.Y);
        this.g = b01;
        B0 b02 = o0.c(null);
        this.h = b02;
        this.i = o0.j(b00, o0.F(b02, new l(null, this, 17)), b01, new K1(4, null, 3));
    }

    public W(LayoutNode layoutNode0) {
        this.a = 0;
        super();
        this.b = layoutNode0;
        t t0 = new t(layoutNode0);
        this.c = t0;
        this.d = t0;
        this.e = t0.I0;
        this.f = t0.I0;
    }

    public W(CustomerApp customerApp0) {
        this.a = 2;
        super();
        this.b = customerApp0;
        B0 b00 = o0.c(new pb.w(d.X, null, false, false, false));
        this.c = b00;
        this.d = new j0(b00);
        this.f = new p(4, this);
        new o(customerApp0, this);
        new i(customerApp0, this);
    }

    public W(D d0) {
        this.a = 1;
        super();
        this.b = d0;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.g = new ArrayList();
        this.h = new r();
        this.i = new r();
    }

    public static final void a(W w0, g0.n n0, c0 c00) {
        w0.getClass();
        for(g0.n n1 = n0.c0; n1 != null; n1 = n1.c0) {
            if(n1 == Y.a) {
                LayoutNode layoutNode0 = ((LayoutNode)w0.b).s();
                c00.l0 = layoutNode0 == null ? null : ((t)layoutNode0.u0.c);
                w0.d = c00;
                return;
            }
            if((n1.Z & 2) != 0) {
                break;
            }
            n1.w0(c00);
        }
    }

    public static g0.n b(m m0, g0.n n0) {
        g0.n n1;
        if(m0 instanceof T) {
            n1 = ((T)m0).k();
            n1.Z = d0.g(n1);
        }
        else {
            c c0 = new c();  // initializer: Lg0/n;-><init>()V
            c0.Z = d0.e(m0);
            c0.l0 = m0;
            c0.n0 = new HashSet();
            n1 = c0;
        }
        if(!n1.k0) {
            n1.g0 = true;
            g0.n n2 = n0.d0;
            if(n2 != null) {
                n2.c0 = n1;
                n1.d0 = n2;
            }
            n0.d0 = n1;
            n1.c0 = n0;
            return n1;
        }
        b.T("A ModifierNodeElement cannot return an already attached node from create() ");
        throw null;
    }

    public static g0.n c(g0.n n0) {
        if(n0.k0) {
            d0.b(n0, -1, 2);
            n0.u0();
            n0.o0();
        }
        g0.n n1 = n0.d0;
        g0.n n2 = n0.c0;
        if(n1 != null) {
            n1.c0 = n2;
            n0.d0 = null;
        }
        if(n2 != null) {
            n2.d0 = n1;
            n0.c0 = null;
        }
        j.c(n2);
        return n2;
    }

    public void d() {
        D d0 = (D)this.b;
        if(!d0.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator iterator0 = d0.iterator();
                while(((f)iterator0).hasNext()) {
                    t0 t00 = (t0)((f)iterator0).next();
                    ((f)iterator0).remove();
                    t00.c();
                }
            }
            finally {
                Trace.endSection();
            }
        }
    }

    public void e() {
        this.g(0x80000000);
        ArrayList arrayList0 = (ArrayList)this.d;
        D d0 = (D)this.b;
        if(!arrayList0.isEmpty()) {
            Trace.beginSection("Compose:onForgotten");
            try {
                E e0 = (E)this.f;
                for(int v1 = arrayList0.size() - 1; -1 < v1; --v1) {
                    Object object0 = arrayList0.get(v1);
                    if(object0 instanceof t0) {
                        d0.remove(object0);
                        ((t0)object0).d();
                    }
                    if(object0 instanceof U.j) {
                        if(e0 == null || !e0.c(object0)) {
                            ((U.j)object0).f();
                        }
                        else {
                            ((U.j)object0).e();
                        }
                    }
                }
            }
            finally {
                Trace.endSection();
            }
        }
        ArrayList arrayList1 = (ArrayList)this.c;
        if(!arrayList1.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                int v3 = arrayList1.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    t0 t00 = (t0)arrayList1.get(v4);
                    d0.remove(t00);
                    t00.a();
                }
            }
            finally {
                Trace.endSection();
            }
        }
    }

    public boolean f(int v) {
        return (v & ((g0.n)this.f).b0) != 0;
    }

    public void g(int v) {
        ArrayList arrayList0 = (ArrayList)this.g;
        if(!arrayList0.isEmpty()) {
            List list0 = null;
            int v2 = 0;
            Object object0 = null;
            Object object1 = null;
            while(true) {
                r r0 = (r)this.i;
                if(v2 >= r0.b) {
                    break;
                }
                if(v <= r0.c(v2)) {
                    Object object2 = arrayList0.remove(v2);
                    int v3 = r0.d(v2);
                    int v4 = ((r)this.h).d(v2);
                    if(list0 == null) {
                        list0 = q.N(new Object[]{object2});
                        object1 = new r();
                        ((r)object1).a(v3);
                        object0 = new r();
                    }
                    else {
                        j.d(object0, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        j.d(object1, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        list0.add(object2);
                        ((r)object1).a(v3);
                    }
                    ((r)object0).a(v4);
                }
                else {
                    ++v2;
                }
            }
            if(list0 != null) {
                j.d(object0, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                j.d(object1, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int v5 = list0.size();
                for(int v1 = 0; v1 < v5 - 1; ++v1) {
                    int v6 = list0.size();
                    for(int v7 = v1 + 1; v7 < v6; ++v7) {
                        int v8 = ((r)object1).c(v1);
                        int v9 = ((r)object1).c(v7);
                        if(v8 < v9 || v9 == v8 && ((r)object0).c(v1) < ((r)object0).c(v7)) {
                            Object object3 = list0.get(v1);
                            list0.set(v1, list0.get(v7));
                            list0.set(v7, object3);
                            int v10 = ((r)object0).c(v1);
                            ((r)object0).e(v1, ((r)object0).c(v7));
                            ((r)object0).e(v7, v10);
                            int v11 = ((r)object1).c(v1);
                            ((r)object1).e(v1, ((r)object1).c(v7));
                            ((r)object1).e(v7, v11);
                        }
                    }
                }
                ((ArrayList)this.d).addAll(list0);
            }
        }
    }

    public void h(Object object0, int v, int v1, int v2) {
        this.g(v);
        if(v2 >= 0 && v2 < v) {
            ((ArrayList)this.g).add(object0);
            ((r)this.h).a(v1);
            ((r)this.i).a(v2);
            return;
        }
        ((ArrayList)this.d).add(object0);
    }

    public void i() {
        for(g0.n n0 = (g0.n)this.f; n0 != null; n0 = n0.d0) {
            n0.t0();
            if(n0.g0) {
                d0.a(n0);
            }
            if(n0.h0) {
                d0.d(n0);
            }
            n0.g0 = false;
            n0.h0 = false;
        }
    }

    public void j(String s, a a0) {
        j.f(s, "historyEntryId");
        j.f(a0, "receiptTemplate");
        do {
            B0 b00 = (B0)this.f;
            Object object0 = b00.getValue();
            ((Boolean)object0).getClass();
        }
        while(!b00.j(object0, Boolean.FALSE));
        do {
            B0 b01 = (B0)this.g;
            Object object1 = b01.getValue();
            a a1 = (a)object1;
        }
        while(!b01.j(object1, a0));
        do {
            B0 b02 = (B0)this.h;
            Object object2 = b02.getValue();
            String s1 = (String)object2;
        }
        while(!b02.j(object2, s));
    }

    public void k(int v, W.d d0, W.d d1, g0.n n0, boolean z) {
        W w0;
        int v15;
        int v14;
        int v13;
        u u4;
        int v32;
        int v31;
        int v29;
        int v28;
        u u3;
        u u2;
        int v23;
        int v22;
        V v1 = (V)this.i;
        if(v1 == null) {
            v1 = new V(this, n0, v, d0, d1, z);
            this.i = v1;
        }
        else {
            v1.a = n0;
            v1.b = v;
            v1.c = d0;
            v1.d = d1;
            v1.e = z;
        }
        int v2 = d0.Z - v;
        int v3 = d1.Z - v;
        int v4 = (v2 + v3 + 1) / 2;
        u u0 = new u(v4 * 3);
        u u1 = new u(v4 * 4);
        u1.d(0, v2, 0, v3);
        int v5 = v4 * 2 + 1;
        int[] arr_v = new int[v5];
        int[] arr_v1 = new int[v5];
        int[] arr_v2 = new int[5];
        int v6;
        while((v6 = u1.b) != 0) {
            int[] arr_v3 = u1.a;
            u1.b = v6 - 1;
            int v7 = arr_v3[v6 - 1];
            u1.b = v6 - 2;
            int v8 = arr_v3[v6 - 2];
            u1.b = v6 - 3;
            int v9 = arr_v3[v6 - 3];
            u1.b = v6 - 4;
            int v10 = arr_v3[v6 - 4];
            int v11 = v9 - v10;
            int v12 = v7 - v8;
            if(v11 >= 1 && v12 >= 1) {
                int v16 = (v11 + v12 + 1) / 2;
                int v17 = v5 / 2 + 1;
                arr_v[v17] = v10;
                arr_v1[v17] = v9;
                v15 = v5;
                int v18 = 0;
                while(v18 < v16) {
                    int v19 = v11 - v12;
                    int v20 = Math.abs(v19) % 2 == 1 ? 1 : 0;
                    int v21 = -v18;
                    while(v21 <= v18) {
                        if(v21 == -v18) {
                            v13 = v2;
                            v14 = v3;
                        }
                        else {
                            if(v21 == v18) {
                                v13 = v2;
                                v14 = v3;
                            }
                            else {
                                v13 = v2;
                                v14 = v3;
                                if(arr_v[v21 + 1 + v5 / 2] > arr_v[v21 - 1 + v5 / 2]) {
                                    goto label_62;
                                }
                            }
                            v22 = arr_v[v21 - 1 + v5 / 2];
                            v23 = v22 + 1;
                            goto label_64;
                        }
                    label_62:
                        v22 = arr_v[v21 + 1 + v5 / 2];
                        v23 = v22;
                    label_64:
                        int v24 = v23 - v10 + v8 - v21;
                        int v25 = v18 == 0 || v23 != v22 ? v24 : v24 - 1;
                        u2 = u1;
                        int v26;
                        for(v26 = v24; v23 < v9 && v26 < v7 && v1.a(v23, v26); ++v26) {
                            ++v23;
                        }
                        arr_v[v5 / 2 + v21] = v23;
                        if(v20 == 0) {
                            u3 = u0;
                        }
                        else {
                            int v27 = v19 - v21;
                            u3 = u0;
                            if(v27 >= -v18 + 1 && v27 <= v18 - 1 && arr_v1[v5 / 2 + v27] <= v23) {
                                arr_v2[0] = v22;
                                arr_v2[1] = v25;
                                arr_v2[2] = v23;
                                arr_v2[3] = v26;
                                arr_v2[4] = 0;
                                v28 = v9;
                                v29 = v7;
                                goto label_128;
                            }
                        }
                        v21 += 2;
                        u1 = u2;
                        v2 = v13;
                        v3 = v14;
                        v20 = v20;
                        u0 = u3;
                    }
                    v13 = v2;
                    v14 = v3;
                    u3 = u0;
                    u2 = u1;
                    int v30 = -v18;
                    while(v30 <= v18) {
                        if(v30 == -v18 || v30 != v18 && arr_v1[v30 + 1 + v5 / 2] < arr_v1[v30 - 1 + v5 / 2]) {
                            v31 = arr_v1[v30 + 1 + v5 / 2];
                            v32 = v31;
                        }
                        else {
                            v31 = arr_v1[v30 - 1 + v5 / 2];
                            v32 = v31 - 1;
                        }
                        int v33 = v7 - (v9 - v32 - v30);
                        int v34 = v18 == 0 || v32 != v31 ? v33 : v33 + 1;
                        while(true) {
                            if(v32 > v10 && v33 > v8) {
                                v28 = v9;
                                v29 = v7;
                                if(v1.a(v32 - 1, v33 - 1)) {
                                    --v32;
                                    --v33;
                                    v9 = v28;
                                    v7 = v29;
                                    continue;
                                }
                                else {
                                    break;
                                }
                            }
                            v28 = v9;
                            v29 = v7;
                            break;
                        }
                        arr_v1[v5 / 2 + v30] = v32;
                        if(v19 % 2 == 0) {
                            int v35 = v19 - v30;
                            if(v35 >= -v18 && v35 <= v18 && arr_v[v5 / 2 + v35] >= v32) {
                                arr_v2[0] = v32;
                                arr_v2[1] = v33;
                                arr_v2[2] = v31;
                                arr_v2[3] = v34;
                                arr_v2[4] = 1;
                            label_128:
                                if(F0.f.m(arr_v2) > 0) {
                                    int v36 = arr_v2[1];
                                    int v37 = arr_v2[3] - v36;
                                    int v38 = arr_v2[0];
                                    int v39 = arr_v2[2] - v38;
                                    if(v37 == v39) {
                                        u0 = u3;
                                        u0.c(v38, v36, v39);
                                    }
                                    else if(arr_v2[4] == 0) {
                                        u0 = u3;
                                        if(v37 > v39) {
                                            u0.c(v38, v36 + 1, F0.f.m(arr_v2));
                                        }
                                        else {
                                            u0.c(v38 + 1, v36, F0.f.m(arr_v2));
                                        }
                                    }
                                    else {
                                        u0 = u3;
                                        u0.c(v38, v36, F0.f.m(arr_v2));
                                    }
                                }
                                else {
                                    u0 = u3;
                                }
                                u4 = u2;
                                u4.d(v10, arr_v2[0], v8, arr_v2[1]);
                                u4.d(arr_v2[2], v28, arr_v2[3], v29);
                                goto label_171;
                            }
                        }
                        v30 += 2;
                        u2 = u2;
                        v7 = v29;
                        u3 = u3;
                        v9 = v28;
                    }
                    u0 = u3;
                    ++v18;
                    v9 = v9;
                    v12 = v12;
                    v11 = v11;
                    v2 = v13;
                    v3 = v14;
                    u1 = u2;
                    v16 = v16;
                }
                v13 = v2;
                v14 = v3;
            }
            else {
                v13 = v2;
                v14 = v3;
                v15 = v5;
            }
            u4 = u1;
        label_171:
            v5 = v15;
            u1 = u4;
            v2 = v13;
            v3 = v14;
        }
        int v40 = u0.b;
        if(v40 % 3 == 0) {
            if(v40 > 3) {
                u0.e(0, v40 - 3);
            }
            u0.c(v2, v3, 0);
            int v41 = 0;
            int v42 = 0;
            int v43 = 0;
            while(v41 < u0.b) {
                int[] arr_v4 = u0.a;
                int v44 = arr_v4[v41];
                int v45 = arr_v4[v41 + 2];
                int v46 = arr_v4[v41 + 1] - v45;
                v41 += 3;
                while(true) {
                    w0 = v1.f;
                    if(v42 >= v44 - v45) {
                        break;
                    }
                    g0.n n1 = v1.a.d0;
                    j.c(n1);
                    w0.getClass();
                    if((n1.Z & 2) != 0) {
                        c0 c00 = n1.f0;
                        j.c(c00);
                        c0 c01 = c00.l0;
                        c0 c02 = c00.k0;
                        j.c(c02);
                        if(c01 != null) {
                            c01.k0 = c02;
                        }
                        c02.l0 = c01;
                        W.a(w0, v1.a, c02);
                    }
                    v1.a = W.c(n1);
                    ++v42;
                }
                while(v43 < v46) {
                    g0.n n2 = v1.a;
                    m m0 = (m)v1.d.X[v1.b + v43];
                    w0.getClass();
                    g0.n n3 = W.b(m0, n2);
                    v1.a = n3;
                    if(v1.e) {
                        g0.n n4 = n3.d0;
                        j.c(n4);
                        c0 c03 = n4.f0;
                        j.c(c03);
                        x x0 = F0.f.g(v1.a);
                        if(x0 == null) {
                            v1.a.w0(c03);
                        }
                        else {
                            z z1 = new z(((LayoutNode)w0.b), x0);
                            v1.a.w0(z1);
                            W.a(w0, v1.a, z1);
                            z1.l0 = c03.l0;
                            z1.k0 = c03;
                            c03.l0 = z1;
                        }
                        v1.a.n0();
                        v1.a.t0();
                        d0.a(v1.a);
                    }
                    else {
                        n3.g0 = true;
                    }
                    ++v43;
                }
                while(v45 > 0) {
                    g0.n n5 = v1.a.d0;
                    j.c(n5);
                    v1.a = n5;
                    int v47 = v1.b;
                    m m1 = (m)v1.c.X[v47 + v42];
                    m m2 = (m)v1.d.X[v47 + v43];
                    if(j.a(m1, m2)) {
                        w0.getClass();
                    }
                    else {
                        g0.n n6 = v1.a;
                        w0.getClass();
                        W.m(m1, m2, n6);
                    }
                    ++v42;
                    ++v43;
                    --v45;
                }
            }
            g0.n n7 = ((F0.o0)this.e).c0;
            int v48 = 0;
            while(n7 != null && n7 != Y.a) {
                v48 |= n7.Z;
                n7.b0 = v48;
                n7 = n7.c0;
            }
            return;
        }
        b.T("Array size not a multiple of 3");
        throw null;
    }

    public void l() {
        z z0;
        LayoutNode layoutNode0;
        g0.n n0 = ((F0.o0)this.e).c0;
        t t0 = (t)this.c;
        while(true) {
            layoutNode0 = (LayoutNode)this.b;
            if(n0 == null) {
                break;
            }
            x x0 = F0.f.g(n0);
            if(x0 == null) {
                n0.w0(t0);
            }
            else {
                c0 c00 = n0.f0;
                if(c00 == null) {
                    z0 = new z(layoutNode0, x0);
                    n0.w0(z0);
                }
                else {
                    z0 = (z)c00;
                    x x1 = z0.I0;
                    z0.e1(x0);
                    if(x1 != n0) {
                        h0 h00 = z0.B0;
                        if(h00 != null) {
                            h00.invalidate();
                        }
                    }
                }
                t0.l0 = z0;
                z0.k0 = t0;
                t0 = z0;
            }
            n0 = n0.c0;
        }
        LayoutNode layoutNode1 = layoutNode0.s();
        t0.l0 = layoutNode1 == null ? null : ((t)layoutNode1.u0.c);
        this.d = t0;
    }

    public static void m(m m0, m m1, g0.n n0) {
        if(m0 instanceof T && m1 instanceof T) {
            j.d(n0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((T)m1).m(n0);
            if(n0.k0) {
                d0.d(n0);
                return;
            }
            n0.h0 = true;
            return;
        }
        if(!(n0 instanceof c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        if(((c)n0).k0) {
            ((c)n0).y0();
        }
        ((c)n0).l0 = m1;
        ((c)n0).Z = d0.e(m1);
        if(((c)n0).k0) {
            ((c)n0).x0(false);
        }
        if(n0.k0) {
            d0.d(n0);
            return;
        }
        n0.h0 = true;
    }

    @Override
    public String toString() {
        if(this.a != 0) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder("[");
        g0.n n0 = (g0.n)this.f;
        F0.o0 o00 = (F0.o0)this.e;
        if(n0 == o00) {
            stringBuilder0.append("]");
        }
        else {
            while(n0 != null && n0 != o00) {
                stringBuilder0.append(String.valueOf(n0));
                if(n0.d0 == o00) {
                    stringBuilder0.append("]");
                    break;
                }
                stringBuilder0.append(",");
                n0 = n0.d0;
            }
        }
        String s = stringBuilder0.toString();
        j.e(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

