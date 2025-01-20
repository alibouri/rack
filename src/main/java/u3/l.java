package u3;

import E3.d;
import E3.g;
import F3.a;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import m5.b;
import t3.p;
import z3.k;

public final class l extends e {
    public final k h;
    public final Path i;
    public ArrayList j;

    public l(List list0) {
        super(list0);
        this.h = new k();
        this.i = new Path();
    }

    @Override  // u3.e
    public final Object e(a a0, float f) {
        int v12;
        k k4;
        int v11;
        int v10;
        ArrayList arrayList7;
        l l0 = this;
        k k0 = (k)a0.b;
        k k1 = (k)a0.c;
        if(k1 == null) {
            k1 = k0;
        }
        k k2 = l0.h;
        if(k2.b == null) {
            k2.b = new PointF();
        }
        k2.c = k0.c || k1.c;
        ArrayList arrayList0 = k0.a;
        ArrayList arrayList1 = k1.a;
        if(arrayList0.size() != k1.a.size()) {
            d.b(("Curves must have the same number of control points. Shape 1: " + arrayList0.size() + "\tShape 2: " + arrayList1.size()));
        }
        int v = Math.min(arrayList0.size(), arrayList1.size());
        ArrayList arrayList2 = k2.a;
        if(arrayList2.size() < v) {
            for(int v1 = arrayList2.size(); v1 < v; ++v1) {
                arrayList2.add(new x3.a());
            }
        }
        else if(arrayList2.size() > v) {
            for(int v2 = arrayList2.size() - 1; v2 >= v; --v2) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        k2.a(g.e(k0.b.x, k1.b.x, f), g.e(k0.b.y, k1.b.y, f));
        for(int v3 = arrayList2.size() - 1; v3 >= 0; --v3) {
            x3.a a1 = (x3.a)arrayList0.get(v3);
            x3.a a2 = (x3.a)arrayList1.get(v3);
            ((x3.a)arrayList2.get(v3)).a.set(g.e(a1.a.x, a2.a.x, f), g.e(a1.a.y, a2.a.y, f));
            ((x3.a)arrayList2.get(v3)).b.set(g.e(a1.b.x, a2.b.x, f), g.e(a1.b.y, a2.b.y, f));
            ((x3.a)arrayList2.get(v3)).c.set(g.e(a1.c.x, a2.c.x, f), g.e(a1.c.y, a2.c.y, f));
        }
        ArrayList arrayList3 = l0.j;
        if(arrayList3 != null) {
            int v4 = arrayList3.size() - 1;
            while(v4 >= 0) {
                p p0 = (p)l0.j.get(v4);
                p0.getClass();
                ArrayList arrayList4 = k2.a;
                if(arrayList4.size() > 2) {
                    float f1 = (float)(((Float)p0.b.d()));
                    if(f1 != 0.0f) {
                        boolean z = k2.c;
                        int v5 = arrayList4.size() - 1;
                        int v6 = 0;
                        while(v5 >= 0) {
                            x3.a a3 = (x3.a)arrayList4.get(v5);
                            x3.a a4 = (x3.a)arrayList4.get(p.d(v5 - 1, arrayList4.size()));
                            PointF pointF0 = v5 != 0 || z ? a4.c : k2.b;
                            boolean z1 = !k2.c && (v5 == 0 || v5 == arrayList4.size() - 1);
                            v6 = !(v5 != 0 || z ? a4.b : pointF0).equals(pointF0) || !a3.a.equals(pointF0) || z1 ? v6 + 1 : v6 + 2;
                            --v5;
                        }
                        if(p0.c == null || p0.c.a.size() != v6) {
                            ArrayList arrayList5 = new ArrayList(v6);
                            for(int v7 = 0; v7 < v6; ++v7) {
                                arrayList5.add(new x3.a());
                            }
                            p0.c = new k(new PointF(0.0f, 0.0f), false, arrayList5);
                        }
                        k k3 = p0.c;
                        k3.c = z;
                        k3.a(k2.b.x, k2.b.y);
                        ArrayList arrayList6 = k3.a;
                        boolean z2 = k2.c;
                        int v8 = 0;
                        int v9 = 0;
                        while(v8 < arrayList4.size()) {
                            x3.a a5 = (x3.a)arrayList4.get(v8);
                            x3.a a6 = (x3.a)arrayList4.get(p.d(v8 - 1, arrayList4.size()));
                            PointF pointF1 = v8 != 0 || z2 ? a6.c : k2.b;
                            PointF pointF2 = ((x3.a)arrayList4.get(p.d(v8 - 2, arrayList4.size()))).c;
                            boolean z3 = !k2.c && (v8 == 0 || v8 == arrayList4.size() - 1);
                            if(!(v8 != 0 || z2 ? a6.b : pointF1).equals(pointF1) || !a5.a.equals(pointF1) || z3) {
                                v10 = v4;
                                arrayList7 = arrayList4;
                                k4 = k2;
                                v11 = v8;
                                x3.a a10 = (x3.a)arrayList6.get(p.d(v9 - 1, arrayList6.size()));
                                x3.a a11 = (x3.a)arrayList6.get(v9);
                                a10.b.set(a6.b.x, a6.b.y);
                                a10.c.set(a6.c.x, a6.c.y);
                                a11.a.set(a5.a.x, a5.a.y);
                                ++v9;
                            }
                            else {
                                arrayList7 = arrayList4;
                                v10 = v4;
                                v11 = v8;
                                float f2 = (float)Math.hypot(a5.c.x - pointF1.x, a5.c.y - pointF1.y);
                                float f3 = Math.min(f1 / ((float)Math.hypot(pointF1.x - pointF2.x, pointF1.y - pointF2.y)), 0.5f);
                                float f4 = Math.min(f1 / f2, 0.5f);
                                float f5 = b.o(pointF2.x, pointF1.x, f3, pointF1.x);
                                float f6 = b.o(pointF2.y, pointF1.y, f3, pointF1.y);
                                float f7 = b.o(a5.c.x, pointF1.x, f4, pointF1.x);
                                float f8 = b.o(a5.c.y, pointF1.y, f4, pointF1.y);
                                float f9 = f5 - (f5 - pointF1.x) * 0.5519f;
                                float f10 = f6 - (f6 - pointF1.y) * 0.5519f;
                                float f11 = f7 - (f7 - pointF1.x) * 0.5519f;
                                float f12 = f8 - (f8 - pointF1.y) * 0.5519f;
                                x3.a a7 = (x3.a)arrayList6.get(p.d(v9 - 1, arrayList6.size()));
                                x3.a a8 = (x3.a)arrayList6.get(v9);
                                k4 = k2;
                                a7.b.set(f5, f6);
                                a7.c.set(f5, f6);
                                if(v11 == 0) {
                                    k3.a(f5, f6);
                                }
                                a8.a.set(f9, f10);
                                x3.a a9 = (x3.a)arrayList6.get(v9 + 1);
                                a8.b.set(f11, f12);
                                a8.c.set(f7, f8);
                                a9.a.set(f7, f8);
                                v9 += 2;
                            }
                            v8 = v11 + 1;
                            z2 = z2;
                            arrayList4 = arrayList7;
                            v4 = v10;
                            k2 = k4;
                        }
                        v12 = v4;
                        k2 = k3;
                    }
                }
                else {
                    v12 = v4;
                }
                v4 = v12 - 1;
                l0 = this;
            }
        }
        Object object0 = this.i;
        ((Path)object0).reset();
        PointF pointF3 = k2.b;
        ((Path)object0).moveTo(pointF3.x, pointF3.y);
        PointF pointF4 = g.a;
        pointF4.set(pointF3.x, pointF3.y);
        for(int v13 = 0; true; ++v13) {
            ArrayList arrayList8 = k2.a;
            if(v13 >= arrayList8.size()) {
                break;
            }
            x3.a a12 = (x3.a)arrayList8.get(v13);
            PointF pointF5 = a12.a;
            boolean z4 = pointF5.equals(pointF4);
            PointF pointF6 = a12.b;
            PointF pointF7 = a12.c;
            if(!z4 || !pointF6.equals(pointF7)) {
                ((Path)object0).cubicTo(pointF5.x, pointF5.y, pointF6.x, pointF6.y, pointF7.x, pointF7.y);
            }
            else {
                ((Path)object0).lineTo(pointF7.x, pointF7.y);
            }
            pointF4.set(pointF7.x, pointF7.y);
        }
        if(k2.c) {
            ((Path)object0).close();
        }
        return object0;
    }

    @Override  // u3.e
    public final boolean h() {
        return this.j != null && !this.j.isEmpty();
    }
}

