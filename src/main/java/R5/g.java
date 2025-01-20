package r5;

import m5.b;
import q7.c;
import q7.d;
import t7.a;
import t7.e;

public final class g implements d {
    public static final g a;
    public static final c b;
    public static final c c;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        g.b = new c("startMs", b.D(b.C(e.class, a0)));
        a a1 = new a(2);
        g.c = new c("endMs", b.D(b.C(e.class, a1)));
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).f(g.b, ((u5.g)object0).a);
        ((q7.e)object1).f(g.c, ((u5.g)object0).b);
    }
}

