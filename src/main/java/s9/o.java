package S9;

import B9.b;
import B9.f;
import B9.g;
import Eb.a;
import Fb.c;
import I2.m;
import I2.v;
import I2.w;
import I2.x;
import Nb.j;
import Y8.G6;
import Y8.O;
import Y8.R6;
import Y8.T;
import Y8.p9;
import java.util.ArrayList;
import q9.o0;
import q9.t1;

public final class o {
    public final Object a(m m0, int v, f f0, g g0, c c0) {
        n n0;
        if(c0 instanceof n) {
            n0 = (n)c0;
            int v1 = n0.d0;
            if((v1 & 0x80000000) == 0) {
                n0 = new n(this, c0);
            }
            else {
                n0.d0 = v1 ^ 0x80000000;
            }
        }
        else {
            n0 = new n(this, c0);
        }
        Object object0 = n0.b0;
        Object object1 = a.X;
        switch(n0.d0) {
            case 0: {
                W5.f.b0(object0);
                if(v > 3) {
                    return new v();
                }
                String s = m0.b("mobile");
                j.c(s);
                String s1 = m0.b("reportID");
                j.c(s1);
                b b0 = f0.a(s);
                if(b0 != null) {
                    R6 r60 = b0.a();
                    if(r60 == null) {
                        return new v();
                    }
                    Iterable iterable0 = f0.f();
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: iterable0) {
                        b b1 = f0.a(((String)object2));
                        String s2 = b1 == null ? null : b1.d(t1.d0).j("session_opaque_id");
                        if(s2 != null) {
                            arrayList0.add(s2);
                        }
                    }
                    p9 p90 = new p9(o0.u(g0.Y), arrayList0, s1, f0.f());
                    try {
                        n0.d0 = 1;
                        return r60.f(p90, G6.Z, n0) == object1 ? object1 : new x();
                    }
                    catch(T unused_ex) {
                        break;
                    }
                    catch(O unused_ex) {
                        return new v();
                    }
                }
                return new v();
            }
            case 1: {
                try {
                    W5.f.b0(object0);
                    return new x();
                }
                catch(T unused_ex) {
                    break;
                }
                catch(O unused_ex) {
                    return new v();
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return new w();  // initializer: Ljava/lang/Object;-><init>()V
    }
}

