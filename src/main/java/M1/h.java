package m1;

import g1.k;
import java.util.ArrayList;
import java.util.Iterator;
import l1.b;

public final class h extends c {
    @Override  // l1.g
    public final void apply() {
        k k0;
        ArrayList arrayList0 = this.m0;
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            k0 = this.k0;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            k0.b(object0).g();
        }
        b b0 = null;
        b b1 = null;
        for(Object object1: arrayList0) {
            b b2 = k0.b(object1);
            if(b1 == null) {
                Object object2 = this.N;
                if(object2 == null) {
                    Object object3 = this.O;
                    if(object3 == null) {
                        Object object4 = this.J;
                        if(object4 == null) {
                            Object object5 = this.K;
                            if(object5 == null) {
                                String s = b2.a.toString();
                                b2.o(0);
                                b2.l(this.w(s)).n(this.v(s));
                            }
                            else {
                                b2.j0 = 6;
                                b2.O = object5;
                                b2.k(this.j).m(this.p);
                            }
                        }
                        else {
                            b2.o(object4);
                            b2.k(this.j).m(this.p);
                        }
                    }
                    else {
                        b2.j0 = 6;
                        b2.O = object3;
                        b2.k(this.l).m(this.r);
                    }
                }
                else {
                    b2.o(object2);
                    b2.k(this.l).m(this.r);
                }
                b1 = b2;
            }
            if(b0 != null) {
                String s1 = b0.a.toString();
                String s2 = b2.a.toString();
                b0.j0 = 7;
                b0.P = b2.a;
                b0.l(this.u(s1)).n(this.t(s1));
                b2.j0 = 6;
                b2.O = b0.a;
                b2.l(this.w(s2)).n(this.v(s2));
            }
            String s3 = object1.toString();
            float f = this.o0.containsKey(s3) ? ((float)(((Float)this.o0.get(s3)))) : -1.0f;
            if(f != -1.0f) {
                b2.f = f;
            }
            b0 = b2;
        }
        if(b0 != null) {
            Object object6 = this.P;
            if(object6 == null) {
                Object object7 = this.Q;
                if(object7 == null) {
                    Object object8 = this.L;
                    if(object8 == null) {
                        Object object9 = this.M;
                        if(object9 == null) {
                            String s4 = b0.a.toString();
                            b0.i(0);
                            b0.l(this.u(s4)).n(this.t(s4));
                        }
                        else {
                            b0.i(object9);
                            b0.k(this.k).m(this.q);
                        }
                    }
                    else {
                        b0.j0 = 7;
                        b0.P = object8;
                        b0.k(this.k).m(this.q);
                    }
                }
                else {
                    b0.i(object7);
                    b0.k(this.m).m(this.s);
                }
            }
            else {
                b0.j0 = 7;
                b0.P = object6;
                b0.k(this.m).m(this.s);
            }
        }
        if(b1 == null) {
            return;
        }
        float f1 = this.n0;
        if(f1 != 0.5f) {
            b1.h = f1;
        }
        switch(this.t0.ordinal()) {
            case 0: {
                b1.d = 0;
                return;
            }
            case 1: {
                b1.d = 1;
                return;
            }
            case 2: {
                b1.d = 2;
            }
        }
    }
}

