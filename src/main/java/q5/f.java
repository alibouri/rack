package q5;

import q7.c;
import q7.d;
import q7.e;

public final class f implements d {
    public static final f a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;

    static {
        f.a = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f.b = c.a("requestTimeMs");
        f.c = c.a("requestUptimeMs");
        f.d = c.a("clientInfo");
        f.e = c.a("logSource");
        f.f = c.a("logSourceName");
        f.g = c.a("logEvent");
        f.h = c.a("qosTier");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).f(f.b, ((l)(((s)object0))).a);
        ((e)object1).f(f.c, ((l)(((s)object0))).b);
        ((e)object1).a(f.d, ((l)(((s)object0))).c);
        ((e)object1).a(f.e, ((l)(((s)object0))).d);
        ((e)object1).a(f.f, ((l)(((s)object0))).e);
        ((e)object1).a(f.g, ((l)(((s)object0))).f);
        ((e)object1).a(f.h, w.X);
    }
}

