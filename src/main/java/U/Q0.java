package U;

import Ab.t;
import Nb.k;
import W.d;
import android.os.Trace;
import e0.m;
import e0.q;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import s.E;

public final class q0 extends k implements Function1 {
    public final s0 X;
    public final E Y;
    public final E Z;
    public final List b0;
    public final List c0;
    public final E d0;
    public final List e0;
    public final E f0;
    public final Set g0;

    public q0(s0 s00, E e0, E e1, List list0, List list1, E e2, List list2, E e3, Set set0) {
        this.X = s00;
        this.Y = e0;
        this.Z = e1;
        this.b0 = list0;
        this.c0 = list1;
        this.d0 = e2;
        this.e0 = list2;
        this.f0 = e3;
        this.g0 = set0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        E e9;
        E e8;
        long v19;
        int v18;
        int v17;
        Object[] arr_object1;
        E e7;
        E e6;
        s s0;
        int v5;
        E e5;
        E e4;
        long v = ((Number)object0).longValue();
        if(s0.r(this.X)) {
            Trace.beginSection("Recomposer:animation");
            try {
                this.X.a.c(v);
                q.h();
            }
            catch(Throwable throwable0) {
                Trace.endSection();
                throw throwable0;
            }
            Trace.endSection();
        }
        s0 s00 = this.X;
        E e0 = this.Y;
        E e1 = this.Z;
        List list0 = this.b0;
        List list1 = this.c0;
        E e2 = this.d0;
        List list2 = this.e0;
        E e3 = this.f0;
        Set set0 = this.g0;
        Trace.beginSection("Recomposer:recompose");
        try {
            s0.t(s00);
            synchronized(s00.b) {
                d d0 = s00.h;
                int v2 = d0.Z;
                if(v2 > 0) {
                    Object[] arr_object = d0.X;
                    int v3 = 0;
                    while(true) {
                        list0.add(((s)arr_object[v3]));
                        ++v3;
                        if(v3 >= v2) {
                            break;
                        }
                    }
                }
                s00.h.i();
            }
            e0.b();
            e1.b();
            while(true) {
            label_38:
                if(list0.isEmpty() && list1.isEmpty()) {
                    goto label_124;
                }
                e4 = e0;
                e5 = e1;
                break;
            }
        }
        catch(Throwable throwable1) {
            Trace.endSection();
            throw throwable1;
        }
        try {
            int v4 = list0.size();
            v5 = 0;
            while(true) {
            label_43:
                if(v5 >= v4) {
                    goto label_71;
                }
                s0 = (s)list0.get(v5);
                e6 = e4;
                goto label_50;
            }
        }
        catch(Exception exception0) {
        }
        catch(Throwable throwable2) {
            goto label_69;
        }
        e6 = e4;
        e7 = e5;
        goto label_64;
        try {
        label_50:
            s s1 = s0.s(s00, s0, e6);
            if(s1 != null) {
                list2.add(s1);
            }
            e7 = e5;
            goto label_58;
        }
        catch(Exception exception0) {
        }
        catch(Throwable throwable2) {
            goto label_69;
        }
        e7 = e5;
        goto label_64;
        try {
        label_58:
            e7.a(s0);
            ++v5;
            e4 = e6;
            e5 = e7;
            goto label_43;
        }
        catch(Exception exception0) {
        }
        catch(Throwable throwable2) {
            goto label_69;
        }
        try {
        label_64:
            s0.G(s00, exception0, true, 2);
            r0.y(s00, list0, list1, list2, e2, e3, e6, e7);
        }
        catch(Throwable throwable2) {
            goto label_69;
        }
        try {
            list0.clear();
            goto label_237;
        label_69:
            list0.clear();
            throw throwable2;
        label_71:
            list0.clear();
            if(e4.h() || s00.h.n()) {
                synchronized(s00.b) {
                    List list3 = s00.A();
                    int v7 = list3.size();
                    for(int v8 = 0; v8 < v7; ++v8) {
                        s s2 = (s)list3.get(v8);
                        if(!e5.c(s2) && s2.u(set0)) {
                            list0.add(s2);
                        }
                    }
                    d d1 = s00.h;
                    int v9 = d1.Z;
                    int v11 = 0;
                    for(int v10 = 0; v10 < v9; ++v10) {
                        s s3 = (s)d1.X[v10];
                        if(!e5.c(s3) && !list0.contains(s3)) {
                            list0.add(s3);
                            ++v11;
                        }
                        else if(v11 > 0) {
                            d1.X[v10 - v11] = d1.X[v10];
                        }
                    }
                    int v12 = v9 - v11;
                    Arrays.fill(d1.X, v12, v9, null);
                    d1.Z = v12;
                }
            }
            if(list0.isEmpty()) {
                try {
                    r0.z(list1, s00);
                    while(!list1.isEmpty()) {
                        Iterable iterable0 = s00.E(list1, e4);
                        e2.getClass();
                        for(Object object3: iterable0) {
                            e2.b[e2.d(object3)] = object3;
                        }
                        r0.z(list1, s00);
                    }
                    e0 = e4;
                    e1 = e5;
                    goto label_38;
                }
                catch(Exception exception1) {
                }
            }
            else {
                e0 = e4;
                e1 = e5;
                goto label_38;
            }
            s0.G(s00, exception1, true, 2);
            r0.y(s00, list0, list1, list2, e2, e3, e4, e5);
            goto label_237;
        }
        catch(Throwable throwable1) {
            Trace.endSection();
            throw throwable1;
        }
    label_124:
        if(!list2.isEmpty()) {
            try {
                try {
                    int v13 = list2.size();
                    for(int v14 = 0; v14 < v13; ++v14) {
                        e3.a(((s)list2.get(v14)));
                    }
                    int v15 = list2.size();
                    int v16 = 0;
                    while(true) {
                        if(v16 >= v15) {
                            goto label_146;
                        }
                        ((s)list2.get(v16)).d();
                        ++v16;
                    }
                }
                catch(Exception exception2) {
                }
                s0.G(s00, exception2, false, 6);
                r0.y(s00, list0, list1, list2, e2, e3, e0, e1);
            }
            catch(Throwable throwable3) {
                goto label_144;
            }
            try {
                list2.clear();
                goto label_237;
            label_144:
                list2.clear();
                throw throwable3;
            label_146:
                list2.clear();
            }
            catch(Throwable throwable1) {
                Trace.endSection();
                throw throwable1;
            }
        }
        if(e2.h()) {
            try {
                e3.i(e2);
                arr_object1 = e2.b;
                long[] arr_v = e2.a;
                v17 = arr_v.length - 2;
                if(v17 >= 0) {
                    v18 = 0;
                    while(true) {
                    label_154:
                        v19 = arr_v[v18];
                        e8 = e0;
                        e9 = e1;
                        if((~v19 << 7 & v19 & 0x8080808080808080L) != 0x8080808080808080L) {
                            goto label_158;
                        }
                        goto label_171;
                    }
                }
                else {
                    e8 = e0;
                    e9 = e1;
                }
                goto label_189;
            }
            catch(Exception exception3) {
                goto label_180;
            }
            catch(Throwable throwable4) {
                goto label_187;
            }
        label_158:
            int v20 = 8 - (~(v18 - v17) >>> 0x1F);
            long v21 = v19;
            int v22 = 0;
            while(v22 < v20) {
                if((v21 & 0xFFL) < 0x80L) {
                    try {
                        ((s)arr_object1[(v18 << 3) + v22]).f();
                        goto label_167;
                    }
                    catch(Exception exception3) {
                    }
                    catch(Throwable throwable4) {
                        goto label_187;
                    }
                    goto label_182;
                }
            label_167:
                v21 >>= 8;
                ++v22;
            }
            if(v20 == 8) {
            label_171:
                if(v18 != v17) {
                    try {
                        ++v18;
                        e0 = e8;
                        e1 = e9;
                        goto label_154;
                    }
                    catch(Exception exception3) {
                    }
                    catch(Throwable throwable4) {
                        goto label_187;
                    }
                label_180:
                    e8 = e0;
                    e9 = e1;
                    try {
                    label_182:
                        s0.G(s00, exception3, false, 6);
                        r0.y(s00, list0, list1, list2, e2, e3, e8, e9);
                    }
                    catch(Throwable throwable4) {
                        goto label_187;
                    }
                    try {
                        e2.b();
                        goto label_237;
                    label_187:
                        e2.b();
                        throw throwable4;
                    label_189:
                        e2.b();
                        goto label_193;
                    }
                    catch(Throwable throwable1) {
                        Trace.endSection();
                        throw throwable1;
                    }
                }
            }
            goto label_189;
        }
        else {
            e8 = e0;
            e9 = e1;
        }
    label_193:
        if(e3.h()) {
            try {
                Object[] arr_object2 = e3.b;
                long[] arr_v1 = e3.a;
                int v23 = arr_v1.length - 2;
                if(v23 >= 0) {
                    int v24 = 0;
                    while(true) {
                        long v25 = arr_v1[v24];
                        if((~v25 << 7 & v25 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_211;
                        }
                        int v26 = 8 - (~(v24 - v23) >>> 0x1F);
                        long v27 = v25;
                        for(int v28 = 0; v28 < v26; ++v28) {
                            if((v27 & 0xFFL) < 0x80L) {
                                ((s)arr_object2[(v24 << 3) + v28]).g();
                            }
                            v27 >>= 8;
                        }
                        if(v26 == 8) {
                        label_211:
                            if(v24 != v23) {
                                try {
                                    try {
                                        ++v24;
                                        continue;
                                    }
                                    catch(Exception exception4) {
                                    }
                                label_215:
                                    s0.G(s00, exception4, false, 6);
                                    r0.y(s00, list0, list1, list2, e2, e3, e8, e9);
                                    goto label_217;
                                }
                                catch(Throwable throwable5) {
                                    goto label_220;
                                }
                            }
                        }
                        break;
                    }
                }
                goto label_222;
            }
            catch(Exception exception4) {
                goto label_215;
            }
            catch(Throwable throwable5) {
                goto label_220;
            }
            try {
            label_217:
                e3.b();
                goto label_237;
            label_220:
                e3.b();
                throw throwable5;
            label_222:
                e3.b();
            label_223:
                synchronized(s00.b) {
                    s00.x();
                }
                m.k().m();
                e9.b();
                e8.b();
                s00.n = null;
                goto label_237;
            }
            catch(Throwable throwable1) {
            }
        }
        else {
            goto label_223;
        }
        Trace.endSection();
        throw throwable1;
    label_237:
        Trace.endSection();
        return t.a;
    }
}

