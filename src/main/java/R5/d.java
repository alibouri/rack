package r5;

import m5.b;
import q7.c;
import t7.a;
import t7.e;

public final class d implements q7.d {
    public static final d a;
    public static final c b;
    public static final c c;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        d.b = new c("logSource", b.D(b.C(e.class, a0)));
        a a1 = new a(2);
        d.c = new c("logEventDropped", b.D(b.C(e.class, a1)));
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).a(d.b, ((u5.e)object0).a);
        ((q7.e)object1).a(d.c, ((u5.e)object0).b);
    }
}

