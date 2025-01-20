package q5;

import q7.c;
import q7.e;

public final class d implements q7.d {
    public static final d a;
    public static final c b;
    public static final c c;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d.b = c.a("clientType");
        d.c = c.a("androidClientInfo");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((j)(((q)object0))).getClass();
        ((e)object1).a(d.b, p.X);
        ((e)object1).a(d.c, ((j)(((q)object0))).a);
    }
}

