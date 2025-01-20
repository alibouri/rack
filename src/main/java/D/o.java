package D;

import Aa.P;
import B.g;
import B.i;
import B.q0;
import Bb.z;
import C.p;
import D0.f0;
import E.L;
import J2.w;
import Nb.j;
import Nb.k;
import Sb.b;
import Sb.d;
import Tb.c;
import W5.f;
import a1.a;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import dc.e;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class o extends k implements Function2 {
    public final A X;
    public final q0 Y;
    public final boolean Z;
    public final c b0;
    public final D.c c0;
    public final i d0;
    public final e e0;
    public final GraphicsContext f0;

    public o(A a0, q0 q00, boolean z, c c0, D.c c1, i i0, g g0, e e0, GraphicsContext graphicsContext0) {
        this.X = a0;
        this.Y = q00;
        this.Z = z;
        this.b0 = c0;
        this.c0 = c1;
        this.d0 = i0;
        this.e0 = e0;
        this.f0 = graphicsContext0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ArrayList arrayList1;
        int v73;
        b b0;
        long v68;
        int v67;
        int v65;
        int v64;
        int v63;
        int v52;
        x x2;
        float f6;
        m m2;
        int v45;
        x x1;
        int v41;
        Object object2;
        int v38;
        boolean z4;
        L l1;
        int v24;
        A a3;
        q q0;
        int v18;
        int v17;
        int v10;
        t t1;
        int v7;
        L l0 = (L)object0;
        long v = ((a)object1).a;
        A a0 = this.X;
        a0.q.getValue();
        y.q0 q00 = y.q0.X;
        w.t(v, q00);
        LayoutDirection layoutDirection0 = l0.Y.getLayoutDirection();
        float f = this.Y.b(layoutDirection0);
        int v1 = l0.Y.I(f);
        LayoutDirection layoutDirection1 = l0.Y.getLayoutDirection();
        float f1 = this.Y.d(layoutDirection1);
        int v2 = l0.Y.I(f1);
        float f2 = this.Y.c();
        int v3 = l0.Y.I(f2);
        float f3 = this.Y.a();
        f0 f00 = l0.Y;
        int v4 = f00.I(f3);
        int v5 = v3 + v4;
        int v6 = v1 + v2;
        boolean z = this.Z;
        if(z) {
            v7 = z ? v4 : v2;
        }
        else {
            v7 = v3;
        }
        int v8 = v5 - v7;
        long v9 = f.K(-v6, v, -v5);
        D.i i0 = (D.i)this.b0.invoke();
        x x0 = i0.b.a;
        D.c c0 = this.c0;
        if(c0.d == null || !a.b(c0.b, v) || c0.c != f00.getDensity()) {
            c0.b = v;
            c0.c = f00.getDensity();
            a a1 = new a(v);
            t t2 = (t)c0.a.j(l0, a1);
            c0.d = t2;
            t1 = t2;
        }
        else {
            t t0 = c0.d;
            j.c(t0);
            t1 = t0;
        }
        if(t1.a.length == x0.f) {
            v10 = v6;
        }
        else {
            x0.f = t1.a.length;
            x0.a.clear();
            v10 = v6;
            u u0 = new u(0, 0);
            x0.a.add(u0);
            x0.b = 0;
            x0.c = 0;
            x0.d = 0;
            x0.e = -1;
            ((ArrayList)x0.h).clear();
        }
        i i1 = this.d0;
        if(i1 == null) {
            throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
        }
        int v11 = f00.I(i1.a());
        int v12 = i0.b.b().Y;
        int v13 = a.g(v) - v5;
        m m0 = new m(i0, l0, v11, this.X, this.Z, v7, v8, (!z || v13 > 0 ? android.support.v4.media.session.a.i(v1, v3) : android.support.v4.media.session.a.i(v1, v3 + v13)));
        n n0 = new n(t1, v12, v11, m0, x0);
        P p0 = new P(x0, 2, n0);
        e0.g g0 = e0.q.c();
        Function1 function10 = g0 == null ? null : g0.f();
        e0.g g1 = e0.q.d(g0);
        try {
            C.w w0 = this.X.b;
            int v15 = w0.b.k();
            int v16 = E.A.h(v15, i0, w0.e);
            if(v15 != v16) {
                w0.b.m(v16);
                w0.f.a(v15);
            }
            if(v16 < v12 || v12 <= 0) {
                v17 = x0.d(v16);
                v18 = w0.c.k();
            }
            else {
                v17 = x0.d(v12 - 1);
                v18 = 0;
            }
        }
        finally {
            e0.q.g(g0, g1, function10);
        }
        List list0 = E.A.f(i0, a0.o, a0.l);
        float f4 = a0.e;
        List list1 = list0;
        A a2 = a0;
        p p1 = new p(l0, v, v10, v5, 1);
        if(v7 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if(v8 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        z z1 = z.X;
        e e0 = this.e0;
        androidx.compose.foundation.lazy.layout.c c1 = a2.k;
        GraphicsContext graphicsContext0 = this.f0;
        if(v12 <= 0) {
            int v19 = a.j(v9);
            int v20 = a.i(v9);
            c1.d(0, v19, v20, new ArrayList(), i0.c, m0, true, false, t1.a.length, false, 0, 0, e0, graphicsContext0);
            long v21 = c1.b();
            if(!IntSize.a(v21, 0L)) {
                v19 = f.t(((int)(v21 >> 0x20)), v9);
                v20 = f.s(((int)(v21 & 0xFFFFFFFFL)), v9);
            }
            q0 = new q(null, 0, false, 0.0f, ((D0.L)p1.h(v19, v20, D.p.Y)), false, l0, p0, z1, -v7, v13 + v8, 0, q00, v8, v11);
            a3 = a2;
        }
        else {
            int v22 = Math.round(f4);
            int v23 = v18 - v22;
            if(v17 != 0 || v23 >= 0) {
                v24 = v17;
            }
            else {
                v22 += v23;
                v24 = 0;
                v23 = 0;
            }
            Bb.m m1 = new Bb.m();
            int v25 = -v7 + (v11 >= 0 ? 0 : v11);
            int v26 = v23 + v25;
            while(v26 < 0 && v24 > 0) {
                s s0 = n0.b(v24 - 1);
                --v24;
                m1.add(0, s0);
                v26 += s0.g;
                e0 = e0;
                a2 = a2;
            }
            if(v26 < v25) {
                v22 += v26;
                v26 = v25;
            }
            int v27 = v26 - v25;
            int v28 = v13 + v8;
            int v29 = v28 >= 0 ? v28 : 0;
            int v30 = -v27;
            int v31 = v27;
            int v32 = v24;
            int v33 = 0;
            boolean z2 = false;
            while(v33 < m1.Z) {
                if(v30 >= v29) {
                    m1.c(v33);
                    z2 = true;
                }
                else {
                    ++v32;
                    v30 += ((s)m1.get(v33)).g;
                    ++v33;
                }
            }
            boolean z3 = z2;
            int v34 = v32;
            while(true) {
                if(v34 >= v12 || v30 >= v29 && v30 > 0 && !m1.isEmpty()) {
                    l1 = l0;
                    z4 = z3;
                    break;
                }
                s s1 = n0.b(v34);
                z4 = z3;
                r[] arr_r = s1.b;
                l1 = l0;
                if(arr_r.length == 0) {
                    break;
                }
                int v35 = s1.g;
                int v36 = v30 + v35;
                if(v36 <= v25) {
                    if(arr_r.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    if(arr_r[arr_r.length - 1].a != v12 - 1) {
                        v31 -= v35;
                        v24 = v34 + 1;
                        z3 = true;
                    }
                }
                else {
                    m1.addLast(s1);
                    z3 = z4;
                }
                ++v34;
                v29 = v29;
                v30 = v36;
                l0 = l1;
            }
            if(v30 < v13) {
                int v37 = v13 - v30;
                v30 += v37;
                v38 = v31 - v37;
                while(v38 < v7 && v24 > 0) {
                    s s2 = n0.b(v24 - 1);
                    m1.add(0, s2);
                    v38 += s2.g;
                    --v24;
                }
                v22 += v37;
                if(v38 < 0) {
                    v22 += v38;
                    v30 += v38;
                    v38 = 0;
                }
            }
            else {
                v38 = v31;
            }
            float f5 = Integer.signum(Math.round(f4)) != Integer.signum(v22) || Math.abs(Math.round(f4)) < Math.abs(v22) ? f4 : ((float)v22);
            if(v38 < 0) {
                throw new IllegalArgumentException("negative initial offset");
            }
            s s3 = (s)m1.first();
            r r0 = s3.b.length == 0 ? null : s3.b[0];
            int v39 = r0 == null ? 0 : r0.a;
            if(m1.isEmpty()) {
                object2 = null;
            }
            else {
                Object[] arr_object = m1.Y;
                int v40 = m1.X;
                object2 = arr_object[m1.o(Bb.q.y(m1) + v40)];
            }
            if(((s)object2) == null) {
                v41 = 0;
            }
            else {
                r[] arr_r1 = ((s)object2).b;
                r r1 = arr_r1.length == 0 ? null : arr_r1[arr_r1.length - 1];
                v41 = r1 == null ? 0 : r1.a;
            }
            int v42 = list1.size();
            s s4 = s3;
            int v43 = 0;
            z z5 = null;
            while(true) {
                x1 = (x)n0.f;
                if(v43 >= v42) {
                    break;
                }
                int v44 = ((Number)list1.get(v43)).intValue();
                if(v44 < 0 || v44 >= v39) {
                    v45 = v39;
                    m2 = m0;
                    f6 = f5;
                }
                else {
                    v45 = v39;
                    int v46 = x1.g(v44);
                    m2 = m0;
                    f6 = f5;
                    r r2 = m2.b(v44, n0.a(0, v46), 0, v46, m2.c);
                    if(z5 == null) {
                        z5 = new ArrayList();
                    }
                    z5.add(r2);
                    z5 = z5;
                }
                ++v43;
                f5 = f6;
                m0 = m2;
                v42 = v42;
                v39 = v45;
            }
            int v47 = v39;
            z z6 = z5 == null ? z1 : z5;
            int v48 = list1.size();
            int v49 = 0;
            z z7 = null;
            while(v49 < v48) {
                int v50 = ((Number)list1.get(v49)).intValue();
                if(v41 + 1 > v50 || v50 >= v12) {
                    x2 = x1;
                }
                else {
                    int v51 = x1.g(v50);
                    x2 = x1;
                    r r3 = m0.b(v50, n0.a(0, v51), 0, v51, m0.c);
                    if(z7 == null) {
                        z7 = new ArrayList();
                    }
                    z7.add(r3);
                    z7 = z7;
                }
                ++v49;
                v48 = v48;
                list1 = list1;
                x1 = x2;
            }
            z z8 = z7 == null ? z1 : z7;
            if(v7 > 0 || v11 < 0) {
                int v53 = m1.Z;
                v52 = v38;
                int v54 = 0;
                while(v54 < v53) {
                    int v55 = ((s)m1.get(v54)).g;
                    if(v52 == 0 || v55 > v52 || v54 == Bb.q.y(m1)) {
                        break;
                    }
                    v52 -= v55;
                    ++v54;
                    s4 = (s)m1.get(v54);
                }
            }
            else {
                v52 = v38;
            }
            int v56 = a.h(v9);
            int v57 = f.s(v30, v9);
            boolean z9 = v30 < Math.min(v57, v13);
            if(z9 && -v38 != 0) {
                throw new IllegalStateException("non-zero firstLineScrollOffset");
            }
            int v58 = m1.a();
            int v59 = 0;
            int v60 = 0;
            while(v59 < v58) {
                v60 += ((s)m1.get(v59)).b.length;
                ++v59;
                v58 = v58;
            }
            ArrayList arrayList0 = new ArrayList(v60);
            if(z9) {
                if(!z6.isEmpty() || !z8.isEmpty()) {
                    throw new IllegalArgumentException("no items");
                }
                int v61 = m1.a();
                int[] arr_v = new int[v61];
                int v62 = 0;
                while(v62 < v61) {
                    if(z) {
                        v63 = v41;
                        v64 = v61 - v62 - 1;
                    }
                    else {
                        v63 = v41;
                        v64 = v62;
                    }
                    arr_v[v62] = ((s)m1.get(v64)).f;
                    ++v62;
                    v41 = v63;
                }
                v65 = v41;
                int[] arr_v1 = new int[v61];
                for(int v66 = 0; v66 < v61; ++v66) {
                    arr_v1[v66] = 0;
                }
                v67 = v12;
                i1.b(l1, v57, arr_v, arr_v1);
                if(z) {
                    d d0 = Bb.n.t0(arr_v1);
                    l1 = l1;
                    v68 = v9;
                    b0 = new b(d0.Y, d0.X, -d0.Z);
                }
                else {
                    v68 = v9;
                    l1 = l1;
                    b0 = Bb.n.t0(arr_v1);
                }
                int v69 = b0.X;
                int v70 = b0.Y;
                int v71 = b0.Z;
                if(v71 > 0 && v69 <= v70 || v71 < 0 && v70 <= v69) {
                    while(true) {
                        int v72 = arr_v1[v69];
                        s s5 = (s)m1.get((z ? v61 - v69 - 1 : v69));
                        if(z) {
                            v73 = v61;
                            v72 = v57 - v72 - s5.f;
                        }
                        else {
                            v73 = v61;
                        }
                        r[] arr_r2 = s5.a(v72, v56, v57);
                        int v74 = 0;
                        while(v74 < arr_r2.length) {
                            arrayList0.add(arr_r2[v74]);
                            ++v74;
                            arr_v1 = arr_v1;
                        }
                        if(v69 != v70) {
                            v69 += v71;
                            v61 = v73;
                            arr_v1 = arr_v1;
                            continue;
                        }
                        goto label_379;
                    }
                    throw new IllegalArgumentException("no items");
                }
            }
            else {
                v68 = v9;
                v65 = v41;
                v67 = v12;
                int v75 = z6.size() - 1;
                if(v75 >= 0) {
                    int v76 = -v38;
                    while(true) {
                        r r4 = (r)z6.get(v75);
                        v76 -= r4.p;
                        r4.l(v76, 0, v56, v57);
                        arrayList0.add(r4);
                        if(v75 - 1 < 0) {
                            break;
                        }
                        --v75;
                    }
                }
                int v77 = m1.a();
                int v78 = -v38;
                int v79 = 0;
                while(v79 < v77) {
                    s s6 = (s)m1.get(v79);
                    r[] arr_r3 = s6.a(v78, v56, v57);
                    int v80 = 0;
                    while(v80 < arr_r3.length) {
                        arrayList0.add(arr_r3[v80]);
                        ++v80;
                        v77 = v77;
                    }
                    v78 += s6.g;
                    ++v79;
                    v77 = v77;
                }
                int v81 = z8.size();
                for(int v82 = 0; v82 < v81; ++v82) {
                    r r5 = (r)z8.get(v82);
                    r5.l(v78, 0, v56, v57);
                    arrayList0.add(r5);
                    v78 += r5.p;
                }
            }
        label_379:
            c1.d(((int)f5), v56, v57, arrayList0, m0.a.c, m0, true, false, t1.a.length, false, v52, v30, e0, graphicsContext0);
            long v83 = c1.b();
            if(!IntSize.a(v83, 0L)) {
                int v84 = f.t(Math.max(v56, ((int)(v83 >> 0x20))), v68);
                int v85 = f.s(Math.max(v57, ((int)(v83 & 0xFFFFFFFFL))), v68);
                if(v85 != v57) {
                    int v86 = arrayList0.size();
                    for(int v87 = 0; v87 < v86; ++v87) {
                        r r6 = (r)arrayList0.get(v87);
                        r6.q = v85;
                        r6.s = r6.g + v85;
                    }
                }
                v56 = v84;
                v57 = v85;
            }
            D0.L l2 = (D0.L)p1.h(v56, v57, new P(arrayList0, 3, a2.p));
            if(!z6.isEmpty() || !z8.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(arrayList0.size());
                int v88 = arrayList0.size();
                int v89 = 0;
                while(v89 < v88) {
                    Object object3 = arrayList0.get(v89);
                    int v90 = ((r)object3).a;
                    if(v47 <= v90 && v90 <= v65) {
                        arrayList2.add(object3);
                    }
                    ++v89;
                    v47 = v47;
                }
                arrayList1 = arrayList2;
            }
            else {
                arrayList1 = arrayList0;
            }
            a3 = a2;
            q0 = new q(s4, v52, v65 != v67 - 1 || v30 > v13, f5, l2, z4, l1, p0, arrayList1, -v7, v28, v67, q00, v8, v11);
        }
        a3.f(q0, false);
        return q0;
    }
}

