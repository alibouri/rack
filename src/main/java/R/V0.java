package R;

import H.c;
import H.e;
import H.f;
import U.O0;
import U.p;
import n0.M;
import n0.S;
import v.h;

public abstract class v0 {
    public static final O0 a;

    static {
        v0.a = new O0(k.i0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
    }

    public static final S a(int v, p p0) {
        u0 u00 = (u0)p0.k(v0.a);
        switch(h.d(v)) {
            case 0: {
                return u00.e;
            }
            case 1: {
                return v0.b(u00.e);
            }
            case 2: {
                return u00.a;
            }
            case 3: {
                return v0.b(u00.a);
            }
            case 4: {
                return f.a;
            }
            case 5: {
                return u00.d;
            }
            case 6: {
                c c0 = new c(0.0f);
                c c1 = new c(0.0f);
                return e.a(u00.d, c0, null, c1, 6);
            }
            case 7: {
                return v0.b(u00.d);
            }
            case 8: {
                return u00.c;
            }
            case 9: {
                return M.a;
            }
            case 10: {
                return u00.b;
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final e b(e e0) {
        c c0 = new c(0.0f);
        return e.a(e0, null, new c(0.0f), c0, 3);
    }
}

