package M;

import I.f0;
import Nb.j;

public final class r {
    public final int a;

    public r(int v) {
        this.a = v;
        super();
    }

    public final q a(M m0) {
        boolean z3;
        p p4;
        p p3;
        p p2;
        switch(this.a) {
            case 0: {
                return new q(m0.g().a(m0.g().c), m0.k().a(m0.k().d), m0.l() == 1);
            }
            case 1: {
                return c0.h(m0, s.c);
            }
            case 2: {
                return c0.h(m0, s.b);
            }
            default: {
                q q0 = m0.d();
                if(q0 == null) {
                    return c0.h(m0, s.c);
                }
                boolean z = m0.a();
                p p0 = q0.b;
                p p1 = q0.a;
                if(z) {
                    p2 = c0.l(m0, m0.g(), p1);
                    p3 = p2;
                    p4 = p0;
                    p0 = p1;
                }
                else {
                    p2 = c0.l(m0, m0.k(), p0);
                    p3 = p1;
                    p4 = p2;
                }
                boolean z1 = true;
                if(!j.a(p2, p0)) {
                    if(m0.l() != 1 && (m0.l() != 3 || p3.b <= p4.b)) {
                        z1 = false;
                    }
                    q0 = new q(p3, p4, z1);
                    boolean z2 = false;
                    p p5 = q0.a;
                    p p6 = q0.b;
                    if(p5.c != p6.c) {
                        boolean z4 = q0.c;
                        if((z4 ? p5 : p6).b == 0) {
                            if(z4) {
                                p5 = p6;
                            }
                            if(m0.e().f.a.a.X.length() == p5.b) {
                                Nb.s s0 = new Nb.s();  // initializer: Ljava/lang/Object;-><init>()V
                                s0.X = true;
                                m0.f(new O(s0, 0));
                                z3 = s0.X;
                            }
                            else {
                                z3 = false;
                            }
                        }
                        else {
                            z3 = false;
                        }
                    }
                    else if(p5.b == p6.b) {
                        z3 = true;
                    }
                    else {
                        z3 = false;
                    }
                    if(z3) {
                        String s1 = m0.c().f.a.a.X;
                        if(m0.m() <= 1 && m0.d() != null && s1.length() != 0) {
                            o o0 = m0.c();
                            String s2 = o0.f.a.a.X;
                            int v = s2.length();
                            int v1 = o0.c;
                            if(v1 == 0) {
                                int v2 = f0.r(0, s2);
                                return m0.a() ? q.a(q0, c0.o(q0.a, o0, v2), null, true, 2) : q.a(q0, null, c0.o(q0.b, o0, v2), false, 1);
                            }
                            if(v1 == v) {
                                int v3 = f0.u(v, s2);
                                return m0.a() ? q.a(q0, c0.o(q0.a, o0, v3), null, false, 2) : q.a(q0, null, c0.o(q0.b, o0, v3), true, 1);
                            }
                            q q1 = m0.d();
                            if(q1 != null && q1.c) {
                                z2 = true;
                            }
                            int v4 = (m0.a() ^ z2) == 0 ? f0.r(v1, s2) : f0.u(v1, s2);
                            return m0.a() ? q.a(q0, c0.o(q0.a, o0, v4), null, z2, 2) : q.a(q0, null, c0.o(q0.b, o0, v4), z2, 1);
                        }
                    }
                }
                return q0;
            }
        }
    }
}

