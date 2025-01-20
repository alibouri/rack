package m1;

import g1.k;
import java.util.ArrayList;
import java.util.Iterator;
import l1.b;

public final class i extends c {
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
            k0.b(object0).h();
        }
        b b0 = null;
        b b1 = null;
        for(Object object1: arrayList0) {
            b b2 = k0.b(object1);
            if(b1 == null) {
                Object object2 = this.R;
                if(object2 == null) {
                    Object object3 = this.S;
                    if(object3 == null) {
                        String s = b2.a.toString();
                        b2.p(0);
                        b2.l(this.w(s)).n(this.v(s));
                    }
                    else {
                        b2.j0 = 10;
                        b2.S = object3;
                        b2.k(this.n).m(this.t);
                    }
                }
                else {
                    b2.p(object2);
                    b2.k(this.n).m(this.t);
                }
                b1 = b2;
            }
            if(b0 != null) {
                String s1 = b0.a.toString();
                String s2 = b2.a.toString();
                b0.j0 = 12;
                b0.U = b2.a;
                b0.l(this.u(s1)).n(this.t(s1));
                b2.j0 = 10;
                b2.S = b0.a;
                b2.l(this.w(s2)).n(this.v(s2));
            }
            String s3 = object1.toString();
            float f = this.o0.containsKey(s3) ? ((float)(((Float)this.o0.get(s3)))) : -1.0f;
            if(f != -1.0f) {
                b2.g = f;
            }
            b0 = b2;
        }
        if(b0 != null) {
            Object object4 = this.U;
            if(object4 == null) {
                Object object5 = this.V;
                if(object5 == null) {
                    String s4 = b0.a.toString();
                    b0.e(0);
                    b0.l(this.u(s4)).n(this.t(s4));
                }
                else {
                    b0.e(object5);
                    b0.k(this.o).m(this.u);
                }
            }
            else {
                b0.j0 = 12;
                b0.U = object4;
                b0.k(this.o).m(this.u);
            }
        }
        if(b1 == null) {
            return;
        }
        float f1 = this.n0;
        if(f1 != 0.5f) {
            b1.i = f1;
        }
        switch(this.t0.ordinal()) {
            case 0: {
                b1.e = 0;
                return;
            }
            case 1: {
                b1.e = 1;
                return;
            }
            case 2: {
                b1.e = 2;
            }
        }
    }
}

