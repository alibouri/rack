package m1;

import l1.g;
import o1.a;
import o1.i;
import v.h;

public final class b extends g {
    public int n0;
    public int o0;
    public a p0;

    @Override  // l1.g
    public final void apply() {
        this.s();
        int v = 1;
        switch(h.d(this.n0)) {
            case 1: 
            case 3: {
                break;
            }
            case 4: {
                v = 2;
                break;
            }
            case 5: {
                v = 3;
                break;
            }
            default: {
                v = 0;
            }
        }
        this.p0.t0 = v;
        this.p0.v0 = this.o0;
    }

    @Override  // l1.b
    public final l1.b k(int v) {
        this.o0 = v;
        return this;
    }

    @Override  // l1.b
    public final l1.b l(Float float0) {
        this.o0 = this.k0.c(float0);
        return this;
    }

    @Override  // l1.g
    public final i s() {
        if(this.p0 == null) {
            this.p0 = new a();
        }
        return this.p0;
    }
}

