package M;

import I.f0;
import O0.n;

public final class s implements i {
    public final int a;
    public static final s b;
    public static final s c;
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;

    static {
        s.b = new s(0);
        s.c = new s(1);
        s.d = new r(0);
        s.e = new r(1);
        s.f = new r(2);
        s.g = new r(3);
    }

    public s(int v) {
        this.a = v;
        super();
    }

    @Override  // M.i
    public long a(o o0, int v) {
        if(this.a != 0) {
            return o0.f.l(v);
        }
        String s = o0.f.a.a.X;
        return n.b(f0.t(v, s), f0.s(v, s));
    }
}

