package N;

import F0.f;
import R.k0;
import R.m0;
import R.t;
import n0.M;
import n0.v;
import n0.w;

public final class l0 implements w {
    public final int a;
    public final Object b;

    public l0(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // n0.w
    public final long a() {
        switch(this.a) {
            case 0: {
                n0 n00 = (n0)this.b;
                long v = ((f1)((l0)n00.s0).b).c;
                if(v == 16L) {
                    d1 d10 = (d1)f.i(n00, e1.b);
                    if(d10 == null) {
                        v = ((v)f.i(n00, a0.a)).a;
                        return ((Q)f.i(n00, T.a)).h() || ((double)M.w(v)) >= 0.5 ? v : v.e;
                    }
                    v = d10.a;
                    if(v == 16L) {
                        v = ((v)f.i(n00, a0.a)).a;
                        return ((Q)f.i(n00, T.a)).h() || ((double)M.w(v)) >= 0.5 ? v : v.e;
                    }
                }
                return v;
            }
            case 1: {
                return ((f1)this.b).c;
            }
            case 2: {
                n0 n01 = (n0)this.b;
                long v1 = ((m0)((l0)n01.s0).b).c;
                if(v1 == 16L) {
                    k0 k00 = (k0)f.i(n01, R.l0.b);
                    if(k00 != null) {
                        return k00.a == 16L ? ((v)f.i(n01, t.a)).a : k00.a;
                    }
                    return ((v)f.i(n01, t.a)).a;
                }
                return v1;
            }
            default: {
                return ((m0)this.b).c;
            }
        }
    }
}

