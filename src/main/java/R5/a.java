package r5;

import m5.b;
import q7.c;
import q7.d;
import t7.e;

public final class a implements d {
    public static final a a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;

    static {
        a.a = new a();  // initializer: Ljava/lang/Object;-><init>()V
        t7.a a0 = new t7.a(1);
        a.b = new c("window", b.D(b.C(e.class, a0)));
        t7.a a1 = new t7.a(2);
        a.c = new c("logSourceMetrics", b.D(b.C(e.class, a1)));
        t7.a a2 = new t7.a(3);
        a.d = new c("globalMetrics", b.D(b.C(e.class, a2)));
        t7.a a3 = new t7.a(4);
        a.e = new c("appNamespace", b.D(b.C(e.class, a3)));
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).a(a.b, ((u5.a)object0).a);
        ((q7.e)object1).a(a.c, ((u5.a)object0).b);
        ((q7.e)object1).a(a.d, ((u5.a)object0).c);
        ((q7.e)object1).a(a.e, ((u5.a)object0).d);
    }
}

