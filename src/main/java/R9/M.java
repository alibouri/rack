package R9;

import Ab.k;
import Ab.t;
import Bb.r;
import Eb.a;
import Fb.j;
import W5.f;
import ac.e;
import ac.h;
import ac.i;
import ha.D2;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import ma.G;
import ma.Q;
import ma.i0;
import o9.J1;
import o9.K1;
import o9.n;
import q9.b3;
import q9.o0;
import rb.b;

public final class m extends j implements Function3 {
    public final int c0;
    public int d0;
    public i e0;
    public Object f0;

    public m(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.c0) {
            case 0: {
                m m1 = new m(3, ((g)object2), 0);
                m1.e0 = (i)object0;
                m1.f0 = object1;
                return m1.v(t.a);
            }
            case 1: {
                m m2 = new m(3, ((g)object2), 1);
                m2.e0 = (i)object0;
                m2.f0 = object1;
                return m2.v(t.a);
            }
            case 2: {
                m m3 = new m(3, ((g)object2), 2);
                m3.e0 = (i)object0;
                m3.f0 = object1;
                return m3.v(t.a);
            }
            case 3: {
                m m4 = new m(3, ((g)object2), 3);
                m4.e0 = (i)object0;
                m4.f0 = object1;
                return m4.v(t.a);
            }
            case 4: {
                m m5 = new m(3, ((g)object2), 4);
                m5.e0 = (i)object0;
                m5.f0 = object1;
                return m5.v(t.a);
            }
            case 5: {
                m m6 = new m(3, ((g)object2), 5);
                m6.e0 = (i)object0;
                m6.f0 = object1;
                return m6.v(t.a);
            }
            case 6: {
                m m7 = new m(3, ((g)object2), 6);
                m7.e0 = (i)object0;
                m7.f0 = object1;
                return m7.v(t.a);
            }
            case 7: {
                m m8 = new m(3, ((g)object2), 7);
                m8.e0 = (i)object0;
                m8.f0 = object1;
                return m8.v(t.a);
            }
            case 8: {
                m m9 = new m(3, ((g)object2), 8);
                m9.e0 = (i)object0;
                m9.f0 = object1;
                return m9.v(t.a);
            }
            default: {
                m m0 = new m(3, ((g)object2), 9);
                m0.e0 = (i)object0;
                m0.f0 = object1;
                return m0.v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        switch(this.c0) {
            case 0: {
                Object object2 = a.X;
                t t0 = t.a;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i1 = this.e0;
                        Iterable iterable0 = (List)this.f0;
                        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
                        for(Object object3: iterable0) {
                            arrayList0.add(((n)object3).d());
                        }
                        e e0 = o0.f(arrayList0);
                        this.d0 = 1;
                        ac.o0.r(i1);
                        Object object4 = e0.d(new Na.j(i1, 7), this);
                        a a0 = a.X;
                        if(object4 != a0) {
                            object4 = t0;
                        }
                        if(object4 != a0) {
                            object4 = t0;
                        }
                        return object4 != object2 ? t0 : object2;
                    }
                    case 1: {
                        f.b0(object0);
                        return t0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                Object object5 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        this.d0 = 1;
                        return ac.o0.p(((h)((k)this.f0).X), this.e0, this) != object5 ? t.a : object5;
                    }
                    case 1: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                Object object6 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        this.d0 = 1;
                        return ac.o0.p(((h)((k)this.f0).Y), this.e0, this) != object6 ? t.a : object6;
                    }
                    case 1: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 3: {
                Object object7 = a.X;
                t t1 = t.a;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i2 = this.e0;
                        Iterable iterable1 = (List)this.f0;
                        ArrayList arrayList1 = new ArrayList(r.b0(iterable1));
                        for(Object object8: iterable1) {
                            arrayList1.add(((Q)(((G)object8))).m0);
                        }
                        e e1 = o0.f(arrayList1);
                        this.d0 = 1;
                        ac.o0.r(i2);
                        Object object9 = e1.d(new D2(i2, 19), this);
                        a a1 = a.X;
                        if(object9 != a1) {
                            object9 = t1;
                        }
                        if(object9 != a1) {
                            object9 = t1;
                        }
                        return object9 != object7 ? t1 : object7;
                    }
                    case 1: {
                        f.b0(object0);
                        return t1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 4: {
                Object object10 = a.X;
                t t2 = t.a;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i3 = this.e0;
                        Iterable iterable2 = (List)this.f0;
                        ArrayList arrayList2 = new ArrayList(r.b0(iterable2));
                        for(Object object11: iterable2) {
                            arrayList2.add(((J1)(((K1)object11))).f0);
                        }
                        e e2 = o0.f(arrayList2);
                        this.d0 = 1;
                        ac.o0.r(i3);
                        Object object12 = e2.d(new i0(i3, 11), this);
                        a a2 = a.X;
                        if(object12 != a2) {
                            object12 = t2;
                        }
                        if(object12 != a2) {
                            object12 = t2;
                        }
                        return object12 != object10 ? t2 : object10;
                    }
                    case 1: {
                        f.b0(object0);
                        return t2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 5: {
                Object object13 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i4 = this.e0;
                        b3 b30 = new b3(((long)((Number)this.f0).intValue()) * 1000L);
                        this.d0 = 1;
                        return ac.o0.p(b30, i4, this) != object13 ? t.a : object13;
                    }
                    case 1: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 6: {
                Object object14 = a.X;
                t t3 = t.a;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i5 = this.e0;
                        Iterable iterable3 = (List)this.f0;
                        ArrayList arrayList3 = new ArrayList(r.b0(iterable3));
                        for(Object object15: iterable3) {
                            arrayList3.add(((n)object15).d());
                        }
                        e e3 = o0.f(arrayList3);
                        this.d0 = 1;
                        ac.o0.r(i5);
                        Object object16 = e3.d(new i0(i5, 16), this);
                        a a3 = a.X;
                        if(object16 != a3) {
                            object16 = t3;
                        }
                        if(object16 != a3) {
                            object16 = t3;
                        }
                        return object16 != object14 ? t3 : object14;
                    }
                    case 1: {
                        f.b0(object0);
                        return t3;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 7: {
                Object object17 = a.X;
                t t4 = t.a;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i6 = this.e0;
                        Iterable iterable4 = (List)this.f0;
                        ArrayList arrayList4 = new ArrayList(r.b0(iterable4));
                        for(Object object18: iterable4) {
                            arrayList4.add(((n)object18).d());
                        }
                        e e4 = o0.f(arrayList4);
                        this.d0 = 1;
                        ac.o0.r(i6);
                        Object object19 = e4.d(new i0(i6, 17), this);
                        a a4 = a.X;
                        if(object19 != a4) {
                            object19 = t4;
                        }
                        if(object19 != a4) {
                            object19 = t4;
                        }
                        return object19 != object17 ? t4 : object17;
                    }
                    case 1: {
                        f.b0(object0);
                        return t4;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 8: {
                Object object20 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i7 = this.e0;
                        this.e0 = null;
                        this.d0 = 1;
                        return i7.c(this.f0, this) != object20 ? Boolean.FALSE : object20;
                    }
                    case 1: {
                        f.b0(object0);
                        return Boolean.FALSE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                Object object1 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i0 = this.e0;
                        b b0 = ((Boolean)this.f0).booleanValue() ? new b(new b3(1000L), System.currentTimeMillis()) : ac.o0.c(null);
                        this.d0 = 1;
                        return ac.o0.p(b0, i0, this) != object1 ? t.a : object1;
                    }
                    case 1: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

