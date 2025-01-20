package a8;

import q7.c;
import q7.d;
import q7.e;

public final class g implements d {
    public static final g a;
    public static final c b;
    public static final c c;
    public static final c d;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
        g.b = c.a("eventType");
        g.c = c.a("sessionData");
        g.d = c.a("applicationInfo");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((E)object0).getClass();
        ((e)object1).a(g.b, k.Y);
        ((e)object1).a(g.c, ((E)object0).a);
        ((e)object1).a(g.d, ((E)object0).b);
    }
}

