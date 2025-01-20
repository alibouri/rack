package ha;

import Ab.t;
import Bb.q;
import Eb.a;
import W5.f;
import Y8.N;
import Y8.O5;
import Y8.y6;
import a9.T7;
import ac.i;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;

public final class p1 implements i {
    public final int X;
    public final i Y;
    public final S2 Z;

    public p1(i i0, S2 s20, int v) {
        this.X = v;
        this.Y = i0;
        this.Z = s20;
        super();
    }

    public p1(S2 s20, i i0) {
        this.X = 0;
        super();
        this.Z = s20;
        this.Y = i0;
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        B2 b20;
        n2 n20;
        m2 m20;
        Object object1 = t.a;
        i i0 = this.Y;
        S2 s20 = this.Z;
        switch(this.X) {
            case 0: {
                ((Number)object0).longValue();
                o1 o10 = new o1(i0, s20, null);
                return N.n(s20.t1, s20.s1, o10, g0);
            }
            case 1: {
                if(g0 instanceof m2) {
                    m20 = (m2)g0;
                    int v1 = m20.c0;
                    if((v1 & 0x80000000) == 0) {
                        m20 = new m2(this, g0);
                    }
                    else {
                        m20.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    m20 = new m2(this, g0);
                }
                Object object3 = m20.b0;
                a a1 = a.X;
                switch(m20.c0) {
                    case 0: {
                        f.b0(object3);
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object4: ((List)object0)) {
                            if(((Boolean)s20.m0.j(((T7)object4).e, ((T7)object4).f.d)).booleanValue()) {
                                arrayList0.add(object4);
                            }
                        }
                        m20.c0 = 1;
                        return i0.c(arrayList0, m20) == a1 ? a1 : object1;
                    }
                    case 1: {
                        f.b0(object3);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                if(g0 instanceof n2) {
                    n20 = (n2)g0;
                    int v2 = n20.c0;
                    if((v2 & 0x80000000) == 0) {
                        n20 = new n2(this, g0);
                    }
                    else {
                        n20.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    n20 = new n2(this, g0);
                }
                Object object5 = n20.b0;
                a a2 = a.X;
                switch(n20.c0) {
                    case 0: {
                        f.b0(object5);
                        t9.a a3 = q.l(s20.o0.t0, ((CustomerHomeFragment)((Y8.m2)object0).a).f.e.a, s20.n0);
                        n20.c0 = 1;
                        return i0.c(a3, n20) == a2 ? a2 : object1;
                    }
                    case 1: {
                        f.b0(object5);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof B2) {
                    b20 = (B2)g0;
                    int v = b20.c0;
                    if((v & 0x80000000) == 0) {
                        b20 = new B2(this, g0);
                    }
                    else {
                        b20.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    b20 = new B2(this, g0);
                }
                Object object2 = b20.b0;
                a a0 = a.X;
                switch(b20.c0) {
                    case 0: {
                        f.b0(object2);
                        s20.getClass();
                        b20.c0 = 1;
                        return i0.c(Boolean.valueOf(!((O5)((y6)object0).b).a.c.b.b.a.isEmpty()), b20) == a0 ? a0 : object1;
                    }
                    case 1: {
                        f.b0(object2);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

