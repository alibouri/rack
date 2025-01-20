package e0;

import F0.e;
import I5.h;
import Nb.j;
import U.C;
import U.G0;
import U.Z;
import U.o;
import V2.a;
import W.d;
import W.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s.B;
import s.E;
import s.y;

public final class r {
    public final Function1 a;
    public Object b;
    public y c;
    public int d;
    public final h e;
    public final B f;
    public final E g;
    public final d h;
    public final o i;
    public int j;
    public final h k;
    public final HashMap l;

    public r(Function1 function10) {
        this.a = function10;
        this.d = -1;
        this.e = new h(22);
        this.f = new B();
        this.g = new E();
        this.h = new d(new C[16]);
        this.i = new o(1, this);
        this.k = new h(22);
        this.l = new HashMap();
    }

    public final void a(Object object0, a a0, Function0 function00) {
        long[] arr_v2;
        long[] arr_v1;
        Object object1 = this.b;
        y y0 = this.c;
        int v = this.d;
        this.b = object0;
        this.c = (y)this.f.e(object0);
        if(this.d == -1) {
            this.d = m.k().d();
        }
        d d0 = U.d.u();
        try {
            d0.c(this.i);
            q.e(function00, a0);
        }
        finally {
            d0.p(d0.Z - 1);
        }
        Object object2 = this.b;
        j.c(object2);
        int v2 = this.d;
        y y1 = this.c;
        if(y1 != null) {
            long[] arr_v = y1.a;
            int v3 = arr_v.length - 2;
            if(v3 >= 0) {
                int v4 = 0;
                while(true) {
                    long v5 = arr_v[v4];
                    if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                        arr_v2 = arr_v;
                    }
                    else {
                        int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                        int v7 = 0;
                        while(v7 < v6) {
                            if((v5 & 0xFFL) < 0x80L) {
                                int v8 = (v4 << 3) + v7;
                                Object object3 = y1.b[v8];
                                arr_v1 = arr_v;
                                boolean z = y1.c[v8] != v2;
                                if(z) {
                                    this.d(object2, object3);
                                }
                                if(z) {
                                    y1.e(v8);
                                }
                            }
                            else {
                                arr_v1 = arr_v;
                            }
                            v5 >>= 8;
                            ++v7;
                            arr_v = arr_v1;
                        }
                        arr_v2 = arr_v;
                        if(v6 != 8) {
                            break;
                        }
                    }
                    if(v4 == v3) {
                        break;
                    }
                    ++v4;
                    arr_v = arr_v2;
                }
            }
        }
        this.b = object1;
        this.c = y0;
        this.d = v;
    }

    public final boolean b(Set set0) {
        Object[] arr_object19;
        h h16;
        y y1;
        Object[] arr_object18;
        h h15;
        h h9;
        Iterator iterator1;
        Object object12;
        h h13;
        HashMap hashMap7;
        Object[] arr_object12;
        Object[] arr_object11;
        HashMap hashMap6;
        Object object11;
        h h12;
        long[] arr_v8;
        h h11;
        Iterator iterator2;
        h h7;
        h h5;
        HashMap hashMap3;
        int v22;
        int v21;
        HashMap hashMap2;
        h h4;
        int v16;
        Object[] arr_object3;
        long[] arr_v2;
        long v9;
        int v8;
        int v7;
        h h3;
        h h2;
        Z z2;
        HashMap hashMap1;
        int v6;
        int v5;
        Object[] arr_object1;
        boolean z1;
        HashMap hashMap0 = this.l;
        Z z0 = Z.e;
        d d0 = this.h;
        h h0 = this.k;
        h h1 = this.e;
        E e0 = this.g;
        if(set0 instanceof f) {
            Object[] arr_object = ((f)set0).X.b;
            long[] arr_v = ((f)set0).X.a;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                z1 = false;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_274;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(object0 instanceof u) {
                                arr_object1 = arr_object;
                                if(!((u)object0).h(2)) {
                                    v5 = v3;
                                    v6 = v4;
                                    hashMap1 = hashMap0;
                                    z2 = z0;
                                    h2 = h0;
                                    h3 = h1;
                                    v7 = v;
                                    v8 = v1;
                                    v9 = v2;
                                    goto label_254;
                                }
                            }
                            else {
                                arr_object1 = arr_object;
                            }
                            if(((B)h0.Y).b(object0)) {
                                Object object1 = ((B)h0.Y).e(object0);
                                if(object1 == null) {
                                    goto label_209;
                                }
                                else if(object1 instanceof E) {
                                    Object[] arr_object2 = ((E)object1).b;
                                    long[] arr_v1 = ((E)object1).a;
                                    z2 = z0;
                                    int v10 = arr_v1.length - 2;
                                    v5 = v3;
                                    v6 = v4;
                                    if(v10 >= 0) {
                                        h2 = h0;
                                        int v11 = 0;
                                        while(true) {
                                            long v12 = arr_v1[v11];
                                            v8 = v1;
                                            v9 = v2;
                                            if((~v12 << 7 & v12 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                goto label_141;
                                            }
                                            int v13 = 8 - (~(v11 - v10) >>> 0x1F);
                                            int v14 = 0;
                                            while(v14 < v13) {
                                                if((v12 & 0xFFL) < 0x80L) {
                                                    C c0 = (C)arr_object2[(v11 << 3) + v14];
                                                    j.d(c0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                    arr_v2 = arr_v1;
                                                    Object object2 = hashMap0.get(c0);
                                                    arr_object3 = arr_object2;
                                                    G0 g00 = c0.Z;
                                                    if(g00 == null) {
                                                        g00 = z2;
                                                    }
                                                    if(g00.a(c0.m().f, object2)) {
                                                        hashMap2 = hashMap0;
                                                        v16 = v11;
                                                        h4 = h1;
                                                        v22 = v;
                                                        d0.c(c0);
                                                    }
                                                    else {
                                                        Object object3 = ((B)h1.Y).e(c0);
                                                        if(object3 == null) {
                                                        label_107:
                                                            hashMap2 = hashMap0;
                                                            v16 = v11;
                                                            h4 = h1;
                                                            v22 = v;
                                                        }
                                                        else if(object3 instanceof E) {
                                                            Object[] arr_object4 = ((E)object3).b;
                                                            long[] arr_v3 = ((E)object3).a;
                                                            int v15 = arr_v3.length - 2;
                                                            if(v15 >= 0) {
                                                                v16 = v11;
                                                                h4 = h1;
                                                                int v17 = 0;
                                                                while(true) {
                                                                    long v18 = arr_v3[v17];
                                                                    hashMap2 = hashMap0;
                                                                    if((~v18 << 7 & v18 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                                        goto label_93;
                                                                    }
                                                                    int v19 = 8 - (~(v17 - v15) >>> 0x1F);
                                                                    int v20 = 0;
                                                                    while(v20 < v19) {
                                                                        if((v18 & 0xFFL) < 0x80L) {
                                                                            v21 = v;
                                                                            e0.a(arr_object4[(v17 << 3) + v20]);
                                                                            z1 = true;
                                                                        }
                                                                        else {
                                                                            v21 = v;
                                                                        }
                                                                        v18 >>= 8;
                                                                        ++v20;
                                                                        v = v21;
                                                                    }
                                                                    v22 = v;
                                                                    if(v19 == 8) {
                                                                        goto label_94;
                                                                    label_93:
                                                                        v22 = v;
                                                                    label_94:
                                                                        if(v17 != v15) {
                                                                            ++v17;
                                                                            hashMap0 = hashMap2;
                                                                            arr_v3 = arr_v3;
                                                                            v = v22;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            else {
                                                                goto label_107;
                                                            }
                                                        }
                                                        else {
                                                            hashMap2 = hashMap0;
                                                            v16 = v11;
                                                            h4 = h1;
                                                            v22 = v;
                                                            e0.a(object3);
                                                            z1 = true;
                                                        }
                                                    }
                                                }
                                                else {
                                                    hashMap2 = hashMap0;
                                                    arr_v2 = arr_v1;
                                                    v16 = v11;
                                                    h4 = h1;
                                                    v22 = v;
                                                    arr_object3 = arr_object2;
                                                }
                                                v12 >>= 8;
                                                ++v14;
                                                arr_v1 = arr_v2;
                                                arr_object2 = arr_object3;
                                                h1 = h4;
                                                v11 = v16;
                                                hashMap0 = hashMap2;
                                                v = v22;
                                            }
                                            hashMap3 = hashMap0;
                                            long[] arr_v4 = arr_v1;
                                            h5 = h1;
                                            v7 = v;
                                            Object[] arr_object5 = arr_object2;
                                            if(v13 == 8) {
                                                int v23 = v11;
                                                goto label_147;
                                            label_141:
                                                hashMap3 = hashMap0;
                                                arr_v4 = arr_v1;
                                                h5 = h1;
                                                v7 = v;
                                                arr_object5 = arr_object2;
                                                v23 = v11;
                                            label_147:
                                                if(v23 != v10) {
                                                    v11 = v23 + 1;
                                                    v1 = v8;
                                                    v2 = v9;
                                                    arr_v1 = arr_v4;
                                                    arr_object2 = arr_object5;
                                                    h1 = h5;
                                                    hashMap0 = hashMap3;
                                                    v = v7;
                                                    continue;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    else {
                                        hashMap3 = hashMap0;
                                        h2 = h0;
                                        h5 = h1;
                                        v7 = v;
                                        v8 = v1;
                                        v9 = v2;
                                    }
                                    h3 = h5;
                                    hashMap1 = hashMap3;
                                }
                                else {
                                    v5 = v3;
                                    v6 = v4;
                                    z2 = z0;
                                    h2 = h0;
                                    v7 = v;
                                    v8 = v1;
                                    v9 = v2;
                                    hashMap1 = hashMap0;
                                    Object object4 = hashMap1.get(((C)object1));
                                    G0 g01 = ((C)object1).Z;
                                    if(g01 == null) {
                                        g01 = z2;
                                    }
                                    if(g01.a(((C)object1).m().f, object4)) {
                                        h3 = h1;
                                        d0.c(((C)object1));
                                    }
                                    else {
                                        h3 = h1;
                                        Object object5 = ((B)h3.Y).e(((C)object1));
                                        if(object5 != null) {
                                            if(object5 instanceof E) {
                                                Object[] arr_object6 = ((E)object5).b;
                                                long[] arr_v5 = ((E)object5).a;
                                                int v24 = arr_v5.length - 2;
                                                if(v24 >= 0) {
                                                    int v25 = 0;
                                                    while(true) {
                                                        long v26 = arr_v5[v25];
                                                        if((~v26 << 7 & v26 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                            goto label_200;
                                                        }
                                                        int v27 = 8 - (~(v25 - v24) >>> 0x1F);
                                                        for(int v28 = 0; v28 < v27; ++v28) {
                                                            if((v26 & 0xFFL) < 0x80L) {
                                                                e0.a(arr_object6[(v25 << 3) + v28]);
                                                                z1 = true;
                                                            }
                                                            v26 >>= 8;
                                                        }
                                                        if(v27 == 8) {
                                                        label_200:
                                                            if(v25 != v24) {
                                                                ++v25;
                                                                continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                            else {
                                                e0.a(object5);
                                                z1 = true;
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                            label_209:
                                v5 = v3;
                                v6 = v4;
                                hashMap1 = hashMap0;
                                z2 = z0;
                                h2 = h0;
                                h3 = h1;
                                v7 = v;
                                v8 = v1;
                                v9 = v2;
                            }
                            Object object6 = ((B)h3.Y).e(object0);
                            if(object6 != null) {
                                if(object6 instanceof E) {
                                    Object[] arr_object7 = ((E)object6).b;
                                    long[] arr_v6 = ((E)object6).a;
                                    int v29 = arr_v6.length - 2;
                                    if(v29 >= 0) {
                                        int v30 = 0;
                                        while(true) {
                                            long v31 = arr_v6[v30];
                                            if((~v31 << 7 & v31 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                goto label_238;
                                            }
                                            int v32 = 8 - (~(v30 - v29) >>> 0x1F);
                                            for(int v33 = 0; v33 < v32; ++v33) {
                                                if((v31 & 0xFFL) < 0x80L) {
                                                    e0.a(arr_object7[(v30 << 3) + v33]);
                                                    z1 = true;
                                                }
                                                v31 >>= 8;
                                            }
                                            if(v32 == 8) {
                                            label_238:
                                                if(v30 != v29) {
                                                    ++v30;
                                                    continue;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                                else {
                                    e0.a(object6);
                                    z1 = true;
                                }
                            }
                        }
                        else {
                            v5 = v3;
                            v6 = v4;
                            hashMap1 = hashMap0;
                            arr_object1 = arr_object;
                            z2 = z0;
                            h2 = h0;
                            h3 = h1;
                            v7 = v;
                            v8 = v1;
                            v9 = v2;
                        }
                    label_254:
                        v2 = v9 >> 8;
                        h1 = h3;
                        v4 = v6 + 1;
                        arr_object = arr_object1;
                        z0 = z2;
                        h0 = h2;
                        v1 = v8;
                        v = v7;
                        hashMap0 = hashMap1;
                        v3 = v5;
                    }
                    Object[] arr_object8 = arr_object;
                    Z z3 = z0;
                    h h6 = h0;
                    HashMap hashMap4 = hashMap0;
                    h7 = h1;
                    if(v3 == 8) {
                        int v34 = v1;
                        v = v;
                        goto label_280;
                    label_274:
                        hashMap4 = hashMap0;
                        arr_object8 = arr_object;
                        z3 = z0;
                        h6 = h0;
                        h7 = h1;
                        v34 = v1;
                    label_280:
                        if(v34 != v) {
                            v1 = v34 + 1;
                            arr_v = arr_v;
                            h1 = h7;
                            arr_object = arr_object8;
                            z0 = z3;
                            h0 = h6;
                            hashMap0 = hashMap4;
                            continue;
                        }
                    }
                    break;
                }
            }
            else {
                h7 = h1;
                z1 = false;
            }
        }
        else {
            HashMap hashMap5 = hashMap0;
            h h8 = h0;
            h7 = h1;
            z1 = false;
            Iterator iterator0 = set0.iterator();
            while(iterator0.hasNext()) {
                Object object7 = iterator0.next();
                if(!(object7 instanceof u) || ((u)object7).h(2)) {
                    h h10 = h8;
                    if(((B)h10.Y).b(object7)) {
                        Object object8 = ((B)h10.Y).e(object7);
                        if(object8 == null) {
                            iterator1 = iterator0;
                            h9 = h7;
                            object12 = object7;
                            h8 = h10;
                        }
                        else if(object8 instanceof E) {
                            Object[] arr_object9 = ((E)object8).b;
                            long[] arr_v7 = ((E)object8).a;
                            int v35 = arr_v7.length - 2;
                            if(v35 >= 0) {
                                int v36 = 0;
                                while(true) {
                                    long v37 = arr_v7[v36];
                                    if((~v37 << 7 & v37 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_409;
                                    }
                                    int v38 = 8 - (~(v36 - v35) >>> 0x1F);
                                    int v39 = 0;
                                    while(v39 < v38) {
                                        if((v37 & 0xFFL) < 0x80L) {
                                            C c1 = (C)arr_object9[(v36 << 3) + v39];
                                            iterator2 = iterator0;
                                            j.d(c1, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                            Object object9 = hashMap5.get(c1);
                                            h11 = h10;
                                            G0 g02 = c1.Z;
                                            arr_v8 = arr_v7;
                                            if(g02 == null) {
                                                g02 = z0;
                                            }
                                            if(g02.a(c1.m().f, object9)) {
                                                hashMap6 = hashMap5;
                                                h12 = h7;
                                                object11 = object7;
                                                arr_object12 = arr_object9;
                                                d0.c(c1);
                                            }
                                            else {
                                                Object object10 = ((B)h7.Y).e(c1);
                                                if(object10 == null) {
                                                label_372:
                                                    hashMap6 = hashMap5;
                                                    h12 = h7;
                                                    object11 = object7;
                                                    arr_object12 = arr_object9;
                                                }
                                                else if(object10 instanceof E) {
                                                    Object[] arr_object10 = ((E)object10).b;
                                                    long[] arr_v9 = ((E)object10).a;
                                                    int v40 = arr_v9.length - 2;
                                                    if(v40 >= 0) {
                                                        h12 = h7;
                                                        object11 = object7;
                                                        int v41 = 0;
                                                        while(true) {
                                                            long v42 = arr_v9[v41];
                                                            hashMap6 = hashMap5;
                                                            if((~v42 << 7 & v42 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                                goto label_358;
                                                            }
                                                            int v43 = 8 - (~(v41 - v40) >>> 0x1F);
                                                            int v44 = 0;
                                                            while(v44 < v43) {
                                                                if((v42 & 0xFFL) < 0x80L) {
                                                                    arr_object11 = arr_object9;
                                                                    e0.a(arr_object10[(v41 << 3) + v44]);
                                                                    z1 = true;
                                                                }
                                                                else {
                                                                    arr_object11 = arr_object9;
                                                                }
                                                                v42 >>= 8;
                                                                ++v44;
                                                                arr_object9 = arr_object11;
                                                            }
                                                            arr_object12 = arr_object9;
                                                            if(v43 == 8) {
                                                                goto label_359;
                                                            label_358:
                                                                arr_object12 = arr_object9;
                                                            label_359:
                                                                if(v41 != v40) {
                                                                    ++v41;
                                                                    arr_v9 = arr_v9;
                                                                    arr_object9 = arr_object12;
                                                                    hashMap5 = hashMap6;
                                                                    continue;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    else {
                                                        goto label_372;
                                                    }
                                                }
                                                else {
                                                    hashMap6 = hashMap5;
                                                    h12 = h7;
                                                    object11 = object7;
                                                    arr_object12 = arr_object9;
                                                    e0.a(object10);
                                                    z1 = true;
                                                }
                                            }
                                        }
                                        else {
                                            hashMap6 = hashMap5;
                                            iterator2 = iterator0;
                                            h12 = h7;
                                            object11 = object7;
                                            h11 = h10;
                                            arr_v8 = arr_v7;
                                            arr_object12 = arr_object9;
                                        }
                                        v37 >>= 8;
                                        ++v39;
                                        iterator0 = iterator2;
                                        arr_v7 = arr_v8;
                                        h10 = h11;
                                        object7 = object11;
                                        arr_object9 = arr_object12;
                                        h7 = h12;
                                        hashMap5 = hashMap6;
                                    }
                                    hashMap7 = hashMap5;
                                    iterator1 = iterator0;
                                    h13 = h7;
                                    object12 = object7;
                                    h8 = h10;
                                    long[] arr_v10 = arr_v7;
                                    Object[] arr_object13 = arr_object9;
                                    if(v38 == 8) {
                                        goto label_416;
                                    label_409:
                                        hashMap7 = hashMap5;
                                        iterator1 = iterator0;
                                        h13 = h7;
                                        object12 = object7;
                                        h8 = h10;
                                        arr_v10 = arr_v7;
                                        arr_object13 = arr_object9;
                                    label_416:
                                        if(v36 != v35) {
                                            ++v36;
                                            iterator0 = iterator1;
                                            arr_v7 = arr_v10;
                                            h10 = h8;
                                            object7 = object12;
                                            arr_object9 = arr_object13;
                                            h7 = h13;
                                            hashMap5 = hashMap7;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                hashMap7 = hashMap5;
                                iterator1 = iterator0;
                                h13 = h7;
                                object12 = object7;
                                h8 = h10;
                            }
                            h9 = h13;
                            hashMap5 = hashMap7;
                        }
                        else {
                            iterator1 = iterator0;
                            object12 = object7;
                            h8 = h10;
                            Object object13 = hashMap5.get(((C)object8));
                            G0 g03 = ((C)object8).Z;
                            if(g03 == null) {
                                g03 = z0;
                            }
                            if(g03.a(((C)object8).m().f, object13)) {
                                h9 = h7;
                                d0.c(((C)object8));
                            }
                            else {
                                h9 = h7;
                                Object object14 = ((B)h9.Y).e(((C)object8));
                                if(object14 != null) {
                                    if(object14 instanceof E) {
                                        Object[] arr_object14 = ((E)object14).b;
                                        long[] arr_v11 = ((E)object14).a;
                                        int v45 = arr_v11.length - 2;
                                        if(v45 >= 0) {
                                            int v46 = 0;
                                            while(true) {
                                                long v47 = arr_v11[v46];
                                                if((~v47 << 7 & v47 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                    goto label_463;
                                                }
                                                int v48 = 8 - (~(v46 - v45) >>> 0x1F);
                                                for(int v49 = 0; v49 < v48; ++v49) {
                                                    if((v47 & 0xFFL) < 0x80L) {
                                                        e0.a(arr_object14[(v46 << 3) + v49]);
                                                        z1 = true;
                                                    }
                                                    v47 >>= 8;
                                                }
                                                if(v48 == 8) {
                                                label_463:
                                                    if(v46 != v45) {
                                                        ++v46;
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        e0.a(object14);
                                        z1 = true;
                                    }
                                }
                            }
                        }
                    }
                    else {
                        iterator1 = iterator0;
                        h9 = h7;
                        object12 = object7;
                        h8 = h10;
                    }
                    Object object15 = ((B)h9.Y).e(object12);
                    if(object15 != null) {
                        if(object15 instanceof E) {
                            Object[] arr_object15 = ((E)object15).b;
                            long[] arr_v12 = ((E)object15).a;
                            int v50 = arr_v12.length - 2;
                            if(v50 >= 0) {
                                int v51 = 0;
                                while(true) {
                                    long v52 = arr_v12[v51];
                                    if((~v52 << 7 & v52 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_496;
                                    }
                                    int v53 = 8 - (~(v51 - v50) >>> 0x1F);
                                    for(int v54 = 0; v54 < v53; ++v54) {
                                        if((v52 & 0xFFL) < 0x80L) {
                                            e0.a(arr_object15[(v51 << 3) + v54]);
                                            z1 = true;
                                        }
                                        v52 >>= 8;
                                    }
                                    if(v53 == 8) {
                                    label_496:
                                        if(v51 != v50) {
                                            ++v51;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        else {
                            e0.a(object15);
                            z1 = true;
                        }
                    }
                }
                else {
                    iterator1 = iterator0;
                    h9 = h7;
                }
                h7 = h9;
                iterator0 = iterator1;
            }
        }
        h h14 = h7;
        if(d0.n()) {
            int v55 = d0.Z;
            if(v55 > 0) {
                Object[] arr_object16 = d0.X;
                int v56 = 0;
                while(true) {
                    C c2 = (C)arr_object16[v56];
                    int v57 = m.k().d();
                    Object object16 = ((B)h14.Y).e(c2);
                    if(object16 == null) {
                        h16 = h14;
                        arr_object19 = arr_object16;
                    }
                    else {
                        B b0 = this.f;
                        if(object16 instanceof E) {
                            Object[] arr_object17 = ((E)object16).b;
                            long[] arr_v13 = ((E)object16).a;
                            int v58 = arr_v13.length - 2;
                            if(v58 >= 0) {
                                int v59 = 0;
                                while(true) {
                                    long v60 = arr_v13[v59];
                                    if((~v60 << 7 & v60 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_549;
                                    }
                                    int v61 = 8 - (~(v59 - v58) >>> 0x1F);
                                    int v62 = 0;
                                    while(v62 < v61) {
                                        if((v60 & 0xFFL) < 0x80L) {
                                            h15 = h14;
                                            Object object17 = arr_object17[(v59 << 3) + v62];
                                            y y0 = (y)b0.e(object17);
                                            arr_object18 = arr_object16;
                                            if(y0 == null) {
                                                y1 = new y();
                                                b0.i(object17, y1);
                                            }
                                            else {
                                                y1 = y0;
                                            }
                                            this.c(c2, v57, object17, y1);
                                        }
                                        else {
                                            h15 = h14;
                                            arr_object18 = arr_object16;
                                        }
                                        v60 >>= 8;
                                        ++v62;
                                        arr_object16 = arr_object18;
                                        h14 = h15;
                                    }
                                    h16 = h14;
                                    arr_object19 = arr_object16;
                                    if(v61 == 8) {
                                        goto label_551;
                                    label_549:
                                        h16 = h14;
                                        arr_object19 = arr_object16;
                                    label_551:
                                        if(v59 != v58) {
                                            ++v59;
                                            arr_object16 = arr_object19;
                                            h14 = h16;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                h16 = h14;
                                arr_object19 = arr_object16;
                            }
                        }
                        else {
                            h16 = h14;
                            arr_object19 = arr_object16;
                            y y2 = (y)b0.e(object16);
                            if(y2 == null) {
                                y2 = new y();
                                b0.i(object16, y2);
                            }
                            this.c(c2, v57, object16, y2);
                        }
                    }
                    ++v56;
                    if(v56 >= v55) {
                        break;
                    }
                    arr_object16 = arr_object19;
                    h14 = h16;
                }
            }
            d0.i();
        }
        return z1;
    }

    public final void c(Object object0, int v, Object object1, y y0) {
        int v2;
        if(this.j > 0) {
            return;
        }
        int v1 = y0.b(object0);
        if(v1 < 0) {
            v1 = ~v1;
            v2 = -1;
        }
        else {
            v2 = y0.c[v1];
        }
        y0.b[v1] = object0;
        y0.c[v1] = v;
        if(!(object0 instanceof C) || v2 == v) {
        label_38:
            if(v2 == -1) {
                if(object0 instanceof u) {
                    ((u)object0).j(2);
                }
                this.e.h(object0, object1);
            }
        }
        else {
            U.B b0 = ((C)object0).m();
            this.l.put(object0, b0.f);
            y y1 = b0.e;
            h h0 = this.k;
            h0.u(object0);
            Object[] arr_object = y1.b;
            long[] arr_v = y1.a;
            int v3 = arr_v.length - 2;
            if(v3 >= 0) {
                int v4 = 0;
                while(true) {
                    long v5 = arr_v[v4];
                    if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_35;
                    }
                    int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                    for(int v7 = 0; v7 < v6; ++v7) {
                        if((v5 & 0xFFL) < 0x80L) {
                            t t0 = (t)arr_object[(v4 << 3) + v7];
                            if(t0 instanceof u) {
                                ((u)t0).j(2);
                            }
                            h0.h(t0, object0);
                        }
                        v5 >>= 8;
                    }
                    if(v6 == 8) {
                    label_35:
                        if(v4 != v3) {
                            ++v4;
                            continue;
                        }
                    }
                    goto label_38;
                }
            }
            else {
                goto label_38;
            }
        }
    }

    public final void d(Object object0, Object object1) {
        this.e.t(object1, object0);
        if(object1 instanceof C && !((B)this.e.Y).b(object1)) {
            this.k.u(object1);
            this.l.remove(object1);
        }
    }

    public final void e() {
        int v17;
        long[] arr_v4;
        e e2;
        int v16;
        int v14;
        int v10;
        int v7;
        long[] arr_v3;
        e e1;
        e e0 = e.e0;
        B b0 = this.f;
        long[] arr_v = b0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    e2 = e0;
                    arr_v4 = arr_v;
                }
                else {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object0 = b0.b[v5];
                            y y0 = (y)b0.c[v5];
                            Boolean boolean0 = (Boolean)e0.n(object0);
                            if(boolean0.booleanValue()) {
                                Object[] arr_object = y0.b;
                                int[] arr_v1 = y0.c;
                                long[] arr_v2 = y0.a;
                                int v6 = arr_v2.length - 2;
                                e1 = e0;
                                arr_v3 = arr_v;
                                v7 = v;
                                if(v6 >= 0) {
                                    int v8 = 0;
                                    while(true) {
                                        long v9 = arr_v2[v8];
                                        v10 = v3;
                                        if((~v9 << 7 & v9 & 0x8080808080808080L) == 0x8080808080808080L) {
                                            goto label_47;
                                        }
                                        int v11 = 8 - (~(v8 - v6) >>> 0x1F);
                                        int v12 = 0;
                                        while(v12 < v11) {
                                            if((v9 & 0xFFL) < 0x80L) {
                                                int v13 = (v8 << 3) + v12;
                                                v14 = v1;
                                                Object object1 = arr_object[v13];
                                                int v15 = arr_v1[v13];
                                                this.d(object0, object1);
                                            }
                                            else {
                                                v14 = v1;
                                            }
                                            v9 >>= 8;
                                            ++v12;
                                            v1 = v14;
                                        }
                                        v16 = v1;
                                        if(v11 == 8) {
                                            goto label_48;
                                        label_47:
                                            v16 = v1;
                                        label_48:
                                            if(v8 != v6) {
                                                ++v8;
                                                v3 = v10;
                                                arr_v2 = arr_v2;
                                                v1 = v16;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                                else {
                                    v16 = v1;
                                    v10 = v3;
                                }
                            }
                            else {
                                e1 = e0;
                                arr_v3 = arr_v;
                                v7 = v;
                                v16 = v1;
                                v10 = v3;
                            }
                            if(boolean0.booleanValue()) {
                                b0.h(v5);
                            }
                        }
                        else {
                            e1 = e0;
                            arr_v3 = arr_v;
                            v7 = v;
                            v16 = v1;
                            v10 = v3;
                        }
                        v2 >>= 8;
                        ++v4;
                        e0 = e1;
                        arr_v = arr_v3;
                        v = v7;
                        v3 = v10;
                        v1 = v16;
                    }
                    e2 = e0;
                    arr_v4 = arr_v;
                    if(v3 != 8) {
                        break;
                    }
                    v = v;
                }
                v17 = v1;
                if(v17 == v) {
                    break;
                }
                v1 = v17 + 1;
                e0 = e2;
                arr_v = arr_v4;
            }
        }
    }
}

