package ia;

import Ab.t;
import M.J;
import M6.b;
import Mb.e;
import N.b1;
import Nb.j;
import U.p;
import androidx.compose.foundation.layout.c;
import g0.l;
import u.g;

public final class d implements e {
    public static final d X;

    static {
        d.X = new d();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object3).intValue();
        j.f(((g)object0), "$this$AnimatedContent");
        j.f(((ia.j)object1), "targetState");
        switch(((ia.j)object1).ordinal()) {
            case 0: {
                ((p)object2).Q(1890103644);
                ((p)object2).p(false);
                return t.a;
            }
            case 1: {
                ((p)object2).Q(0x70A16FC8);
                long v = yc.d.h(0x7F06018F, ((p)object2));  // color:white
                b1.b(c.h(l.X, 75.0f), 0L, 0.0f, v, 0, ((p)object2), 6, 22);
                ((p)object2).p(false);
                return t.a;
            }
            case 2: {
                ((p)object2).Q(0x70A516DE);
                b.e(b.W(0x7F080236, ((p)object2)), null, null, null, null, ((p)object2), 0x30, 0x7C);  // drawable:ic_green_check
                ((p)object2).p(false);
                return t.a;
            }
            default: {
                throw J.c(0x352E781C, ((p)object2), false);
            }
        }
    }
}

