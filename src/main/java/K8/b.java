package K8;

import L8.c;
import L8.g;
import com.google.android.gms.internal.measurement.E1;
import io.sentry.g1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import m7.a;
import r8.e;
import r8.i;
import r8.k;
import r8.m;
import r8.n;
import r8.o;
import r8.p;

public final class b implements k {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // r8.k
    public final m a(g1 g10, EnumMap enumMap0) {
        a a26;
        L8.a[] arr_a8;
        int v52;
        n n2;
        E1 e18;
        int v44;
        n n1;
        E1 e16;
        int v39;
        x8.b b2;
        ArrayList arrayList4;
        int v25;
        int v26;
        L8.a a9;
        ArrayList arrayList3;
        int v22;
        int v18;
        E1 e11;
        int v16;
        Iterator iterator1;
        int v14;
        J5.k k0;
        L8.a a7;
        c c1;
        int v11;
        int v10;
        int v9;
        o[] arr_o2;
        i i1;
        o[] arr_o1;
        a a2;
        e e0;
        o[] arr_o;
        n n0 = n.Z;
        if(this.a != 0) {
            u8.a a0 = new u8.a(g10.r());
            try {
                arr_o = null;
                s8.a a1 = a0.a(false);
                arr_o = a1.b;
                e0 = e1;
                a2 = null;
                arr_o1 = arr_o;
                a2 = new t8.a().a(a1);  // initializer: Ljava/lang/Object;-><init>()V
                arr_o1 = arr_o;
                i1 = null;
                e0 = null;
            }
            catch(i i0) {
                e0 = null;
                i1 = i0;
                arr_o1 = arr_o;
            }
            catch(e unused_ex) {
                a2 = null;
                i1 = null;
            }
            if(a2 == null) {
                try {
                    s8.a a3 = a0.a(true);
                    a a4 = new t8.a().a(a3);  // initializer: Ljava/lang/Object;-><init>()V
                    arr_o2 = a3.b;
                    a2 = a4;
                }
                catch(i | e i2) {
                    if(i1 != null) {
                        throw i1;
                    }
                    if(e0 == null) {
                        throw i2;
                    }
                    throw e0;
                }
            }
            else {
                arr_o2 = arr_o1;
            }
            if(enumMap0 != null) {
                p p0 = (p)enumMap0.get(r8.c.h0);
                if(p0 != null) {
                    for(int v = 0; v < arr_o2.length; ++v) {
                        p0.a(arr_o2[v]);
                    }
                }
            }
            m m0 = new m(a2.a, ((byte[])a2.d), arr_o2, r8.a.X, 0);
            ArrayList arrayList0 = (ArrayList)a2.e;
            if(arrayList0 != null) {
                m0.b(n.Y, arrayList0);
            }
            String s = (String)a2.f;
            if(s != null) {
                m0.b(n0, s);
            }
            return m0;
        }
        ArrayList arrayList1 = new ArrayList();
        x8.b b0 = g10.r();
        ArrayList arrayList2 = N8.a.a(b0);
        if(arrayList2.isEmpty()) {
            int[] arr_v = (int[])b0.b0.clone();
            x8.b b1 = new x8.b(b0.X, b0.Y, b0.Z, arr_v);
            x8.a a5 = new x8.a(b0.X);
            x8.a a6 = new x8.a(b0.X);
            for(int v1 = 0; true; ++v1) {
                int v2 = b1.Y;
                if(v1 >= (v2 + 1) / 2) {
                    break;
                }
                a5 = b1.e(a5, v1);
                int v3 = v2 - 1 - v1;
                a6 = b1.e(a6, v3);
                a5.j();
                a6.j();
                System.arraycopy(a6.X, 0, b1.b0, v1 * b1.Z, b1.Z);
                System.arraycopy(a5.X, 0, b1.b0, v3 * b1.Z, b1.Z);
            }
            b0 = b1;
            arrayList2 = N8.a.a(b1);
        }
        Iterator iterator0 = arrayList2.iterator();
    label_73:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            o o0 = ((o[])object0)[4];
            o o1 = ((o[])object0)[5];
            o o2 = ((o[])object0)[6];
            o o3 = ((o[])object0)[7];
            int v4 = Math.min(Math.min(b.c(((o[])object0)[0], o0), b.c(((o[])object0)[6], ((o[])object0)[2]) * 17 / 18), Math.min(b.c(((o[])object0)[1], ((o[])object0)[5]), b.c(((o[])object0)[7], ((o[])object0)[3]) * 17 / 18));
            int v5 = Math.max(Math.max(b.b(((o[])object0)[0], ((o[])object0)[4]), b.b(((o[])object0)[6], ((o[])object0)[2]) * 17 / 18), Math.max(b.b(((o[])object0)[1], ((o[])object0)[5]), b.b(((o[])object0)[7], ((o[])object0)[3]) * 17 / 18));
            o o4 = o0;
            int v6 = 0;
            c c0 = new c(b0, o0, o1, o2, o3);
            L8.e e2 = null;
            E1 e10 = null;
            while(true) {
                int v7 = c0.i;
                int v8 = c0.h;
                if(o4 == null) {
                    v9 = v8;
                    v10 = v7;
                    v11 = v6;
                    c1 = c0;
                }
                else {
                    v9 = v8;
                    v10 = v7;
                    v11 = v6;
                    c1 = c0;
                    e2 = g.d(b0, c0, o4, true, v4, v5);
                }
                if(o2 != null) {
                    e10 = g.d(b0, c1, o2, false, v4, v5);
                }
                if(e2 == null && e10 == null) {
                    k0 = null;
                }
                else {
                    if(e2 == null) {
                    label_109:
                        if(e10 != null) {
                            a7 = ((L8.e)e10).C();
                            goto label_113;
                        }
                    label_112:
                        a7 = null;
                    }
                    else {
                        a7 = e2.C();
                        if(a7 == null) {
                            goto label_109;
                        }
                        else if(e10 != null) {
                            L8.a a8 = ((L8.e)e10).C();
                            if(a8 != null && a7.b != a8.b && a7.c != a8.c && a7.f != a8.f) {
                                goto label_112;
                            }
                        }
                    }
                label_113:
                    if(a7 != null) {
                        c c2 = g.a(e2);
                        c c3 = g.a(((L8.e)e10));
                        if(c2 == null) {
                            c2 = c3;
                        }
                        else if(c3 != null) {
                            c2 = new c(c2.a, c2.b, c2.c, c3.d, c3.e);
                        }
                        k0 = new J5.k(a7, c2);
                    }
                }
                if(k0 == null) {
                    break;
                }
                if(v11 == 0) {
                    c0 = (c)k0.e;
                    if(c0 == null || c0.h >= v9 && c0.i <= v10) {
                        goto label_131;
                    }
                    v6 = 1;
                    e2 = e2;
                    continue;
                }
            label_131:
                k0.e = c1;
                int v12 = k0.b + 1;
                E1[] arr_e1 = (E1[])k0.d;
                arr_e1[0] = e2;
                arr_e1[v12] = e10;
                int v13 = 1;
                while(true) {
                    v14 = k0.b;
                    if(v13 > v12) {
                        break;
                    }
                    int v15 = e2 == null ? v13 : v12 - v13;
                    if(arr_e1[v15] == null) {
                        if(v15 != 0 && v15 != v12) {
                            iterator1 = iterator0;
                            e11 = new E1(c1);
                            v16 = v12;
                        }
                        else {
                            iterator1 = iterator0;
                            v16 = v12;
                            e11 = new L8.e(c1, v15 == 0);
                        }
                        arr_e1[v15] = e11;
                        int v17 = v9;
                        v18 = v17;
                        int v19 = v4;
                        int v20 = v5;
                        int v21 = -1;
                        while(true) {
                            v22 = v10;
                            if(v17 > v10) {
                                break;
                            }
                            int v23 = e2 == null ? 1 : -1;
                            int v24 = v15 - v23;
                            if(v24 < 0 || v24 > v14 + 1) {
                                arrayList3 = arrayList1;
                                a9 = null;
                            }
                            else {
                                E1 e12 = arr_e1[v24];
                                arrayList3 = arrayList1;
                                a9 = ((L8.a[])e12.Z)[e12.r(v17)];
                            }
                            if(a9 == null) {
                                L8.a a10 = arr_e1[v15].p(v17);
                                if(a10 == null) {
                                    L8.a a11 = v24 < 0 || v24 > v14 + 1 ? null : arr_e1[v24].p(v17);
                                    if(a11 == null) {
                                        int v27 = v15;
                                        int v28 = 0;
                                    alab1:
                                        while(true) {
                                            int v29 = v27 - v23;
                                            v26 = v15;
                                            if(v29 < 0 || v29 > v14 + 1) {
                                                v25 = e2 == null ? ((c)k0.e).f : ((c)k0.e).g;
                                                break;
                                            }
                                            L8.a[] arr_a = (L8.a[])arr_e1[v29].Z;
                                            int v30 = arr_a.length;
                                            int v31 = 0;
                                            while(v31 < v30) {
                                                L8.a a12 = arr_a[v31];
                                                if(a12 != null) {
                                                    v25 = (a12.c - a12.b) * (v23 * v28) + (e2 == null ? a12.c : a12.b);
                                                    break alab1;
                                                }
                                                ++v31;
                                                v30 = v30;
                                            }
                                            ++v28;
                                            v27 = v29;
                                            v15 = v26;
                                        }
                                    }
                                    else {
                                        v25 = e2 == null ? a11.b : a11.c;
                                    label_182:
                                        v26 = v15;
                                    }
                                }
                                else {
                                    v25 = e2 == null ? a10.c : a10.b;
                                    goto label_182;
                                }
                            }
                            else {
                                v25 = e2 == null ? a9.b : a9.c;
                                goto label_182;
                            }
                            if(v25 >= 0 && v25 <= c1.g) {
                            label_209:
                                L8.a a13 = g.c(b0, c1.f, c1.g, e2 != null, v25, v17, v19, v20);
                                if(a13 != null) {
                                    ((L8.a[])e11.Z)[e11.r(v17)] = a13;
                                    v21 = v25;
                                    v20 = Math.max(v20, a13.c - a13.b);
                                    v19 = Math.min(v19, a13.c - a13.b);
                                }
                            }
                            else if(v21 != -1) {
                                v25 = v21;
                                goto label_209;
                            }
                            else {
                                v20 = v20;
                                v19 = v19;
                            }
                            ++v17;
                            v10 = v22;
                            arrayList1 = arrayList3;
                            v15 = v26;
                        }
                        arrayList4 = arrayList1;
                        v5 = v20;
                        v4 = v19;
                    }
                    else {
                        v22 = v10;
                        arrayList4 = arrayList1;
                        iterator1 = iterator0;
                        v16 = v12;
                        v18 = v9;
                    }
                    ++v13;
                    iterator0 = iterator1;
                    v12 = v16;
                    v9 = v18;
                    v10 = v22;
                    arrayList1 = arrayList4;
                }
                ArrayList arrayList5 = arrayList1;
                L8.a a14 = (L8.a)k0.c;
                int[] arr_v1 = new int[2];
                arr_v1[1] = v14 + 2;
                int v32 = a14.f;
                arr_v1[0] = v32;
                L8.b[][] arr2_b = (L8.b[][])Array.newInstance(L8.b.class, arr_v1);
                for(int v33 = 0; v33 < arr2_b.length; ++v33) {
                    for(int v34 = 0; true; ++v34) {
                        L8.b[] arr_b = arr2_b[v33];
                        if(v34 >= arr_b.length) {
                            break;
                        }
                        arr_b[v34] = new L8.b();
                    }
                }
                k0.b(arr_e1[0]);
                k0.b(arr_e1[v14 + 1]);
                int v35 = 0x3A0;
                while(true) {
                    E1 e13 = arr_e1[0];
                    if(e13 != null) {
                        E1 e14 = arr_e1[v14 + 1];
                        if(e14 != null) {
                            int v36 = 0;
                            while(true) {
                                L8.a[] arr_a1 = (L8.a[])e13.Z;
                                if(v36 >= arr_a1.length) {
                                    break;
                                }
                                L8.a a15 = arr_a1[v36];
                                if(a15 != null) {
                                    L8.a a16 = ((L8.a[])e14.Z)[v36];
                                    if(a16 != null && a15.f == a16.f) {
                                        int v37 = 1;
                                        while(v37 <= v14) {
                                            L8.a a17 = ((L8.a[])arr_e1[v37].Z)[v36];
                                            if(a17 != null) {
                                                int v38 = arr_a1[v36].f;
                                                a17.f = v38;
                                                if(!a17.b(v38)) {
                                                    ((L8.a[])arr_e1[v37].Z)[v36] = null;
                                                }
                                            }
                                            ++v37;
                                            e14 = e14;
                                        }
                                    }
                                }
                                ++v36;
                                e14 = e14;
                            }
                        }
                    }
                    E1 e15 = arr_e1[0];
                    if(e15 == null) {
                        b2 = b0;
                        v39 = 0;
                    }
                    else {
                        int v40 = 0;
                        v39 = 0;
                        while(true) {
                            L8.a[] arr_a2 = (L8.a[])e15.Z;
                            if(v40 >= arr_a2.length) {
                                break;
                            }
                            L8.a a18 = arr_a2[v40];
                            if(a18 != null) {
                                int v41 = a18.f;
                                int v42 = 1;
                                int v43 = 0;
                                while(v42 < v14 + 1) {
                                    e16 = e15;
                                    if(v43 >= 2) {
                                        goto label_316;
                                    }
                                    L8.a a19 = ((L8.a[])arr_e1[v42].Z)[v40];
                                    if(a19 != null) {
                                        if(!a19.b(a19.f)) {
                                            if(a19.b(v41)) {
                                                a19.f = v41;
                                                v43 = 0;
                                            }
                                            else {
                                                ++v43;
                                            }
                                        }
                                        if(!a19.b(a19.f)) {
                                            ++v39;
                                        }
                                    }
                                    ++v42;
                                    e15 = e16;
                                    b0 = b0;
                                }
                            }
                            e16 = e15;
                        label_316:
                            ++v40;
                            e15 = e16;
                            b0 = b0;
                        }
                        b2 = b0;
                    }
                    E1 e17 = arr_e1[v14 + 1];
                    if(e17 == null) {
                        n1 = n0;
                        v44 = 0;
                    }
                    else {
                        int v45 = 0;
                        v44 = 0;
                        while(true) {
                            L8.a[] arr_a3 = (L8.a[])e17.Z;
                            if(v45 >= arr_a3.length) {
                                break;
                            }
                            L8.a a20 = arr_a3[v45];
                            if(a20 != null) {
                                int v46 = a20.f;
                                int v47 = v14 + 1;
                                int v48 = 0;
                                while(v47 > 0) {
                                    e18 = e17;
                                    if(v48 < 2) {
                                        L8.a a21 = ((L8.a[])arr_e1[v47].Z)[v45];
                                        if(a21 != null) {
                                            if(!a21.b(a21.f)) {
                                                if(a21.b(v46)) {
                                                    a21.f = v46;
                                                    v48 = 0;
                                                }
                                                else {
                                                    ++v48;
                                                }
                                            }
                                            if(!a21.b(a21.f)) {
                                                ++v44;
                                            }
                                        }
                                        --v47;
                                        e17 = e18;
                                        n0 = n0;
                                        continue;
                                    }
                                    n2 = n0;
                                    goto label_356;
                                }
                            }
                            n2 = n0;
                            e18 = e17;
                        label_356:
                            ++v45;
                            e17 = e18;
                            n0 = n2;
                        }
                        n1 = n0;
                    }
                    int v49 = v39 + v44;
                    if(v49 == 0) {
                        v49 = 0;
                    }
                    else {
                        int v50 = 1;
                        while(v50 < v14 + 1) {
                            L8.a[] arr_a4 = (L8.a[])arr_e1[v50].Z;
                            int v51 = 0;
                            while(v51 < arr_a4.length) {
                                L8.a a22 = arr_a4[v51];
                                if(a22 == null || a22.b(a22.f)) {
                                    v52 = v49;
                                }
                                else {
                                    L8.a a23 = arr_a4[v51];
                                    L8.a[] arr_a5 = (L8.a[])arr_e1[v50 - 1].Z;
                                    E1 e19 = arr_e1[v50 + 1];
                                    L8.a[] arr_a6 = e19 == null ? arr_a5 : ((L8.a[])e19.Z);
                                    v52 = v49;
                                    L8.a[] arr_a7 = new L8.a[14];
                                    arr_a7[2] = arr_a5[v51];
                                    arr_a7[3] = arr_a6[v51];
                                    if(v51 > 0) {
                                        arr_a7[0] = arr_a4[v51 - 1];
                                        arr_a7[4] = arr_a5[v51 - 1];
                                        arr_a7[5] = arr_a6[v51 - 1];
                                    }
                                    if(v51 > 1) {
                                        arr_a7[8] = arr_a4[v51 - 2];
                                        arr_a7[10] = arr_a5[v51 - 2];
                                        arr_a7[11] = arr_a6[v51 - 2];
                                    }
                                    if(v51 < arr_a4.length - 1) {
                                        arr_a7[1] = arr_a4[v51 + 1];
                                        arr_a7[6] = arr_a5[v51 + 1];
                                        arr_a7[7] = arr_a6[v51 + 1];
                                    }
                                    if(v51 < arr_a4.length - 2) {
                                        arr_a7[9] = arr_a4[v51 + 2];
                                        arr_a7[12] = arr_a5[v51 + 2];
                                        arr_a7[13] = arr_a6[v51 + 2];
                                    }
                                    int v53 = 0;
                                    while(v53 < 14) {
                                        L8.a a24 = arr_a7[v53];
                                        if(a24 == null || !a24.b(a24.f)) {
                                        label_405:
                                            arr_a8 = arr_a7;
                                        }
                                        else {
                                            if(a24.d == a23.d) {
                                                a23.f = a24.f;
                                                break;
                                            }
                                            else {
                                                arr_a8 = arr_a7;
                                                goto label_406;
                                            }
                                            goto label_405;
                                        }
                                    label_406:
                                        ++v53;
                                        arr_a7 = arr_a8;
                                    }
                                }
                                ++v51;
                                v49 = v52;
                            }
                            ++v50;
                            v49 = v49;
                        }
                    }
                    if(v49 <= 0 || v49 >= v35) {
                        break;
                    }
                    v35 = v49;
                    b0 = b2;
                    n0 = n1;
                }
                int v55 = 0;
                for(int v54 = 0; v54 < arr_e1.length; ++v54) {
                    E1 e110 = arr_e1[v54];
                    if(e110 != null) {
                        L8.a[] arr_a9 = (L8.a[])e110.Z;
                        for(int v56 = 0; v56 < arr_a9.length; ++v56) {
                            L8.a a25 = arr_a9[v56];
                            if(a25 != null) {
                                int v57 = a25.f;
                                if(v57 >= 0 && v57 < arr2_b.length) {
                                    arr2_b[v57][v55].b(a25.e);
                                }
                            }
                        }
                    }
                    ++v55;
                }
                L8.b b3 = arr2_b[0][1];
                int[] arr_v2 = b3.a();
                int v58 = v14 * v32;
                int v59 = a14.c;
                int v60 = v58 - (2 << v59);
                if(arr_v2.length == 0) {
                    if(v60 <= 0 || v60 > 0x3A0) {
                        throw i.Z;
                    }
                    b3.b(v60);
                }
                else if(arr_v2[0] != v60) {
                    b3.b(v60);
                }
                ArrayList arrayList6 = new ArrayList();
                int[] arr_v3 = new int[v58];
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                for(int v61 = 0; v61 < v32; ++v61) {
                    for(int v62 = 0; v62 < v14; ++v62) {
                        int[] arr_v4 = arr2_b[v61][v62 + 1].a();
                        int v63 = v61 * v14 + v62;
                        if(arr_v4.length == 0) {
                            arrayList6.add(v63);
                        }
                        else if(arr_v4.length == 1) {
                            arr_v3[v63] = arr_v4[0];
                        }
                        else {
                            arrayList8.add(v63);
                            arrayList7.add(arr_v4);
                        }
                    }
                }
                int v64 = arrayList7.size();
                int[][] arr2_v = new int[v64][];
                for(int v65 = 0; v65 < v64; ++v65) {
                    arr2_v[v65] = (int[])arrayList7.get(v65);
                }
                int[] arr_v5 = K8.a.a(arrayList6);
                int[] arr_v6 = K8.a.a(arrayList8);
                int v66 = arr_v6.length;
                int[] arr_v7 = new int[v66];
                int v67 = 100;
                while(true) {
                    for(int v68 = 0; v68 < v66; ++v68) {
                        arr_v3[arr_v6[v68]] = arr2_v[v68][arr_v7[v68]];
                    }
                    try {
                        a26 = g.b(arr_v3, v59, arr_v5);
                        break;
                    }
                    catch(r8.b unused_ex) {
                        if(v66 == 0) {
                            throw r8.b.a();
                        }
                        for(int v69 = 0; v69 < v66; ++v69) {
                            int v70 = arr_v7[v69];
                            if(v70 < arr2_v[v69].length - 1) {
                                arr_v7[v69] = v70 + 1;
                                break;
                            }
                            arr_v7[v69] = 0;
                            if(v69 == v66 - 1) {
                                throw r8.b.a();
                            }
                        }
                        --v67;
                        n1 = n1;
                        arrayList5 = arrayList5;
                        continue;
                    }
                }
                m m1 = new m(a26.a, null, ((o[])object0), r8.a.i0);
                m1.b(n1, ((String)a26.f));
                K8.c c4 = (K8.c)a26.g;
                if(c4 != null) {
                    m1.b(n.f0, c4);
                }
                arrayList5.add(m1);
                iterator0 = iterator0;
                n0 = n1;
                arrayList1 = arrayList5;
                b0 = b2;
                continue label_73;
            }
            throw i.Z;
        }
        m[] arr_m = (m[])arrayList1.toArray(new m[arrayList1.size()]);
        if(arr_m != null && arr_m.length != 0) {
            m m2 = arr_m[0];
            if(m2 != null) {
                return m2;
            }
        }
        throw i.Z;
    }

    public static int b(o o0, o o1) {
        return o0 == null || o1 == null ? 0 : ((int)Math.abs(o0.a - o1.a));
    }

    public static int c(o o0, o o1) {
        return o0 == null || o1 == null ? 0x7FFFFFFF : ((int)Math.abs(o0.a - o1.a));
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override  // r8.k
    public final void reset() {
    }
}

