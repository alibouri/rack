package r5;

import m5.b;
import q7.d;
import t7.a;
import t7.e;

public final class c implements d {
    public static final c a;
    public static final q7.c b;
    public static final q7.c c;

    static {
        c.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        c.b = new q7.c("eventsDroppedCount", b.D(b.C(e.class, a0)));
        a a1 = new a(3);
        c.c = new q7.c("reason", b.D(b.C(e.class, a1)));
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).f(c.b, ((u5.d)object0).a);
        ((q7.e)object1).a(c.c, ((u5.d)object0).b);
    }
}

