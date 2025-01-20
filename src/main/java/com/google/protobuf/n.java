package com.google.protobuf;

import com.apollographql.apollo.api.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import sun.misc.Unsafe;
import v.h;

public final class N implements X {
    public final int[] a;
    public final Object[] b;
    public final a c;
    public final int[] d;
    public final int e;
    public final P f;
    public final C g;
    public final f0 h;
    public final J i;
    public static final int[] j;
    public static final Unsafe k;

    static {
        N.j = new int[0];
        N.k = n0.j();
    }

    public N(int[] arr_v, Object[] arr_object, a a0, int[] arr_v1, int v, P p0, C c0, f0 f00, i i0, J j0) {
        this.a = arr_v;
        this.b = arr_object;
        this.d = arr_v1;
        this.e = v;
        this.f = p0;
        this.g = c0;
        this.h = f00;
        this.c = a0;
        this.i = j0;
    }

    @Override  // com.google.protobuf.X
    public final void a(Object object0) {
        if(!N.m(object0)) {
            return;
        }
        if(object0 instanceof p) {
            ((p)object0).k();
            ((p)object0).j();
            ((p)object0).q();
        }
        int[] arr_v = this.a;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v1 = this.x(v);
            long v2 = (long)(0xFFFFF & v1);
            switch(N.w(v1)) {
                case 9: 
                case 17: {
                    if(this.k(v, object0)) {
                        this.j(v).a(N.k.getObject(object0, v2));
                    }
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.g.a(v2, object0);
                    break;
                }
                case 50: {
                    Unsafe unsafe0 = N.k;
                    Object object1 = unsafe0.getObject(object0, v2);
                    if(object1 != null) {
                        this.i.getClass();
                        J.b(object1);
                        unsafe0.putObject(object0, v2, object1);
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.n(arr_v[v], v, object0)) {
                        this.j(v).a(N.k.getObject(object0, v2));
                    }
                }
            }
        }
        this.h.getClass();
        f0.a(object0);
    }

    @Override  // com.google.protobuf.X
    public final boolean b(Object object0) {
        int v10;
        int v9;
        int v = 0xFFFFF;
        int v1 = 0;
        int v2 = 0;
        while(v2 < this.e) {
            int v3 = this.d[v2];
            int v4 = this.a[v3];
            int v5 = this.x(v3);
            int v6 = this.a[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 == v) {
                v10 = v;
                v9 = v1;
            }
            else {
                if(v7 != 0xFFFFF) {
                    v1 = N.k.getInt(object0, ((long)v7));
                }
                v9 = v1;
                v10 = v7;
            }
            if((0x10000000 & v5) != 0 && !this.l(object0, v3, v10, v9, v8)) {
                return false;
            }
            switch(N.w(v5)) {
                case 9: 
                case 17: {
                    if(this.l(object0, v3, v10, v9, v8) && !this.j(v3).b(n0.c.i(((long)(v5 & 0xFFFFF)), object0))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)n0.c.i(((long)(v5 & 0xFFFFF)), object0);
                    if(!list0.isEmpty()) {
                        X x1 = this.j(v3);
                        for(int v11 = 0; v11 < list0.size(); ++v11) {
                            if(!x1.b(list0.get(v11))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    Object object1 = n0.c.i(((long)(v5 & 0xFFFFF)), object0);
                    this.i.getClass();
                    I i0 = (I)object1;
                    if(!i0.isEmpty() && ((H)this.b[v3 / 3 * 2]).a.b.X == w0.g0) {
                        X x0 = null;
                        Iterator iterator0 = i0.values().iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            Object object2 = iterator0.next();
                            if(x0 == null) {
                                Class class0 = object2.getClass();
                                x0 = U.c.a(class0);
                            }
                            if(x0.b(object2)) {
                                continue;
                            }
                            return false;
                        }
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.n(v4, v3, object0) && !this.j(v3).b(n0.c.i(((long)(v5 & 0xFFFFF)), object0))) {
                        return false;
                    }
                }
            }
            ++v2;
            v = v10;
            v1 = v9;
        }
        return true;
    }

    @Override  // com.google.protobuf.X
    public final p c() {
        this.f.getClass();
        return (p)((p)this.c).m(4);
    }

    @Override  // com.google.protobuf.X
    public final int d(p p0) {
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        Unsafe unsafe0 = N.k;
        int v = 0xFFFFF;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; true; v1 = v10) {
            int[] arr_v = this.a;
            if(v2 >= arr_v.length) {
                break;
            }
            int v4 = this.x(v2);
            int v5 = N.w(v4);
            int v6 = arr_v[v2];
            int v7 = arr_v[v2 + 2];
            int v8 = v7 & 0xFFFFF;
            if(v5 <= 17) {
                if(v8 != v) {
                    v1 = v8 == 0xFFFFF ? 0 : unsafe0.getInt(p0, ((long)v8));
                    v = v8;
                }
                v9 = v;
                v10 = v1;
                v11 = 1 << (v7 >>> 20);
            }
            else {
                v9 = v;
                v10 = v1;
                v11 = 0;
            }
            switch(v5) {
                case 0: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.g(v6);
                    }
                    break;
                }
                case 1: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.k(v6);
                    }
                    break;
                }
                case 2: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.o(v6, unsafe0.getLong(p0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 3: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.y(v6, unsafe0.getLong(p0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 4: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.m(v6, unsafe0.getInt(p0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 5: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.j(v6);
                    }
                    break;
                }
                case 6: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.i(v6);
                    }
                    break;
                }
                case 7: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.d(v6);
                    }
                    break;
                }
                case 8: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        Object object0 = unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)));
                        v12 = object0 instanceof e ? f.e(v6, ((e)object0)) : f.t(v6, ((String)object0));
                        v3 = v12 + v3;
                        break;
                    }
                    break;
                }
                case 9: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += Y.o(v6, unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF))), this.j(v2));
                    }
                    break;
                }
                case 10: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.e(v6, ((e)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    }
                    break;
                }
                case 11: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.w(v6, unsafe0.getInt(p0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 12: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.h(v6, unsafe0.getInt(p0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 13: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.p(v6);
                    }
                    break;
                }
                case 14: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.q(v6);
                    }
                    break;
                }
                case 15: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.r(v6, unsafe0.getInt(p0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 16: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.s(v6, unsafe0.getLong(p0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 17: {
                    if(this.l(p0, v2, v9, v10, v11)) {
                        v3 += f.l(v6, ((a)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))), this.j(v2));
                    }
                    break;
                }
                case 18: {
                    v3 += Y.h(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 19: {
                    v3 += Y.f(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 20: {
                    v3 += Y.m(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 21: {
                    v3 += Y.x(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 22: {
                    v3 += Y.k(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 23: {
                    v3 += Y.h(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 24: {
                    v3 += Y.f(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 25: {
                    v3 += Y.a(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 26: {
                    v3 += Y.u(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 27: {
                    v3 += Y.p(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))), this.j(v2));
                    break;
                }
                case 28: {
                    v3 += Y.c(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 29: {
                    v3 += Y.v(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 30: {
                    v3 += Y.d(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 0x1F: {
                    v3 += Y.f(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 0x20: {
                    v3 += Y.h(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 33: {
                    v3 += Y.q(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 34: {
                    v3 += Y.s(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 35: {
                    v13 = Y.i(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 36: {
                    v13 = Y.g(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 37: {
                    v13 = Y.n(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 38: {
                    v13 = Y.y(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 39: {
                    v13 = Y.l(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 40: {
                    v13 = Y.i(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 41: {
                    v13 = Y.g(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 42: {
                    v13 = Y.b(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 43: {
                    v13 = Y.w(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 44: {
                    v13 = Y.e(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 45: {
                    v13 = Y.g(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 46: {
                    v13 = Y.i(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 0x2F: {
                    v13 = Y.r(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 0x30: {
                    v13 = Y.t(((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += f.x(v13) + f.v(v6) + v13;
                    }
                    break;
                }
                case 49: {
                    v3 += Y.j(v6, ((List)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))), this.j(v2));
                    break;
                }
                case 50: {
                    Object object1 = unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)));
                    Object object2 = this.b[v2 / 3 * 2];
                    this.i.getClass();
                    v3 += J.a(object1, v6, object2);
                    break;
                }
                case 51: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.g(v6);
                    }
                    break;
                }
                case 52: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.k(v6);
                    }
                    break;
                }
                case 53: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.o(v6, N.t(v4 & 0xFFFFF, p0));
                    }
                    break;
                }
                case 54: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.y(v6, N.t(v4 & 0xFFFFF, p0));
                    }
                    break;
                }
                case 55: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.m(v6, N.s(v4 & 0xFFFFF, p0));
                    }
                    break;
                }
                case 56: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.j(v6);
                    }
                    break;
                }
                case 57: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.i(v6);
                    }
                    break;
                }
                case 58: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.d(v6);
                    }
                    break;
                }
                case 59: {
                    if(this.n(v6, v2, p0)) {
                        Object object3 = unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)));
                        v12 = object3 instanceof e ? f.e(v6, ((e)object3)) : f.t(v6, ((String)object3));
                        v3 = v12 + v3;
                    }
                    break;
                }
                case 60: {
                    if(this.n(v6, v2, p0)) {
                        v3 += Y.o(v6, unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF))), this.j(v2));
                    }
                    break;
                }
                case 61: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.e(v6, ((e)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))));
                    }
                    break;
                }
                case 62: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.w(v6, N.s(v4 & 0xFFFFF, p0));
                    }
                    break;
                }
                case 0x3F: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.h(v6, N.s(v4 & 0xFFFFF, p0));
                    }
                    break;
                }
                case 0x40: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.p(v6);
                    }
                    break;
                }
                case 65: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.q(v6);
                    }
                    break;
                }
                case 66: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.r(v6, N.s(v4 & 0xFFFFF, p0));
                    }
                    break;
                }
                case 67: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.s(v6, N.t(v4 & 0xFFFFF, p0));
                    }
                    break;
                }
                case 68: {
                    if(this.n(v6, v2, p0)) {
                        v3 += f.l(v6, ((a)unsafe0.getObject(p0, ((long)(v4 & 0xFFFFF)))), this.j(v2));
                    }
                }
            }
            v2 += 3;
            v = v9;
        }
        this.h.getClass();
        return p0.unknownFields.a() + v3;
    }

    @Override  // com.google.protobuf.X
    public final void e(Object object0, F f0) {
        f0.getClass();
        this.y(object0, f0);
    }

    @Override  // com.google.protobuf.X
    public final void f(Object object0, Object object1) {
        if(!N.m(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
        object1.getClass();
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.x(v);
            long v2 = (long)(v1 & 0xFFFFF);
            int v3 = arr_v[v];
            switch(N.w(v1)) {
                case 0: {
                    if(this.k(v, object1)) {
                        double f = n0.c.e(v2, object1);
                        n0.c.m(object0, v2, f);
                        this.v(v, object0);
                    }
                    break;
                }
                case 1: {
                    if(this.k(v, object1)) {
                        float f1 = n0.c.f(v2, object1);
                        n0.c.n(object0, v2, f1);
                        this.v(v, object0);
                    }
                    break;
                }
                case 2: {
                    if(this.k(v, object1)) {
                        long v4 = n0.c.h(v2, object1);
                        n0.c.p(v2, v4, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 3: {
                    if(this.k(v, object1)) {
                        long v5 = n0.c.h(v2, object1);
                        n0.c.p(v2, v5, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 4: {
                    if(this.k(v, object1)) {
                        n0.n(n0.c.g(v2, object1), v2, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 5: {
                    if(this.k(v, object1)) {
                        long v6 = n0.c.h(v2, object1);
                        n0.c.p(v2, v6, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 6: {
                    if(this.k(v, object1)) {
                        n0.n(n0.c.g(v2, object1), v2, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 7: {
                    if(this.k(v, object1)) {
                        boolean z = n0.c.c(v2, object1);
                        n0.c.k(object0, v2, z);
                        this.v(v, object0);
                    }
                    break;
                }
                case 8: {
                    if(this.k(v, object1)) {
                        n0.o(v2, object0, n0.c.i(v2, object1));
                        this.v(v, object0);
                    }
                    break;
                }
                case 9: {
                    this.o(object0, v, object1);
                    break;
                }
                case 10: {
                    if(this.k(v, object1)) {
                        n0.o(v2, object0, n0.c.i(v2, object1));
                        this.v(v, object0);
                    }
                    break;
                }
                case 11: {
                    if(this.k(v, object1)) {
                        n0.n(n0.c.g(v2, object1), v2, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 12: {
                    if(this.k(v, object1)) {
                        n0.n(n0.c.g(v2, object1), v2, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 13: {
                    if(this.k(v, object1)) {
                        n0.n(n0.c.g(v2, object1), v2, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 14: {
                    if(this.k(v, object1)) {
                        long v7 = n0.c.h(v2, object1);
                        n0.c.p(v2, v7, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 15: {
                    if(this.k(v, object1)) {
                        n0.n(n0.c.g(v2, object1), v2, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 16: {
                    if(this.k(v, object1)) {
                        long v8 = n0.c.h(v2, object1);
                        n0.c.p(v2, v8, object0);
                        this.v(v, object0);
                    }
                    break;
                }
                case 17: {
                    this.o(object0, v, object1);
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.g.b(v2, object0, object1);
                    break;
                }
                case 50: {
                    Object object2 = n0.c.i(v2, object0);
                    Object object3 = n0.c.i(v2, object1);
                    this.i.getClass();
                    I i0 = (I)object2;
                    I i1 = (I)object3;
                    if(!i1.isEmpty()) {
                        if(!i0.X) {
                            i0 = i0.d();
                        }
                        i0.c();
                        if(!i1.isEmpty()) {
                            i0.putAll(i1);
                        }
                    }
                    n0.o(v2, object0, i0);
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if(this.n(v3, v, object1)) {
                        n0.o(v2, object0, n0.c.i(v2, object1));
                        n0.n(v3, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
                    }
                    break;
                }
                case 60: {
                    this.p(object0, v, object1);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.n(v3, v, object1)) {
                        n0.o(v2, object0, n0.c.i(v2, object1));
                        n0.n(v3, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
                    }
                    break;
                }
                case 68: {
                    this.p(object0, v, object1);
                }
            }
        }
        Y.z(this.h, object0, object1);
    }

    @Override  // com.google.protobuf.X
    public final boolean g(p p0, Object object0) {
        int[] arr_v = this.a;
        for(int v = 0; true; v += 3) {
            boolean z = true;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.x(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch(N.w(v1)) {
                case 0: {
                    if(!this.i(p0, object0, v) || Double.doubleToLongBits(n0.c.e(v2, p0)) != Double.doubleToLongBits(n0.c.e(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 1: {
                    if(!this.i(p0, object0, v) || Float.floatToIntBits(n0.c.f(v2, p0)) != Float.floatToIntBits(n0.c.f(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 2: {
                    if(!this.i(p0, object0, v) || n0.c.h(v2, p0) != n0.c.h(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 3: {
                    if(!this.i(p0, object0, v) || n0.c.h(v2, p0) != n0.c.h(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 4: {
                    if(!this.i(p0, object0, v) || n0.c.g(v2, p0) != n0.c.g(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 5: {
                    if(!this.i(p0, object0, v) || n0.c.h(v2, p0) != n0.c.h(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 6: {
                    if(!this.i(p0, object0, v) || n0.c.g(v2, p0) != n0.c.g(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 7: {
                    if(!this.i(p0, object0, v) || n0.c.c(v2, p0) != n0.c.c(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 8: {
                    if(!this.i(p0, object0, v) || !Y.A(n0.c.i(v2, p0), n0.c.i(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 9: {
                    if(!this.i(p0, object0, v) || !Y.A(n0.c.i(v2, p0), n0.c.i(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 10: {
                    if(!this.i(p0, object0, v) || !Y.A(n0.c.i(v2, p0), n0.c.i(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 11: {
                    if(!this.i(p0, object0, v) || n0.c.g(v2, p0) != n0.c.g(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 12: {
                    if(!this.i(p0, object0, v) || n0.c.g(v2, p0) != n0.c.g(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 13: {
                    if(!this.i(p0, object0, v) || n0.c.g(v2, p0) != n0.c.g(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 14: {
                    if(!this.i(p0, object0, v) || n0.c.h(v2, p0) != n0.c.h(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 15: {
                    if(!this.i(p0, object0, v) || n0.c.g(v2, p0) != n0.c.g(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 16: {
                    if(!this.i(p0, object0, v) || n0.c.h(v2, p0) != n0.c.h(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 17: {
                    if(!this.i(p0, object0, v) || !Y.A(n0.c.i(v2, p0), n0.c.i(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    z = Y.A(n0.c.i(v2, p0), n0.c.i(v2, object0));
                    break;
                }
                case 50: {
                    z = Y.A(n0.c.i(v2, p0), n0.c.i(v2, object0));
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    long v3 = (long)(arr_v[v + 2] & 0xFFFFF);
                    if(n0.c.g(v3, p0) != n0.c.g(v3, object0) || !Y.A(n0.c.i(v2, p0), n0.c.i(v2, object0))) {
                        z = false;
                    }
                }
            }
            if(!z) {
                return false;
            }
        }
        this.h.getClass();
        return p0.unknownFields.equals(((p)object0).unknownFields);
    }

    @Override  // com.google.protobuf.X
    public final int h(p p0) {
        int[] arr_v = this.a;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v2 = this.x(v);
            int v3 = arr_v[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 0x4D5;
            int v6 = 37;
            switch(N.w(v2)) {
                case 0: {
                    v1 = u.a(Double.doubleToLongBits(n0.c.e(v4, p0))) + v1 * 53;
                    break;
                }
                case 1: {
                    v1 = Float.floatToIntBits(n0.c.f(v4, p0)) + v1 * 53;
                    break;
                }
                case 2: {
                    v1 = u.a(n0.c.h(v4, p0)) + v1 * 53;
                    break;
                }
                case 3: {
                    v1 = u.a(n0.c.h(v4, p0)) + v1 * 53;
                    break;
                }
                case 4: {
                    v1 = n0.c.g(v4, p0) + v1 * 53;
                    break;
                }
                case 5: {
                    v1 = u.a(n0.c.h(v4, p0)) + v1 * 53;
                    break;
                }
                case 6: {
                    v1 = n0.c.g(v4, p0) + v1 * 53;
                    break;
                }
                case 7: {
                    if(n0.c.c(v4, p0)) {
                        v5 = 0x4CF;
                    }
                    v1 = v5 + v1 * 53;
                    break;
                }
                case 8: {
                    v1 = ((String)n0.c.i(v4, p0)).hashCode() + v1 * 53;
                    break;
                }
                case 9: {
                    Object object0 = n0.c.i(v4, p0);
                    if(object0 != null) {
                        v6 = object0.hashCode();
                    }
                    v1 = v1 * 53 + v6;
                    break;
                }
                case 10: {
                    v1 = n0.c.i(v4, p0).hashCode() + v1 * 53;
                    break;
                }
                case 11: {
                    v1 = n0.c.g(v4, p0) + v1 * 53;
                    break;
                }
                case 12: {
                    v1 = n0.c.g(v4, p0) + v1 * 53;
                    break;
                }
                case 13: {
                    v1 = n0.c.g(v4, p0) + v1 * 53;
                    break;
                }
                case 14: {
                    v1 = u.a(n0.c.h(v4, p0)) + v1 * 53;
                    break;
                }
                case 15: {
                    v1 = n0.c.g(v4, p0) + v1 * 53;
                    break;
                }
                case 16: {
                    v1 = u.a(n0.c.h(v4, p0)) + v1 * 53;
                    break;
                }
                case 17: {
                    Object object1 = n0.c.i(v4, p0);
                    if(object1 != null) {
                        v6 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v6;
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    v1 = n0.c.i(v4, p0).hashCode() + v1 * 53;
                    break;
                }
                case 50: {
                    v1 = n0.c.i(v4, p0).hashCode() + v1 * 53;
                    break;
                }
                case 51: {
                    if(this.n(v3, v, p0)) {
                        v1 = u.a(Double.doubleToLongBits(((double)(((Double)n0.c.i(v4, p0)))))) + v1 * 53;
                    }
                    break;
                }
                case 52: {
                    if(this.n(v3, v, p0)) {
                        v1 = Float.floatToIntBits(((float)(((Float)n0.c.i(v4, p0))))) + v1 * 53;
                    }
                    break;
                }
                case 53: {
                    if(this.n(v3, v, p0)) {
                        v1 = u.a(N.t(v4, p0)) + v1 * 53;
                    }
                    break;
                }
                case 54: {
                    if(this.n(v3, v, p0)) {
                        v1 = u.a(N.t(v4, p0)) + v1 * 53;
                    }
                    break;
                }
                case 55: {
                    if(this.n(v3, v, p0)) {
                        v1 = N.s(v4, p0) + v1 * 53;
                    }
                    break;
                }
                case 56: {
                    if(this.n(v3, v, p0)) {
                        v1 = u.a(N.t(v4, p0)) + v1 * 53;
                    }
                    break;
                }
                case 57: {
                    if(this.n(v3, v, p0)) {
                        v1 = N.s(v4, p0) + v1 * 53;
                    }
                    break;
                }
                case 58: {
                    if(this.n(v3, v, p0)) {
                        if(((Boolean)n0.c.i(v4, p0)).booleanValue()) {
                            v5 = 0x4CF;
                        }
                        v1 = v5 + v1 * 53;
                    }
                    break;
                }
                case 59: {
                    if(this.n(v3, v, p0)) {
                        v1 = ((String)n0.c.i(v4, p0)).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 60: {
                    if(this.n(v3, v, p0)) {
                        v1 = n0.c.i(v4, p0).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 61: {
                    if(this.n(v3, v, p0)) {
                        v1 = n0.c.i(v4, p0).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 62: {
                    if(this.n(v3, v, p0)) {
                        v1 = N.s(v4, p0) + v1 * 53;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.n(v3, v, p0)) {
                        v1 = N.s(v4, p0) + v1 * 53;
                    }
                    break;
                }
                case 0x40: {
                    if(this.n(v3, v, p0)) {
                        v1 = N.s(v4, p0) + v1 * 53;
                    }
                    break;
                }
                case 65: {
                    if(this.n(v3, v, p0)) {
                        v1 = u.a(N.t(v4, p0)) + v1 * 53;
                    }
                    break;
                }
                case 66: {
                    if(this.n(v3, v, p0)) {
                        v1 = N.s(v4, p0) + v1 * 53;
                    }
                    break;
                }
                case 67: {
                    if(this.n(v3, v, p0)) {
                        v1 = u.a(N.t(v4, p0)) + v1 * 53;
                    }
                    break;
                }
                case 68: {
                    if(this.n(v3, v, p0)) {
                        v1 = n0.c.i(v4, p0).hashCode() + v1 * 53;
                    }
                }
            }
        }
        this.h.getClass();
        return p0.unknownFields.hashCode() + v1 * 53;
    }

    public final boolean i(p p0, Object object0, int v) {
        return this.k(v, p0) == this.k(v, object0);
    }

    public final X j(int v) {
        int v1 = v / 3 * 2;
        Object[] arr_object = this.b;
        X x0 = (X)arr_object[v1];
        if(x0 != null) {
            return x0;
        }
        X x1 = U.c.a(((Class)arr_object[v1 + 1]));
        arr_object[v1] = x1;
        return x1;
    }

    public final boolean k(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(Long.compare(v1 & 0xFFFFF, 0xFFFFFL) == 0) {
            int v2 = this.x(v);
            switch(N.w(v2)) {
                case 0: {
                    return Double.doubleToRawLongBits(n0.c.e(((long)(v2 & 0xFFFFF)), object0)) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(n0.c.f(((long)(v2 & 0xFFFFF)), object0)) != 0;
                }
                case 2: {
                    return n0.c.h(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 3: {
                    return n0.c.h(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 4: {
                    return n0.c.g(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 5: {
                    return n0.c.h(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 6: {
                    return n0.c.g(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 7: {
                    return n0.c.c(((long)(v2 & 0xFFFFF)), object0);
                }
                case 8: {
                    Object object1 = n0.c.i(((long)(v2 & 0xFFFFF)), object0);
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof e)) {
                        throw new IllegalArgumentException();
                    }
                    return !e.Z.equals(object1);
                }
                case 9: {
                    return n0.c.i(((long)(v2 & 0xFFFFF)), object0) != null;
                }
                case 10: {
                    Object object2 = n0.c.i(((long)(v2 & 0xFFFFF)), object0);
                    return !e.Z.equals(object2);
                }
                case 11: {
                    return n0.c.g(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 12: {
                    return n0.c.g(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 13: {
                    return n0.c.g(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 14: {
                    return n0.c.h(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 15: {
                    return n0.c.g(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 16: {
                    return n0.c.h(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 17: {
                    return n0.c.i(((long)(v2 & 0xFFFFF)), object0) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (1 << (v1 >>> 20) & n0.c.g(((long)(v1 & 0xFFFFF)), object0)) != 0;
    }

    public final boolean l(Object object0, int v, int v1, int v2, int v3) {
        return v1 == 0xFFFFF ? this.k(v, object0) : (v2 & v3) != 0;
    }

    public static boolean m(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof p ? ((p)object0).p() : true;
    }

    public final boolean n(int v, int v1, Object object0) {
        return n0.c.g(((long)(this.a[v1 + 2] & 0xFFFFF)), object0) == v;
    }

    public final void o(Object object0, int v, Object object1) {
        if(!this.k(v, object1)) {
            return;
        }
        int v1 = this.x(v);
        Unsafe unsafe0 = N.k;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.a[v] + " is present but null: " + object1);
        }
        X x0 = this.j(v);
        if(!this.k(v, object0)) {
            if(N.m(object2)) {
                p p0 = x0.c();
                x0.f(p0, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), p0);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.v(v, object0);
            return;
        }
        Object object3 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!N.m(object3)) {
            p p1 = x0.c();
            x0.f(p1, object3);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), p1);
            object3 = p1;
        }
        x0.f(object3, object2);
    }

    public final void p(Object object0, int v, Object object1) {
        int[] arr_v = this.a;
        int v1 = arr_v[v];
        if(!this.n(v1, v, object1)) {
            return;
        }
        int v2 = this.x(v);
        Unsafe unsafe0 = N.k;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + arr_v[v] + " is present but null: " + object1);
        }
        X x0 = this.j(v);
        if(!this.n(v1, v, object0)) {
            if(N.m(object2)) {
                p p0 = x0.c();
                x0.f(p0, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), p0);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            n0.n(v1, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
            return;
        }
        Object object3 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!N.m(object3)) {
            p p1 = x0.c();
            x0.f(p1, object3);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), p1);
            object3 = p1;
        }
        x0.f(object3, object2);
    }

    public static N q(W w0, P p0, C c0, f0 f00, i i0, J j0) {
        if(w0 instanceof W) {
            return N.r(w0, p0, c0, f00, i0, j0);
        }
        w0.getClass();
        throw new ClassCastException();
    }

    public static N r(W w0, P p0, C c0, f0 f00, i i0, J j0) {
        int v82;
        int v81;
        Field field3;
        int v72;
        int v71;
        int[] arr_v2;
        int v70;
        int v69;
        String s1;
        int v68;
        Field field1;
        Field field0;
        int v65;
        int v64;
        int v58;
        int v52;
        int v12;
        int[] arr_v;
        int v11;
        int v10;
        int v9;
        int v8;
        int v2;
        String s = w0.c();
        int v = s.length();
        if(s.charAt(0) >= 0xD800) {
            for(int v1 = 1; true; v1 = v2) {
                v2 = v1 + 1;
                if(s.charAt(v1) < 0xD800) {
                    break;
                }
            }
        }
        else {
            v2 = 1;
        }
        int v3 = v2 + 1;
        int v4 = s.charAt(v2);
        if(v4 >= 0xD800) {
            int v5 = v4 & 0x1FFF;
            int v6 = 13;
            int v7;
            while((v7 = s.charAt(v3)) >= 0xD800) {
                v5 |= (v7 & 0x1FFF) << v6;
                v6 += 13;
                ++v3;
            }
            v4 = v5 | v7 << v6;
            ++v3;
        }
        if(v4 == 0) {
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = 0;
            arr_v = N.j;
            v12 = 0;
        }
        else {
            int v13 = v3 + 1;
            int v14 = s.charAt(v3);
            if(v14 >= 0xD800) {
                int v15 = v14 & 0x1FFF;
                int v16 = 13;
                int v17;
                while((v17 = s.charAt(v13)) >= 0xD800) {
                    v15 |= (v17 & 0x1FFF) << v16;
                    v16 += 13;
                    ++v13;
                }
                v14 = v15 | v17 << v16;
                ++v13;
            }
            int v18 = v13 + 1;
            int v19 = s.charAt(v13);
            if(v19 >= 0xD800) {
                int v20 = v19 & 0x1FFF;
                int v21 = 13;
                int v22;
                while((v22 = s.charAt(v18)) >= 0xD800) {
                    v20 |= (v22 & 0x1FFF) << v21;
                    v21 += 13;
                    ++v18;
                }
                v19 = v20 | v22 << v21;
                ++v18;
            }
            int v23 = v18 + 1;
            if(s.charAt(v18) >= 0xD800) {
                while(s.charAt(v23) >= 0xD800) {
                    ++v23;
                }
                ++v23;
            }
            int v24 = v23 + 1;
            if(s.charAt(v23) >= 0xD800) {
                while(s.charAt(v24) >= 0xD800) {
                    ++v24;
                }
                ++v24;
            }
            int v25 = v24 + 1;
            v8 = s.charAt(v24);
            if(v8 >= 0xD800) {
                int v26 = v8 & 0x1FFF;
                int v27 = 13;
                int v28;
                while((v28 = s.charAt(v25)) >= 0xD800) {
                    v26 |= (v28 & 0x1FFF) << v27;
                    v27 += 13;
                    ++v25;
                }
                v8 = v26 | v28 << v27;
                ++v25;
            }
            int v29 = v25 + 1;
            v9 = s.charAt(v25);
            if(v9 >= 0xD800) {
                int v30 = v9 & 0x1FFF;
                int v31 = 13;
                int v32;
                while((v32 = s.charAt(v29)) >= 0xD800) {
                    v30 |= (v32 & 0x1FFF) << v31;
                    v31 += 13;
                    ++v29;
                }
                v9 = v30 | v32 << v31;
                ++v29;
            }
            int v33 = v29 + 1;
            int v34 = s.charAt(v29);
            if(v34 >= 0xD800) {
                int v35 = v34 & 0x1FFF;
                int v36 = 13;
                int v37;
                while((v37 = s.charAt(v33)) >= 0xD800) {
                    v35 |= (v37 & 0x1FFF) << v36;
                    v36 += 13;
                    ++v33;
                }
                v34 = v35 | v37 << v36;
                ++v33;
            }
            int v38 = v33 + 1;
            int v39 = s.charAt(v33);
            if(v39 >= 0xD800) {
                int v40 = v39 & 0x1FFF;
                int v41 = 13;
                int v42;
                while((v42 = s.charAt(v38)) >= 0xD800) {
                    v40 |= (v42 & 0x1FFF) << v41;
                    v41 += 13;
                    ++v38;
                }
                v39 = v40 | v42 << v41;
                ++v38;
            }
            v12 = v14;
            v3 = v38;
            arr_v = new int[v39 + v9 + v34];
            v10 = v14 * 2 + v19;
            v11 = v39;
        }
        Unsafe unsafe0 = N.k;
        Object[] arr_object = w0.b();
        Class class0 = w0.a().getClass();
        int[] arr_v1 = new int[v8 * 3];
        Object[] arr_object1 = new Object[v8 * 2];
        int v43 = v9 + v11;
        int v44 = v11;
        int v45 = 0;
        int v46 = 0;
        while(v3 < v) {
            int v47 = s.charAt(v3);
            if(v47 >= 0xD800) {
                int v48 = v47 & 0x1FFF;
                int v49 = v3 + 1;
                int v50 = 13;
                int v51;
                while((v51 = s.charAt(v49)) >= 0xD800) {
                    v48 |= (v51 & 0x1FFF) << v50;
                    v50 += 13;
                    ++v49;
                }
                v47 = v48 | v51 << v50;
                v52 = v49 + 1;
            }
            else {
                v52 = v3 + 1;
            }
            int v53 = s.charAt(v52);
            if(v53 >= 0xD800) {
                int v54 = v53 & 0x1FFF;
                int v55 = v52 + 1;
                int v56 = 13;
                int v57;
                while((v57 = s.charAt(v55)) >= 0xD800) {
                    v54 |= (v57 & 0x1FFF) << v56;
                    v56 += 13;
                    ++v55;
                }
                v53 = v54 | v57 << v56;
                v58 = v55 + 1;
            }
            else {
                v58 = v52 + 1;
            }
            if((v53 & 0x400) != 0) {
                arr_v[v45] = v46;
                ++v45;
            }
            if((v53 & 0xFF) >= 51) {
                int v59 = s.charAt(v58);
                if(v59 >= 0xD800) {
                    int v60 = 13;
                    int v61 = v59 & 0x1FFF;
                    int v62 = v58 + 1;
                    int v63;
                    while((v63 = s.charAt(v62)) >= 0xD800) {
                        v61 |= (v63 & 0x1FFF) << v60;
                        v60 += 13;
                        ++v62;
                    }
                    v59 = v61 | v63 << v60;
                    v64 = v62 + 1;
                }
                else {
                    v64 = v58 + 1;
                }
                v65 = v11;
                switch((v53 & 0xFF) - 51) {
                    case 12: {
                        if(h.b(w0.d(), 1) || (v53 & 0x800) != 0) {
                            arr_object1[v46 / 3 * 2 + 1] = arr_object[v10];
                            ++v10;
                        }
                        break;
                    }
                    case 9: 
                    case 17: {
                        arr_object1[v46 / 3 * 2 + 1] = arr_object[v10];
                        ++v10;
                    }
                }
                Object object0 = arr_object[v59 * 2];
                if(object0 instanceof Field) {
                    field0 = (Field)object0;
                }
                else {
                    field0 = N.u(class0, ((String)object0));
                    arr_object[v59 * 2] = field0;
                }
                int v66 = (int)unsafe0.objectFieldOffset(field0);
                int v67 = v59 * 2 + 1;
                Object object1 = arr_object[v67];
                if(object1 instanceof Field) {
                    field1 = (Field)object1;
                }
                else {
                    field1 = N.u(class0, ((String)object1));
                    arr_object[v67] = field1;
                }
                v68 = 0;
                s1 = s;
                v69 = (int)unsafe0.objectFieldOffset(field1);
                v70 = v66;
                arr_v2 = arr_v1;
                v71 = v47;
                v72 = v64;
            }
            else {
                v65 = v11;
                int v73 = v10 + 1;
                Field field2 = N.u(class0, ((String)arr_object[v10]));
                v71 = v47;
                switch(v53 & 0xFF) {
                    case 9: 
                    case 17: {
                        arr_v2 = arr_v1;
                        arr_object1[v46 / 3 * 2 + 1] = field2.getType();
                        break;
                    }
                    case 12: 
                    case 30: 
                    case 44: {
                        arr_v2 = arr_v1;
                        if(w0.d() == 1 || (v53 & 0x800) != 0) {
                            arr_object1[v46 / 3 * 2 + 1] = arr_object[v73];
                            v73 = v10 + 2;
                        }
                        break;
                    }
                    case 27: 
                    case 49: {
                        arr_v2 = arr_v1;
                        arr_object1[v46 / 3 * 2 + 1] = arr_object[v73];
                        v73 = v10 + 2;
                        break;
                    }
                    case 50: {
                        arr_v[v44] = v46;
                        int v74 = v46 / 3 * 2;
                        arr_object1[v74] = arr_object[v73];
                        if((v53 & 0x800) == 0) {
                            ++v44;
                            v73 = v10 + 2;
                        }
                        else {
                            v73 = v10 + 3;
                            arr_object1[v74 + 1] = arr_object[v10 + 2];
                            ++v44;
                        }
                        arr_v2 = arr_v1;
                        break;
                    }
                    default: {
                        arr_v2 = arr_v1;
                        break;
                    }
                }
                int v75 = (int)unsafe0.objectFieldOffset(field2);
                if((v53 & 0x1000) == 0 || (v53 & 0xFF) > 17) {
                    s1 = s;
                    v81 = v73;
                    v82 = 0xFFFFF;
                    v72 = v58;
                    v68 = 0;
                }
                else {
                    v72 = v58 + 1;
                    int v76 = s.charAt(v58);
                    if(v76 >= 0xD800) {
                        int v77 = v76 & 0x1FFF;
                        int v78 = 13;
                        int v79;
                        while((v79 = s.charAt(v72)) >= 0xD800) {
                            v77 |= (v79 & 0x1FFF) << v78;
                            v78 += 13;
                            ++v72;
                        }
                        v76 = v77 | v79 << v78;
                        ++v72;
                    }
                    int v80 = v76 / 0x20 + v12 * 2;
                    Object object2 = arr_object[v80];
                    if(object2 instanceof Field) {
                        field3 = (Field)object2;
                    }
                    else {
                        field3 = N.u(class0, ((String)object2));
                        arr_object[v80] = field3;
                    }
                    s1 = s;
                    v81 = v73;
                    v68 = v76 % 0x20;
                    v82 = (int)unsafe0.objectFieldOffset(field3);
                }
                if((v53 & 0xFF) >= 18 && (v53 & 0xFF) <= 49) {
                    arr_v[v43] = v75;
                    ++v43;
                }
                v69 = v82;
                v70 = v75;
                v10 = v81;
            }
            arr_v2[v46] = v71;
            int v83 = v46 + 2;
            arr_v2[v46 + 1] = v70 | (((v53 & 0x200) == 0 ? 0 : 0x20000000) | ((v53 & 0x100) == 0 ? 0 : 0x10000000) | ((v53 & 0x800) == 0 ? 0 : 0x80000000) | (v53 & 0xFF) << 20);
            v46 += 3;
            arr_v2[v83] = v69 | v68 << 20;
            s = s1;
            v = v;
            v3 = v72;
            arr_v1 = arr_v2;
            v12 = v12;
            v11 = v65;
        }
        return new N(arr_v1, arr_object1, w0.a(), arr_v, v11, p0, c0, f00, i0, j0);
    }

    public static int s(long v, Object object0) {
        return (int)(((Integer)n0.c.i(v, object0)));
    }

    public static long t(long v, Object object0) {
        return (long)(((Long)n0.c.i(v, object0)));
    }

    public static Field u(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            StringBuilder stringBuilder0 = b.s("Field ", s, " for ");
            stringBuilder0.append(class0.getName());
            stringBuilder0.append(" not found. Known fields are ");
            stringBuilder0.append(Arrays.toString(arr_field));
            throw new RuntimeException(stringBuilder0.toString());
        }
    }

    public final void v(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        n0.n(1 << (v1 >>> 20) | n0.c.g(((long)(0xFFFFF & v1)), object0), ((long)(0xFFFFF & v1)), object0);
    }

    public static int w(int v) {
        return (v & 0xFF00000) >>> 20;
    }

    public final int x(int v) {
        return this.a[v + 1];
    }

    public final void y(Object object0, F f0) {
        int v20;
        int v16;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int[] arr_v = this.a;
        int v = arr_v.length;
        Unsafe unsafe0 = N.k;
        int v1 = 0xFFFFF;
        int v3 = 0;
        for(int v2 = 0; v3 < v; v2 = v13) {
            int v4 = this.x(v3);
            int v5 = arr_v[v3];
            int v6 = N.w(v4);
            if(v6 <= 17) {
                int v7 = arr_v[v3 + 2];
                int v8 = v7 & 0xFFFFF;
                if(v8 != v1) {
                    v2 = v8 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v8));
                    v1 = v8;
                }
                v9 = v2;
                v10 = 1 << (v7 >>> 20);
                v11 = v1;
            }
            else {
                v11 = v1;
                v9 = v2;
                v10 = 0;
            }
            switch(v6) {
                case 0: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.c(v5, n0.c.e(((long)(v4 & 0xFFFFF)), object0));
                    }
                    break;
                }
                case 1: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.g(v5, n0.c.f(((long)(v4 & 0xFFFFF)), object0));
                    }
                    break;
                }
                case 2: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.j(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 3: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.q(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 4: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.i(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 5: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.f(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 6: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.e(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 7: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.a(v5, n0.c.c(((long)(v4 & 0xFFFFF)), object0));
                    }
                    break;
                }
                case 8: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        Object object1 = unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)));
                        if(object1 instanceof String) {
                            ((f)f0.a).J(v5, 2);
                            ((f)f0.a).I(((String)object1));
                        }
                        else {
                            f0.b(v5, ((e)object1));
                        }
                    }
                    break;
                }
                case 9: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.k(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), this.j(v14));
                    }
                    break;
                }
                case 10: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.b(v5, ((e)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))));
                    }
                    break;
                }
                case 11: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.p(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 12: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.d(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 13: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.l(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 14: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.m(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 15: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.n(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 16: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v14, v11, v13, v10)) {
                        f0.o(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 17: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    if(this.l(object0, v3, v11, v13, v10)) {
                        f0.h(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), this.j(v14));
                    }
                    break;
                }
                case 18: {
                    v12 = v;
                    v13 = v9;
                    Y.D(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 19: {
                    v12 = v;
                    v13 = v9;
                    Y.H(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 20: {
                    v12 = v;
                    v13 = v9;
                    Y.K(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 21: {
                    v12 = v;
                    v13 = v9;
                    Y.S(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 22: {
                    v12 = v;
                    v13 = v9;
                    Y.J(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 23: {
                    v12 = v;
                    v13 = v9;
                    Y.G(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 24: {
                    v12 = v;
                    v13 = v9;
                    Y.F(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 25: {
                    v12 = v;
                    v13 = v9;
                    Y.B(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 26: {
                    v12 = v;
                    v13 = v9;
                    Y.Q(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0);
                    v14 = v3;
                    break;
                }
                case 27: {
                    v12 = v;
                    v13 = v9;
                    Y.L(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, this.j(v3));
                    v14 = v3;
                    break;
                }
                case 28: {
                    v12 = v;
                    v13 = v9;
                    Y.C(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0);
                    v14 = v3;
                    break;
                }
                case 29: {
                    v12 = v;
                    v13 = v9;
                    Y.R(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 30: {
                    v12 = v;
                    v13 = v9;
                    Y.E(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 0x1F: {
                    v12 = v;
                    v13 = v9;
                    Y.M(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 0x20: {
                    v12 = v;
                    v13 = v9;
                    Y.N(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 33: {
                    v12 = v;
                    v13 = v9;
                    Y.O(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 34: {
                    v12 = v;
                    v13 = v9;
                    Y.P(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, false);
                    v14 = v3;
                    break;
                }
                case 35: {
                    v12 = v;
                    v13 = v9;
                    Y.D(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 36: {
                    v12 = v;
                    v13 = v9;
                    Y.H(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 37: {
                    v12 = v;
                    v13 = v9;
                    Y.K(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 38: {
                    v12 = v;
                    v13 = v9;
                    Y.S(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 39: {
                    v12 = v;
                    v13 = v9;
                    Y.J(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 40: {
                    v12 = v;
                    v13 = v9;
                    Y.G(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 41: {
                    v12 = v;
                    v13 = v9;
                    Y.F(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 42: {
                    v12 = v;
                    v13 = v9;
                    Y.B(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 43: {
                    v12 = v;
                    v13 = v9;
                    Y.R(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 44: {
                    v12 = v;
                    v13 = v9;
                    Y.E(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 45: {
                    v12 = v;
                    v13 = v9;
                    Y.M(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 46: {
                    v12 = v;
                    v13 = v9;
                    Y.N(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 0x2F: {
                    v12 = v;
                    v13 = v9;
                    Y.O(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 0x30: {
                    v12 = v;
                    v13 = v9;
                    Y.P(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, true);
                    v14 = v3;
                    break;
                }
                case 49: {
                    v12 = v;
                    v13 = v9;
                    Y.I(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), f0, this.j(v3));
                    v14 = v3;
                    break;
                }
                case 50: {
                    Object object2 = unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)));
                    if(object2 != null) {
                        Object object3 = this.b[v3 / 3 * 2];
                        this.i.getClass();
                        G g0 = ((H)object3).a;
                        f f1 = (f)f0.a;
                        f1.getClass();
                        Iterator iterator0 = ((I)object2).entrySet().iterator();
                        while(iterator0.hasNext()) {
                            Object object4 = iterator0.next();
                            f1.J(v5, 2);
                            Object object5 = ((Map.Entry)object4).getKey();
                            Object object6 = ((Map.Entry)object4).getValue();
                            int v15 = 1;
                            s0 s00 = v0.c0;
                            r0 r00 = g0.a;
                            if(r00 == s00) {
                                v15 = 2;
                            }
                            switch(r00.ordinal()) {
                                case 0: {
                                    ((Double)object5).getClass();
                                    v16 = 8;
                                    break;
                                }
                                case 1: {
                                    ((Float)object5).getClass();
                                    v16 = 4;
                                    break;
                                }
                                case 2: {
                                    v16 = f.z(((long)(((Long)object5))));
                                    break;
                                }
                                case 3: {
                                    v16 = f.z(((long)(((Long)object5))));
                                    break;
                                }
                                case 4: {
                                    v16 = f.n(((int)(((Integer)object5))));
                                    break;
                                }
                                case 5: {
                                    ((Long)object5).getClass();
                                    v16 = 8;
                                    break;
                                }
                                case 6: {
                                    ((Integer)object5).getClass();
                                    v16 = 4;
                                    break;
                                }
                                case 7: {
                                    ((Boolean)object5).getClass();
                                    v16 = 1;
                                    break;
                                }
                                case 8: {
                                    v16 = object5 instanceof e ? f.f(((e)object5)) : f.u(((String)object5));
                                    break;
                                }
                                case 9: {
                                    v16 = ((p)(((a)object5))).h(null);
                                    break;
                                }
                                case 10: {
                                    int v17 = ((p)(((a)object5))).h(null);
                                    v16 = f.x(v17) + v17;
                                    break;
                                }
                                case 11: {
                                    v16 = object5 instanceof e ? f.f(((e)object5)) : ((byte[])object5).length + f.x(((byte[])object5).length);
                                    break;
                                }
                                case 12: {
                                    v16 = f.x(((int)(((Integer)object5))));
                                    break;
                                }
                                case 13: {
                                    v16 = object5 instanceof T7.i ? f.n(((T7.i)object5).X) : f.n(((int)(((Integer)object5))));
                                    break;
                                }
                                case 14: {
                                    ((Integer)object5).getClass();
                                    v16 = 4;
                                    break;
                                }
                                case 15: {
                                    ((Long)object5).getClass();
                                    v16 = 8;
                                    break;
                                }
                                case 16: {
                                    int v18 = (int)(((Integer)object5));
                                    v16 = f.x(v18 << 1 ^ v18 >> 0x1F);
                                    break;
                                }
                                case 17: {
                                    long v19 = (long)(((Long)object5));
                                    v16 = f.z(v19 << 1 ^ v19 >> 0x3F);
                                    break;
                                }
                                default: {
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                }
                            }
                            v0 v00 = g0.b;
                            switch(v00.ordinal()) {
                                case 0: {
                                    ((Double)object6).getClass();
                                    v20 = 8;
                                    break;
                                }
                                case 1: {
                                    ((Float)object6).getClass();
                                    v20 = 4;
                                    break;
                                }
                                case 2: {
                                    v20 = f.z(((long)(((Long)object6))));
                                    break;
                                }
                                case 3: {
                                    v20 = f.z(((long)(((Long)object6))));
                                    break;
                                }
                                case 4: {
                                    v20 = f.n(((int)(((Integer)object6))));
                                    break;
                                }
                                case 5: {
                                    ((Long)object6).getClass();
                                    v20 = 8;
                                    break;
                                }
                                case 6: {
                                    ((Integer)object6).getClass();
                                    v20 = 4;
                                    break;
                                }
                                case 7: {
                                    ((Boolean)object6).getClass();
                                    v20 = 1;
                                    break;
                                }
                                case 8: {
                                    v20 = object6 instanceof e ? f.f(((e)object6)) : f.u(((String)object6));
                                    break;
                                }
                                case 9: {
                                    v20 = ((p)(((a)object6))).h(null);
                                    break;
                                }
                                case 10: {
                                    int v21 = ((p)(((a)object6))).h(null);
                                    v20 = v21 + f.x(v21);
                                    break;
                                }
                                case 11: {
                                    v20 = object6 instanceof e ? f.f(((e)object6)) : ((byte[])object6).length + f.x(((byte[])object6).length);
                                    break;
                                }
                                case 12: {
                                    v20 = f.x(((int)(((Integer)object6))));
                                    break;
                                }
                                case 13: {
                                    v20 = object6 instanceof T7.i ? f.n(((T7.i)object6).X) : f.n(((int)(((Integer)object6))));
                                    break;
                                }
                                case 14: {
                                    ((Integer)object6).getClass();
                                    v20 = 4;
                                    break;
                                }
                                case 15: {
                                    ((Long)object6).getClass();
                                    v20 = 8;
                                    break;
                                }
                                case 16: {
                                    int v22 = (int)(((Integer)object6));
                                    v20 = f.x(v22 >> 0x1F ^ v22 << 1);
                                    break;
                                }
                                case 17: {
                                    long v23 = (long)(((Long)object6));
                                    v20 = f.z(v23 << 1 ^ v23 >> 0x3F);
                                    break;
                                }
                                default: {
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                }
                            }
                            f1.K(v20 + (v00 == s00 ? 2 : 1) + (v16 + v15));
                            Object object7 = ((Map.Entry)object4).getKey();
                            Object object8 = ((Map.Entry)object4).getValue();
                            k.b(f1, r00, 1, object7);
                            k.b(f1, v00, 2, object8);
                            iterator0 = iterator0;
                            v5 = v5;
                            v = v;
                            v9 = v9;
                        }
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 51: {
                    if(this.n(v5, v3, object0)) {
                        f0.c(v5, ((double)(((Double)n0.c.i(((long)(v4 & 0xFFFFF)), object0)))));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 52: {
                    if(this.n(v5, v3, object0)) {
                        f0.g(v5, ((float)(((Float)n0.c.i(((long)(v4 & 0xFFFFF)), object0)))));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 53: {
                    if(this.n(v5, v3, object0)) {
                        f0.j(v5, N.t(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 54: {
                    if(this.n(v5, v3, object0)) {
                        f0.q(v5, N.t(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 55: {
                    if(this.n(v5, v3, object0)) {
                        f0.i(v5, N.s(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 56: {
                    if(this.n(v5, v3, object0)) {
                        f0.f(v5, N.t(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 57: {
                    if(this.n(v5, v3, object0)) {
                        f0.e(v5, N.s(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 58: {
                    if(this.n(v5, v3, object0)) {
                        f0.a(v5, ((Boolean)n0.c.i(((long)(v4 & 0xFFFFF)), object0)).booleanValue());
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 59: {
                    if(this.n(v5, v3, object0)) {
                        Object object9 = unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)));
                        if(object9 instanceof String) {
                            ((f)f0.a).J(v5, 2);
                            ((f)f0.a).I(((String)object9));
                        }
                        else {
                            f0.b(v5, ((e)object9));
                        }
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 60: {
                    if(this.n(v5, v3, object0)) {
                        f0.k(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), this.j(v3));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 61: {
                    if(this.n(v5, v3, object0)) {
                        f0.b(v5, ((e)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 62: {
                    if(this.n(v5, v3, object0)) {
                        f0.p(v5, N.s(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 0x3F: {
                    if(this.n(v5, v3, object0)) {
                        f0.d(v5, N.s(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 0x40: {
                    if(this.n(v5, v3, object0)) {
                        f0.l(v5, N.s(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 65: {
                    if(this.n(v5, v3, object0)) {
                        f0.m(v5, N.t(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 66: {
                    if(this.n(v5, v3, object0)) {
                        f0.n(v5, N.s(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 67: {
                    if(this.n(v5, v3, object0)) {
                        f0.o(v5, N.t(v4 & 0xFFFFF, object0));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                case 68: {
                    if(this.n(v5, v3, object0)) {
                        f0.h(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), this.j(v3));
                    }
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
                default: {
                    v12 = v;
                    v13 = v9;
                    v14 = v3;
                    break;
                }
            }
            v3 = v14 + 3;
            v1 = v11;
            v = v12;
        }
        this.h.getClass();
        ((p)object0).unknownFields.b(f0);
    }
}

