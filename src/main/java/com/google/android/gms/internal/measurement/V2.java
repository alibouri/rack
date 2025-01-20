package com.google.android.gms.internal.measurement;

import D3.a;
import com.apollographql.apollo.api.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;
import v.h;

public final class v2 implements C2 {
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final N1 e;
    public final int[] f;
    public final int g;
    public final int h;
    public static final int[] i;
    public static final Unsafe j;

    static {
        v2.i = new int[0];
        v2.j = G2.i();
    }

    public v2(int[] arr_v, Object[] arr_object, int v, int v1, N1 n10, int[] arr_v1, int v2, int v3, d2 d20) {
        this.a = arr_v;
        this.b = arr_object;
        this.c = v;
        this.d = v1;
        this.f = arr_v1;
        this.g = v2;
        this.h = v3;
        this.e = n10;
    }

    public static long A(long v, Object object0) {
        return (long)(((Long)G2.o(v, object0)));
    }

    public final g2 B(int v) {
        return (g2)this.b[(v / 3 << 1) + 1];
    }

    public final C2 C(int v) {
        int v1 = v / 3 << 1;
        Object[] arr_object = this.b;
        C2 c20 = (C2)arr_object[v1];
        if(c20 != null) {
            return c20;
        }
        C2 c21 = A2.c.a(((Class)arr_object[v1 + 1]));
        arr_object[v1] = c21;
        return c21;
    }

    public final Object D(int v) {
        return this.b[v / 3 << 1];
    }

