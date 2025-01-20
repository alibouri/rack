package p1;

import java.util.ArrayList;
import m5.b;
import o1.c;

public final class d extends o {
    public final ArrayList k;
    public int l;

    public d(o1.d d0, int v) {
        super(d0);
        k k1;
        k k0;
        o1.d d3;
        this.k = new ArrayList();
        this.f = v;
        o1.d d1 = this.b;
        for(o1.d d2 = d1.n(v); true; d2 = d1.n(this.f)) {
            d3 = d1;
            d1 = d2;
            if(d1 == null) {
                break;
            }
        }
        this.b = d3;
        int v1 = this.f;
        if(v1 == 0) {
            k0 = d3.d;
        }
        else if(v1 == 1) {
            k0 = d3.e;
        }
        else {
            k0 = null;
        }
        ArrayList arrayList0 = this.k;
        arrayList0.add(k0);
        for(o1.d d4 = d3.m(this.f); d4 != null; d4 = d4.m(this.f)) {
            int v2 = this.f;
            if(v2 == 0) {
                k1 = d4.d;
            }
            else if(v2 == 1) {
                k1 = d4.e;
            }
            else {
                k1 = null;
            }
            arrayList0.add(k1);
        }
        for(Object object0: arrayList0) {
            o o0 = (o)object0;
            int v3 = this.f;
            if(v3 == 0) {
                o0.b.b = this;
            }
            else if(v3 == 1) {
                o0.b.c = this;
            }
        }
        if(this.f == 0 && this.b.U.w0 && arrayList0.size() > 1) {
            this.b = ((o)b.r(1, arrayList0)).b;
        }
        this.l = this.f == 0 ? this.b.j0 : this.b.k0;
    }

