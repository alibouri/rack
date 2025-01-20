package q9;

import Eb.a;
import Fb.j;
import N2.l;
import W5.f;
import ac.i;
import ac.j0;
import ac.o0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class t extends j implements Function3 {
    public final int c0;
    public int d0;
    public i e0;
    public Object f0;
    public final w g0;

    public t(g g0, w w0, int v) {
        this.c0 = v;
        this.g0 = w0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.c0) {
            case 0: {
                t t1 = new t(((g)object2), this.g0, 0);
                t1.e0 = (i)object0;
                t1.f0 = object1;
                return t1.v(Ab.t.a);
            }
            case 1: {
                t t2 = new t(((g)object2), this.g0, 1);
                t2.e0 = (i)object0;
                t2.f0 = object1;
                return t2.v(Ab.t.a);
            }
            case 2: {
                t t3 = new t(((g)object2), this.g0, 2);
                t3.e0 = (i)object0;
                t3.f0 = object1;
                return t3.v(Ab.t.a);
            }
            case 3: {
                t t4 = new t(((g)object2), this.g0, 3);
                t4.e0 = (i)object0;
                t4.f0 = object1;
                return t4.v(Ab.t.a);
            }
            default: {
                t t0 = new t(((g)object2), this.g0, 4);
                t0.e0 = (i)object0;
                t0.f0 = object1;
                return t0.v(Ab.t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        l l0;
        j0 j00;
        l l3;
        l l2;
        l l1;
        switch(this.c0) {
            case 0: {
                Object object2 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i1 = this.e0;
                        if(((Boolean)this.f0).booleanValue()) {
                            P2 p21 = this.g0.Y;
                            if(p21 != null) {
                                l1 = p21.g0;
                                this.d0 = 1;
                                return o0.p(l1, i1, this) != object2 ? Ab.t.a : object2;
                            }
                            Nb.j.p("audioPlayer");
                            throw null;
                        }
                        else {
                            l1 = new l(4, Boolean.TRUE);
                        }
                        this.d0 = 1;
                        return o0.p(l1, i1, this) != object2 ? Ab.t.a : object2;
                    }
                    case 1: {
                        f.b0(object0);
                        return Ab.t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                Object object3 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i2 = this.e0;
                        if(((Boolean)this.f0).booleanValue()) {
                            P2 p22 = this.g0.Y;
                            if(p22 != null) {
                                l2 = p22.f0;
                                this.d0 = 1;
                                return o0.p(l2, i2, this) != object3 ? Ab.t.a : object3;
                            }
                            Nb.j.p("audioPlayer");
                            throw null;
                        }
                        else {
                            l2 = new l(4, Boolean.FALSE);
                        }
                        this.d0 = 1;
                        return o0.p(l2, i2, this) != object3 ? Ab.t.a : object3;
                    }
                    case 1: {
                        f.b0(object0);
                        return Ab.t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                Object object4 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i3 = this.e0;
                        if(((Boolean)this.f0).booleanValue()) {
                            P2 p23 = this.g0.Y;
                            if(p23 != null) {
                                l3 = p23.d0;
                                this.d0 = 1;
                                return o0.p(l3, i3, this) != object4 ? Ab.t.a : object4;
                            }
                            Nb.j.p("audioPlayer");
                            throw null;
                        }
                        else {
                            l3 = new l(4, new Integer(0));
                        }
                        this.d0 = 1;
                        return o0.p(l3, i3, this) != object4 ? Ab.t.a : object4;
                    }
                    case 1: {
                        f.b0(object0);
                        return Ab.t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 3: {
                Object object5 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i4 = this.e0;
                        if(((Boolean)this.f0).booleanValue()) {
                            P2 p24 = this.g0.Y;
                            if(p24 != null) {
                                j00 = new s(0, p24.d0);
                                this.d0 = 1;
                                return o0.p(j00, i4, this) != object5 ? Ab.t.a : object5;
                            }
                            Nb.j.p("audioPlayer");
                            throw null;
                        }
                        else {
                            j00 = q9.o0.a(Boolean.FALSE);
                        }
                        this.d0 = 1;
                        return o0.p(j00, i4, this) != object5 ? Ab.t.a : object5;
                    }
                    case 1: {
                        f.b0(object0);
                        return Ab.t.a;
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
                        if(((Boolean)this.f0).booleanValue()) {
                            P2 p20 = this.g0.Y;
                            if(p20 != null) {
                                l0 = p20.e0;
                                this.d0 = 1;
                                return o0.p(l0, i0, this) != object1 ? Ab.t.a : object1;
                            }
                            Nb.j.p("audioPlayer");
                            throw null;
                        }
                        else {
                            l0 = new l(4, new Integer(0));
                        }
                        this.d0 = 1;
                        return o0.p(l0, i0, this) != object1 ? Ab.t.a : object1;
                    }
                    case 1: {
                        f.b0(object0);
                        return Ab.t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