    public static boolean E(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof c2 ? ((c2)object0).n() : true;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final boolean a(Object object0) {
        int v10;
        int v9;
        int v = 0xFFFFF;
        int v2 = 0;
        for(int v1 = 0; v2 < this.g; v1 = v9) {
            int v3 = this.f[v2];
            int v4 = this.a[v3];
            int v5 = this.u(v3);
            int v6 = this.a[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 == v) {
                v10 = v;
                v9 = v1;
            }
            else {
                if(v7 != 0xFFFFF) {
                    v1 = v2.j.getInt(object0, ((long)v7));
                }
                v9 = v1;
                v10 = v7;
            }
            if((0x10000000 & v5) != 0 && !this.r(object0, v3, v10, v9, v8)) {
                return false;
            }
            switch((0xFF00000 & v5) >>> 20) {
                case 9: 
                case 17: {
                    if(this.r(object0, v3, v10, v9, v8) && !this.C(v3).a(G2.o(v5 & 0xFFFFF, object0))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)G2.o(v5 & 0xFFFFF, object0);
                    if(!list0.isEmpty()) {
                        C2 c20 = this.C(v3);
                        for(int v11 = 0; v11 < list0.size(); ++v11) {
                            if(!c20.a(list0.get(v11))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    if(!O.h(G2.o(v5 & 0xFFFFF, object0)).isEmpty()) {
                        O.d(this.D(v3));
                        throw null;
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.x(v4, v3, object0) && !this.C(v3).a(G2.o(v5 & 0xFFFFF, object0))) {
                        return false;
                    }
                }
            }
            ++v2;
            v = v10;
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final int b(c2 c20) {
        int[] arr_v = this.a;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v2 = this.u(v);
            int v3 = arr_v[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 0x4D5;
            int v6 = 37;
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    v1 = e2.a(Double.doubleToLongBits(G2.c.a(v4, c20))) + v1 * 53;
                    break;
                }
                case 1: {
                    v1 = Float.floatToIntBits(G2.c.i(v4, c20)) + v1 * 53;
                    break;
                }
                case 2: {
                    v1 = e2.a(G2.c.m(v4, c20)) + v1 * 53;
                    break;
                }
                case 3: {
                    v1 = e2.a(G2.c.m(v4, c20)) + v1 * 53;
                    break;
                }
                case 4: {
                    v1 = G2.c.l(v4, c20) + v1 * 53;
                    break;
                }
                case 5: {
                    v1 = e2.a(G2.c.m(v4, c20)) + v1 * 53;
                    break;
                }
                case 6: {
                    v1 = G2.c.l(v4, c20) + v1 * 53;
                    break;
                }
                case 7: {
                    if(G2.c.k(v4, c20)) {
                        v5 = 0x4CF;
                    }
                    v1 = v5 + v1 * 53;
                    break;
                }
                case 8: {
                    v1 = ((String)G2.o(v4, c20)).hashCode() + v1 * 53;
                    break;
                }
                case 9: {
                    Object object0 = G2.o(v4, c20);
                    if(object0 != null) {
                        v6 = object0.hashCode();
                    }
                    v1 = v1 * 53 + v6;
                    break;
                }
                case 10: {
                    v1 = G2.o(v4, c20).hashCode() + v1 * 53;
                    break;
                }
                case 11: {
                    v1 = G2.c.l(v4, c20) + v1 * 53;
                    break;
                }
                case 12: {
                    v1 = G2.c.l(v4, c20) + v1 * 53;
                    break;
                }
                case 13: {
                    v1 = G2.c.l(v4, c20) + v1 * 53;
                    break;
                }
                case 14: {
                    v1 = e2.a(G2.c.m(v4, c20)) + v1 * 53;
                    break;
                }
                case 15: {
                    v1 = G2.c.l(v4, c20) + v1 * 53;
                    break;
                }
                case 16: {
                    v1 = e2.a(G2.c.m(v4, c20)) + v1 * 53;
                    break;
                }
                case 17: {
                    Object object1 = G2.o(v4, c20);
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
                    v1 = G2.o(v4, c20).hashCode() + v1 * 53;
                    break;
                }
                case 50: {
                    v1 = G2.o(v4, c20).hashCode() + v1 * 53;
                    break;
                }
                case 51: {
                    if(this.x(v3, v, c20)) {
                        v1 = e2.a(Double.doubleToLongBits(((double)(((Double)G2.o(v4, c20)))))) + v1 * 53;
                    }
                    break;
                }
                case 52: {
                    if(this.x(v3, v, c20)) {
                        v1 = Float.floatToIntBits(((float)(((Float)G2.o(v4, c20))))) + v1 * 53;
                    }
                    break;
                }
                case 53: {
                    if(this.x(v3, v, c20)) {
                        v1 = e2.a(v2.A(v4, c20)) + v1 * 53;
                    }
                    break;
                }
                case 54: {
                    if(this.x(v3, v, c20)) {
                        v1 = e2.a(v2.A(v4, c20)) + v1 * 53;
                    }
                    break;
                }
                case 55: {
                    if(this.x(v3, v, c20)) {
                        v1 = v2.v(v4, c20) + v1 * 53;
                    }
                    break;
                }
                case 56: {
                    if(this.x(v3, v, c20)) {
                        v1 = e2.a(v2.A(v4, c20)) + v1 * 53;
                    }
                    break;
                }
                case 57: {
                    if(this.x(v3, v, c20)) {
                        v1 = v2.v(v4, c20) + v1 * 53;
                    }
                    break;
                }
                case 58: {
                    if(this.x(v3, v, c20)) {
                        if(((Boolean)G2.o(v4, c20)).booleanValue()) {
                            v5 = 0x4CF;
                        }
                        v1 = v5 + v1 * 53;
                    }
                    break;
                }
                case 59: {
                    if(this.x(v3, v, c20)) {
                        v1 = ((String)G2.o(v4, c20)).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 60: {
                    if(this.x(v3, v, c20)) {
                        v1 = G2.o(v4, c20).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 61: {
                    if(this.x(v3, v, c20)) {
                        v1 = G2.o(v4, c20).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 62: {
                    if(this.x(v3, v, c20)) {
                        v1 = v2.v(v4, c20) + v1 * 53;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.x(v3, v, c20)) {
                        v1 = v2.v(v4, c20) + v1 * 53;
                    }
                    break;
                }
                case 0x40: {
                    if(this.x(v3, v, c20)) {
                        v1 = v2.v(v4, c20) + v1 * 53;
                    }
                    break;
                }
                case 65: {
                    if(this.x(v3, v, c20)) {
                        v1 = e2.a(v2.A(v4, c20)) + v1 * 53;
                    }
                    break;
                }
                case 66: {
                    if(this.x(v3, v, c20)) {
                        v1 = v2.v(v4, c20) + v1 * 53;
                    }
                    break;
                }
                case 67: {
                    if(this.x(v3, v, c20)) {
                        v1 = e2.a(v2.A(v4, c20)) + v1 * 53;
                    }
                    break;
                }
                case 68: {
                    if(this.x(v3, v, c20)) {
                        v1 = G2.o(v4, c20).hashCode() + v1 * 53;
                    }
                }
            }
        }
        return c20.zzb.hashCode() + v1 * 53;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final boolean c(c2 c20, Object object0) {
        int[] arr_v = this.a;
        for(int v = 0; true; v += 3) {
            boolean z = true;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.u(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(!this.z(c20, object0, v) || Double.doubleToLongBits(G2.c.a(v2, c20)) != Double.doubleToLongBits(G2.c.a(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 1: {
                    if(!this.z(c20, object0, v) || Float.floatToIntBits(G2.c.i(v2, c20)) != Float.floatToIntBits(G2.c.i(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 2: {
                    if(!this.z(c20, object0, v) || G2.c.m(v2, c20) != G2.c.m(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 3: {
                    if(!this.z(c20, object0, v) || G2.c.m(v2, c20) != G2.c.m(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 4: {
                    if(!this.z(c20, object0, v) || G2.c.l(v2, c20) != G2.c.l(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 5: {
                    if(!this.z(c20, object0, v) || G2.c.m(v2, c20) != G2.c.m(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 6: {
                    if(!this.z(c20, object0, v) || G2.c.l(v2, c20) != G2.c.l(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 7: {
                    if(!this.z(c20, object0, v) || G2.c.k(v2, c20) != G2.c.k(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 8: {
                    if(!this.z(c20, object0, v) || !G1.o(G2.o(v2, c20), G2.o(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 9: {
                    if(!this.z(c20, object0, v) || !G1.o(G2.o(v2, c20), G2.o(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 10: {
                    if(!this.z(c20, object0, v) || !G1.o(G2.o(v2, c20), G2.o(v2, object0))) {
                        z = false;
                    }
                    break;
                }
                case 11: {
                    if(!this.z(c20, object0, v) || G2.c.l(v2, c20) != G2.c.l(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 12: {
                    if(!this.z(c20, object0, v) || G2.c.l(v2, c20) != G2.c.l(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 13: {
                    if(!this.z(c20, object0, v) || G2.c.l(v2, c20) != G2.c.l(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 14: {
                    if(!this.z(c20, object0, v) || G2.c.m(v2, c20) != G2.c.m(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 15: {
                    if(!this.z(c20, object0, v) || G2.c.l(v2, c20) != G2.c.l(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 16: {
                    if(!this.z(c20, object0, v) || G2.c.m(v2, c20) != G2.c.m(v2, object0)) {
                        z = false;
                    }
                    break;
                }
                case 17: {
                    if(!this.z(c20, object0, v) || !G1.o(G2.o(v2, c20), G2.o(v2, object0))) {
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
                    z = G1.o(G2.o(v2, c20), G2.o(v2, object0));
                    break;
                }
                case 50: {
                    z = G1.o(G2.o(v2, c20), G2.o(v2, object0));
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
                    if(G2.c.l(v3, c20) != G2.c.l(v3, object0) || !G1.o(G2.o(v2, c20), G2.o(v2, object0))) {
                        z = false;
                    }
                }
            }
            if(!z) {
                return false;
            }
        }
        return c20.zzb.equals(((c2)object0).zzb);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void d(Object object0) {
        if(!v2.E(object0)) {
            return;
        }
        if(object0 instanceof c2) {
            ((c2)object0).j(0x7FFFFFFF);
            ((c2)object0).zza = 0;
            ((c2)object0).m();
        }
        int[] arr_v = this.a;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v1 = this.u(v);
            long v2 = (long)(0xFFFFF & v1);
            switch((v1 & 0xFF00000) >>> 20) {
                case 9: 
                case 17: {
                    if(this.y(v, object0)) {
                        this.C(v).d(v2.j.getObject(object0, v2));
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
                    Z1.o(v2, object0);
                    break;
                }
                case 50: {
                    Unsafe unsafe0 = v2.j;
                    Object object1 = unsafe0.getObject(object0, v2);
                    if(object1 != null) {
                        O.g(object1);
                        unsafe0.putObject(object0, v2, object1);
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.x(arr_v[v], v, object0)) {
                        this.C(v).d(v2.j.getObject(object0, v2));
                    }
                }
            }
        }
        d2.g(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final int e(c2 c20) {
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        Unsafe unsafe0 = v2.j;
        int v = 0xFFFFF;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; true; v1 = v10) {
            int[] arr_v = this.a;
            if(v2 >= arr_v.length) {
                break;
            }
            int v4 = this.u(v2);
            int v5 = (0xFF00000 & v4) >>> 20;
            int v6 = arr_v[v2];
            int v7 = arr_v[v2 + 2];
            int v8 = v7 & 0xFFFFF;
            if(v5 <= 17) {
                if(v8 != v) {
                    v1 = v8 == 0xFFFFF ? 0 : unsafe0.getInt(c20, ((long)v8));
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
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.p(v6);
                    }
                    break;
                }
                case 1: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.j(v6);
                    }
                    break;
                }
                case 2: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.E(v6, unsafe0.getLong(c20, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 3: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.L(v6, unsafe0.getLong(c20, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 4: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.K(v6, unsafe0.getInt(c20, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 5: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.z(v6);
                    }
                    break;
                }
                case 6: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.I(v6);
                    }
                    break;
                }
                case 7: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.r(v6);
                    }
                    break;
                }
                case 8: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        Object object0 = unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)));
                        v12 = object0 instanceof T1 ? U1.A(v6, ((T1)object0)) : U1.t(v6, ((String)object0));
                        v3 += v12;
                        break;
                    }
                    break;
                }
                case 9: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += G1.a(v6, unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF))), this.C(v2));
                    }
                    break;
                }
                case 10: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.A(v6, ((T1)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    }
                    break;
                }
                case 11: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.R(v6, unsafe0.getInt(c20, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 12: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.H(v6, unsafe0.getInt(c20, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 13: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.N(v6);
                    }
                    break;
                }
                case 14: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.G(v6);
                    }
                    break;
                }
                case 15: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.P(v6, unsafe0.getInt(c20, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 16: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.J(v6, unsafe0.getLong(c20, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 17: {
                    if(this.r(c20, v2, v9, v10, v11)) {
                        v3 += U1.s(v6, ((N1)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))), this.C(v2));
                    }
                    break;
                }
                case 18: {
                    v3 += G1.A(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 19: {
                    v3 += G1.x(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 20: {
                    v3 += G1.G(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 21: {
                    v3 += G1.S(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 22: {
                    v3 += G1.D(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 23: {
                    v3 += G1.A(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 24: {
                    v3 += G1.x(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 25: {
                    v3 += G1.b(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 26: {
                    v3 += G1.w(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 27: {
                    v3 += G1.r(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))), this.C(v2));
                    break;
                }
                case 28: {
                    v3 += G1.p(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 29: {
                    v3 += G1.P(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 30: {
                    v3 += G1.q(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 0x1F: {
                    v3 += G1.x(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 0x20: {
                    v3 += G1.A(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 33: {
                    v3 += G1.J(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 34: {
                    v3 += G1.M(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    break;
                }
                case 35: {
                    v13 = G1.B(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 36: {
                    v13 = G1.y(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 37: {
                    v13 = G1.H(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 38: {
                    v13 = G1.T(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 39: {
                    v13 = G1.E(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 40: {
                    v13 = G1.B(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 41: {
                    v13 = G1.y(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 42: {
                    v13 = G1.d(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 43: {
                    v13 = G1.Q(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 44: {
                    v13 = G1.s(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 45: {
                    v13 = G1.y(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 46: {
                    v13 = G1.B(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 0x2F: {
                    v13 = G1.K(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 0x30: {
                    v13 = G1.N(((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    if(v13 > 0) {
                        v3 += U1.Q(v13) + U1.O(v6) + v13;
                    }
                    break;
                }
                case 49: {
                    v3 += G1.c(v6, ((List)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))), this.C(v2));
                    break;
                }
                case 50: {
                    O.e(unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF))), this.D(v2));
                    break;
                }
                case 51: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.p(v6);
                    }
                    break;
                }
                case 52: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.j(v6);
                    }
                    break;
                }
                case 53: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.E(v6, v2.A(v4 & 0xFFFFF, c20));
                    }
                    break;
                }
                case 54: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.L(v6, v2.A(v4 & 0xFFFFF, c20));
                    }
                    break;
                }
                case 55: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.K(v6, v2.v(v4 & 0xFFFFF, c20));
                    }
                    break;
                }
                case 56: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.z(v6);
                    }
                    break;
                }
                case 57: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.I(v6);
                    }
                    break;
                }
                case 58: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.r(v6);
                    }
                    break;
                }
                case 59: {
                    if(this.x(v6, v2, c20)) {
                        Object object1 = unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)));
                        v12 = object1 instanceof T1 ? U1.A(v6, ((T1)object1)) : U1.t(v6, ((String)object1));
                        v3 += v12;
                    }
                    break;
                }
                case 60: {
                    if(this.x(v6, v2, c20)) {
                        v3 += G1.a(v6, unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF))), this.C(v2));
                    }
                    break;
                }
                case 61: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.A(v6, ((T1)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))));
                    }
                    break;
                }
                case 62: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.R(v6, v2.v(v4 & 0xFFFFF, c20));
                    }
                    break;
                }
                case 0x3F: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.H(v6, v2.v(v4 & 0xFFFFF, c20));
                    }
                    break;
                }
                case 0x40: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.N(v6);
                    }
                    break;
                }
                case 65: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.G(v6);
                    }
                    break;
                }
                case 66: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.P(v6, v2.v(v4 & 0xFFFFF, c20));
                    }
                    break;
                }
                case 67: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.J(v6, v2.A(v4 & 0xFFFFF, c20));
                    }
                    break;
                }
                case 68: {
                    if(this.x(v6, v2, c20)) {
                        v3 += U1.s(v6, ((N1)unsafe0.getObject(c20, ((long)(v4 & 0xFFFFF)))), this.C(v2));
                    }
                }
            }
            v2 += 3;
            v = v9;
        }
        return d2.c(d2.f(c20)) + v3;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void f(Object object0, Object object1) {
        if(!v2.E(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
        object1.getClass();
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.u(v);
            long v2 = (long)(v1 & 0xFFFFF);
            int v3 = arr_v[v];
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.y(v, object1)) {
                        G2.e(object0, v2, G2.c.a(v2, object1));
                        this.s(v, object0);
                    }
                    break;
                }
                case 1: {
                    if(this.y(v, object1)) {
                        G2.f(object0, v2, G2.c.i(v2, object1));
                        this.s(v, object0);
                    }
                    break;
                }
                case 2: {
                    if(this.y(v, object1)) {
                        long v4 = G2.c.m(v2, object1);
                        G2.c.c(v2, v4, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 3: {
                    if(this.y(v, object1)) {
                        long v5 = G2.c.m(v2, object1);
                        G2.c.c(v2, v5, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 4: {
                    if(this.y(v, object1)) {
                        G2.c(G2.c.l(v2, object1), v2, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 5: {
                    if(this.y(v, object1)) {
                        long v6 = G2.c.m(v2, object1);
                        G2.c.c(v2, v6, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 6: {
                    if(this.y(v, object1)) {
                        G2.c(G2.c.l(v2, object1), v2, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 7: {
                    if(this.y(v, object1)) {
                        G2.l(object0, v2, G2.c.k(v2, object1));
                        this.s(v, object0);
                    }
                    break;
                }
                case 8: {
                    if(this.y(v, object1)) {
                        G2.d(v2, object0, G2.o(v2, object1));
                        this.s(v, object0);
                    }
                    break;
                }
                case 9: {
                    this.q(object0, object1, v);
                    break;
                }
                case 10: {
                    if(this.y(v, object1)) {
                        G2.d(v2, object0, G2.o(v2, object1));
                        this.s(v, object0);
                    }
                    break;
                }
                case 11: {
                    if(this.y(v, object1)) {
                        G2.c(G2.c.l(v2, object1), v2, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 12: {
                    if(this.y(v, object1)) {
                        G2.c(G2.c.l(v2, object1), v2, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 13: {
                    if(this.y(v, object1)) {
                        G2.c(G2.c.l(v2, object1), v2, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 14: {
                    if(this.y(v, object1)) {
                        long v7 = G2.c.m(v2, object1);
                        G2.c.c(v2, v7, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 15: {
                    if(this.y(v, object1)) {
                        G2.c(G2.c.l(v2, object1), v2, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 16: {
                    if(this.y(v, object1)) {
                        long v8 = G2.c.m(v2, object1);
                        G2.c.c(v2, v8, object0);
                        this.s(v, object0);
                    }
                    break;
                }
                case 17: {
                    this.q(object0, object1, v);
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
                    l2 l20 = (l2)G2.o(v2, object0);
                    l2 l21 = (l2)G2.o(v2, object1);
                    int v9 = l20.size();
                    int v10 = l21.size();
                    if(v9 > 0 && v10 > 0) {
                        if(!((O1)l20).X) {
                            l20 = l20.b(v10 + v9);
                        }
                        l20.addAll(l21);
                    }
                    if(v9 > 0) {
                        l21 = l20;
                    }
                    G2.d(v2, object0, l21);
                    break;
                }
                case 50: {
                    G2.d(v2, object0, O.c(G2.o(v2, object0), G2.o(v2, object1)));
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
                    if(this.x(v3, v, object1)) {
                        G2.d(v2, object0, G2.o(v2, object1));
                        G2.c(v3, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
                    }
                    break;
                }
                case 60: {
                    this.t(object0, v, object1);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.x(v3, v, object1)) {
                        G2.d(v2, object0, G2.o(v2, object1));
                        G2.c(v3, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
                    }
                    break;
                }
                case 68: {
                    this.t(object0, v, object1);
                }
            }
        }
        G1.m(object0, object1);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void g(Object object0, byte[] arr_b, int v, int v1, R1 r10) {
        this.j(object0, arr_b, v, v1, 0, r10);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void h(Object object0, q2 q20) {
        J2 j23;
        J2 j21;
        int v13;
        int v12;
        int[] arr_v1;
        int v11;
        int v10;
        int v9;
        v2 v20 = this;
        q20.getClass();
        int[] arr_v = v20.a;
        int v = arr_v.length;
        Unsafe unsafe0 = v2.j;
        int v1 = 0xFFFFF;
        int v2 = 0;
        int v3 = 0;
        while(v3 < v) {
            int v4 = v20.u(v3);
            int v5 = arr_v[v3];
            int v6 = (0xFF00000 & v4) >>> 20;
            if(v6 <= 17) {
                int v7 = arr_v[v3 + 2];
                int v8 = v7 & 0xFFFFF;
                if(v8 != v1) {
                    v2 = v8 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v8));
                    v1 = v8;
                }
                v9 = v1;
                v10 = v2;
                v11 = 1 << (v7 >>> 20);
            }
            else {
                v9 = v1;
                v10 = v2;
                v11 = 0;
            }
            U1 u10 = (U1)q20.X;
            switch(v6) {
                case 0: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.d(v5, G2.a(v4 & 0xFFFFF, object0));
                    }
                    break;
                }
                case 1: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.e(v5, G2.g(v4 & 0xFFFFF, object0));
                    }
                    break;
                }
                case 2: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.l(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 3: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.s(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 4: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.n(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 5: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.g(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 6: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.k(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    break;
                }
                case 7: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v13, v10, v11)) {
                        q20.j(v5, G2.p(v4 & 0xFFFFF, object0));
                    }
                    break;
                }
                case 8: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        Object object1 = unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)));
                        if(object1 instanceof String) {
                            String s = (String)object1;
                            u10.C(v5, 2);
                            int v14 = u10.e;
                            try {
                                int v15 = U1.Q(s.length());
                                byte[] arr_b = u10.c;
                                if(v15 == U1.Q(s.length() * 3)) {
                                    int v16 = v14 + v15;
                                    u10.e = v16;
                                    int v17 = I2.b(s, arr_b, v16, u10.q());
                                    u10.e = v14;
                                    u10.B(v17 - v14 - v15);
                                    u10.e = v17;
                                }
                                else {
                                    u10.B(I2.a(s));
                                    u10.e = I2.b(s, arr_b, u10.e, u10.q());
                                }
                                break;
                            }
                            catch(J2 j20) {
                                j21 = j20;
                            }
                            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                                throw new a(indexOutOfBoundsException0);
                            }
                            u10.e = v14;
                            U1.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", j21);
                            byte[] arr_b1 = s.getBytes(e2.a);
                            try {
                                u10.B(arr_b1.length);
                                u10.D(arr_b1, 0, arr_b1.length);
                                break;
                            }
                            catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
                                throw new a(indexOutOfBoundsException1);
                            }
                            throw new a(indexOutOfBoundsException0);
                        }
                        else {
                            q20.h(v5, ((T1)object1));
                            break;
                        }
                        goto label_113;
                    }
                    break;
                }
                case 9: {
                label_113:
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.m(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), v20.C(v3));
                    }
                    v13 = v9;
                    break;
                }
                case 10: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.h(v5, ((T1)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))));
                    }
                    v13 = v9;
                    break;
                }
                case 11: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.t(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    v13 = v9;
                    break;
                }
                case 12: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.f(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    v13 = v9;
                    break;
                }
                case 13: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.p(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    v13 = v9;
                    break;
                }
                case 14: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.o(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    v13 = v9;
                    break;
                }
                case 15: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.r(v5, unsafe0.getInt(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    v13 = v9;
                    break;
                }
                case 16: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.q(v5, unsafe0.getLong(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    v13 = v9;
                    break;
                }
                case 17: {
                    arr_v1 = arr_v;
                    v12 = v;
                    if(this.r(object0, v3, v9, v10, v11)) {
                        q20.i(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), v20.C(v3));
                    }
                    v13 = v9;
                    break;
                }
                case 18: {
                    G1.v(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 19: {
                    G1.I(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 20: {
                    G1.O(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 21: {
                    G1.Y(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 22: {
                    G1.L(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 23: {
                    G1.F(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 24: {
                    G1.C(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 25: {
                    G1.k(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 26: {
                    G1.t(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 27: {
                    G1.u(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, v20.C(v3));
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 28: {
                    G1.i(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 29: {
                    G1.X(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 30: {
                    G1.z(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 0x1F: {
                    G1.R(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 0x20: {
                    G1.U(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 33: {
                    G1.V(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 34: {
                    G1.W(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, false);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 35: {
                    G1.v(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 36: {
                    G1.I(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 37: {
                    G1.O(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 38: {
                    G1.Y(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 39: {
                    G1.L(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 40: {
                    G1.F(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 41: {
                    G1.C(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 42: {
                    G1.k(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 43: {
                    G1.X(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 44: {
                    G1.z(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 45: {
                    G1.R(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 46: {
                    G1.U(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 0x2F: {
                    G1.V(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 0x30: {
                    G1.W(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, true);
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 49: {
                    G1.j(arr_v[v3], ((List)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))), q20, v20.C(v3));
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 50: {
                    if(unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))) != null) {
                        O.d(v20.D(v3));
                        throw null;
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 51: {
                    if(v20.x(v5, v3, object0)) {
                        q20.d(v5, ((double)(((Double)G2.o(v4 & 0xFFFFF, object0)))));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 52: {
                    if(v20.x(v5, v3, object0)) {
                        q20.e(v5, ((float)(((Float)G2.o(v4 & 0xFFFFF, object0)))));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 53: {
                    if(v20.x(v5, v3, object0)) {
                        q20.l(v5, v2.A(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 54: {
                    if(v20.x(v5, v3, object0)) {
                        q20.s(v5, v2.A(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 55: {
                    if(v20.x(v5, v3, object0)) {
                        q20.n(v5, v2.v(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 56: {
                    if(v20.x(v5, v3, object0)) {
                        q20.g(v5, v2.A(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 57: {
                    if(v20.x(v5, v3, object0)) {
                        q20.k(v5, v2.v(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 58: {
                    if(v20.x(v5, v3, object0)) {
                        q20.j(v5, ((Boolean)G2.o(v4 & 0xFFFFF, object0)).booleanValue());
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 59: {
                    if(v20.x(v5, v3, object0)) {
                        Object object2 = unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)));
                        if(object2 instanceof String) {
                            String s1 = (String)object2;
                            u10.C(v5, 2);
                            int v18 = u10.e;
                            try {
                                int v19 = U1.Q(s1.length());
                                byte[] arr_b2 = u10.c;
                                if(v19 == U1.Q(s1.length() * 3)) {
                                    int v20_1 = v18 + v19;
                                    u10.e = v20_1;
                                    int v21 = I2.b(s1, arr_b2, v20_1, u10.q());
                                    u10.e = v18;
                                    u10.B(v21 - v18 - v19);
                                    u10.e = v21;
                                }
                                else {
                                    u10.B(I2.a(s1));
                                    u10.e = I2.b(s1, arr_b2, u10.e, u10.q());
                                }
                                arr_v1 = arr_v;
                                v12 = v;
                                v13 = v9;
                                break;
                            }
                            catch(J2 j22) {
                                j23 = j22;
                            }
                            catch(IndexOutOfBoundsException indexOutOfBoundsException2) {
                                throw new a(indexOutOfBoundsException2);
                            }
                            u10.e = v18;
                            U1.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", j23);
                            byte[] arr_b3 = s1.getBytes(e2.a);
                            try {
                                u10.B(arr_b3.length);
                                u10.D(arr_b3, 0, arr_b3.length);
                                arr_v1 = arr_v;
                                v12 = v;
                                v13 = v9;
                                break;
                            }
                            catch(IndexOutOfBoundsException indexOutOfBoundsException3) {
                                throw new a(indexOutOfBoundsException3);
                            }
                            throw new a(indexOutOfBoundsException2);
                        }
                        else {
                            q20.h(v5, ((T1)object2));
                        }
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 60: {
                    if(v20.x(v5, v3, object0)) {
                        q20.m(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), v20.C(v3));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 61: {
                    if(v20.x(v5, v3, object0)) {
                        q20.h(v5, ((T1)unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF)))));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 62: {
                    if(v20.x(v5, v3, object0)) {
                        q20.t(v5, v2.v(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 0x3F: {
                    if(v20.x(v5, v3, object0)) {
                        q20.f(v5, v2.v(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 0x40: {
                    if(v20.x(v5, v3, object0)) {
                        q20.p(v5, v2.v(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 65: {
                    if(v20.x(v5, v3, object0)) {
                        q20.o(v5, v2.A(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 66: {
                    if(v20.x(v5, v3, object0)) {
                        q20.r(v5, v2.v(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 67: {
                    if(v20.x(v5, v3, object0)) {
                        q20.q(v5, v2.A(v4 & 0xFFFFF, object0));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                case 68: {
                    if(v20.x(v5, v3, object0)) {
                        q20.i(v5, unsafe0.getObject(object0, ((long)(v4 & 0xFFFFF))), v20.C(v3));
                    }
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
                default: {
                    arr_v1 = arr_v;
                    v12 = v;
                    v13 = v9;
                    break;
                }
            }
            v3 += 3;
            v20 = this;
            v2 = v10;
            arr_v = arr_v1;
            v = v12;
            v1 = v13;
        }
        ((c2)object0).zzb.d(q20);
    }

    public final int i(int v, int v1) {
        int[] arr_v = this.a;
        int v2 = arr_v.length / 3 - 1;
        while(v1 <= v2) {
            int v3 = v2 + v1 >>> 1;
            int v4 = v3 * 3;
            int v5 = arr_v[v4];
            if(v == v5) {
                return v4;
            }
            if(v < v5) {
                v2 = v3 - 1;
            }
            else {
                v1 = v3 + 1;
            }
        }
        return -1;
    }

    public final int j(Object object0, byte[] arr_b, int v, int v1, int v2, R1 r10) {
        // ERROR - The method was not decompiled
        // Self interruption (operation timed-out, maximum duration allowed was 60000 ms)
    }

    public static v2 k(B2 b20, d2 d20) {
        int v93;
        Field field3;
        int v83;
        int v82;
        int v81;
        int v80;
        Field field1;
        int v78;
        int v77;
        Field field0;
        int v76;
        int v75;
        int v74;
        int v69;
        int v63;
        int v14;
        int[] arr_v;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v2;
        if(b20 instanceof B2) {
            String s = b20.c();
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
                v12 = 0;
                v13 = 0;
                arr_v = v2.i;
                v14 = 0;
            }
            else {
                int v15 = v3 + 1;
                int v16 = s.charAt(v3);
                if(v16 >= 0xD800) {
                    int v17 = v16 & 0x1FFF;
                    int v18 = 13;
                    int v19;
                    while((v19 = s.charAt(v15)) >= 0xD800) {
                        v17 |= (v19 & 0x1FFF) << v18;
                        v18 += 13;
                        ++v15;
                    }
                    v16 = v17 | v19 << v18;
                    ++v15;
                }
                int v20 = v15 + 1;
                int v21 = s.charAt(v15);
                if(v21 >= 0xD800) {
                    int v22 = v21 & 0x1FFF;
                    int v23 = 13;
                    int v24;
                    while((v24 = s.charAt(v20)) >= 0xD800) {
                        v22 |= (v24 & 0x1FFF) << v23;
                        v23 += 13;
                        ++v20;
                    }
                    v21 = v22 | v24 << v23;
                    ++v20;
                }
                int v25 = v20 + 1;
                int v26 = s.charAt(v20);
                if(v26 >= 0xD800) {
                    int v27 = v26 & 0x1FFF;
                    int v28 = 13;
                    int v29;
                    while((v29 = s.charAt(v25)) >= 0xD800) {
                        v27 |= (v29 & 0x1FFF) << v28;
                        v28 += 13;
                        ++v25;
                    }
                    v26 = v27 | v29 << v28;
                    ++v25;
                }
                int v30 = v25 + 1;
                int v31 = s.charAt(v25);
                if(v31 >= 0xD800) {
                    int v32 = v31 & 0x1FFF;
                    int v33 = 13;
                    int v34;
                    while((v34 = s.charAt(v30)) >= 0xD800) {
                        v32 |= (v34 & 0x1FFF) << v33;
                        v33 += 13;
                        ++v30;
                    }
                    v31 = v32 | v34 << v33;
                    ++v30;
                }
                int v35 = v30 + 1;
                v9 = s.charAt(v30);
                if(v9 >= 0xD800) {
                    int v36 = v9 & 0x1FFF;
                    int v37 = 13;
                    int v38;
                    while((v38 = s.charAt(v35)) >= 0xD800) {
                        v36 |= (v38 & 0x1FFF) << v37;
                        v37 += 13;
                        ++v35;
                    }
                    v9 = v36 | v38 << v37;
                    ++v35;
                }
                int v39 = v35 + 1;
                v10 = s.charAt(v35);
                if(v10 >= 0xD800) {
                    int v40 = v10 & 0x1FFF;
                    int v41 = 13;
                    int v42;
                    while((v42 = s.charAt(v39)) >= 0xD800) {
                        v40 |= (v42 & 0x1FFF) << v41;
                        v41 += 13;
                        ++v39;
                    }
                    v10 = v40 | v42 << v41;
                    ++v39;
                }
                int v43 = v39 + 1;
                int v44 = s.charAt(v39);
                if(v44 >= 0xD800) {
                    int v45 = v44 & 0x1FFF;
                    int v46 = 13;
                    int v47;
                    while((v47 = s.charAt(v43)) >= 0xD800) {
                        v45 |= (v47 & 0x1FFF) << v46;
                        v46 += 13;
                        ++v43;
                    }
                    v44 = v45 | v47 << v46;
                    ++v43;
                }
                int v48 = v43 + 1;
                int v49 = s.charAt(v43);
                if(v49 >= 0xD800) {
                    int v50 = v49 & 0x1FFF;
                    int v51 = 13;
                    int v52;
                    while((v52 = s.charAt(v48)) >= 0xD800) {
                        v50 |= (v52 & 0x1FFF) << v51;
                        v51 += 13;
                        ++v48;
                    }
                    v49 = v50 | v52 << v51;
                    ++v48;
                }
                v14 = v16;
                v3 = v48;
                arr_v = new int[v49 + v10 + v44];
                v11 = v26;
                v8 = (v16 << 1) + v21;
                v13 = v49;
                v12 = v31;
            }
            Unsafe unsafe0 = v2.j;
            Object[] arr_object = b20.d();
            Class class0 = b20.a().getClass();
            int[] arr_v1 = new int[v9 * 3];
            Object[] arr_object1 = new Object[v9 << 1];
            int v53 = v13 + v10;
            int v54 = v13;
            int v55 = v53;
            int v56 = 0;
            int v57 = 0;
            while(v3 < v) {
                int v58 = s.charAt(v3);
                if(v58 >= 0xD800) {
                    int v59 = v58 & 0x1FFF;
                    int v60 = v3 + 1;
                    int v61 = 13;
                    int v62;
                    while((v62 = s.charAt(v60)) >= 0xD800) {
                        v59 |= (v62 & 0x1FFF) << v61;
                        v61 += 13;
                        ++v60;
                    }
                    v58 = v59 | v62 << v61;
                    v63 = v60 + 1;
                }
                else {
                    v63 = v3 + 1;
                }
                int v64 = s.charAt(v63);
                if(v64 >= 0xD800) {
                    int v65 = v64 & 0x1FFF;
                    int v66 = v63 + 1;
                    int v67 = 13;
                    int v68;
                    while((v68 = s.charAt(v66)) >= 0xD800) {
                        v65 |= (v68 & 0x1FFF) << v67;
                        v67 += 13;
                        ++v66;
                    }
                    v64 = v65 | v68 << v67;
                    v69 = v66 + 1;
                }
                else {
                    v69 = v63 + 1;
                }
                if((v64 & 0x400) != 0) {
                    arr_v[v57] = v56;
                    ++v57;
                }
                if((v64 & 0xFF) >= 51) {
                    int v70 = s.charAt(v69);
                    if(v70 >= 0xD800) {
                        int v71 = v70 & 0x1FFF;
                        int v72 = v69 + 1;
                        int v73 = 13;
                        while(true) {
                            v74 = s.charAt(v72);
                            v75 = v12;
                            if(v74 < 0xD800) {
                                break;
                            }
                            v71 |= (v74 & 0x1FFF) << v73;
                            v73 += 13;
                            ++v72;
                            v12 = v75;
                        }
                        v70 = v71 | v74 << v73;
                        v76 = v72 + 1;
                    }
                    else {
                        v75 = v12;
                        v76 = v69 + 1;
                    }
                    switch((v64 & 0xFF) - 51) {
                        case 12: {
                            if(h.b(b20.b(), 1) || (v64 & 0x800) != 0) {
                                arr_object1[(v56 / 3 << 1) + 1] = arr_object[v8];
                                ++v8;
                            }
                            break;
                        }
                        case 9: 
                        case 17: {
                            arr_object1[(v56 / 3 << 1) + 1] = arr_object[v8];
                            ++v8;
                        }
                    }
                    Object object0 = arr_object[v70 << 1];
                    if(object0 instanceof Field) {
                        field0 = (Field)object0;
                    }
                    else {
                        field0 = v2.n(class0, ((String)object0));
                        arr_object[v70 << 1] = field0;
                    }
                    v77 = v11;
                    v78 = (int)unsafe0.objectFieldOffset(field0);
                    int v79 = (v70 << 1) + 1;
                    Object object1 = arr_object[v79];
                    if(object1 instanceof Field) {
                        field1 = (Field)object1;
                    }
                    else {
                        field1 = v2.n(class0, ((String)object1));
                        arr_object[v79] = field1;
                    }
                    v80 = v58;
                    v81 = v8;
                    v3 = v76;
                    v82 = (int)unsafe0.objectFieldOffset(field1);
                    v83 = 0;
                }
                else {
                    v77 = v11;
                    v75 = v12;
                    int v84 = v8 + 1;
                    Field field2 = v2.n(class0, ((String)arr_object[v8]));
                    switch(v64 & 0xFF) {
                        case 9: 
                        case 17: {
                            v80 = v58;
                            arr_object1[(v56 / 3 << 1) + 1] = field2.getType();
                            break;
                        }
                        case 12: 
                        case 30: 
                        case 44: {
                            v80 = v58;
                            if(b20.b() == 1 || (v64 & 0x800) != 0) {
                                arr_object1[(v56 / 3 << 1) + 1] = arr_object[v84];
                                v84 = v8 + 2;
                            }
                            break;
                        }
                        case 27: 
                        case 49: {
                            v80 = v58;
                            arr_object1[(v56 / 3 << 1) + 1] = arr_object[v84];
                            v84 = v8 + 2;
                            break;
                        }
                        case 50: {
                            arr_v[v54] = v56;
                            int v85 = v56 / 3 << 1;
                            arr_object1[v85] = arr_object[v84];
                            if((v64 & 0x800) == 0) {
                                ++v54;
                                v84 = v8 + 2;
                                v80 = v58;
                            }
                            else {
                                v84 = v8 + 3;
                                arr_object1[v85 + 1] = arr_object[v8 + 2];
                                v80 = v58;
                                ++v54;
                            }
                            break;
                        }
                        default: {
                            v80 = v58;
                        }
                    }
                    int v86 = (int)unsafe0.objectFieldOffset(field2);
                    if((v64 & 0x1000) == 0 || (v64 & 0xFF) > 17) {
                        v82 = 0xFFFFF;
                        v93 = v69;
                        v83 = 0;
                    }
                    else {
                        int v87 = v69 + 1;
                        int v88 = s.charAt(v69);
                        if(v88 >= 0xD800) {
                            int v89 = v88 & 0x1FFF;
                            int v90 = 13;
                            int v91;
                            while((v91 = s.charAt(v87)) >= 0xD800) {
                                v89 |= (v91 & 0x1FFF) << v90;
                                v90 += 13;
                                ++v87;
                            }
                            v88 = v89 | v91 << v90;
                            ++v87;
                        }
                        int v92 = v88 / 0x20 + (v14 << 1);
                        Object object2 = arr_object[v92];
                        if(object2 instanceof Field) {
                            field3 = (Field)object2;
                        }
                        else {
                            field3 = v2.n(class0, ((String)object2));
                            arr_object[v92] = field3;
                        }
                        v83 = v88 % 0x20;
                        v93 = v87;
                        v82 = (int)unsafe0.objectFieldOffset(field3);
                    }
                    if((v64 & 0xFF) >= 18 && (v64 & 0xFF) <= 49) {
                        arr_v[v55] = v86;
                        ++v55;
                    }
                    v81 = v84;
                    v78 = v86;
                    v3 = v93;
                }
                arr_v1[v56] = v80;
                int v94 = v56 + 2;
                arr_v1[v56 + 1] = ((v64 & 0x200) == 0 ? 0 : 0x20000000) | ((v64 & 0x100) == 0 ? 0 : 0x10000000) | ((v64 & 0x800) == 0 ? 0 : 0x80000000) | (v64 & 0xFF) << 20 | v78;
                v56 += 3;
                arr_v1[v94] = v83 << 20 | v82;
                v8 = v81;
                v = v;
                s = s;
                class0 = class0;
                v11 = v77;
                v12 = v75;
            }
            return new v2(arr_v1, arr_object1, v11, v12, b20.a(), arr_v, v13, v53, d20);
        }
        b.w(b20);
        throw new NoSuchMethodError();
    }

    public final Object l(int v, int v1, Object object0) {
        C2 c20 = this.C(v1);
        if(!this.x(v, v1, object0)) {
            return c20.zza();
        }
        int v2 = this.u(v1);
        Object object1 = v2.j.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(v2.E(object1)) {
            return object1;
        }
        Object object2 = c20.zza();
        if(object1 != null) {
            c20.f(object2, object1);
        }
        return object2;
    }

    public final Object m(int v, Object object0) {
        C2 c20 = this.C(v);
        int v1 = this.u(v);
        if(!this.y(v, object0)) {
            return c20.zza();
        }
        Object object1 = v2.j.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(v2.E(object1)) {
            return object1;
        }
        Object object2 = c20.zza();
        if(object1 != null) {
            c20.f(object2, object1);
        }
        return object2;
    }

    public static Field n(Class class0, String s) {
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
            throw new RuntimeException("Field " + s + " for " + class0.getName() + " not found. Known fields are " + Arrays.toString(arr_field));
        }
    }

    public final void o(int v, int v1, Object object0, Object object1) {
        int v2 = this.u(v1);
        v2.j.putObject(object0, ((long)(v2 & 0xFFFFF)), object1);
        G2.c(v, ((long)(this.a[v1 + 2] & 0xFFFFF)), object0);
    }

    public final void p(Object object0, int v, Object object1) {
        int v1 = this.u(v);
        v2.j.putObject(object0, ((long)(v1 & 0xFFFFF)), object1);
        this.s(v, object0);
    }

    public final void q(Object object0, Object object1, int v) {
        if(!this.y(v, object1)) {
            return;
        }
        int v1 = this.u(v);
        Unsafe unsafe0 = v2.j;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.a[v] + " is present but null: " + object1);
        }
        C2 c20 = this.C(v);
        if(!this.y(v, object0)) {
            if(v2.E(object2)) {
                c2 c21 = c20.zza();
                c20.f(c21, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), c21);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.s(v, object0);
            return;
        }
        Object object3 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!v2.E(object3)) {
            c2 c22 = c20.zza();
            c20.f(c22, object3);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), c22);
            object3 = c22;
        }
        c20.f(object3, object2);
    }

    public final boolean r(Object object0, int v, int v1, int v2, int v3) {
        return v1 == 0xFFFFF ? this.y(v, object0) : (v2 & v3) != 0;
    }

    public final void s(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        G2.c(1 << (v1 >>> 20) | G2.c.l(((long)(0xFFFFF & v1)), object0), ((long)(0xFFFFF & v1)), object0);
    }

    public final void t(Object object0, int v, Object object1) {
        int[] arr_v = this.a;
        int v1 = arr_v[v];
        if(!this.x(v1, v, object1)) {
            return;
        }
        int v2 = this.u(v);
        Unsafe unsafe0 = v2.j;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + arr_v[v] + " is present but null: " + object1);
        }
        C2 c20 = this.C(v);
        if(!this.x(v1, v, object0)) {
            if(v2.E(object2)) {
                c2 c21 = c20.zza();
                c20.f(c21, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), c21);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            G2.c(v1, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
            return;
        }
        Object object3 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!v2.E(object3)) {
            c2 c22 = c20.zza();
            c20.f(c22, object3);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), c22);
            object3 = c22;
        }
        c20.f(object3, object2);
    }

    public final int u(int v) {
        return this.a[v + 1];
    }

    public static int v(long v, Object object0) {
        return (int)(((Integer)G2.o(v, object0)));
    }

    public static D2 w(Object object0) {
        D2 d20 = ((c2)object0).zzb;
        if(d20 == D2.f) {
            d20 = D2.e();
            ((c2)object0).zzb = d20;
        }
        return d20;
    }

    public final boolean x(int v, int v1, Object object0) {
        return G2.c.l(((long)(this.a[v1 + 2] & 0xFFFFF)), object0) == v;
    }

    public final boolean y(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(Long.compare(v1 & 0xFFFFF, 0xFFFFFL) == 0) {
            int v2 = this.u(v);
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    return Double.doubleToRawLongBits(G2.c.a(((long)(v2 & 0xFFFFF)), object0)) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(G2.c.i(((long)(v2 & 0xFFFFF)), object0)) != 0;
                }
                case 2: {
                    return G2.c.m(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 3: {
                    return G2.c.m(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 4: {
                    return G2.c.l(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 5: {
                    return G2.c.m(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 6: {
                    return G2.c.l(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 7: {
                    return G2.c.k(((long)(v2 & 0xFFFFF)), object0);
                }
                case 8: {
                    Object object1 = G2.o(v2 & 0xFFFFF, object0);
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof T1)) {
                        throw new IllegalArgumentException();
                    }
                    return !T1.Z.equals(object1);
                }
                case 9: {
                    return G2.o(v2 & 0xFFFFF, object0) != null;
                }
                case 10: {
                    Object object2 = G2.o(v2 & 0xFFFFF, object0);
                    return !T1.Z.equals(object2);
                }
                case 11: {
                    return G2.c.l(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 12: {
                    return G2.c.l(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 13: {
                    return G2.c.l(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 14: {
                    return G2.c.m(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 15: {
                    return G2.c.l(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 16: {
                    return G2.c.m(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 17: {
                    return G2.o(v2 & 0xFFFFF, object0) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (1 << (v1 >>> 20) & G2.c.l(((long)(v1 & 0xFFFFF)), object0)) != 0;
    }

    public final boolean z(c2 c20, Object object0, int v) {
        return this.y(v, c20) == this.y(v, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final c2 zza() {
        return (c2)((c2)this.e).e(4);
    }
}