    @Override  // p1.e
    public final void a(e e0) {
        int v33;
        int v31;
        int v30;
        ArrayList arrayList2;
        boolean z2;
        int v28;
        float f5;
        int v25;
        int v24;
        int v23;
        boolean z1;
        int v18;
        int v17;
        int v16;
        ArrayList arrayList1;
        int v15;
        int v10;
        float f2;
        int v7;
        int v3;
        f f0 = this.h;
        if(f0.j) {
            f f1 = this.i;
            if(f1.j) {
                o1.e e1 = this.b.U;
                boolean z = e1 instanceof o1.e ? e1.w0 : false;
                int v = f1.g - f0.g;
                ArrayList arrayList0 = this.k;
                int v1 = arrayList0.size();
                int v2;
                for(v2 = 0; true; ++v2) {
                    v3 = -1;
                    if(v2 >= v1) {
                        v2 = -1;
                        break;
                    }
                    if(((o)arrayList0.get(v2)).b.h0 != 8) {
                        break;
                    }
                }
                int v4 = v1 - 1;
                while(v4 >= 0) {
                    if(((o)arrayList0.get(v4)).b.h0 == 8) {
                        --v4;
                    }
                    else {
                        v3 = v4;
                        if(true) {
                            break;
                        }
                    }
                }
                int v5 = 0;
                while(v5 < 2) {
                    int v6 = 0;
                    v7 = 0;
                    int v8 = 0;
                    int v9 = 0;
                    f2 = 0.0f;
                    while(v6 < v1) {
                        o o0 = (o)arrayList0.get(v6);
                        o1.d d0 = o0.b;
                        if(d0.h0 == 8) {
                            v10 = v2;
                        }
                        else {
                            ++v9;
                            if(v6 > 0 && v6 >= v2) {
                                v7 += o0.h.f;
                            }
                            g g0 = o0.e;
                            int v11 = g0.g;
                            v10 = v2;
                            int v12 = o0.d == 3 ? 0 : 1;
                            int v13 = 0;
                            if(v12 != 0) {
                                int v14 = this.f;
                                if(v14 == 0 && !d0.d.e.j) {
                                    return;
                                }
                                if(v14 == 1 && !d0.e.e.j) {
                                    return;
                                }
                                v13 = v12;
                            }
                            else if(o0.a == 1 && v5 == 0) {
                                v15 = g0.m;
                                ++v8;
                                v13 = 1;
                                goto label_63;
                            }
                            else if(g0.j) {
                                v15 = v11;
                                v13 = 1;
                                goto label_63;
                            }
                            v15 = v11;
                        label_63:
                            if(v13 == 0) {
                                ++v8;
                                float f3 = d0.l0[this.f];
                                if(f3 >= 0.0f) {
                                    f2 += f3;
                                }
                            }
                            else {
                                v7 += v15;
                            }
                            if(v6 < v1 - 1 && v6 < v3) {
                                v7 -= o0.i.f;
                            }
                        }
                        ++v6;
                        arrayList0 = arrayList0;
                        v2 = v10;
                    }
                    arrayList1 = arrayList0;
                    v16 = v2;
                    if(v7 < v || v8 == 0) {
                        v17 = v8;
                        v18 = v9;
                    }
                    else {
                        ++v5;
                        arrayList0 = arrayList1;
                        v2 = v16;
                        continue;
                    }
                    goto label_92;
                }
                arrayList1 = arrayList0;
                v16 = v2;
                v17 = 0;
                v18 = 0;
                v7 = 0;
                f2 = 0.0f;
            label_92:
                int v19 = z ? f1.g : f0.g;
                if(v7 > v) {
                    v19 = z ? v19 + ((int)(((float)(v7 - v)) / 2.0f + 0.5f)) : v19 - ((int)(((float)(v7 - v)) / 2.0f + 0.5f));
                }
                if(v17 > 0) {
                    float f4 = (float)(v - v7);
                    int v20 = (int)(f4 / ((float)v17) + 0.5f);
                    int v21 = 0;
                    int v22 = 0;
                    while(v21 < v1) {
                        o o1 = (o)arrayList1.get(v21);
                        o1.d d1 = o1.b;
                        if(d1.h0 == 8 || o1.d != 3) {
                            z1 = z;
                            f5 = f4;
                        }
                        else {
                            g g1 = o1.e;
                            if(!g1.j) {
                                if(f2 > 0.0f) {
                                    z1 = z;
                                    v23 = (int)(d1.l0[this.f] * f4 / f2 + 0.5f);
                                }
                                else {
                                    z1 = z;
                                    v23 = v20;
                                }
                                if(this.f == 0) {
                                    v24 = d1.w;
                                    v25 = d1.v;
                                }
                                else {
                                    v24 = d1.z;
                                    v25 = d1.y;
                                }
                                f5 = f4;
                                int v26 = o1.a == 1 ? Math.min(v23, g1.m) : v23;
                                int v27 = v24 <= 0 ? Math.max(v25, v26) : Math.min(v24, Math.max(v25, v26));
                                if(v27 != v23) {
                                    ++v22;
                                    v23 = v27;
                                }
                                g1.d(v23);
                            }
                        }
                        ++v21;
                        v20 = v20;
                        v7 = v7;
                        v19 = v19;
                        z = z1;
                        f4 = f5;
                        arrayList1 = arrayList1;
                    }
                    v28 = v19;
                    z2 = z;
                    arrayList2 = arrayList1;
                    if(v22 > 0) {
                        v17 -= v22;
                        int v29 = 0;
                        v7 = 0;
                        while(v29 < v1) {
                            o o2 = (o)arrayList2.get(v29);
                            if(o2.b.h0 == 8) {
                                v30 = v16;
                            }
                            else {
                                v30 = v16;
                                if(v29 > 0 && v29 >= v30) {
                                    v7 += o2.h.f;
                                }
                                v7 += o2.e.g;
                                if(v29 < v1 - 1 && v29 < v3) {
                                    v7 -= o2.i.f;
                                }
                            }
                            ++v29;
                            v16 = v30;
                        }
                        v31 = v16;
                    }
                    else {
                        v31 = v16;
                        v7 = v7;
                    }
                    if(this.l == 2 && v22 == 0) {
                        this.l = 0;
                    }
                }
                else {
                    v28 = v19;
                    z2 = z;
                    arrayList2 = arrayList1;
                    v31 = v16;
                }
                if(v7 > v) {
                    this.l = 2;
                }
                if(v18 > 0 && v17 == 0 && v31 == v3) {
                    this.l = 2;
                }
                int v32 = this.l;
                if(v32 == 1) {
                    if(v18 > 1) {
                        v33 = (v - v7) / (v18 - 1);
                    }
                    else {
                        v33 = v18 == 1 ? (v - v7) / 2 : 0;
                    }
                    if(v17 > 0) {
                        v33 = 0;
                    }
                    int v35 = v28;
                    for(int v34 = 0; v34 < v1; ++v34) {
                        o o3 = (o)arrayList2.get((z2 ? v1 - (v34 + 1) : v34));
                        f f6 = o3.i;
                        f f7 = o3.h;
                        if(o3.b.h0 == 8) {
                            f7.d(v35);
                            f6.d(v35);
                        }
                        else {
                            if(v34 > 0) {
                                v35 = z2 ? v35 - v33 : v35 + v33;
                            }
                            if(v34 > 0 && v34 >= v31) {
                                v35 = z2 ? v35 - f7.f : v35 + f7.f;
                            }
                            if(z2) {
                                f6.d(v35);
                            }
                            else {
                                f7.d(v35);
                            }
                            int v36 = o3.d != 3 || o3.a != 1 ? o3.e.g : o3.e.m;
                            v35 = z2 ? v35 - v36 : v35 + v36;
                            if(z2) {
                                f7.d(v35);
                            }
                            else {
                                f6.d(v35);
                            }
                            o3.g = true;
                            if(v34 < v1 - 1 && v34 < v3) {
                                v35 = z2 ? v35 - -f6.f : v35 - f6.f;
                            }
                        }
                    }
                    return;
                }
                if(v32 == 0) {
                    int v37 = (v - v7) / (v18 + 1);
                    if(v17 > 0) {
                        v37 = 0;
                    }
                    int v39 = v28;
                    for(int v38 = 0; v38 < v1; ++v38) {
                        o o4 = (o)arrayList2.get((z2 ? v1 - (v38 + 1) : v38));
                        f f8 = o4.i;
                        f f9 = o4.h;
                        if(o4.b.h0 == 8) {
                            f9.d(v39);
                            f8.d(v39);
                        }
                        else {
                            int v40 = z2 ? v39 - v37 : v39 + v37;
                            if(v38 > 0 && v38 >= v31) {
                                v40 = z2 ? v40 - f9.f : v40 + f9.f;
                            }
                            if(z2) {
                                f8.d(v40);
                            }
                            else {
                                f9.d(v40);
                            }
                            int v41 = o4.d != 3 || o4.a != 1 ? o4.e.g : Math.min(o4.e.g, o4.e.m);
                            v39 = z2 ? v40 - v41 : v40 + v41;
                            if(z2) {
                                f9.d(v39);
                            }
                            else {
                                f8.d(v39);
                            }
                            if(v38 < v1 - 1 && v38 < v3) {
                                v39 = z2 ? v39 - -f8.f : v39 - f8.f;
                            }
                        }
                    }
                    return;
                }
                if(v32 == 2) {
                    float f10 = this.f == 0 ? this.b.e0 : this.b.f0;
                    if(z2) {
                        f10 = 1.0f - f10;
                    }
                    int v42 = ((int)(((float)(v - v7)) * f10 + 0.5f)) >= 0 && v17 <= 0 ? ((int)(((float)(v - v7)) * f10 + 0.5f)) : 0;
                    int v43 = z2 ? v28 - v42 : v28 + v42;
                    for(int v44 = 0; v44 < v1; ++v44) {
                        o o5 = (o)arrayList2.get((z2 ? v1 - (v44 + 1) : v44));
                        f f11 = o5.i;
                        f f12 = o5.h;
                        if(o5.b.h0 == 8) {
                            f12.d(v43);
                            f11.d(v43);
                        }
                        else {
                            if(v44 > 0 && v44 >= v31) {
                                v43 = z2 ? v43 - f12.f : v43 + f12.f;
                            }
                            if(z2) {
                                f11.d(v43);
                            }
                            else {
                                f12.d(v43);
                            }
                            int v45 = o5.d != 3 || o5.a != 1 ? o5.e.g : o5.e.m;
                            v43 = z2 ? v43 - v45 : v43 + v45;
                            if(z2) {
                                f12.d(v43);
                            }
                            else {
                                f11.d(v43);
                            }
                            if(v44 < v1 - 1 && v44 < v3) {
                                v43 = z2 ? v43 - -f11.f : v43 - f11.f;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // p1.o
    public final void d() {
        ArrayList arrayList0 = this.k;
        for(Object object0: arrayList0) {
            ((o)object0).d();
        }
        int v = arrayList0.size();
        if(v < 1) {
            return;
        }
        o1.d d0 = ((o)arrayList0.get(0)).b;
        o1.d d1 = ((o)arrayList0.get(v - 1)).b;
        f f0 = this.i;
        f f1 = this.h;
        if(this.f == 0) {
            c c0 = d1.L;
            f f2 = o.i(d0.J, 0);
            int v1 = d0.J.e();
            o1.d d2 = this.m();
            if(d2 != null) {
                v1 = d2.J.e();
            }
            if(f2 != null) {
                o.b(f1, f2, v1);
            }
            f f3 = o.i(c0, 0);
            int v2 = c0.e();
            o1.d d3 = this.n();
            if(d3 != null) {
                v2 = d3.L.e();
            }
            if(f3 != null) {
                o.b(f0, f3, -v2);
            }
        }
        else {
            c c1 = d1.M;
            f f4 = o.i(d0.K, 1);
            int v3 = d0.K.e();
            o1.d d4 = this.m();
            if(d4 != null) {
                v3 = d4.K.e();
            }
            if(f4 != null) {
                o.b(f1, f4, v3);
            }
            f f5 = o.i(c1, 1);
            int v4 = c1.e();
            o1.d d5 = this.n();
            if(d5 != null) {
                v4 = d5.M.e();
            }
            if(f5 != null) {
                o.b(f0, f5, -v4);
            }
        }
        f1.a = this;
        f0.a = this;
    }

    @Override  // p1.o
    public final void e() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.k;
            if(v >= arrayList0.size()) {
                break;
            }
            ((o)arrayList0.get(v)).e();
        }
    }

    @Override  // p1.o
    public final void f() {
        this.c = null;
        for(Object object0: this.k) {
            ((o)object0).f();
        }
    }

    @Override  // p1.o
    public final long j() {
        ArrayList arrayList0 = this.k;
        int v = arrayList0.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            o o0 = (o)arrayList0.get(v2);
            long v3 = v1 + ((long)o0.h.f);
            long v4 = o0.j();
            v1 = ((long)o0.i.f) + (v4 + v3);
        }
        return v1;
    }

    @Override  // p1.o
    public final boolean k() {
        ArrayList arrayList0 = this.k;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((o)arrayList0.get(v1)).k()) {
                return false;
            }
        }
        return true;
    }

    public final o1.d m() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.k;
            if(v >= arrayList0.size()) {
                break;
            }
            o1.d d0 = ((o)arrayList0.get(v)).b;
            if(d0.h0 != 8) {
                return d0;
            }
        }
        return null;
    }

    public final o1.d n() {
        ArrayList arrayList0 = this.k;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            o1.d d0 = ((o)arrayList0.get(v)).b;
            if(d0.h0 != 8) {
                return d0;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChainRun ");
        stringBuilder0.append((this.f == 0 ? "horizontal : " : "vertical : "));
        for(Object object0: this.k) {
            stringBuilder0.append("<");
            stringBuilder0.append(((o)object0));
            stringBuilder0.append("> ");
        }
        return stringBuilder0.toString();
    }
}

