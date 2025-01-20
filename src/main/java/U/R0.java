package U;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import s.E;

public final class r0 extends j implements Function3 {
    public List c0;
    public List d0;
    public List e0;
    public E f0;
    public E g0;
    public E h0;
    public Set i0;
    public E j0;
    public int k0;
    public T l0;
    public final s0 m0;

    public r0(s0 s00, g g0) {
        this.m0 = s00;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        G g0 = (G)object0;
        r0 r00 = new r0(this.m0, ((g)object2));
        r00.l0 = (T)object1;
        r00.v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object2;
        E e16;
        E e11;
        E e10;
        List list8;
        List list7;
        List list6;
        E e9;
        E e8;
        Set set2;
        E e3;
        Set set0;
        E e2;
        E e1;
        E e0;
        List list2;
        List list1;
        List list0;
        T t0;
        Object object1 = a.X;
        switch(this.k0) {
            case 0: {
                f.b0(object0);
                t0 = this.l0;
                list0 = new ArrayList();
                list1 = new ArrayList();
                list2 = new ArrayList();
                e0 = new E();
                e1 = new E();
                e2 = new E();
                set0 = new W.f(e2);
                e3 = new E();
                goto label_58;
            }
            case 1: {
                E e4 = this.j0;
                Set set1 = this.i0;
                E e5 = this.h0;
                E e6 = this.g0;
                E e7 = this.f0;
                List list3 = this.e0;
                List list4 = this.d0;
                List list5 = this.c0;
                T t1 = this.l0;
                f.b0(object0);
                set2 = set1;
                e8 = e5;
                e9 = e7;
                list6 = list3;
                list7 = list4;
                list8 = list5;
                e10 = e4;
                t0 = t1;
                e11 = e6;
                goto label_78;
            }
            case 2: {
                E e12 = this.j0;
                Set set3 = this.i0;
                E e13 = this.h0;
                E e14 = this.g0;
                E e15 = this.f0;
                List list9 = this.e0;
                List list10 = this.d0;
                List list11 = this.c0;
                T t2 = this.l0;
                f.b0(object0);
                e16 = e15;
                list8 = list11;
                object2 = object1;
                set0 = set3;
                e3 = e12;
                t0 = t2;
                e2 = e13;
                list1 = list10;
                e1 = e14;
                list2 = list9;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            s0.q(this.m0);
            object1 = object2;
            list0 = list8;
            while(true) {
                e0 = e16;
            label_58:
                this.l0 = t0;
                this.c0 = list0;
                this.d0 = list1;
                this.e0 = list2;
                this.f0 = e0;
                this.g0 = e1;
                this.h0 = e2;
                this.i0 = set0;
                this.j0 = e3;
                this.k0 = 1;
                if(s0.p(this.m0, this) == object1) {
                    return object1;
                }
                list8 = list0;
                list7 = list1;
                list6 = list2;
                e9 = e0;
                e8 = e2;
                set2 = set0;
                e10 = e3;
                e11 = e1;
            label_78:
                if(s0.t(this.m0)) {
                    break;
                }
                e16 = e9;
                e2 = e8;
                e3 = e10;
                e1 = e11;
                object1 = object1;
                list0 = list8;
                list1 = list7;
                list2 = list6;
                set0 = set2;
            }
            e16 = new q0(this.m0, e8, e10, list8, list7, e9, list6, e11, set2);
            this.l0 = t0;
            this.c0 = list8;
            this.d0 = list7;
            this.e0 = list6;
            this.f0 = e16;
            this.g0 = e11;
            this.h0 = e8;
            this.i0 = set2;
            this.j0 = e10;
            this.k0 = 2;
            object2 = object1;
            if(t0.v(null, this) == object2) {
                return object2;
            }
            e2 = e8;
            e3 = e10;
            e1 = e11;
            list1 = list7;
            list2 = list6;
            set0 = set2;
        }
    }

    public static final void y(s0 s00, List list0, List list1, List list2, E e0, E e1, E e2, E e3) {
        synchronized(s00.b) {
            list0.clear();
            list1.clear();
            int v1 = list2.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                s s0 = (s)list2.get(v2);
                s0.a();
                s00.H(s0);
            }
            list2.clear();
            Object[] arr_object = e0.b;
            long[] arr_v = e0.a;
            int v3 = arr_v.length - 2;
            if(v3 >= 0) {
                int v4 = 0;
                while(true) {
                    long v5 = arr_v[v4];
                    if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_32;
                    }
                    int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                    for(int v7 = 0; v7 < v6; ++v7) {
                        if((v5 & 0xFFL) < 0x80L) {
                            s s1 = (s)arr_object[(v4 << 3) + v7];
                            s1.a();
                            s00.H(s1);
                        }
                        v5 >>= 8;
                    }
                    if(v6 == 8) {
                    label_32:
                        if(v4 != v3) {
                            ++v4;
                            arr_v = arr_v;
                            continue;
                        }
                    }
                    goto label_36;
                }
            }
            else {
            label_36:
                e0.b();
                Object[] arr_object1 = e1.b;
                long[] arr_v1 = e1.a;
                int v8 = arr_v1.length - 2;
                if(v8 >= 0) {
                    int v9 = 0;
                    while(true) {
                        long v10 = arr_v1[v9];
                        if((~v10 << 7 & v10 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_53;
                        }
                        int v11 = 8 - (~(v9 - v8) >>> 0x1F);
                        for(int v12 = 0; v12 < v11; ++v12) {
                            if((v10 & 0xFFL) < 0x80L) {
                                ((s)arr_object1[(v9 << 3) + v12]).g();
                            }
                            v10 >>= 8;
                        }
                        if(v11 == 8) {
                        label_53:
                            if(v9 != v8) {
                                ++v9;
                                continue;
                            }
                        }
                        goto label_56;
                    }
                }
                else {
                label_56:
                    e1.b();
                    e2.b();
                    Object[] arr_object2 = e3.b;
                    long[] arr_v2 = e3.a;
                    int v13 = arr_v2.length - 2;
                    if(v13 >= 0) {
                        int v14 = 0;
                        while(true) {
                            long v15 = arr_v2[v14];
                            if((~v15 << 7 & v15 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v16 = 8 - (~(v14 - v13) >>> 0x1F);
                                for(int v17 = 0; v17 < v16; ++v17) {
                                    if((v15 & 0xFFL) < 0x80L) {
                                        s s2 = (s)arr_object2[(v14 << 3) + v17];
                                        s2.a();
                                        s00.H(s2);
                                    }
                                    v15 >>= 8;
                                }
                                if(v16 == 8) {
                                    goto label_76;
                                }
                                break;
                            }
                        label_76:
                            if(v14 == v13) {
                                break;
                            }
                            ++v14;
                        }
                    }
                }
            }
            e3.b();
        }
    }

    public static final void z(List list0, s0 s00) {
        list0.clear();
        synchronized(s00.b) {
            ArrayList arrayList0 = s00.j;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                list0.add(((X)arrayList0.get(v2)));
            }
            s00.j.clear();
        }
    }
}

