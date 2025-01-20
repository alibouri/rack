package r5;

import m5.b;
import q7.c;
import q7.d;
import t7.a;
import t7.e;

public final class f implements d {
    public static final f a;
    public static final c b;
    public static final c c;

    static {
        f.a = new f();  // initializer: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        f.b = new c("currentCacheSizeBytes", b.D(b.C(e.class, a0)));
        a a1 = new a(2);
        f.c = new c("maxCacheSizeBytes", b.D(b.C(e.class, a1)));
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).f(f.b, ((u5.f)object0).a);
        ((q7.e)object1).f(f.c, ((u5.f)object0).b);
    }
}

