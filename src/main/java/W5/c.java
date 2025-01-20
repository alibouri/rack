package w5;

import Bb.n;
import Nb.j;
import W.d;
import android.content.Context;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import s.H;
import s.o;
import s.v;
import s.z;
import t5.b;
import y.u;
import z0.e;
import zb.a;

public final class c implements b {
    public final Object X;
    public final Object Y;
    public final Object Z;

    public c(LayoutCoordinates layoutCoordinates0) {
        this.X = layoutCoordinates0;
        this.Y = new u(1);
        this.Z = new v(10);
    }

    public c(g3.b b0, a a0, q8.b b1) {
        this.X = b0;
        this.Y = a0;
        this.Z = b1;
    }

    public void a(long v, List list0, boolean z) {
        long[] arr_v4;
        long[] arr_v3;
        e e0;
        Object object1;
        u u0 = (u)this.Y;
        v v1 = (v)this.Z;
        v1.e = 0;
        long[] arr_v = v1.a;
        if(arr_v != H.a) {
            n.p0(arr_v);
            int v2 = v1.d >> 3;
            v1.a[v2] |= 0xFFL << ((v1.d & 7) << 3);
        }
        n.o0(v1.c, null, 0, v1.d);
        v1.f = H.c(v1.d) - v1.e;
        int v3 = list0.size();
        u u1 = u0;
        int v4 = 0;
        boolean z1 = true;
        while(v4 < v3) {
            g0.n n0 = (g0.n)list0.get(v4);
            if(z1) {
                d d0 = u1.a;
                int v5 = d0.Z;
                if(v5 > 0) {
                    Object[] arr_object = d0.X;
                    int v6 = 0;
                    while(true) {
                        Object object0 = arr_object[v6];
                        if(j.a(((e)object0).b, n0)) {
                            object1 = object0;
                            goto label_30;
                        }
                        if(v6 + 1 >= v5) {
                            break;
                        }
                        ++v6;
                    }
                }
                object1 = null;
            label_30:
                e0 = (e)object1;
                if(e0 == null) {
                    z1 = false;
                }
                else {
                    e0.h = true;
                    e0.c.a(v);
                    Object object2 = v1.e(v);
                    if(object2 == null) {
                        object2 = new z();
                        v1.g(v, object2);
                    }
                    ((z)object2).a(e0);
                    goto label_49;
                }
            }
            e0 = new e(n0);
            e0.c.a(v);
            Object object3 = v1.e(v);
            if(object3 == null) {
                object3 = new z();
                v1.g(v, object3);
            }
            ((z)object3).a(e0);
            u1.a.c(e0);
        label_49:
            u1 = e0;
            ++v4;
        }
        if(z) {
            long[] arr_v1 = v1.b;
            Object[] arr_object1 = v1.c;
            long[] arr_v2 = v1.a;
            int v7 = arr_v2.length - 2;
            if(v7 >= 0) {
                int v8 = 0;
                while(true) {
                    long v9 = arr_v2[v8];
                    if((~v9 << 7 & v9 & 0x8080808080808080L) == 0x8080808080808080L) {
                        arr_v4 = arr_v1;
                    }
                    else {
                        int v10 = 8 - (~(v8 - v7) >>> 0x1F);
                        int v11 = 0;
                        while(v11 < v10) {
                            if((v9 & 0xFFL) < 0x80L) {
                                int v12 = (v8 << 3) + v11;
                                long v13 = arr_v1[v12];
                                z z2 = (z)arr_object1[v12];
                                d d1 = u0.a;
                                int v14 = d1.Z;
                                if(v14 > 0) {
                                    Object[] arr_object2 = d1.X;
                                    int v15 = 0;
                                    while(true) {
                                        ((e)arr_object2[v15]).i(v13, z2);
                                        arr_v3 = arr_v1;
                                        if(v15 + 1 >= v14) {
                                            goto label_82;
                                        }
                                        ++v15;
                                        arr_v1 = arr_v3;
                                    }
                                }
                                else {
                                    arr_v3 = arr_v1;
                                    goto label_82;
                                }
                                goto label_81;
                            }
                            else {
                            label_81:
                                arr_v3 = arr_v1;
                            }
                        label_82:
                            v9 >>= 8;
                            ++v11;
                            arr_v1 = arr_v3;
                        }
                        arr_v4 = arr_v1;
                        if(v10 != 8) {
                            break;
                        }
                    }
                    if(v8 == v7) {
                        break;
                    }
                    ++v8;
                    arr_v1 = arr_v4;
                }
            }
        }
    }

    public boolean b(d6.a a0, boolean z) {
        boolean z2;
        boolean z1;
        u u0 = (u)this.Y;
        if(!u0.a(((o)a0.Y), ((LayoutCoordinates)this.X), a0, z)) {
            return false;
        }
        d d0 = u0.a;
        int v = d0.Z;
        if(v > 0) {
            Object[] arr_object = d0.X;
            int v1 = 0;
            z1 = false;
            do {
                z1 = ((e)arr_object[v1]).h(a0, z) || z1;
                ++v1;
            }
            while(v1 < v);
        }
        else {
            z1 = false;
        }
        int v2 = d0.Z;
        if(v2 > 0) {
            Object[] arr_object1 = d0.X;
            int v3 = 0;
            z2 = false;
            do {
                z2 = ((e)arr_object1[v3]).g(a0) || z2;
                ++v3;
            }
            while(v3 < v2);
        }
        else {
            z2 = false;
        }
        u0.c(a0);
        return z2 || z1;
    }

    @Override  // zb.a
    public Object get() {
        return new x5.c(((Context)((g3.b)this.X).Y), ((y5.d)((a)this.Y).get()), ((x5.a)((q8.b)this.Z).get()));
    }
}

