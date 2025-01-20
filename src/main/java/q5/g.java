package q5;

import q7.c;
import q7.d;
import q7.e;

public final class g implements d {
    public static final g a;
    public static final c b;
    public static final c c;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
        g.b = c.a("networkType");
        g.c = c.a("mobileSubtype");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).a(g.b, ((n)(((v)object0))).a);
        ((e)object1).a(g.c, ((n)(((v)object0))).b);
    }
}

