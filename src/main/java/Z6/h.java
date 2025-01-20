package Z6;

import E7.C;
import Nb.j;
import Xb.J;
import f7.a;
import f7.b;
import f7.c;
import f7.d;
import java.util.concurrent.Executor;
import m7.e;
import m7.r;

public final class h implements e {
    public final int X;
    public static final h Y;
    public static final h Z;
    public static final h b0;
    public static final h c0;

    static {
        h.Y = new h(0);
        h.Z = new h(1);
        h.b0 = new h(2);
        h.c0 = new h(3);
    }

    public h(int v) {
        this.X = v;
        super();
    }

    @Override  // m7.e
    public final Object d(C c0) {
        switch(this.X) {
            case 0: {
                Object object1 = c0.k(new r(a.class, Executor.class));
                j.e(object1, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return J.i(((Executor)object1));
            }
            case 1: {
                Object object2 = c0.k(new r(c.class, Executor.class));
                j.e(object2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return J.i(((Executor)object2));
            }
            case 2: {
                Object object3 = c0.k(new r(b.class, Executor.class));
                j.e(object3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return J.i(((Executor)object3));
            }
            default: {
                Object object0 = c0.k(new r(d.class, Executor.class));
                j.e(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return J.i(((Executor)object0));
            }
        }
    }
}

