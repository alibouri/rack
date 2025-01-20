package m1;

import g1.k;
import l1.b;
import l1.g;

public final class a extends g {
    public final int n0;
    public float o0;

    public a(k k0, int v, int v1) {
        this.n0 = v1;
        super(k0, v);
    }

    @Override  // l1.g
    public final void apply() {
        if(this.n0 != 0) {
            for(Object object0: this.m0) {
                b b0 = this.k0.b(object0);
                b0.h();
                Object object1 = this.R;
                if(object1 == null) {
                    Object object2 = this.S;
                    if(object2 == null) {
                        b0.p(0);
                    }
                    else {
                        b0.j0 = 10;
                        b0.S = object2;
                    }
                }
                else {
                    b0.p(object1);
                }
                Object object3 = this.U;
                if(object3 == null) {
                    Object object4 = this.V;
                    if(object4 == null) {
                        b0.e(0);
                    }
                    else {
                        b0.e(object4);
                    }
                }
                else {
                    b0.j0 = 12;
                    b0.U = object3;
                }
                float f = this.o0;
                if(f != 0.5f) {
                    b0.i = f;
                }
            }
            return;
        }
        for(Object object5: this.m0) {
            b b1 = this.k0.b(object5);
            b1.g();
            Object object6 = this.N;
            if(object6 == null) {
                Object object7 = this.O;
                if(object7 == null) {
                    b1.o(0);
                }
                else {
                    b1.j0 = 6;
                    b1.O = object7;
                }
            }
            else {
                b1.o(object6);
            }
            Object object8 = this.P;
            if(object8 == null) {
                Object object9 = this.Q;
                if(object9 == null) {
                    b1.i(0);
                }
                else {
                    b1.i(object9);
                }
            }
            else {
                b1.j0 = 7;
                b1.P = object8;
            }
            float f1 = this.o0;
            if(f1 != 0.5f) {
                b1.h = f1;
            }
        }
    }
}

