package j6;

import java.util.concurrent.Callable;

public final class l0 implements Callable {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final h0 e;

    public l0(h0 h00, String s, String s1, String s2, int v) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = h00;
        super();
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                this.e.d.d0();
                g g1 = this.e.d.Z;
                k1.v(g1);
                return g1.h0(this.b, this.c, this.d);
            }
            case 1: {
                this.e.d.d0();
                g g2 = this.e.d.Z;
                k1.v(g2);
                return g2.h0(this.b, this.c, this.d);
            }
            case 2: {
                this.e.d.d0();
                g g3 = this.e.d.Z;
                k1.v(g3);
                return g3.J(this.b, this.c, this.d);
            }
            default: {
                this.e.d.d0();
                g g0 = this.e.d.Z;
                k1.v(g0);
                return g0.J(this.b, this.c, this.d);
            }
        }
    }
}

